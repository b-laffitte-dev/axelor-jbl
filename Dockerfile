# syntax=docker/dockerfile:1
# ---------------------------------------------------------------------------
# JBL Atelier - image Docker
# Étape 1 : build du WAR avec Gradle (JDK 21, Node téléchargé par le plugin AOP)
# Étape 2 : runtime Tomcat 10.1 (Jakarta EE 10, requis par AOP 8.x), WAR en ROOT
# ---------------------------------------------------------------------------

FROM gradle:8.14.3-jdk21 AS build
WORKDIR /home/gradle/app
# On copie d'abord les fichiers de build pour profiter du cache Docker
# quand seul le code source change
COPY settings.gradle build.gradle gradle.properties ./
COPY src ./src
RUN gradle --no-daemon --console=plain clean build

FROM tomcat:10.1-jdk21-temurin
RUN apt-get update \
 && apt-get install -y --no-install-recommends curl \
 && rm -rf /var/lib/apt/lists/*

ENV CATALINA_OPTS="-Xms512m -Xmx2048m"

# WAR déployé à la racine du serveur (contexte /)
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=build /home/gradle/app/build/libs/axelor-jbl.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
HEALTHCHECK --interval=30s --timeout=5s --start-period=240s --retries=5 \
  CMD curl -fsS http://localhost:8080/ -o /dev/null || exit 1
