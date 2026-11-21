
                        List<Class<?>> allowClasses,
                        List<Class<?>> denyClasses) {
                        List<String> denyPackages,
                   field="addresses" **(6)**
                   form-view="address-form-popup"> **(7)**
                 ┌─ flow "mgr" ──► manager approval ──┐
                 └─ flow "adm" ──► admin approval ────┘
                20% <Icon icon="trending_down"/>
                <bind column="p1" to="code"/>
                <bind column="p1" to="name"/>
                <bind column="p2" to="code"/>
                <bind column="p2" to="name"/>
                FormStep.add("items"), **(3)**
                FormStep.click("btnCompute"), **(5)**
                FormStep.click("items[-1]", "btnApplyDiscount"),
                FormStep.save()), **(6)**
                FormStep.set("customer", Map.of("id", customerId)), **(2)**
                FormStep.set("items[-1].product", Map.of("id", productId)), **(4)**
                eval="t2.split('\\|') as List"/>
               model="com.axelor.contact.db.Contact"> **(5)**
               title="Contacts"
              action,                                       **(6)**
              isDefaultProject);                            **(8)**
              new Context(project.getId(), Project.class),  **(7)**
              project.getName(),                            **(5)**
            "My projects",  **(1)**
            "ids": [1, 2, 3]
            "model": "com.axelor.contact.db.Contact",
            0,              **(2)**
            </Box>
            </bind>
            <Box d="flex" alignItems="center" style={{fontWeight: "bold", color: "red"}}>
            <DataChart data={data} type="bar" x="name" series={[{ field: "value" }]} />
            <DataTable data={data} sortable />
            <Icon icon={"clock"} />
            <a href={`mailto:${email}`}>{email}</a>
            <a href={`tel:${phone}`}>{phone}</a>
            <bind column="email" to="email"/>
            <bind column="firstName" to="firstName"/>
            <bind column="lastName" to="lastName"/>
            <bind column="q1" to="quantity"/>
            <bind column="q2" to="quantity"/>
            <bind column="r1" to="price"/>
            <bind column="r2" to="price"/>
            <bind column="t11" to="taxes" search="self.code = :t11"/>
            <bind column="t12" to="taxes" search="self.code = :t12"/>
            <bind column="t2" to="taxes" search="self.code in :t2"
            <bind to="email" eval='"${firstName}.${lastName}@gmail.com".toLowerCase()'/>
            <bind to="product" search="self.name = :p1">
            <bind to="product" search="self.name = :p2">
            <small>Total sale</small>
            <strong>{address.street} {address.area}</strong><br/>
            ActionInteraction.CANCEL_ALL); **(7)**
            List.of(
            RETURN NULL;
            RETURN lo_get(oid_value);
            action="contact.all"/> **(2)** **(3)** **(4)**
            bean.getClass().getSimpleName(),
            bean.getId());
            eval="confirmed ==~ /^(T|Y|1)$/ ? 'true' : 'false'"/>
            generator.generate(output, design, format, params, Locale.getDefault());
            getItems());    **(4)**
            parent="menu-contact-book"
            return;
            title="Address Book" /> **(1)**
            title="All Contact"
            true,           **(3)**
            {address.city}{address.state && <span>, {address.state}</span>}{address.zip && <span> - {address.zip}</span>}<br/>
            {address.country.name}<br/>
            {email && <span><abbr title="Email">E:</abbr> {email}</span>}
            {phone && <span><abbr title="Phone">P:</abbr> {phone}</span>}<br/>
            {startDate && <span>{$moment(startDate).format('LLL')}</span>}
            {user && <Image src={$image('user', 'image')} style={{ width: "1.5rem", height: "1.5rem", borderRadius: "100%" }}/>}
           "ids": [1, 2, 3]
           "model": "com.axelor.sale.db.Product",
          "fieldName": "firstName",
          "fieldName": "lastName",
          "id": 1,
          "name": "P1",
          "operator": "like",
          "value": "j%"
          "value": "s%"
          "version": 1
          - code
          - name
          </>
          </Box>
          </DataWidget>
          </address>
          <>
          <Box d="flex" g={2}>
          <Box d="flex" justifyContent="flex-end">
          <Box textAlign="center" fontWeight="bold" p={1}>{fullName}</Box>
          <DataWidget data={data} title="My Chart">
          <DataWidget data={data} title="My Table" padding={0}>
          <a href={`tel:${phone}`}>{phone}</a>
          <address>
          <field name="firstName" colSpan="4"/>
          <field name="lastName" colSpan="5"/>
          <field name="title" colSpan="3"/>
          <img src={hasImage ? $image(null, 'image') : "img/user.png"}/>
          delay="3" unit="day" next="escalate"/> **(1)**
          else use 'FR'
          eval="'FR'" if="location_contact == null &amp;&amp; city_country == null"/>
          eval="city_country" if="city_country != null"/>
          eval="location_contact" if="location_contact != null"/>
          if city_country exists then use it
          if location_contact exists then use it,
          mode="all"                                wait="any"
          new QuickMenuItem(
          {
          {name}
          {notes}
          }
          },
        "_results": [
        "code": "A",
        "criteria": [{
        "fieldName": "age",
        "fieldName": "email",
        "fieldName": "lang",
        "operator": "=",
        "operator": "and",
        "operator": "between",
        "operator": "like",
        "product": {
        "value": "%gmail.com"
        "value": "FR"
        "value": 18,
        "value2": 40
        )}
        **(1)**
        **(2)**
        - click: btnTotalAmount                 **(5)**
        - save: true
        - set: { confirmDate: "eval: inputs.confirmDate ?: confirmDate" }
        - set: { confirmed: true }              **(6)**
        -->
        // TODO: create render tasks
        // TODO: open the design
        // TODO: provide task options
        // TODO: run the task
        // do something with order
        // now we can't update world, as it's converted to real instance
        // provide input data
        <!--
        <!-- default value provided with eval expression -->
        <!-- find country codes and put them in the context -->
        <!-- transform boolean value into 'true' or 'false' -->
        </>
        </Box>
        </bind>
        </editor>
        <>
        <Box d="flex" flex={2}>
        <Box d="flex" flexDirection="column" alignItems="center" flex={1}>
        <Box d="flex" flexDirection="row" justifyContent="space-between">
        <a href={`mailto:${email}`}>{email}</a>
        <bind column="confirmed" to="confirmed"
        <bind column="date" to="createDate"/>
        <bind column="date" to="orderDate"/>
        <bind node="../../../@location" alias="location_contact"/>
        <bind node="@zip" to="zip"/>
        <bind node="city" to="city"/>
        <bind node="city/@country" alias="city_country"/>
        <bind node="line1" to="street"/>
        <bind node="line2" to="area"/>
        <bind to="code" column="code"></bind>
        <bind to="confirmDate" eval="java.time.LocalDate.now()"/>
        <bind to="country" search="self.code = :country"
        <bind to="customer" if="email.empty">
        <bind to="customer" search="self.email = :email" if="!email.empty">
        <bind to="items">
        <bind to="name" column="name" if-empty="true"></bind>
        <editor> **(4)**
        <field name="area"/>
        <field name="city"/>
        <field name="country"/>
        <field name="firstName" colSpan="4"/>
        <field name="lastName" colSpan="5"/>
        <field name="notes" showTitle="false" colSpan="12"/>
        <field name="state"/>
        <field name="street"/>
        <field name="title" colSpan="3"/>
        <field name="zip"/>
        <h1>{first.total}</h1>
        <header>code,name</header>
        <input name="customer" field="customer.fullName" matchStyle="contains"/>
        <input name="date" field="orderDate"/>
        <input name="partner" field="customer"/>
        <input name="product" field="items.product"/>
        <input name="value" field="amount" matchStyle="greaterOrEqual"/>
        <li>{$fmt("createDate")}</li>
        <li>{$fmt("user")}</li>
        <viewer><![CDATA[
        <viewer><![CDATA[ **(5)**
        ELSE
        END IF;
        IF EXISTS (SELECT 1 FROM pg_largeobject_metadata WHERE oid = oid_value) THEN
        IF oid_value IS NULL THEN
        IResourceLocator locator = engine.getConfig().getResourceLocator();
        Object bean = searchForRecord(values);
        Order order = (Order) bean;
        Order order = new Order();
        Query.of(Project.class).filter("?1 MEMBER OF self.members", user).fetch(10)) {
        Recalculates the totals, then confirms the order as the form's Confirmed switch does.
        System.err.println("    " + key + " = " + data.getString(key));
        URL found = locator.findResource(null, design, IResourceLocator.OTHERS);
        ]
        ]]></viewer>
        artifact("v[revision]/[artifact](-v[revision]-[classifier]).[ext]")
        artifact()
        bind(ReportConfigurerImpl.class).to(MyReportConfigurer.class);
        bind(TenantConfigProvider.class).to(MyTenantConfigProvider.class);
        call="com.axelor.data.tests.Validators:validateSaleOrder">
        confirmDate: { type: date }             **(4)**
        context.put("_saleOrder", order);
        depth: 1
        depth: 2
        depth: 2        **(1)**
        forms.open(FormSpec.of("sale.orders"), Target.newRecord()); **(1)**
        if (found == null) {
        if="email == null || email.empty"/>
        if="title_code &amp;&amp; !title_code.empty" /> <!-- NOT SURE -->
        include:        **(2)**
        includeModule("org.nodejs", "node")
        input("customers", new File("customers.csv")); **(4)**
        input("sales", new File("sales.csv"));
        log.error("IOException error : " + e);
        log.error("Import error : " + exception);
        log.info("Bean saved : {}(id={})",
        log.info("Record (success): " + success);
        log.info("Record (total): " + total);
        logger.lifecycle('Running: ' + descriptor)
        maxInputTokens: 1000000
        model="com.axelor.contact.db.Address">
        model="com.axelor.contact.db.Contact"> **(1)**
        model="com.axelor.contact.db.Contact"> **(2)**
        order.run(
        order.setCreateDate(new LocalDate());
        order.setOrderDate(new LocalDate());
        password = providers.gradleProperty("axelor_registry_password").get()
        records.add(bean);
        render={(data) => (
        return 
        return bean;
        return false;
        return firstName + " " + lastName;
        return null;
        return true;
        search="self.code = :code" update="true">
        search="self.firstName = :firstName AND self.lastName = :lastName"
        separator="\t"
        supportsTools: true
        task.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        title="Address"
        title="Contact"
        title="Contacts"
        try (OutputStream output = new FileOutputStream(...)) {
        type: CHAT              # required
        update="true"/>
        username = providers.gradleProperty("axelor_registry_user").get()
        world = $json.create('world');
        world = $json.save(world); **(4)**
        world.name = "World!!!";
        }
        },
        }, {
        }]
       and save again at the end -->
      "criteria": [{
      "email": "%gmail.com"
      "email": "j.smith@example.com",
      "fileName": "some.tar.gz"
      "fullName": "Thomas Smith",
      "id": 1
      "id": 1,
      "id": 101,
      "id": 12,
      "id": 123,
      "name": "firstName",
      "name": "j.smith",
      "name": "lastName",
      "operator": "or",
      "required": true
      "type": "STRING"
      "type": "STRING",
      "version": 0
      $(`<li>${name}</li>`).appendTo(productList);
      - field: addresses
      - field: area
      - field: attrs
      - field: attrs    **(4)**
      - field: city
      - field: code
      - field: country
      - field: fullName
      - field: jsonModel
      - field: name
      - field: street
      - field: title
      - field: zip
      ...
      .reduce((acc, cur) => { const [k, v] = cur.split('='); return {...acc, [k]: v}; }, {});
      .split('; ')
      />
      <!-- MEV_ERP_ID is provided with "context" : so here it may be null -->
      <!-- bind multi-value field -->
      <!-- generate email if doesn't exist -->
      <!-- if @code of node title exist and not empty then bind to field notes -->
      </>
      </Box>
      </bind>
      </editor>
      </field>
      </ul>
      </where>
      <>
      <Box as="strong">
      <Box d="flex" flexDirection="row">
      <Box d="flex" mt={2}>
      <Box d="grid" gridTemplateColumns="auto auto" style={{ fontSize: "0.85rem", color: "grey" }} mt={2}>
      <DataDashlet query="my.other-query" colSpan={6}
      <DataDashlet query="my.query" colSpan={6} height={400}
      <bind eval="MEV_ERP_ID" to="notes" if="MEV_ERP_ID"/>
      <bind node="@code" to="code" />
      <bind node="email" to="email"/>
      <bind node="my/address-list/address" to="addresses">
      <bind node="name[@type='F']" to="firstName" />
      <bind node="name[@type='L']" to="lastName" />
      <bind node="text()" to="name" />
      <bind node="title" to="title" search="self.name = :title" />
      <bind node="title/@code" to="notes" alias="title_code"
      <bind to="email" eval='"${firstName}.${lastName}@gmail.com".toLowerCase()'
      <bind to="items">
      <editor> **(4)**
      <field name="area" />
      <field name="area"/>
      <field name="city" />
      <field name="city"/>
      <field name="country" />
      <field name="country"/>
      <field name="createdBy"/>
      <field name="createdOn"/>
      <field name="dateOfBirth" />
      <field name="email">
      <field name="firstName"/>
      <field name="fullName" readonly="false">
      <field name="lastName"/>
      <field name="notes" showTitle="false" colSpan="12"/>
      <field name="phone">
      <field name="state" />
      <field name="state"/>
      <field name="street" />
      <field name="street"/>
      <field name="updatedBy"/>
      <field name="updatedOn"/>
      <field name="zip" />
      <field name="zip"/>
      <flow id="f1" when="self.totalAmount &gt; 10000" next="approve" title="Large order"/>
      <flow id="f2" default="true" next="notify"/>
      <hilite if="_model == 'com.axelor.contact.db.Contact'" color="brown"/>
      <input name="customer" field="fullName" matchStyle="contains"/>
      <input name="date" field="dateOfBirth"/>
      <input name="orderStatus" field="status"/>
      <input name="partner.fullName" field="fullName"/>
      <li>First line
      <li>Second line
      <panel-dashlet action="action-view-orders-by-contact" title="Orders"/>
      <ul>
      <viewer><![CDATA[
      <viewer><![CDATA[ **(5)**
      <where match="any">
      @Named(RequestEvent.EXPORT) @EntityType(Contact.class) PostRequest event) {
      @Override
      AND self.orderDate < :toDateTime
      AND self.orderDate > :fromDateTime
      MONTH(self.orderDate)
      MONTH(self.orderDate) AS month,
      Order self
      QuickMenuItem item =
      SUM(self.totalAmount) AS amount,
      String falsePattern = this.get("falsePattern", "(0|false|no|f|n)");
      YEAR(self.orderDate) = YEAR(current_date)
      ]]></viewer>
      _customer,
      _customer.fullName AS customer
      action: sale.orders                       **(2)**
      beforeTest { descriptor ->
      boolean isDefaultProject = project.equals(user.getDefaultProject());
      content {
      credentials {
      defaults:                 # applied only when a model is created
      delay="3" unit="day" next="notify"/>
      description: >-
      eval="confirmed ==~ /^(T|Y|1)$/ ? 'true' : 'false'"/>
      fields: ['name'],
      for (String key : data.keySet()) {
      https://axelor.com/xml/ns/data-queries/data-queries_10.0.xsd">
      inputs:
      items.add(item);
      keep: 1                   # the newest N it takes; omit to take every match
      languageVersion = JavaLanguageVersion.of(21)
      languageVersion = JavaLanguageVersion.of(21) **(3)**
      limit: 20
      log.error("error saving Title");
      log.info("A new Product is about to be inserted: {}", event.getEntity());
      metadataSources {
      model="com.axelor.contact.db.Contact"> **(1)**
      month
      name = "Node.js"
      pattern = Pattern.compile(falsePattern, Pattern.CASE_INSENSITIVE);
      patternLayout {
      public boolean handle(IOException e) { **(6)**
      public boolean handle(ImportException exception) { **(5)**
      public void configure() throws IOException {
      public void handle(Model bean, Exception e) {
      public void imported(Integer total, Integer success) {
      public void imported(Model bean) {
      response.addError("email", "Email required");
      response.addError("email", "Invalid email.");
      return Boolean.FALSE;
      role="sales.manager" comment="reject" next="notify"/> **(3)**
      search="self.code = :code" update="false">
      self.customer AS _customer
      setUrl("https://nodejs.org/dist/")
      sortBy: ['name'],
      steps:
      throw new IllegalStateException(result.message()); **(8)**
      title = this.save(title);
      title: Confirm the order                  **(1)**
      title="Contact"
      track(_t('Order confirmed'));
      url = uri(providers.gradleProperty("axelor_registry_url").get())
      useJUnitPlatform() **(4)**
      when: "!confirmed && customer"            **(3)**
      when="self.confirmed == true" repeat="episode" next="check"/> **(1)**
      }
      }, {
      }]
     *
     * @param bean the bean instance created from the imported record
     * @param values the value map that represents the csv row being imported
     * @param values the value map that represents the imported data
     * @return the bean object to persist (in most cases the same bean object)
     * @return the bean object to update
     * It prepares the global context before transforming the csv row.
     * This method is called  in favor of `search` JPQL expression.
     * This method is called for each record being imported.
     * This method is called with `call` attribute.
     * This method is called with `prepare-context` attribute.
     * This method is called with `search-call` attribute.
     */
     <field type="datetime" name="fromDateTime" title="From Date"/>
     <field type="datetime" name="toDateTime" title="To Date"/>
    """
    """);
    "..."
    "_archived": true
    "_domain": "self.email like :email",
    "_domainContext": {
    "_searchContext": {
    "context":  {
    "criteria": [{
    "email": "j.smith@gmail.com",
    "email": "tom.boy@gmail.com",
    "fields": [{
    "fileName": "Some Folder",
    "fileName": "another.pdf"
    "fileName": "some.pdf"
    "fileName": "some.pdf",
    "firstName": "John",
    "fullName": "John SMITH",
    "fullName": "John Smith",
    "fullName": "Tom Boy",
    "id": 1,
    "id": 2,
    "id": 9,
    "isDirectory": false
    "isDirectory": true
    "lastName": "SMITH"
    "lastName": "SMITH",
    "lastName": "Smith",
    "model": "com.axelor.contact.db.Contact",
    "parent": ["fullName"]
    "parent": {
    "user": ["name", "email"],
    "user": {
    "version": 0
    "version": 0,
    "version": 1
    "version": 1,
    "version": 2,
    # header providing the client IP address, set by the reverse proxy
    $$ LANGUAGE plpgsql;
    $response.values = hello;
    *   **`name`** - name of the field to track
    *   Action Events
    *   Adaptive back-pressure mechanism controlled with following properties : `application.audit.logs.flush-thresho
    *   Allowed
    *   Annotation-based Whitelisting
    *   Application Events
    *   Authenticates the key against stored credentials
    *   Builder Creation
    *   Builder Options
    *   Building the Cache
    *   Checks if the API key hasn’t expired
    *   Confirms the associated user account is active
    *   DataSet
    *   Database session
    *   Denied (cannot be overridden)
    *   Event Object
    *   Event Observer
    *   Event Source
    *   Field
    *   For Email: A verification code is automatically sent to their registered email.
    *   For Recovery: The user can enter
    *   For TOTP: The user is prompted to enter the current code from their authenticator app.
    *   For security and performance reasons, certain field types are automatically excluded from audit tracking : passwords/encrypted/binary/collection and transient fields.
    *   From xml entity definition itself, using `allocationSize` attribute
    *   Global default allocation size : `application.entity.sequence.default_allocation_size`
    *   Helper functions
    *   Include archived : include the archived records
    *   Introduce `AuditLog` entity for persistent audit event storage with full state capture. It support retry logic with max retries and error tracking.
    *   JobStore
    *   Login Events
    *   Mail channel
    *   Multi-instance
    *   Only archived : only display the archived records.
    *   Pending exports
    *   Programmatic Configuration
    *   Qualifiers
    *   Records the same file creates
    *   Request Events
    *   Sequence specific configuration defined in application settings, `application.entity.sequence.%MY_SEQ%.allocation_size`
    *   Template
    *   Tracking messages are not created immediately when a record is created/updated. Instead, they appear in the stream after a brief delay.
    *   Upgrade BIRT from 4.21.0 to 4.22.0
    *   Upgrade Bytebuddy from 1.17.7 to 1.17.8
    *   Upgrade Caffeine from 3.2.2 to 3.2.3
    *   Upgrade Greenmail from 2.1.6 to 2.1.7
    *   Upgrade Greenmail from 2.1.7 to 2.1.8
    *   Upgrade Groovy from 4.0.28 to 4.0.29
    *   Upgrade Hibernate from 6.6.31 to 6.6.36
    *   Upgrade Hibernate from 6.6.36.Final to 6.6.40.Final
    *   Upgrade Jack
    *   Upgrade Logback from 1.5.19 to 1.5.21
    *   Upgrade Logback from 1.5.21 to 1.5.25
    *   Upgrade Moxy from 4.0.8 to 4.0.9
    *   Upgrade PostgreSQL JDBC driver from 42.7.8 to 42.7.9
    *   Upgrade Quartz from 2.5.0 to 2.5.1
    *   Upgrade Quartz from 2.5.1 to 2.5.2
    *   Upgrade Redisson from 3.51.0 to 3.52.0
    *   Upgrade Resteasy from 6.2.14.Final to 6.2.15.Final
    *   Upgrade Shiro from 2.0.5 to 2.0.6
    *   Upgrade Swagger from 2.2.38 to 2.2.40
    *   Upgrade Swagger from 2.2.40 to 2.2.41
    *   Upgrade Tomcat from 10.1.47 to 10.1.49
    *   Upgrade Tomcat from 10.1.49 to 10.1.50
    *   Upgrade Undertow from 2.3.19 to 2.3.20
    *   Upgrade Undertow from 2.3.20.Final to 2.3.21.Final
    *   Upgrade pac4j from 6.2.2 to 6.3.1
    *   Verifies the structure and presence of the API key
    *   `_calendarEndDate`: last visible date of the viewport (exclusive)
    *   `_calendarStartDate`: first visible date of the viewport (inclusive)
    *   `_calendarViewMode`: current view type (day, week, or month)
    *   `class` - fully qualified name of the target class
    *   `com.axelor.common.HtmlUtils`
    *   `com.axelor.common.Inflections`
    *   `com.axelor.common.Inflector`
    *   `com.axelor.common.ObjectUtils`
    *   `com.axelor.common.StringUtils`
    *   `com.axelor.db.EntityHelper`
    *   `com.axelor.db.Model`
    *   `com.axelor.db.Query`
    *   `com.axelor.db.Repository`
    *   `com.axelor.db.ValueEnum`
    *   `com.axelor.i18n.I18n`
    *   `com.axelor.i18n.L10n`
    *   `com.axelor.rpc.ActionRequest`
    *   `com.axelor.rpc.ActionResponse`
    *   `com.axelor.rpc.Context`
    *   `com.axelor.rpc.JsonContext`
    *   `configure(task, options, params)`: called before the task runs (timezone, render options…​)
    *   `copy` - if the expression return a model object, whether to copy it
    *   `distinct` : use a distinct scale by axis, based on the series values. This is the default.
    *   `expr` - context variable value expression
    *   `expr` - expression to execute to get the value
    *   `expr` - expression to provide parameter value
    *   `fields` - only use this message as tag if any of the given field is changed
    *   `fixed` : use a fixed scale for all axis. Value should be provided by `max` config.
    *   `groupBy` - the dataset field use to group the related data
    *   `if` - a boolean expression against the current context
    *   `if` - a boolean expression to test before tracking the field (JEL)
    *   `if` - a boolean expression to test before using the message
    *   `if` - a groovy boolean expression against the current context
    *   `if` - condition to check before preparing the value
    *   `jakarta.persistence.Query`
    *   `java.lang.CharSequence`
    *   `java.lang.Iterable`
    *   `java.lang`
    *   `java.math`
    *   `java.text`
    *   `java.time.*`
    *   `java.util.Iterator`
    *   `java.util.Map.Entry`
    *   `java.util.Map`
    *   `java.util`
    *   `key` - the dataset field to be used as Y-Axis data points
    *   `key` - the dataset field to be used to categorize the data (used as X-Axis data points)
    *   `method` - method name
    *   `name` - context variable name
    *   `name` - name of the action
    *   `name` - name of the configuration item
    *   `name` - name of the field
    *   `name` - name of the parameter
    *   `name` - parameter name
    *   `name` - the view name
    *   `on` - on which event this field should be tracked
    *   `on` - on which event this messages should be used
    *   `org.hibernate.collection.spi.LazyInitializable`
    *   `org.hibernate.collection.spi.PersistentCollection`
    *   `org.hibernate.proxy.HibernateProxy`
    *   `side` - Y-Axis side (left or right)
    *   `tag` - specify predefined tag class if this message is a tag
    *   `title` - category title displayed on X-Axis
    *   `title` - the title for the Y-Axis
    *   `type` - category type can be, numeric, date, time, month, year or text
    *   `type` - graph type, (pie, bar, hbar, line, area)
    *   `type` - the view type
    *   `unique` : use a unique scale for all axis, based on the series values.
    *   `validate(report, params)`: called once the design is opened, throw to abort the generation
    *   `value` - configuration value
    *   `value` - parameter value
    *   attribute
    *   extend
    *   insert
    *   move
    *   replace
    *   report-box
    *   report-table
    **Cleanup:** You will have orphaned large objects in `pg_largeobject` that are no longer referenced by anything. PostgreSQL provides the `vacuumlo` utility to clean them up.
    **Impact:** Critical for schema validation. Requires adding the unique constraint.
    **Impact:** Critical for schema validation. Requires converting "wall clock" time to "absolute" time.
    **Impact:** Critical for schema validation. Requires converting existing `oid` to `bytea`.
    **Impact:** Critical for schema validation. Requires converting to new precision.
    **Impact:** Minimal. Postgres `time` defaults to microsecond precision (6) anyway. Only aligned with Hibernate 6’s expectations.
    **Impact:** Minimal. Postgres `timestamp` defaults to microsecond precision (6) anyway. Only aligned with Hibernate 6’s expectations.
    **Migration:**
    **Optional:** If you still want to use `oid` database type, use `large="true"` attribute on fields.
    - match: "claude-sonnet-.*" # a regex the whole model id must match
    ...
    /**
    // ...
    // Bind the configurator.
    // Business code
    // Called by fireContactSavedEvent,
    // Called by fireContactSavedEventFailure.
    // Called by fireContactSavedEventSuccess.
    // Do something to the `view`.
    // For report-box, we send a list with a single item accessible as `first`.
    // Other configurations...
    // Possibly register more listeners...
    // Retrieve the available themes for the user.
    // Retrieve the theme content depending on the given name.
    // Return false to allow the insertion to proceed.
    // Return whether the feature is enabled.
    // The current user can be used to retrieve theme depending on user context.
    // This data will be put into dataset.
    // You can add multiple configurators from different modules.
    // fireContactSavedEventSuccess, and fireContactSavedEventFailure.
    // logic can be moved to service layer
    // not required though
    // return as response values
    // validate email & set response properties
    // work with database
    <!-- other nodes -->
    <!-- transform boolean value into 'true' or 'false' -->
    <![CDATA[
    </>
    </Box>
    </DataDashboard>
    </bind>
    </field>
    </input>
    </insert>
    </panel-related>
    </panel>
    </replace>
    </split>
    </ul>\
    </where>
    <>
    <Box d="flex" flexDirection="column" flex={1}>
    <DataDashboard>
    <action name="myBtn1" title="Act1" action="com.axelor.Hello:myAction1"/>
    <action name="myBtn2" title="Act2" action="some-action2"/>
    <attribute name="canAttach" value="false"/>
    <attribute name="widget" value="html"/>
    <attribute name="width" value="large"/>
    <bind column="confirmed" to="confirmed"
    <bind node="configs/country" type="com.axelor.contact.db.Country"
    <bind node="configs/titles/title" type="com.axelor.contact.db.Title"
    <bind node="contacts/contact" type="com.axelor.contact.db.Contact">
    <boundary id="giveUp" host="approve" on="timer"
    <button name="showMeBtn" onClick="call-an-action" title="Show me" icon="question-circle-fill"/>
    <date name="dateOfBirth" />
    <divider/>
    <end id="done"/>
    <field name="amount" as="value"/>
    <field name="attrs" colSpan="12" />
    <field name="color" type="string"/>
    <field name="confirmDate" on="UPDATE" if="status == 'confirmed'" />
    <field name="createDate" on="CREATE" />
    <field name="createdBy"/>
    <field name="createdOn"/>
    <field name="customer" />
    <field name="customer" type="string" />
    <field name="customer" type="string">
    <field name="customer.fullName" as="customer"/>
    <field name="date" type="date"/>
    <field name="dateOfBirth" />
    <field name="dateOfBirth" as="date"/>
    <field name="email" />
    <field name="email">
    <field name="fromDate" type="date" title="From date"/>
    <field name="fullName" />
    <field name="fullName" as="customer"/>
    <field name="fullName" readonly="false"> **(3)**
    <field name="items.product.color" as="color" selection="product.color.selection"/>
    <field name="items.product.name" as="product"/>
    <field name="name" />
    <field name="name" as="title" />
    <field name="orderDate" as="date"/>
    <field name="orderStatus" type="string" widget="single-select" selection="order.status.selection"/>
    <field name="partner" type="reference" target="com.axelor.contact.db.Contact"/>
    <field name="phone" />
    <field name="phone">
    <field name="product" type="reference" target="com.axelor.sale.db.Product" widget="SuggestBox"/>
    <field name="product" type="string"/>
    <field name="progress" as="progress" />
    <field name="state" title="Status" type="string" widget="single-select" selection="order.status.selection"/>
    <field name="status" as="state"/>
    <field name="toDate" type="date" title="To date"/>
    <field name="totalAmount" />
    <field name="updatedBy"/>
    <field name="updatedOn"/>
    <field name="value" type="decimal" />
    <field name="value" type="decimal"/>
    <finder-method name="findByEmail" using="email" />
    <finder-method name="findByName" using="fullName" /> **(5)**
    <from model="com.axelor.contact.db.Contact" as="c"/>
    <hilite if="value &gt; 100" color="red"/>
    <input file="circles.csv" type="com.axelor.contact.db.Circle"/>
    <input file="company.csv" type="com.axelor.contact.db.Company"/>
    <input file="contacts-update.csv" type="com.axelor.contact.db.Contact"
    <input file="contacts.csv" type="com.axelor.contact.db.Contact"/>
    <input file="sale-orders.csv" type="com.axelor.sale.db.Order"
    <input file="taxes.csv" type="com.axelor.sale.db.Tax"/>
    <input file="titles-no-header.csv" type="com.axelor.contact.db.Title"
    <input file="titles.csv" type="com.axelor.contact.db.Title"
    <input file="titles.csv" type="com.axelor.contact.db.Title"/>
    <insert position="after">
    <item title="Home Page" action="act2"/>
    <item title="Send Greetings" action="act1"/>
    <item title="Test" action="act3"/>
    <mail-followers />
    <mail-messages limit="4" />
    <many-to-one name="contact" ref="Contact" required="true" />
    <many-to-one name="customer" ref="com.axelor.contact.db.Contact" required="true"/>
    <many-to-one name="title" ref="Title"/> **(1)**
    <message if="status == 'confirmed'" on="UPDATE">Order confirmed.</message>
    <message if="status == 'confirmed'" tag="success" fields="status">Confirmed</message>
    <message if="status == 'draft'" tag="important">Draft</message>
    <message if="true" on="CREATE">Order created.</message>
    <move position="before" source="panel[@title='Extra']"/>
    <non-jta-data-source>java:comp/env/ds/AxelorDS</non-jta-data-source>
    <one-to-many name="addresses" ref="Address" mappedBy="contact" /> **(4)**
    <orderBy field="c.fullName" dir="asc"/>
    <panel name="aboutMePanel" title="About me">
    <panel name="overviewPanel" title="Overview"> **(3)**
    <panel name="sidePanel" sidebar="true"> **(8)**
    <panel title="Overview">
    <panel-dashlet action="action-view-orders-by-contact" title="Orders"/>
    <panel-related name="addressesPanel
    <param name="some" expr="eval: expression" if="confirmed"/>
    <param name="thing" expr="constant" />
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
    <replace>
    <script id="notify" next="done"><![CDATA[
    <select field="c.email" as="email"/>
    <select field="c.fullName" as="name"/>
    <shared-cache-mode>ENABLE_SELECTIVE</shared-cache-mode>
    <split id="check" mode="one"> **(2)**
    <start .../> **(5)**
    <start id="start" on="update" watch="confirmed"
    <string name="area" max="255" />
    <string name="city" />
    <string name="code" required="true" unique="true" min="2" />
    <string name="country" />
    <string name="email" required="true" unique="true" max="100" />
    <string name="firstName" required="true" /> **(2)**
    <string name="fullName" namecolumn="true" search="firstName,lastName"> **(3)**
    <string name="lastName" required="true" />
    <string name="name" required="true" unique="true" min="2" />
    <string name="name" sequence="sale.order.seq" />
    <string name="notes" title="About me" large="true" />
    <string name="phone" max="20" massUpdate="true" />
    <string name="state" />
    <string name="street" required="true" max="255" />
    <string name="zip" />
    <task id="approve" title="Approve large order"
    <ul>
    <view type="form" name="contact-form"/> **(7)**
    <view type="grid" name="contact-grid"/> **(6)**
    <where field="c.archived" op="ne" value="true"/>
    <where match="any">
    <where>
    >
    @Inject private IReportEngine engine;
    @Inject private ReportGenerator generator;
    @Override
    ALTER COLUMN my_zoned_date TYPE timestamp(6) with time zone
    ALTER TABLE my_table
    ALTER TABLE my_table ADD CONSTRAINT uk_my_fk UNIQUE (my_fk_column);
    ALTER TABLE my_table ALTER COLUMN my_amount TYPE numeric(38, 2);
    ALTER TABLE my_table ALTER COLUMN my_binary TYPE bytea USING safe_lo_get(my_binary);
    ALTER TABLE my_table ALTER COLUMN my_date TYPE timestamp(6) without time zone;
    ALTER TABLE my_table ALTER COLUMN my_time TYPE time(6) without time zone;
    Add support to simply drag and drop files directly into binary/binary-link/image widgets. Users can now drag files from their desktop or file explorer directly into the widget area, bypassing the traditional system file picker dialog
    Added a lightweight, declarative workflow engine bound to models: a workflow starts from one trigger (`create`, `update`, `timer`, `manual`, or a `message` another workflow sends) and walks a graph of nodes until an `end`, covering both automation and human-approval flows. Workflows are authored as XML under `src/main/resources/workflows/`, validated against an XSD plus a graph-wide validator, then loaded into `MetaWorkflow` records the same way views and actions are. Everything runs after the triggering transaction commits, so a workflow failure never rolls back the user’s save.
    Affected usage:
    Allow opening a record in form view from the kanban view when either read or canView permission is granted.
    Allows specifying custom allocation size for sequences used by entities. This can be useful for optimizing performance.
    An `agent` or `email` node runs in the background: the run stops there, and the node runs on a worker of its own once everything before it has committed, so a slow model or mail server neither holds up nor undoes the save. A slow `script` opts in with `async="true"`, and any of the three opts out with `async="false"`. The record’s form shows such a run as pending and reloads the record once the node commits, so an edit made meanwhile does not collide with the newer version.
    BEGIN
    Behind the proxy filter, `HttpServletRequest#getRemoteAddr()` now returns the client IP address resolved from a single header: the left-most address of the header configured with the new `application.client-ip-header` setting, or of `X-Forwarded-For` by default. The address is validated and normalized, ie any port suffix is stripped and IPv6 addresses are canonicalized, whereas the left-most `X-Forwarded-For` value was previously used as it is.
    Build an agent that helps project managers triage project tasks: it reviews open tasks and changes their priority or status through the task form.
    By default, when multi-tenancy is active, the cache automatically segregates entries based on the current tenant context. Use `CacheBuilder#nonTenantAware()` to disable this behavior and allow the cache to be shared globally across all tenants.
    CREATE OR REPLACE FUNCTION safe_lo_get(oid_value oid)
    CacheBuilder.newBuilder("actions").maximumSize(1000).weakValues().build(XMLViews::findAction);
    Calendar views with context-based domains (e.g. `self.user.id = :_userId`) displayed no events because the calendar widget’s `_domainContext` overwrote the action-view’s context variables during filter merge. The DataStore’s original context is now preserved by spreading it first when building the calendar’s domain context.
    Contact contact = event.getContact();
    Contact contact = request.getContext().asType(Contact.class); **(4)**
    Details
    Don’t show automatic attrs on form view when there is at least one manual custom field, e.g. `<field name="attrs.customField" />` Static widgets on grid view (like `button`) do not prevent automatic attrs.
    Don’t use `$proxy_add_x_forwarded_for`: it keeps the `X-Forwarded-For` value sent by the client, whose left-most address would then be used as the client address.
    Due to OpenPDF library upgrade, import statements using `com.lowagie` package should be migrated to `org.openpdf`.
    END;
    Every popup also carries a close button, so it can be dismissed on the spot instead of waiting for it to fade.
    Execution history is kept at three levels, set by `workflow.trace`: `off` records failures, `runs` adds a row per run, and `nodes` adds a row per node visited. Parks are recorded at every level. A run form lists the steps it took, and a Node Metrics view groups them by node across runs.
    Extended entities having a super class were wrongly generated in project : Entities in a 'SINGLE\_TABLE' hierarchy shouldn’t be annotated with `@Table` (the root class declares the table mapping for the hierarchy). Issue only happens with entities declared in module dependencies (project dependencies not concerned).
    Extra models when field paths aren’t enough.
    Filter conditions, combinable and nestable.
    Fix changing title of toolbar buttons and menubar items in form view. Also add support for title/hidden/readonly attributes for cards/kanban/dms/grid views.
    Fix findFields returning wrong field metadata when different JSON models have fields with the same name. The method now correctly filters fields by jsonModel to avoid returning data from unrelated custom models.
    Fix initial email resend timer when email method is default. Fix email resend timer on browser refresh.
    FormResult result =
    FormSession order =
    Group by / Order by
    Grouping for aggregates and result ordering.
    Here is the list of backend dependencies upgraded :
    If that header is missing, or doesn’t provide a valid IP address, the address of the direct connection is used. No other header is tried, such as `X-Real-IP`, as the reverse proxy may not overwrite it, so it may have been forged by the client.
    Improved audit tracking with asynchronous queue-based processing to improve the performance. Now the listener performs a lightweight capture of raw data and inserts simple `AuditLog` rows into the database. The main operation has no more complex logic executed, reducing the execution time. After the transaction commits, a background thread picks up the AuditLog entries and handle the tracking process : generate the associated mail message and emails sending.
    In calendar views, the context now includes the following information:
    In previous version, we removed automatic flush calls from JPA.persist() and JPA.merge() methods to restore JDBC batching for bulk operations. We restored this behavior to ensure backward compatibilities. It was initially added for an eager synchronization model (assume read-your-own-writes consistency immediately after any `persist` or `merge`) but also to reduced cognitive load (doesn’t have to wired about potential synchronization issues). We thought the impact will be restricted, but the fact is that lot of process depending the behavior. This requires more preparation and details before we can get ride of this anti-pattern strategy and fit on standard.
    JobDataMap data = context.getJobDetail().getJobDataMap();
    JobDetail detail = context.getJobDetail();
    Joins
    Keep the DMS upload panel visible briefly after uploads complete, show accurate titles for running/failed/complete states, and add missing translations.
    List<QuickMenuItem> items = new ArrayList<>();
    Map<String, Object> data = new HashMap<>();
    Moreover, on app shutdown, we need to iterate over the cache for each tenant.
    Node types: `script` (inline JavaScript against the record), `agent` (ask an AI agent, optionally checking its answer against a declared shape), `email` (send an email template), `split` and `join` (branch on `one`, `some` or `all` flows and wait for `all`, `any` or a quorum of them), `call` (run another workflow, once or per record), `subflow` (a region of the same workflow, once or per record), `task` (a human approval with an assignee, a user, or a role or group pool), `wait` (park on a timer, a condition, a message or a signal), `send` (announce a message or broadcast a signal), `boundary` (a deadline, condition, message, signal or error attached to another node) and `end`.
    ON audit_log (processed, tx_id, related_model, related_id, event_type, created_on, retry_count);
    Order order = new Order();
    Order so = (Order) bean
    Override `ReportConfigurerImpl` instead of extending `ReportGenerator`, so that report generation fixes and improvements still apply to your application:
    Pending tasks surface in a My Approvals inbox and on the record form’s toolbar, both permission-checked per task. A workflow’s `id` is its stable identity, and each run is pinned to the revision it started on, so parked runs and tasks survive undeploy and redeploy.
    Popups now last five seconds, and stay for as long as the pointer rests on them or the keyboard focus is inside them. The five seconds start over once the pointer leaves.
    PostgreSQL gains the JPQL functions `json_extract_long`, `json_extract_date`, `json_extract_datetime` and `json_extract_time`, so a long, date, date-time or time held in a JSON field can be read with its type and passed to date functions. A JSON path names them with `::long`, `::date`, `::datetime` and `::time`; `::long` previously read as a 32-bit integer.
    RETURNS bytea AS $$
    React-based HTML applications embedded can now retrieve some information (theme/language/…​) and subscribe to changes via a listener pattern.
    Replace the unmaintained react-text-mask dependency with a fully internal \<MaskedInput> implementation covering the same feature set.
    Response response = new ActionResponse();
    Select
    Show archived boolean is replaced by selection as follow
    String action = ProjectController.class.getName() + ":updateDefaultProject";
    String desc = detail.getDescription();
    String message = service.say(contact); **(5)**
    String message = super.say(contact);
    String name = detail.getKey().getName();
    System.err.println("Job fired: " + name + " (" + desc + ")");
    System.out.printf("User: %s, User-Agent: %s%n", userCode, userAgent);
    System.out.println(contact);
    System.out.println(event.getName());
    System.out.println(event.getSource());
    The configured header is trusted as it is: the reverse proxy must overwrite it, and the application must only be reachable through the proxy. With nginx, using the default `X-Forwarded-For` header:
    The expression parser now blocks `this` and dangerous properties such as `__proto__`, `prototype`, and `constructor`, including computed access, to prevent sandbox escapes and prototype pollution vectors.
    The expression parser sandbox checked property access values against `React.createFactory`, which was removed in React 19 and is `undefined`. This caused any computed property lookup returning `undefined` (e.g. an object key miss with nullish coalescing) to falsely throw an error.
    The expression parser sandbox only blocked the regular `Function` constructor, allowing code execution through `AsyncFunction`, `GeneratorFunction`, and `AsyncGeneratorFunction` constructors obtained via `.constructor` on async, generator, and async generator function instances.
    The notification popups shown in the bottom corner disappeared after three seconds, which left no time to read a long message, let alone copy it, and no way to keep one on screen.
    The output columns — plain fields or aggregates (count, sum, avg, min, max, date parts), each with an alias.
    The record selector popup (opened from many-to-one/many-to-many/one-to-many select actions) now shows an advanced search bar in its header, letting users build custom search criteria over the selector’s grid columns instead of relying only on the plain free-text search.
    The summary bar can be used to show summary by the selected rows, page and action in a grid view.
    This allows to provide custom entity sequence allocation size in multiple ways:
    This fixes `x-popup-maximized` attribute to control the maximized (i.e., fullscreen) state of popup windows for relational fields.
    Treat HTML editor output that contains only whitespace or \<br> tags as empty. This prevents leftover \<br> content when clearing the field and allows required validation to work as expected.
    USING my_zoned_date AT TIME ZONE 'Europe/Paris'; -- check your timezone
    Use tenant-aware caches for MFAService, I18nBundle, and MetaStore. Any cache that contains database-dependent data should be tenant-aware.
    When `allocationSize` is 1, it forces Hibernate to execute a `SELECT nextval('seq')` query for every single entity saved. Having an `allocationSize` greater than 1 is the performance tuner for database inserts. It controls how many IDs Hibernate fetches from the database in a single network call.
    When a record is created through the many-to-one widget using the popup form, the record is persisted via an action. After clicking **OK**, the newly created record should be automatically selected in the M2O widget.
    When header/footer is hidden then it should still bind close handler properly so that action handler can close the view.
    Where / Having
    With multi-tenancy, AxelorCache.asMap() returns a map view for current tenant. Using it on static field either cause null tenant if called before multi-tenancy module, or resolution to tenant of first usage. AxelorCache.asMap() should be called on demand only.
    Workflows can also be built visually in a Studio designer that saves and deploys through the same validation, and authored from chat through a Studio tool exposed to the AI assistant.
    ]]>
    ]]></script> **(4)**
    ]]></string>
    `ReportGenerator` now delegates application specific behavior to an injectable `ReportConfigurer`:
    ```
    ```java
    ```sql
    ```yaml
    action="mail.important"
    active="true"> **(4)**
    addHibernateListenerConfigurator(MyHibernateListenerConfigurator.class);
    addQuickMenu(MyQuickMenu.class);
    allowClasses.add(PaymentService.class);
    allowPackages.add("com.axelor.sale.service.*");
    application.client-ip-header = X-Real-IP
    archived       boolean,
    assert bean instanceof Order
    assert count > 1
    backgroundServiceTier: FLEX
    bind(HelloService.class).to(HelloServiceImpl.class); **(2)**
    bind(ReportConfigurerImpl.class).to
    bind(classOf[HelloService]).to(classOf[HelloServiceImpl])
    call="com.axelor.data.tests.Validators:validateSaleOrder">
    compile 'org.scala-lang:scala-library:2.11.8'
    condition: self.archived = true   # whole model only: the records hidden
    confirm_order:
    const productList = $('#product-list');
    const productNames = response.data.map(e => e.name);
    contactSavedEvent.fire(new ContactSaved(contact));
    contactSavedEvent.select(NamedLiteral.of("failure")).fire(new ContactSaved(contact));
    contactSavedEvent.select(NamedLiteral.of("success")).fire(new ContactSaved(contact));
    contentType: 'application/json'
    context.put("CUSTOMER_PHONE", "+3326253225");
    created_by     bigint   constraint fk_ru17orlmi6rjhpojmeqrxbiok references auth_user,
    created_on     timestamp(6),
    current_state  text,
    data.put("percent", percent);
    data.put("tag", I18n.get("Monthly"));
    data.put("tagCss", "label-bg-success");
    data.put("total", total);
    data.put("up", total.compareTo(last) > 0);
    data: JSON.stringify({
    denyClasses.add(PaymentValidationService.class);
    design="invoice.rptdesign"
    draggable="true" onClick="project.task.add"> **(3)**
    embeddingDimensions: 1536
    error_message  text,
    event_type     varchar(255) not null,
    fields:
    fields: [email, phone]     # hidden; none listed: the whole model
    fields: name, code, email, group.name
    final Importer importer = new CSVImporter("/path/to/csv-config.xml"); **(1)**
    final List<Map<String, Object>> status = new ArrayList<>();
    final List<Model> records = new ArrayList<>();
    final List<String> names = new ArrayList<>();
    final Map<String, Object> context = new HashMap<>();
    final String userAgent = request.getHeader("User-Agent");
    final String userCode = event.getUser().getCode();
    for (Project project :
    form-examples.md
    form-items.md          **(2)**
    format="pdf">
    headers: { 'X-CSRF-Token': cookies['CSRF-TOKEN'] },
    hello.name = "Hello!!!";           **(2)**
    hello.world = world;  **(5)**
    https://axelor.com/xml/ns/data-import/data-import_10.0.xsd">
    id             bigint       not null    primary key,
    id 'com.axelor.app' version '10.0.+' **(2)**
    if (data != null && data.size() > 0) {
    if (email == null) {
    if (event.getEntity() instanceof Product) {
    if (firstName == null && lastName == null)
    if (firstName == null && lastName == null) {
    if (pattern == null) {
    if (result.status() != FormResult.Status.DONE) {
    if (title == null)
    if (title == null) {
    if (value == null || "".equals(value)) {
    if (world == null) {
    importer.addListener(new Listener() { **(2)**
    importer.runTask(new ImportTask() { **(3)**
    index: Contact      **(3)**
    int count = all(Contact).count()
    isDefault: true **(2)**
    item.product.name as productName, item.quantity * item.price AS total
    ivy { **(4)**
    language="js" **(3)**
    log.error("error saving Title");
    log.info("I would say: {}", message);
    log.info("Overriding the default HelloService.say ...");
    log.info("The default message was: {}", message);
    log.info("saving Title instance: " + title.getCode());
    maven { **(1)**
    mavenCentral()
    mavenCentral() **(3)**
    maxInputTokens: 272000
    message = String.format("You are welcome '%s!'", contact.getFullName());
    model: User
    model="com.axelor.sale.db.Order" **(2)**
    modelId: gpt-6.1-sol
    modelId: text-embedding-3-small
    name: Text Embedding 3 Small
    name: gpt-6.1-sol
    name="order-confirmation" **(1)**
    names.add("bar");
    names.add("foo");
    order.setName(JpaSequence.nextValue("sale.order.seq"));
    output="invoice-${date}${time}"
    parent="menu-mail"
    percent="first.percent" up="first.up" tag="first.tag" tag-css="first.tagCss"/>
    policies/*.yaml      **(7)**
    previous_state text,
    println("Customer: $so.customer.firstName $so.customer.lastName")
    println("Date: $so.orderDate")
    println("Items: $so.items.size")
    println(s"Say: ${what}")
    priority="20" **(3)**
    processed      boolean,
    productNames.forEach(name => {
    protected void configure() {
    proxy_set_header X-Forwarded-For $remote_addr;
    public Object importData(Object bean, Map values){
    public Object searchData(Map values){
    public void configure(IRunAndRenderTask task, IRenderOption options, Map<String, Object> params) {
    public void prepareData(Map context) {
    public void print(String design, Map<String, Object> params) throws IOException {
    public void print(String design, String format, Map<String, Object> params) throws IOException, BirtException {
    reasoningEffort: "low"
    registry.appendListeners(EventType.PRE_INSERT, myPreInsertEventListener);
    related_id     bigint       not null,
    related_model  varchar(255) not null,
    res.setStatus(Response.STATUS_SUCCESS)
    response.setData(List.of(data));
    response.setFlash(message); **(6)**
    retry_count    integer,
    return !pattern.matcher((String) value).matches();
    return "About: " + what;
    return "Hello, World!";
    return String.format("Welcome, '%s!'", contact.getFullName());
    return bean
    return contact;
    return decodeURIComponent(document.cookie)
    return false;
    return items;
    return message;
    return names;
    return new QuickMenu(
    return response;
    return result.record();
    return settings.get(AvailableAppSettings.APPLICATION_MODE, "dev");
    return title.getName() + " " + firstName + " " + lastName;
    return title;
    selection="selection-order-status" widget="single-select"/>
    service.say(ctx.getMessage)
    soService.validate(so)
    sql
    status.add(Map.of("name", "s1", "title", "Status 1", "color", "red"));
    supportsTools: true
    supportsVision: true
    tag-style="important"/> **(6)**
    tag="Important"
    template: "${name ?: code} (${code}) — email: ${email ?: 'N/A'}, group: ${group?.name ?: 'N/A'}"
    test {
    testCompile 'org.scalatest:scalatest_2.11:3.0.0'
    this.contact = contact;
    this.myPreInsertEventListener = myPreInsertEventListener;
    title = this.save(title);
    title="Important"
    toolchain {
    transactional="true" **(4)**
    try {
    tx_id          varchar(255) not null,
    type: 'POST',
    type: CHAT
    type: EMBEDDING
    updated_by     bigint   constraint fk_tbhw331n3l89dk629vmpxg4de references auth_user,
    updated_on     timestamp(6),
    url: 'ws/rest/com.axelor.sale.db.Product/search',
    usage/*.yaml         **(8)**
    useResponsesApi: true
    user_id        bigint   constraint fk_pyjqqm7hglp6pnwp3h8whian8 references auth_user
    val ctx = req.getContext.asType(classOf[Hello])
    values.put("$wkfStatus", status);
    var hello = $json.create('hello'); **(1)**
    var world = $json.all('world').by('name', '=', 'World!!!').fetchOne(); **(3)**
    version        integer,
    widgets.md
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://axelor.com/xml/ns/data-import
    xsi:schemaLocation="http://axelor.com/xml/ns/data-queries
    yaml
    { ... }
    { ... },
    |  | Replace `Europe/Paris` with your specific database instance time zone (mostly JVM/server timezone). Verify migration on a staging database before. |
    |  | You cannot add a UNIQUE constraint if you already have "bad data" (duplicates) where multiple ro
    | **1** | What the approval card asks: "Confirm the order?".                                                                                                                                       |
    | **2** | The action-view whose form it runs in — the one users open orders with.                                                                                                                  |
    | **3** | The guard, on the record as loaded. A false guard refuses the run before the user is asked; nothing of the form runs for that check. The run reads it again after the form’s load hooks. |
    | **4** | The only values the model gives. Read them as `inputs.<name>`, never bare: an input may share a field’s name.                                                                            |
    | **5** | A button, by name: its `onClick` chain runs.                                                                                                                                             |
    | **6** | The switch: its `onChange` runs after the value is set.                                                                                                                                  |
    }
    } catch (Exception e) {
    } else if (!email.matches("\w+@\w+")) {
    }),
    });
    },
    }, "..."]
    }, {
    }]
  "_chart": "chart.sales.per.month.pie",          
  "action": "check-order-dates,com.axelor.sale.web.SaleOrderController:calculate",
  "data"    : ["com.axelor.contact.db.Contact", "..."]
  "data"    : []    **(5)**
  "data"    : {},   **(5)**
  "data"    : {},  **(5)**
  "data": [
  "data": [1]
  "data": [{
  "data": {
  "errors"  : {},   **(4)**
  "fields"  : []   **(7)**
  "fields": ["fullName", "email"],
  "fields": ["fullName"],
  "fileName": "some.tar.gz",
  "filePath": "some.tar.gz",
  "id": 1,
  "limit"   : 40,  **(3)**
  "limit": 10,
  "model"   : "",  **(1)**
  "offset"  : 0,    **(2)**
  "offset"  : 0,   **(2)**
  "offset": 0,
  "password" : "secret"
  "records" : [],  **(6)**
  "records": [{
  "related": {
  "sortBy"  : [],  **(4)**
  "sortBy": ["fullName", "-createdOn"],
  "status"  : 0,
  "status"  : 0,    **(1)**
  "status": 0,
  "total"   : 0,    **(3)**
  "total"   : 32,
  "total": 120,
  "total": 2,
  "username": "admin",
  $.ajax({
  () -> {
  - code: openai/gpt-6.1-sol **(1)**
  - code: openai/text-embedding-3-small
  - entity: com.axelor.contact.db.Address
  - entity: com.axelor.contact.db.Contact
  - entity: com.axelor.contact.db.Country
  - entity: com.axelor.meta.db.MetaJsonRecord
  - entity: com.axelor.sale.db.Product
  - object: Contact
  - object: Contact            # a model, a package (com.x.db.*), a custom model, or *
  - type: RECORD
  -V, --version       Print version information and exit.
  -c, --config=FILE   Path to axelor config file.
  -h, --help          Show this help message and exit.
  ...
  // Observes built-in post-action event by its name.
  // Observes successful login.
  // Other implemented methods
  // Other methods
  // Possibly declare more listeners...
  // Probably should be called from entity listener. **(1)**
  // add dependencies
  // and so on...
  // if you want to save invoice
  // is accessible as `first`.
  // jpql or sql or method call
  // prepare invoice lines from sale order
  // template, data can be accessed using `data`, and first data item
  // work with database
  //TODO: invoice.invoiceLines = listOf(...);
  //invoice.saleOrder = em.find(Order.class, so.id);
  //return $em.persist(invoice);
  <!-- Always show zoom controls, fully zoomed out -->
  <!-- Change attributes on the root element. -->
  <!-- Change widget attribute on notes field. -->
  <!-- Disable zoom controls entirely -->
  <!-- Elements to insert -->
  <!-- Elements to replace the target element with -->
  <!-- Enable zoom slider only when more than 20 data points are present -->
  <!-- Insert a dashlet after Contacts panel. -->
  <!-- Move Extra panel before first sidebar panel. -->
  <!-- One or more extension operations -->
  <!-- Replace fullName field by firstName and lastName fields. -->
  <!-- Show only the top 20 products, aggregate the rest into "Others" -->
  <!-- close current view after action is complete -->
  <!-- dataset (optional) -->
  <!-- dataset fields (optional) -->
  <!-- define 1st level node -->
  <!-- define 2nd level node -->
  <!-- define tree columns -->
  <!-- entity definitions here -->
  <!-- named and/or colors -->
  <!-- or pre-defined palette name -->
  <!-- save current form before executing some-action,
  <!-- template is require -->
  <!-- views definitions here -->
  <!-- widgets -->
  <!-- with custom shades -->
  <![CDATA[
  </>
  </>]]></template>
  </action-view>
  </actions>
  </dataset>
  </entity>
  </extend>
  </form>
  </grid>
  </input>
  </insert>
  </menu>
  </node>
  </panel-mail>
  </panel-related>
  </panel-side>
  </panel>
  </persistence-unit>
  </query>
  </result-fields>
  </script>
  </search-fields>
  </select>
  </template>
  </track>
  </workflow>
  <>
  <DataDashlet query="sale.daily-trends" ... />
  <DataDashlet query="sale.kpi" ... />
  <ReportBox icon="search" label="Total sales" value="first.total"
  <ReportTable sums="total"/>
  <action name="act1"/>
  <action name="act2"/>
  <action name="act3" if="invoiceDate"/>
  <action-view name="contact.all"
  <actions>
  <attribute ... expr="call: com.axelor.contact.SomeController:method" /> **(3)**
  <attribute ... expr="select: s.fullName from Contact s where s.code = :code" /> **(4)**
  <attribute ... if="#{code == 'some'}" expr="#{ __self__.customer.fullName }" /> **(2)**
  <attribute ... if="code == 'some'" expr="eval: __self__?.customer?.fullName" /> **(1)**
  <button name="btnExport" icon="rocket-takeoff-fill" title="Export" onClick="act2"/>
  <button name="btnPrint" icon="printer" title="Print" onClick="act1"/>
  <call class="com.axelor.contact.web.HelloController" method="say"/>
  <call class="com.axelor.contact.web.HelloController" method="say(fullName)"/>
  <category key="month" type="month"/> **(4)**
  <column name="progress" type="integer" />
  <column name="title" type="string" /> **(1)**
  <config name="colors" value="#f44336,#4caf50" />
  <config name="colors" value="#f44336,green" />
  <config name="colors" value="red,green" />
  <config name="colors" value="roma" />
  <config name="maxSeries" value="20" />
  <config name="shades" value="10" />
  <config name="zoomThreshold" value="-1" />
  <config name="zoomThreshold" value="0" />
  <config name="zoomThreshold" value="20" />
  <context name="circleCode" expr="friend"/> **(5)**
  <dashlet action="chart:chart.sales.per.month"/>
  <dashlet action="chart:chart.sales.per.month.pie"/>
  <dashlet colSpan="12" action="sale.orders"/>
  <dataset type="jpql" limit="40">
  <dataset type="jpql">
  <dataset type="jpql"> **(3)**
  <dataset type="jpql|sql|rpc">
  <dataset type="rpc">com.axelor.sale.web.SaleOrderController:reportMonthly</dataset>
  <date name="dateOfBirth"/>
  <domain>self.circle.code = :circleCode</domain> **(4)**
  <entity name="Address">
  <entity name="Contact">
  <entity name="Order">
  <entity name="Title">
  <extend target="/">
  <extend target="//field[@name='fullName']">
  <extend target="//field[@name='notes']">
  <extend target="panel[@sidebar='true']">
  <extend target="panel[@title='Contacts']">
  <field name="address" />
  <field name="color" selection="product.color.selec
  <field name="createDate" />
  <field name="createDate" expr="eval: __date__"/>
  <field name="customer" expr="action:default-customer-record" if="!_contact"/>
  <field name="customer" expr="eval: _contact" if="_contact"/>
  <field name="dateOfBirth" />
  <field name="email" />
  <field name="email" onChange="com.axelor.contact.web.HelloController:validate(email)"/>
  <field name="endDate"/>
  <field name="fullName" />
  <field name="fullName" /> **(2)**
  <field name="hasImage" />
  <field name="items" expr="action:default-orderline-record"/>
  <field name="name" />
  <field name="name" title="Order name"/>
  <field name="name"/>
  <field name="notes" />
  <field name="orderDate" expr="eval: __date__"/>
  <field name="phone" />
  <field name="productName" title="Product" type="string" x-translatable="true"/>
  <field name="progress"/>
  <field name="project" />
  <field name="some" onChange="save,some-action,another-action,save" />
  <field name="some" onChange="some-action,close" />
  <field name="some" type="integer" />
  <field name="startDate"/>
  <field name="state" />
  <field name="statusSelect" title="Status" type="integer"
  <field name="total" type="decimal" scale="4"/>
  <field name="total" type="decimal" x-scale="2"/>
  <field name="user" />
  <field name="user"/>
  <finder-method name="findByEmail" using="email" />
  <finder-method name="findByName" using="fullName" /> **(5)**
  <flow id="big"     when="self.totalAmount &gt; 10000" next="approve"  title="Large order"/>
  <flow id="blocked" when="self.customer.blocked"       next="reject"   title="Blocked customer"/>
  <flow id="credit" next="creditCheck"/>
  <flow id="f1" when="task.rejected" next="cancelled" title="Rejected"/>
  <flow id="f2" default="true" next="confirm"/>
  <flow id="rest"    default="true"                      next="confirm"/>
  <flow id="stock"  next="stockCheck"/>
  <flow id="trail"  next="auditTrail"/>
  <form name="address-form-popup"
  <form name="contact-form"
  <grid name="contact-grid"
  <hilite background="warning" if="$contains(email, 'gmeil.com')"/>
  <hilite color="danger" if="progress == 0" />
  <hilite color="info" if="progress &gt;= 50" />
  <hilite color="success" if="progress == 100" />
  <hilite color="warning" if="progress &gt; 0" />
  <hilite if="$moment().isAfter(endDate ?? startDate)" styles="fade" />
  <hilite if="state === 'complete'" styles="strike" />
  <hilite if="state === 'progress'" styles="stripe" />
  <hilite if="state === 'todo'" styles="outline" />
  <input file="contacts.xml" root="address-book">
  <input file="sale-orders.csv" type="com.axelor.sale.db.Order"
  <insert position="before">
  <many-to-one name="title" ref="Title"/> **(1)**
  <menu title="Actions" icon="img/address-book.png" showTitle="false">
  <menuitem name="menu-contact-book"
  <menuitem name="menu-contact-friends"
  <menuitem name="menu-mail-important"
  <module name="contact" package="com.axelor.contact.db" />
  <module name="contact" package="com.axelor.contact.db"/>
  <node model="com.axelor.project.db.Project"> **(2)**
  <node model="com.axelor.project.db.ProjectTask" parent="project"
  <on field="line.order.id" op="eq" ref="o.id"/>
  <one-to-many name="addresses" ref="Address" mappedBy="contact"/> **(4)**
  <option name="falsePattern" value="(0|false|no|f|n)"/>
  <option name="format" value="HH:mm"/>
  <option name="format" value="dd/MM/yyyy HH:mm"/>
  <option name="format" value="dd/MM/yyyy"/>
  <option name="type" value="DateTime"/>
  <option name="type" value="LocalDate"/>
  <option name="type" value="LocalDateTime"/>
  <option name="type" value="LocalTime"/>
  <option value="en-GB">English (United Kingdom)</option>
  <option value="en-US">English (United States)</option>
  <option value="fr-CA">French (Canada)</option>
  <panel name="aboutMePanel" title="About me">
  <panel name="overviewPanel" title="Overview"> **(2)**
  <panel name="sidebarPanel" sidebar="true"> **(7)**
  <panel title="Attributes">
  <panel-mail>
  <panel-related name="addressesPanel" field="addresses"> **(6)**
  <persistence-unit name="persistenceUnit" transaction-type="RESOURCE_LOCAL">
  <prompt><![CDATA[Classify ${self.subject}]]></prompt>
  <query name="active-contacts">
  <result-fields>
  <script
  <script language="js" transactional="true">
  <search-fields>
  <search-fields> **(2)**
  <select model="com.axelor.contact.db.Contact" orderBy="company.name" limit="5">
  <select model="com.axelor.sale.db.Order" title="Sale Order" orderBy="orderDate,-amount" distinct="true">
  <sequence name="sale.order.seq" initial="1" increment="1" padding="5" prefix="SO"/>
  <series key="amount" groupBy="customer" type="bar"/> **(5)**
  <string name="attrs" title="Attributes" json="true" />
  <string name="customAttrs" title="Custom Attributes" json="true" />
  <string name="email" required="true" unique="true" max="100" />
  <string name="extraAttrs" title="Extra Attributes" json="true" />
  <string name="firstName" required="true" /> **(2)**
  <string name="fullName" help="true" />
  <string name="fullName" namecolumn="true" search="firstName,lastName"> **(3)**
  <string name="lastName" required="true" />
  <string name="name" ... />
  <string name="name" required="true" unique="true" min="2" />
  <string name="name" translatable="true" /> **(1)**
  <string name="notes" title="About me" large="true" />
  <string name="phone" max="20" massUpdate="true"/>
  <template>
  <template><![CDATA[
  <template><![CDATA[<>
  <track>
  <value>
  <value>a@example.com</value>
  <view name="team-task-form" type="form" /> **(2)**
  <view name="team-task-grid" type="grid" /> **(1)**
  <view type="form" name="contact-form"/>
  <view type="form" name="contact-form"/> **(3)**
  <view type="form" name="order-form"/>
  <view type="grid" name="contact-grid"/>
  <view type="grid" name="contact-grid"/> **(2)**
  <view type="grid" name="order-grid"/>
  <view-param name="details-view" value="true" /> **(3)**
  <view-param name="details-view-mode" value="overlay" /> **(4)**
  <workflow
  <workflow name="order-confirmation" model="com.axelor.sale.db.Order">
  >
  @CallMethod
  @CallMethod **(7)**
  @Inject
  @Inject private Event<ContactSaved> contactSavedEvent;
  @Inject private HeadlessForms forms;
  @Inject private HelloService service; **(2)**
  @Inject private HttpServletRequest request;
  @Inject private Logger log;
  @Override
  @SuppressWarnings("unchecked")
  @Test
  @Transactional
  And some details about breaking changes
  Detailed reference for building views with Studio — item types, JSON
  FROM
  FROM Order self
  GROUP BY
  JOIN self.items item
  LEFT JOIN
  ORDER BY
  ORDER BY self.name
  SELECT
  SELECT self.name AS name, self.statusSelect AS statusSelect,
  SKILL.md                 **(1)**
  SaleOrderService soService
  String hello();
  String say(Contact contact);
  UPDATE some_table SET foo = 'bar';
  WHERE
  ]
  ]]>
  ]]></string>
  ]]></template>
  ```
  ```sql
  action="contact.all"/> **(2)** **(3)** **(4)**
  action="mail.inbox"
  afterEvaluate {
  agents/*.md          **(6)**
  all="true" />
  and migrations steps.
  canExport: false
  canExport: true
  canRead: false
  canRead: true
  canWrite: false
  canWrite: true
  colorBy="project"
  columnBy="state" sequenceBy="priority" onNew="project.task.kanban.on.new" limit="10">
  const cookies = getCookies();
  database  Perform database maintenance operations.
  def say(req: ActionRequest, res: ActionResponse): Unit = {
  def say(what: String): Unit
  def validateSaleOrder(Object bean) {
  eventLength="1">
  eventStart="startDate"
  eventStop="endDate"
  exclude: [".*-preview"]       # ids dropped before any family is consulted
  families:                     # tried in order; the first whose `match` accepts an id owns it
  field: customer
  field: totalAmount
  filter="self.country.code = :country" all="true" />
  filter="self.id = :id or self.email = :email or self.country.code = :country"
  final List<String> names = new ArrayList<>();
  final Map<String, Object> values = (Map<String, Object>) event.getResponse().getItem(0);
  function getCookies() {
  governance/
  group = 'com.axelor'
  header.set("${version.get()} (${new Date().format("yyyy-MM-dd")})")
  hideIf: __group__ == 'user'
  https://axelor.com/xml/ns/data-import/data-import_10.0.xsd">
  https://axelor.com/xml/ns/domain-models/domain-models_10.0.xsd">
  https://axelor.com/xml/ns/object-views/object-views_10.0.xsd">
  id 'com.axelor.app' **(1)**
  id="sale-contact-form" extension="true">
  if (values != null) {
  implementation project(':axelor-contact') **(5)**
  inputPath.set(file("changelogs/unreleased"))
  invoice.date = so.confirmDate;
  java {
  knowledge AI knowledge base management.
  knowledge/<code>/KB.yaml (+ content.md)  **(4)**
  log.info("saving Title instance: " + title.getCode());
  maxModels: 8                  # hard cap across all families (default 8)
  mode="year"
  model="com.axelor.contact.db.Contact">
  model="com.axelor.contact.db.Contact"> **(1)**
  model="com.axelor.project.db.ProjectTask"
  model="com.axelor.sale.db.Order" **(2)**
  name="create.invoice" **(1)**
  names.add("bar");
  names.add("foo");
  output.set(file("CHANGELOG.md"))
  override def say(what: String): Unit = {
  override protected def configure(): Unit = {
  paramMap={{ startDate: "fromDate", endDate: "toDate" }}
  parent="menu-contact-book"
  parent="menu-mail"
  plugins {
  private Logger log = LoggerFactory.getLogger(getClass());
  private Pattern pattern;
  private final AppSettings settings = AppSettings.get();
  private final Contact contact;
  private final MyPreInsertEventListener myPreInsertEventListener;
  private static final Logger log = LoggerFactory.getLogger(MyPreInsertEventListener.class);
  procedures.yaml          **(3)**
  protected Logger log = LoggerFactory.getLogger(getClass());
  protected final Logger log = LoggerFactory.getLogger(getClass());
  protected void configure() {
  providers/*.yaml     **(1)**
  public Contact getContact() {
  public ContactSaved(Contact contact) {
  public List<MetaTheme> getAvailableThemes(User user) {
  public List<QuickMenuItem> getItems() {
  public List<String> getFooNames() {
  public Map<String, Object> create(long customerId, long productId) {
  public MetaTheme getTheme(String name, User user) {
  public MyHibernateListenerConfigurator(MyPreInsertEventListener myPreInsertEventListener) {
  public Object adapt(Object value, Map<String, Object> context) {
  public QuickMenu create() {
  public Response validate(String email) { **(8)**
  public String getApplicationMode() {
  public String hello() {
  public String say(Contact contact) {
  public String say(String what) {
  public Title saveAndLog(Title title) {
  public boolean hasFeature(String featureName) {
  public boolean onPreInsert(PreInsertEvent event) {
  public void configure(List<String> allowPackages,
  public void doSomeThing() {
  public void execute(JobExecutionContext context) throws JobExecutionException {
  public void fireContactSavedEvent(Contact contact) {
  public void fireContactSavedEventFailure(Contact contact) {
  public void fireContactSavedEventSuccess(Contact contact) {
  public void process(AbstractView view) {
  public void registerListeners(EventListenerRegistry registry) {
  public void reportMonthly(ActionRequest request, ActionResponse response) {
  public void say(ActionRequest request, ActionResponse response) { **(3)**
  public void testCsv() throws ClassNotFoundException {
  public void validate(Order order) {
  readonlyIf: confirmed && __group__ == 'manager'
  references/
  render={...} />
  repositories {
  res.setReadonly('customer', true);
  res.setValue('invoice', invoice);
  return names;
  return title;
  roles/*.yaml         **(2)**
  run       Run the application.
  search    Full-text search management.
  select sum(self.totalAmount) as total from Order self
  skills/<code>/SKILL.md (+ references/)  **(5)**
  some description here
  structure, widget catalog, and concrete form/grid examples. Load this skill
  tag-get="com.axelor.mail.web.MailController:inboxMenuTag()"
  tag-style="warning"/> **(5)**
  taskDuration="plannedDuration"
  taskParent="parentTask"
  taskProgress="plannedProgress"
  taskSequence="sequence"
  taskStart="plannedStartDate"
  this.data = imgData;
  title = 'Axelor DEMO'
  title="Address Book" /> **(1)**
  title="All Contact"
  title="Inbox"
  title="My Tasks"
  tools/*.yaml         **(3)**
  try {
  types.set(["Feature", "Change", "Deprecate", "Remove", "Fix", "Security"])
  var invoice = new Invoice();
  var req = $request; **(5)**
  var res = $response; **(6)**
  var so = req.context;
  version = "${project.version}"
  version = '1.0.0'
  void onConfirmed(@Observes @Named("action-sale-order-confirm") PostAction event) {
  void onContactChanged(@Observes ContactSaved event) {
  void onContactChangedFailure(@Observes @Named("failure") ContactSaved event) {
  void onContactChangedSuccess(@Observes @Named("success") ContactSaved event) {
  void onExport(@Observes @Priority(0)
  void onLoginSuccess(@Observes @Named(PostLogin.SUCCESS) PostLogin event) {
  void validate(Order order);
  when creating or modifying views with studio_save_view.
  when="self.confirmed == true" repeat="episode" next="check"/>
  with more details.
  x-finish-to-finish="finishToFinishTaskSet"
  x-finish-to-start="finishToStartTaskSet"
  x-start-to-finish="startToFinishaskSet">
  x-start-to-start="startToStartTaskSet"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns="https://jakarta.ee/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://axelor.com/xml/ns/data-import
  xsi:schemaLocation="http://axelor.com/xml/ns/domain-models
  xsi:schemaLocation="http://axelor.com/xml/ns/object-views
  xsi:schemaLocation="https://jakarta.ee/xml/ns/persistence https://jakarta.ee/xml/ns/persistence/persistence_3_0.xsd">
  }
  } catch (Exception e) {
  }).done(response => {
  });
  }, "..."]
  }, {
  }]
"email","Courriel","Custom translation",
"key","message","comment","context"
#
# (fallbacks to designs provided by modules)
# (quartz scheduler should be enabled for fetching stream replies)
# 10.0 Changelog
# 8.0 Changelog
# 8.0 Migration Guide
# 8.1 Changelog
# 8.1 Migration Guide
# AI
# Actions
# Actions & Menus
# Adapters
# Advanced Customization
# Advanced Import & Export
# Advanced Services
# Agent Builder
# Agents
# Analytics
# Auth Services
# Authentication
# Backend host configuration
# Branching and Joining
# Build Jobs & Repositories
# Building with the AI Assistant
# By default, common document types (pdf, doc, xls, etc.) are supported.
# CORS configuration
# CORS settings to allow cross origin requests
# CSV DataSource
# Caching
# Calendar View
# Cards View
# Chart View
# Chat & Context
# Comma-separated list of additional MIME types to be indexed.
# Command line
# Configuration & Seeding
# Configurations
# Connection timeout in milliseconds
# Custom Fields
# Custom Models
# Custom View
# Dashboard
# Data Queries
# Data Transformation
# Data Widgets
# Database settings
# Defaults to 300000 ms (5 minutes)
# Details View
# Development
# Discards connections after they have been idle this many milliseconds (disabled by default)
# Document Services
# Eclipse
# Enable Elasticsearch backend for Hibernate Search
# Events
# Export Data
# Extension Views
# For Elasticsearch: default port 9200
# For OpenSearch: default port 9200
# Form View
# Format of console log message
# Format of file log message
# Format: application.entity.sequence.<SEQUENCE_NAME>.allocation_size
# Frequency (in milliseconds) at which an instance "checks-in" with the other instances of the cluster
# Gantt View
# Global Search
# Global logging level
# Grid View
# Groovy Scripting
# Groovy/JavaScript scripts execution timeout (in milliseconds)
# Group Action
# Headless Forms
# Hibernate Event Listeners
# IMAP configuration
# IMAP server configuration
# Import Data
# Index a specific tenant
# Integration
# IntelliJ IDEA
# Internationalization
# Job Scheduling
# Kanban View
# Keyboard Shortcuts
# Knowledge Bases
# Lifecycle: Versions & Deployment
# Logging
# Logging level for `com.axelor` package
# Logging level for `org.hibernate` package
# Maximum number of connections that the DataSource can create in its pool of connections (defaults to `quartz.thread-count`)
# Maximum size of files (in MB) to be considered for content indexing.
# Menus
# Messaging
# MetaData Services
# Method Action
# Migrating from the BPM module
# Models
# Multi-Tenancy
# Number of entities to fetch and process in each batch during mass indexing.
# Number of parallel threads to use for loading entities from the database.
# Object Views
# Optional SQL query string that the DataSource can use to detect and replace failed/corrupt connections
# Overview
# Procedures
# Projects & Resources
# Protocol (http or https)
# Providers & Models
# Quartz Scheduler
# Queries
# Quick Menus
# REST Services
# Re-index everything from scratch
# Read timeout in milliseconds
# Record Action
# Reference & Administration
# Reports
# Repositories
# Request timeout in milliseconds (for index/search operations)
# SMPT configuration
# SMTP server configuration
# SOAP DataSource
# Scala Support
# Script Action
# Scripting Security Policy
# Search View
# Security
# See hibernate documentation for connection parameters
# Selections
# Sequences
# Services & Controllers
# Set default allocation size for all sequences
# Single sign-on common configuration
# Skills
# Specify whether to enable quartz scheduler
# Step 3: Define Models
# Step 4: Define Views
# Step 5: Define Actions
# Step 6: Configuration
# Step 7: Start the Server
# Storage path of logs files
# Studio
# Studio View Design **(3)**
# The external report design directory
# Themes
# Tools
# Transaction timeout in seconds for the mass indexer.
# Tree View
# Usage Policies & Logs
# Use JobStoreTX for persistence instead of default RAMJobStore
# User Tasks & Approvals
# VSCode
# View Attributes
# View Processors
# Views
# Views Collaboration
# Web Client
# Web Services
# Widgets
# Workflow Definitions
# Workflow Designer
# Workflow Execution
# Workflow Nodes
# Workflows
# Works for both Elasticsearch and OpenSearch
# XML DataSource
# call identity provider logout endpoint
# callback URL for all indirect clients (defaults to application.base-url + "/callback")
# comma-separated list of exact origins (scheme://host[:port]) or * to allow all
# default group for created users
# enable multi-tenancy
# local build executor: gradle arguments and timeout in minutes
# logout URL
# logout URL pattern
# path to the webapp sources used to assemble the application WAR;
# quartz job scheduler
# remove profiles from session
# required for the Build (WAR export) button
# the number of jobs that can run simultaneously
# this directory is searched for the rptdesign files
# timeout settings
# total number of threads in quartz thread pool
# user provisioning: create / link / none
# where exported apps are written
# ~~~~~
## 10.0.0 (2026-10-23)
## 8.0.2 (2025-12-01)
## 8.0.3 (2025-12-04)
## 8.0.4 (2026-01-05)
## 8.0.5 (2026-01-23)
## 8.1.0 (2026-02-20)
## 8.1.1 (2026-03-09)
## A first agent
## A first workflow
## AI assistant
## API key authentication
## Accessing the tool
## Acting on a task
## Action Report
## Action Service
## Action kinds
## Actions
## Activating a revision
## Add a provider
## Add a tool
## Add attachment
## Adding custom fields to an existing model
## Advance configuration
## Advanced Delete
## Advanced Read
## Advanced Search
## Agent permissions
## Alternative form view
## Application
## Application Configuration
## Application Menu
## Application Settings
## Approvals on the record
## Asking for whole features
## Attachments
## Audit tracking
## Authentication
## Authorization
## Available Fields
## AxelorCache Interface
## Build an agent
## Building a data dashboard
## Building by describing
## Building the graph
## Built-in Events
## Built-in commands
## Built-in templates
## Built-ins variables
## Button
## CORS
## CSRF Protection
## CacheBuilder
## Change Tracking
## Chart types
## Choose an exchange mode
## Choose fields and options
## Choosing a model kind
## Choosing one path: `mode="one"`
## ColorPicker
## Colors
## Column
## Command line app
## Command line tool
## Common attributes
## Concepts
## Config
## Configuration
## Configure
## Connecting a project to git
## Consuming queries
## Context
## Controllers
## Core Security Rules
## Create Controllers
## Create Scala module
## Create Services
## Create a record
## Create an agent
## Creating a chart
## Creating a custom model
## Creating a menu
## Creating a project
## Creating a query
## Creating a selection
## Creating a workflow
## Creating a workflow in a module
## Creating an action
## Creating new revisions
## Creating or editing a view
## Custom Events
## Custom translations
## Customization
## Customizing a shipped workflow
## Dashboards
## Data Mapping
## Data zoom threshold
## Database Settings
## Date
## Deactivating
## Debug
## Decimal
## Define a domain entity
## Define fields
## Define menus
## Define views
## Defining a skill as a seed file
## Definition
## Delete a record
## Delete attachment
## Dependencies upgrade
## Directory Structure
## Discussion Groups
## DistributedFactory
## Doing every step: `mode="all"` + `wait="all"`
## Element map
## Email
## Email integration
## Entities and enums
## Events
## Example
## Execution Timeouts
## Export a data set
## Export formats
## Exporting
## Expressions
## Expressions and scripts
## Extra Code
## Field
## Field properties
## File download
## File listing
## File upload
## Files and sources
## Files storage
## Find records
## Finders
## Finding and managing resources
## Following a build
## Form View
## Form designer
## From
## Full migration script
## Get model properties
## Get models
## Give an agent a skill
## Give an agent knowledge
## Gotchas worth knowing
## Governance files
## Grid designer
## Grid view
## Grid width
## Hibernate 5.6 to Hibernate 6.6
## Hilite
## How rows are matched
## Import a file
## Indexing
## Integer
## Integration
## Introduction
## Its tools
## Java 11 to Java 21
## Java EE to Jakarta EE
## Jobs
## Join
## Json content
## Knowledge base
## Layout Components
## Limitation
## Limitations
## List attachments
## Loading and overriding
## Login
## Logout
## Making dashboards readable
## Many-to-many columns
## Mapping Configuration
## Menubar
## Menubar and toolbar
## Messaging Menu
## Model fields
## Models
## Monitoring runs
## Multi-Factor Authentication (MFA)
## Multi-threading
## Node
## Node Binding
## One difference to know before you start
## Opening Studio
## Operational limits
## Options
## Other view types
## Overriding
## Overview
## Panels
## Password
## Per module web resources
## Per-user enforcement
## Performance Considerations
## Permissions
## Phone
## Policy Configuration
## Positioning
## Predefined fields
## Progressive disclosure
## Provider fields
## Publishing
## Query Structure
## Quick Start
## Quickstart
## Rating
## Read a record
## Record identity
## Related documentation
## Report Data Source
## Request
## Requirements
## Response
## Retrieval
## Review the result workbook
## Revision status
## Round-trip updates
## Routing on the outcome
## Run a form
## Run the application
## Running in the background
## Save a configuration
## Saved mappings
## Search Usage
## Security
## Seeding, reload and modes
## Select
## Series limit
## Services
## Session-based authentication
## Single Sign-On
## Slider
## Source controls
## Sources
## Special actions
## Steps
## Streaming, disconnects & multiple tabs
## Streams & Discussions
## String
## Strings
## Supported Event Types
## Supported Languages
## Sync models from the provider
## Syncing
## Tags
## Task lifecycle
## Template
## The Dataset
## The Todo example, complete
## The `ai/` seed layout
## The chat panel and conversations rail
## The composer
## The designer
## The export dialog
## The format
## The import dialog
## The one rule to remember
## The record and its lines
## The skill record
## The tool record
## Tool types
## Toolbar
## Translation Fallback
## Translations
## Triggers
## UUID
## Update a record
## Url
## Usage
## Usage Example
## Usage log
## Usage policies
## Using Java types
## Using a selection
## Validating and deploying
## Value Translation
## View Access
## View Action
## Views
## What an agent is made of
## What bounds the assistant
## What happens on a save
## What it can build
## What it can change
## What you can build
## What you can rely on
## What’s Next?
## When a build is needed
## When to save a query
## When to use
## When to use a workflow
## Where
## Who gets the task
## Widgets
## Wiring actions
## Working in a revision
## Write a procedure
## Write effective skills
## XML Hotswap
## Your first app in five steps
## `__bean__` Helper
### A branch may wait
### AOP dependencies resolution
### API key validation
### Accessing Global Search
### Action Events
### Allowed
### Annotation-based Whitelisting
### Application Events
### Asynchronous Processing
### Automatic Indexing
### Backend Connection Settings
### Bind a Configurator
### Builder Creation
### Builder Options
### Building the Cache
### Capture recovery
### Change
### Changelog plugin
### Check duplicate classes plugin
### Common Configuration
### Comparison Operators
### Create a Listener
### Cross Join
### DataDashboard
### DataDashlet
### DataSet
### DataWidget
### Database session
### Denied (cannot be overridden)
### Enabling Global Search
### Encoded properties
### Environment variables
### Event Object
### Event Observer
### Event Source
### External configuration
### Feature
### Field
### File Indexing
### Fix
### Helper functions
### Implement a Configurator
### Implicit Joins
### Indexing Configuration
### Internal configuration
### JobStore
### Link sheets
### Login Events
### MFA verification flow
### Managing API keys
### Managing MFA configuration
### Mass Indexing
### Multi-instance
### Panel
### Panel Tabs
### Programmatic Configuration
### Properties
### Qualifiers
### Records the same file creates
### Relation Join
### Request Events
### Resolution
### Response Signals
### Save once, after the join
### Schema Changes
### Security
### Special Operators
### Supported MFA methods
### System properties
### Template
### Types
### Using API keys for authentication
### Using a JNDI DataSource
### Using the Search Interface
### Version Compatibility
### What a non-technical export contains
### What if nothing matches?
### YAML Mapping Example
### allocationSize
### attribute
### database
### dynamicUpdate
### extend
### insert
### move
### persistable
### replace
### report-box
### report-table
### run
### search
### strategy
#### Column Types (on PostgreSQL)
#### Creating API keys
#### JDBC JobStore Clustering
#### JDBC JobStore Data Source
#### Managing existing API keys
#### Restricting API keys by IP address
#### Task 'encryptFile'
#### Task 'encryptText'
#### Token operations
#### Workflow Status Tags
#### `CaffeineCacheBuilder`-Specific Options
#### database encrypt
#### database init
#### database migrate
#### database update
#### search index
#cors.allow-credentials = false
#cors.allow-headers = Origin,Accept,Authorization,X-Requested-With,X-CSRF-Token,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers
#cors.allow-methods = GET,PUT,POST,DELETE,HEAD,OPTIONS
#cors.allow-origin = https://example.com
#cors.expose-headers = X-CSRF-Token
#cors.max-age = 1728000
#mail.imap.channel = ssl
#mail.imap.host = imap.gmail.com
#mail.imap.password = secret
#mail.imap.port = 993
#mail.imap.properties.<
#mail.imap.user = user@gmail.com
#mail.smtp.channel = starttls
#mail.smtp.connection-timeout = 60000
#mail.smtp.from =
#mail.smtp.host = smtp.gmail.com
#mail.smtp.password = secret
#mail.smtp.port = 587
#mail.smtp.properties.<java-mail-property> =
#mail.smtp.timeout = 60000
#mail.smtp.user = user@gmail.com
$ ./bin/axelor search index
$ ./bin/axelor search index --drop
$ ./bin/axelor search index --tenant my_tenant
$ ./gradlew --no-daemon run
$ ./gradlew :encryptFile --password="MySecureKey"
$ ./gradlew :encryptText --text="A secret to encode" --password="MySecureKey"
$ ./gradlew build
$ ./gradlew i18n [--with-context] [--languages <comma-separated language tags>]
$ ./gradlew installDist
$ axelor --help
$ axelor -c /path/to/axelor-config.properties run
$ axelor database --help
$ axelor database [SUBCOMMAND]
$ axelor database encrypt [OPTIONS]
$ axelor database init
$ axelor database migrate
$ axelor database update --module axelor-sale --module axelor-purchase
$ axelor database update [OPTIONS]
$ axelor run --help
$ axelor run [OPTIONS]
$ axelor search index [OPTIONS]
$ createdb axelor-demo
$ export AXELOR_CONFIG_DB_DEFAULT_PASSWORD="secret"
$ export JAVA_OPTS="-Daxelor.config.db.default.password=secret"
$ export JAVA_OPTS="-Daxelor.config=/path/to/dev.properties"
(
));
);
*   **Action** — run an existing Axelor action
*   **Admins are exempt.** The login `admin`, the `admins` group, or the `ai-admin` role gets unlimited quota and no rate limit, full stop — none of the rest of this section applies to them.
*   **Algorithm change** — set `encryption.old-algorithm` to the previous algorithm. `encryption.old-password` is not required and defaults to the current `encryption.password`.
*   **Allow re-import** uses technical headers and values. It is the correct setting for files that will be imported again. It also makes `id` and `importId` available when those stable identifiers are needed for an update.
*   **Audit fields** reveals `createdBy`, `createdOn`, `updatedBy` and `updatedOn` in the available-fields list.
*   **Auto-layout** — arrange the graph horizontally or vertically with one click. Positions and edge routes are kept in the definition’s `<layout>` block, which the engine ignores, so the diagram reopens as you left it. A definition without one is laid out when it opens.
*   **Badges** — a split’s badge is its mode and a join’s is its `wait`: `+` for a join that waits for every branch, and the count for one that continues on the first arrival (or the first N) and cancels the rest. So the two halves of a race are legible without opening either inspector.
*   **Boundaries** — a boundary is attached by drawing an edge from the wait, the approval, the single-call or the subflow region it watches into it (the context menu of each of those four node types also offers **Attach boundary**, since only a node that parks can be timed or watched; a script, agent or email offers it too, and gets an error boundary, since those are the nodes that can fail). That edge is dashed and carries no arrow head, because it is not a step the run takes: it says which park the boundary is racing. The boundary’s own outgoing edge is where the run goes when it fires. Its **Trigger** is picked from what the host allows — a timer, a condition, a message or a signal on a node that parks, an error on one that runs — and an error boundary’s **Error code** may be left empty to catch any failure. A "Cancels the host" checkbox on its properties, checked by default, decides whether firing closes the park or leaves it open; unchecked, the badge draws a dashed second ring — BPMN’s own glyph for a non-interrupting boundary.
*   **Chaining** — an event handler may list several actions separated by commas, and the special name `save` persists the record mid-chain: `action-validate,save,action-send-mail`.
*   **Choose their preferred MFA method**: Select between the two supported methods (TOTP or Email).
*   **Client** — a UI interaction (ask the user, open a view)
*   **Collections**: One-to-Many and Many-to-Many relationships are not supported.
*   **Condition** *(Optional)* - A JS expression to set the attribute value if and only if the expression evaluates to true.
*   **Configure and test the setup before enabling it**: Before activating MFA, users are guided through a setup process to register their chosen method and confirm that it’s working correctly by entering a test code.
*   **Custom fields**: Custom fields are automatically indexed
*   **Edge menu** — right-click a split’s arrow to **Make default**, **Make conditional**, **Move earlier** or **Move later**, or any edge to **Delete** it. A branch that still needs its condition is marked.
*   **Edges** — connect a node’s output handle to the next node; a split grows one edge per flow, labelled with the flow title or its condition.
*   **Elasticsearch**: 7.10 - 8.18
*   **Email verification**: A 6-digit code sent to the user’s registered email address. The code is typically valid for 5 minutes.
*   **Enable/Disable MFA**:MFA is optional and can be turned on or off from the settings page.
*   **Entity type b
*   **Errors** identifies the source, column, submitted value, line — the data row number, not counting the header — and validation or conversion error.
*   **Expressions** — computed values use the `eval:` prefix (`eval: *date*.plusDays(7)`); unprefixed values are taken literally. A **condition** on an action or item makes it fire selectively.
*   **Field** *(Required)* - The field on which the attribute should be applied. Custom fields are supported (example: *attrs.myCustomField*).
*   **Field** — a field rule’s `canRead` and `canWrite` flags decide, on every path, and administrators are held to them too, as the platform’s server-side checks hold them. A rule’s `hideIf` and `readonlyIf` are view attributes and play no part. A custom field is readable unless it names roles the user lacks, and writable when readable.
*   **File fields**: File content is automatically extracted and indexed
*   **Flat export** creates one data source containing scalar fields, values from to-one relationships and the main model’s many-to-many fields. One-to-many fields, and many-to-many fields of related records, are not available in flat mode.
*   **Flat import** (a setting of the whole file, not of one source) treats dotted fields for to-one relationships as values of the related record. It finds that record by its key, creates it when missing and attaches it to the main record, instead of failing with "Relation not found." Only the related record’s key columns — its unique field, `importId` and `id` — are used; its other columns are ignored. Many-to-many columns import the same way in either mode — see Many-to-many columns.
*   **Generate recovery codes**: After enabling MFA, a set of 10 recovery codes is generated automatically.
*   **HTTP** — call an external API
*   **Hashing algorithm upgrade** — migrating from the legacy `$AES$` format (PBKDF2WithHmacSHA1) to the new `$AESv1$` format (PBKDF2WithHmacSHA256). No extra configuration is needed: the password and AES algorithm remain the same, only the hashing algorithm changes.
*   **ID Gaps:** IDs may not be strictly sequential, especially in multi-instance deployments
*   **In a shared conversation, the asker’s policy governs** — not the owner’s. Whoever ran the turn pays for it, is rate-limited by it, and is the one refused at quota, whether or not the conversation is theirs (see Chat & Context).
*   **Initial encryption** — encryption settings were not configured initially, and you now want to encrypt existing plain-text field values. No extra configuration is needed.
*   **Inspector** — select a node to edit its properties: the script body, the split’s **Mode** (the first match ✕, every match ○, every branch +), the join’s **Waits for split** and **Wait** (every branch, the first arrival, or enough arrivals — which reveals its own **Arrivals** field), the task assignment (assignee expression or user, role/group candidate pool), and so on. A branch’s condition is edited by selecting its arrow, and is hidden on a parallel split, which takes every branch without testing anything. Expressions open in an expression editor.
*   **Large Data**: Binary fields (files, images) are excluded.
*   **Link sheets** is described under Link sheets.
*   **Logical @OneToOne UNIQUE constraint**: Hibernate now always generates a UNIQUE constraint on the foreign key column for `@OneToOne` associations.
*   **Model and row** — every read, create, update and delete goes through the user’s model permission for that operation, and every read through their row filter, so a model-wide read permission is not permission to read every row. A record a filter excludes reads back as "not found," not as a distinct "forbidden." Administrators are exempt, as they are in the web client.
*   **Model** *(Required)* - The FQN of the name on which the view attribute should be applied.
*   **Multi-Instance:** Each application instance maintains its own independent ID cache
*   **Name** *(Required)* - The name of the attribute we want to set. Can be any value handled by usual Attrs Actions.
*   **Name** *(Required)* - The value of the attribute we want to set.
*   **Near-zero save-path cost.** Saving a record whose model has no active workflow costs a set lookup. State is persisted only where durability is unavoidable.
*   **Negative value** — zoom is disabled entirely; no zoom controls are rendered.
*   **No Collisions:** Despite gaps, ID uniqueness is guaranteed across all instances
*   **No matching policy means no limit**, not a denial. A user no active `AiUsagePolicy` applies to has unlimited quota and no rate limit. A global policy gives everyone a baseline instead.
*   **Nothing runs inside your transaction.** The save path only detects; the workflow dispatches after the transaction commits, in its own transaction. A workflow failure never rolls back the user’s save.
*   **Object** — a model’s simple or full name, a package (`com.axelor.sale.db.`**, not its sub-packages), a custom model’s name, or ``** for every model. A simple name is kept as the full name; one that two models share, or a model and a cust
*   **One expression language.** All conditions and scripts are JavaScript. Trigger `when` conditions run in a restricted, sandboxed evaluator — in-memory field access only.
*   **Only `CHAT` calls count against the quota** — what a person asks in the chat panel. Programmatic calls (`API`: `AiService.ask`, workflow agent steps) neither count nor are refused by it, so a workflow does not stop because the user it runs as spent their month chatting; they stay rate-limited. Background work billed to the same provider account — title generation, session notes, summarization — is logged under its own `source` value (below) but never added to a user’s monthly total.
*   **OpenSearch**: 1.3 - 2.16
*   **Order** *(Optional)* - If several records set the same view attribute, define which one has the priority.
*   **Palette** — drag any node type onto the canvas: script, agent, email, call, subflow, task, wait, send, split, join, boundary, end. Split and Join are two separate elements, each with its own required properties: a split says how it chooses among its branches, a join says which split it is for and what it waits for.
*   **Password and algorithm change** — set both `encryption.old-password` and `encryption.old-algorithm` to their respective previous values.
*   **Password rotation** — set `encryption.old-password` to the previous password. `encryption.old-algorithm` is not required and defaults to the current `encryption.algorithm`.
*   **Paths** — a dotted path, in a query or a filter, is readable when every field along it and every model it enters is. A filter reads its field as surely as a selection does: `salary > 5000` tells who earns more.
*   **Per-node options** — a script, agent or email has a **Run in background** toggle (on by default for an agent or email, off for a script). An email picks its **Template** from the templates configured for the workflow’s model, and an agent picks its **Agent** and declares the **Answer** it must give, field by field, with allowed values for a string field. A wait or boundary has one **Trigger** list — **Timer**, **Condition**, **Message** or **Signal** — and a send chooses whether it **Sends** a message or a signal, with its **Correlation key**, **Payload**, **Expect** and **Keep offering for (seconds)**.
*   **Positive value** — zoom slider is enabled only when the number of data points exceeds the value. The initial view shows the first N items. Defaults to `50`.
*   **Recovery codes**: A set of 10 backup codes that can be used when primary MFA methods are unavailable.
*   **Red highlight**: For expired tokens
*   **Revoke**: Permanently disables the token. Any services using this token will immediately lose access.
*   **Roles** *(Optional)* - A set of user roles on which this view attribute will be applied. If empty, the view attribute will be applied to all the users.
*   **Rotate**: Replaces the token with a new one while maintaining the same name, expiration date and allowed IPs. This is useful when you suspect a token might have been compromised.
*   **Script** — run JavaScript
*   **Security Sensitive**: Passwords and encrypted fields are never tracked.
*   **Set a default MFA method**: users can designate the default MFA method by clicking the star button next to it. This method will then be used during login.
*   **Statistics** reports successful and failed rows by source.
*   **Studio → Resources** lists every resource of every project with its type, status and version — the quickest way to find one by name. Open a resource and click the designer button in its toolbar to edit it.
*   **Subflow regions** — a subflow is not a node you open; it is drawn in place, as a titled box holding its own nodes. Drop nodes inside the box to add them to the body, and use the two buttons in its header to arrange that body on its own, horizontally or vertically, independently of the document around it.
*   **TOTP (Time-based One-Time Password)**: A 6-digit code generated by an authenticator app (e.g., Google Authenticator). The code refreshes every 30 seconds and is valid only during that short window.
*   **The window is a calendar month, checked before the call.** Usage resets on the 1st, and a request that would push a user over quota is refused before it reaches the provider — there is no after-the-fact reconciliation.
*   **Toggle compute** re-saves its successful records after all sources have been imported. Use it when model logic needs a final save after related data exists.
*   **Transient**: Fields that are not persisted to the database.
*   **Translatable fields**: Translatable values are automatically indexed in all available languages
*   **View** *(Optional)* - The name of the form view on which the view attribute should be applied. If empty, the attribute will be applied on all the form views representing the given model.
*   **Wasted IDs:** Restarting an application instance loses any unused cached IDs
*   **When more than one policy matches, the maximum wins** — not the most specific and not the first found. A generous policy anywhere in the matching set overrides a stricter one sitting next to it, so a global policy is a floor, not a ceiling: a targeted policy can raise a user above it, never below. To exempt someone from a global limit, give them a policy with a higher one.
*   **Yellow highlight**: For tokens expiring within 7 days
*   **Zero** — zoom slider is always shown, fully zoomed out (all data visible). Useful when you want precise zoom controls regardless of how many data points are present.
*   **application.audit.logs.flush-threshold**: Maximum number of AuditLog entries buffered in memory before triggering an automatic flush to the database. Default to the JDBC batch size value where the default value is `20`.
*   **application.audit.logs.max-retry**: Limit how many times the processor will attempt to handle a specific group of logs before giving up. Default to `3`.
*   **application.audit.processor.activity-window**: An interval in milliseconds. Defines the time window to consider the system "Busy" after a user action. Default to `200`.
*   **application.audit.processor.batch-delay**: An interval in milliseconds. The pause taken after successfully processing a batch and before starting the next one. Default to `5`. Prevent consuming 100% of resources in case of massive audit log records to process.
*   **application.audit.processor.batch-size**: AuditProcessor batch size. Defines the number of audit log groups fetched and processed in a single transaction. Default to `100`.
*   **application.audit.processor.busy-backoff-interval**: An interval in milliseconds. The amount of time the processor sleeps when it detects the system is "Busy". Default to `200`.
*   **application.audit.processor.busy-backoff-max-retries**: A number. The maximum number of retries the audit processor will pause and retry when the system is detected as "Busy". Default to `3`. Prevents the audit processor from being permanently blocked during periods of sustained high load.
*   **binary**: `binary` fields declared in domains now map to `bytea` instead of `oid`. `bytea` is the modern standard for binary data up to a few hundred megabytes. `oid` is a legacy mechanism that introduces significant maintenance headaches and should only be used for specific "streaming" use cases.
*   **content** - the json content (see bellow)
*   **datetime (tz)**: same as `datetime` for the microsecond precision but also map to `with time zone` instead of `without time zone`. It shifts data from being "Wall Clock Time" (what a clock on the wall says) to "Absolute Time" (a specific moment in the universe).
*   **datetime**: `datetime` fields declared in domains now map to `timestamp(6) without time zone` (6 digits of fractional seconds, i.e., microseconds) instead of `timestamp without time zone` (with no params).
*   **decimal**: `decimal` fields declared in domains without a custom `scale` and `precison`, now default to precision `38` (previously often 19) to better align with SQL standards.
*   **label** - label/description of the theme
*   **name** - name of the theme
*   **time**: same as `datatime`, `time` fields declared in domains now map to `time(6) without time zone` (6 digits of fractional seconds, i.e., microseconds) instead of `time without time zone` (with no params).
*   *Messaging → Archived* - shows all the archived messages
*   *Messaging → Groups → All Groups* - show all the available groups
*   *Messaging → Important* - shows all the messages marked as important
*   *Messaging → Inbox* - shows all the non-archived messages
*   *create* – Creates the database schema from scratch. This will drop any existing tables and recreate them based on the mappings defined in the Hibernate configuration.
*   *create-drop* – Creates the database schema and drops it when the SessionFactory is closed.
*   *none* : Does not perform any schema generation or validation
*   *update* – Updates the database schema to reflect any changes made to the mappings defined in the Hibernate configuration. This will add new tables or columns, but it will not drop any existing tables or columns.
*   *validate* – Validates the database schema against the mappings defined in the Hibernate configuration. This will check that the database schema is in sync with the mappings, but it will not make any changes to the schema.
*   A **candidate pool** (`role` and/or `group`) makes the task visible to all members; a member must claim it before acting.
*   A first workflow
*   A many-to-one field is written as the related record’s name, or its key when it has no name field.
*   A results area displaying matching records with highlighted search terms
*   A rolled-back transaction dispatches nothing.
*   A search input field where you can type your query
*   A single CSV file (`.csv`), whose one source is the model being imported into, whatever the file is called.
*   A translation already provided in another module (through dependencies) which you need to override
*   A translation key present in a file not scanned by `./gradlew i18n` task (e.g. *.rptdesign* files used to design BIRT reports)
*   AI assistant
*   Accessing the tool
*   Action Report
*   Action Service
*   Action kinds
*   Activating a revision
*   ActiveMQ Artemis Addressing
*   Add `ReportConfigurer` to customize report generation
*   Add advanced search support to record selector popup
*   Add attachment
*   Add drag-and-drop support into the widget area
*   Add summary bar feature in grid view
*   Add support to custom entity sequence allocation size
*   Add the workflow automation engine
*   Add typed JSON extract functions for longs, dates and times
*   Adding custom fields to an existing model
*   Advance configuration
*   Advanced Delete
*   Advanced Read
*   Advanced Search
*   Allow displaying archived records only from advance search
*   Allowed IPs: The IP addresses allowed to use the token, if restricted
*   Alternative form view
*   An **assignee** (`assignee` expression or `user` login) gets the task assigned and auto-claimed.
*   An optional filter dropdown (labeled "All…​") to narrow results to specific entity types
*   And others…​
*   Apache HTTP Client (Java)
*   Application Settings
*   Application configuration
*   Apply tenant-aware for database-dependent caches
*   Asking for whole features
*   Asynchronous Queue-Based Audit Tracking
*   Audit tracking
*   Authentication
*   Available Fields
*   Axelor Common
*   Axelor DB
*   Axelor RPC
*   Axelor i18n
*   AxelorCache Interface
*   Bind the service interface with the default implementation
*   Block expression sandbox escapes via this and prototype access
*   Both may coexist.
*   Building a data dashboard
*   Building by describing
*   Building the graph
*   Built-in Events
*   Built-in templates
*   Built-ins variables
*   CORS
*   CSRF Protection
*   CacheBuilder
*   Calendar - shows data in schedule like view
*   Calendar View - represents data as agenda/schedule based on date/time information
*   Cards - shows data list as cards
*   Chain bind the default implementation with new implementation
*   Chart - shows data as 2D graphs
*   Chart View - represents data as 2D graphs
*   Choose an exchange mode
*   Choosing a model kind
*   Column
*   Concepts
*   Configuration
*   Configure
*   Connecting a project to git
*   Consuming queries
*   Context
*   Core Security Rules
*   Create Controllers
*   Create Scala module
*   Create Services
*   Create a record
*   Creating a chart
*   Creating a custom model
*   Creating a menu
*   Creating a project
*   Creating a query
*   Creating a selection
*   Creating a workflow
*   Creating an action
*   Creating new revisions
*   Creating or editing a view
*   Custom - shows data using custom templates
*   Custom Events
*   Custom models, custom fields, JPA entities and enums — and it initializes or refines the model’s views.
*   Custom translations
*   Customization
*   Dashboards
*   Data Mapping
*   Data dashboards bind dashlets to queries by name — Analytics.
*   Dates, date-times and numbers are formatted for your locale and written as text.
*   Deactivating
*   Debug
*   Define a business service interface
*   Define menus
*   Delete a record
*   Delete attachment
*   Deleting a resource removes it from the revision. To take a deployed customization out of the running application, deactivate the revision instead.
*   Deny all, grant selectively (proven most secure as all permissions are denied by default)
*   Dependencies upgrade
*   Development: `update` is the go-to for flexibility.
*   Directory Structure
*   Disallow `form` tag in DOMPurify sanitization
*   DistributedFactory
*   Don’t show automatic attrs on form view when there is at least one manual custom field
*   Each event runs in a fresh transaction of its own. A workflow failure can never roll back the user’s save, and one event’s failure does not discard another’s.
*   Each failed source has a sheet containing the original rejected rows.
*   Each tab’s **New** button creates a resource and opens its designer immediately. Views and actions have a **New** menu instead, one entry per kind.
*   Elasticsearch Settings Reference
*   Entities and enums
*   Environment variables prefixed with `AXELOR_CONFIG_`
*   Events
*   Example
*   Excel workbooks (`.xlsx`), with one source per sheet.
*   Execution Timeouts
*   Expiration date: When the token will expire
*   Export Data explains field selection, formats and saved export configurations.
*   Exporting
*   Expression Language: not checked, as loops are not supported.
*   Expressions
*   External configuration file using `AXELOR_CONFIG` environment variable or `axelor.config` system property.
*   Extra Code
*   Field properties
*   File download
*   File listing
*   File upload
*   Files and sources
*   Files storage
*   Find records
*   Finders
*   Finding and managing resources
*   Fix EML file upload failures
*   Fix MFA form email resend timer
*   Fix SingleSelect dropdown not closing on Tab key
*   Fix `x-popup-maximized` attribute on relational fields
*   Fix action-attrs support on tooolbar/menubar
*   Fix adding custom button in grid view customization
*   Fix alpha transparency usage in theme editor
*   Fix auto-selection of created record in M2O widget
*   Fix bind close action in popup view
*   Fix check draggable attribute in tree view node
*   Fix connect/disconnect lines in gantt view
*   Fix dms grid auto scroll issue on cell selection
*   Fix false `React.createFactory` error on undefined property access
*   Fix findFields to consider jsonModel for custom models
*   Fix generating extended entities not included in project
*   Fix kanban record opening permission check (canView/read)
*   Fix lost action-view context in calendar views
*   Fix multi-tenancy AxelorCache.asMap() usage
*   Fix perform advanced search on entire dms tree
*   Fix required validation in duration widget
*   Fix sandbox bypass via async/generator function constructors
*   Fix step validation in decimal input widget
*   Following a build
*   Form - shows a single record in a form layout
*   Form View - represents data in html form
*   Form designer
*   Full migration script
*   Gantt - shows data using a Gantt chart
*   Get model properties
*   Get models
*   Give an agent knowledge
*   Give charts explicit heights (roughly 350–400px); KPIs and cards size themselves.
*   Give notification popups more time and a way to keep them open
*   Give status selections colors — status fields render them as badges, and the kanban and `NavSelect` widgets pick them up.
*   Gotchas worth knowing
*   Grid - shows the data list in as columns
*   Grid View - represents data in tabular (list) form
*   Grid designer
*   Grid width
*   Groovy: checked in loop statements only.
*   Groups are for organizational structure but also supports roles & permissions
*   Headers are the field labels in your language, with nested fields joined by `>` (`Customer > Email`).
*   Hibernate
*   Hibernate Search - Elasticsearch Backend Configuration
*   Hilite
*   If `logging.path` is given, log files will be stored under that directory
*   If `logging.pattern.console = OFF` then console logging will be disabled
*   If `logging.pattern.file = OFF` then file logging will be disabled
*   Implement tenant-aware AxelorCache
*   Import Data explains mapping, source controls and the result workbook.
*   Import a file
*   Improve DMS upload notification visibility and statuses
*   Improve React-based HTML applications embedded
*   Include date range and view mode in calendar context
*   Integration
*   Internal configuration file under `src/main/resources`.
*   Java Core Interfaces
*   Java Core Packages
*   Java Persistence
*   JavaScript: the script is interrupted once the timeout is reached, at its next safepoint (such as a loop iteration or a function call). A script blocked inside a Java call, such as a long database query, cannot be interrupted while it waits; it is stopped as soon as the call returns, and the evaluation fails with a timeout even if the script would have finished.
*   Jobs
*   Json content
*   Kanban - shows data as agile kanban board
*   Keep instructions focused and example-driven; move bulky catalogs and long examples into references so they load only when relevant.
*   Keep values lowercase snake case (`in_progress`) and titles human ("In Progress"). Values end up in the database — changing them later means migrating data.
*   Knowledge base
*   Last used: The last time the token was used for authentication, accurate to within 5 minutes
*   Lead with a KPI row — the 3–5 numbers that answer "how are we doing".
*   Limitation
*   Limitations
*   List attachments
*   Make column spans total 12 per row — four span-3 KPIs, two span-6 charts, one span-12 table.
*   Making dashboards readable
*   Match the component to the shape of the data: trends → line or bar, pipeline → flow, top-N → ranked list, drill-down → table, cross-tab → pivot.
*   Menu entries — a menu item opens its action, usually an action view (Menus).
*   Menubar and toolbar
*   Models
*   Multi-threading
*   Name: A descriptive name for the token
*   Node
*   Node Binding
*   Normalize empty HTML content in HTML widget
*   On first-level rows, `Ctrl+Enter` to add subitem is not supported.
*   On first-level rows, you can add a row to the bottom only, not between existing rows.
*   On subitems, grid `onSave` is not supported.
*   One question per dashlet; a chart comparing two measures beats two charts the reader must correlate.
*   OpenSearch Configuration Guide
*   Opening Studio
*   Operational limits
*   Options
*   Other view types
*   Override the default implementation in another module
*   Overview
*   Package level permission rules
*   Per module web resources
*   Per workflow, the gates run first — `watch` prefilter, `when` condition against the snapshots, repeat policy — then the graph walks from `start` to `end`.
*   Permission defines single access rule (finer granularity)
*   Permissions
*   Policy Configuration
*   Positioning
*   Pre
*   Prefer **Action Validate** for user-facing checks — `error` blocks the operation, `alert` asks to continue — rather than failing inside scripts.
*   Production: `none` or `validate` for stability.
*   Project operations: creating a project, listing and deleting resources, creating revisions, activating, deactivating and publishing a revision, checking a project’s consistency.
*   Provide a default implementation of the service
*   Publishing
*   Put the **when-to-load** in the description — it is the only part always in context.
*   RabbitMQ Addressing
*   Read a record
*   Record identity
*   Reference & Administration covers files, permissions, limits and server configuration.
*   Related documentation
*   Replace react-text-mask with internal \<MaskedInput> component
*   Report Data Source
*   Request
*   Request for NodeJS
*   Request for PHP
*   Request for Python
*   Requirements
*   Resolve the client IP address from a single trusted header
*   Response
*   Restore flush on JPA.persist and JPA.merge
*   Retrieval
*   Revision status
*   Role based permissions
*   Round-trip updates
*   Run the application
*   Saved queries and analytics dashboards — it can test a query against live data before saving it, and draw a chart or table in the chat to show how it will look.
*   Search - shows multi-object search view
*   Search View - multi-object search view where search can be done on multiple objects
*   Selection and enum values are written as their translated labels.
*   Selections, actions, menus.
*   Several workflows on the same model fire in `sequence` order.
*   Sources
*   Special actions
*   Strings
*   Supported Languages
*   Syncing
*   System properties prefixed with `axelor.config.`
*   Tags
*   Template
*   Testing: `create` or `create-drop` gives you fresh data every test.
*   The **tabs** group its resources by type: **Views**, **Models**, **Fields**, **Selections**, **Queries**, **Actions**, **Menus**, **Workflows**.
*   The AI assistant can build and test a query against live data before saving it.
*   The Todo example, complete
*   The designer
*   The entity contains at least one `binary` field or large field (`large="true"`).
*   The entity has more t
*   The imp
*   The query REST API executes saved queries with parameters, for external consumers — Data queries.
*   The service interface now binds to the new implementation
*   The toolbar carries the lifecycle buttons — activate, publish, export, sync, build — described in Lifecycle.
*   Translation Fallback
*   Translations
*   Translations for the titles and labels it creates.
*   Tree - shows data in hierarchical manner
*   Tree View - represents data in hierarchical format
*   Update a record
*   Upgrade backend dependencies
*   Usage
*   Usage Example
*   Use **Action Attrs** with `onLoad`/`onChange` to adjust what the user sees (hide a panel, require a field, narrow a relation’s choices) without touching data.
*   Using Java types
*   Using a selection
*   Validating and deploying
*   Value Translation
*   View events — a form’s `onNew`/`onLoad`/`onSave`, a field’s `onChange`, a button’s `onClick` (Views).
*   Views
*   What it can build
*   What you can build
*   What you can rely on
*   What’s Next?
*   When a build is needed
*   When to save a query
*   When to use
*   When to use a workflow
*   Widgets
*   Wiring actions
*   Workflows (Workflow designer).
*   Working in a revision
*   XML Hotswap
*   Your first app in five steps
*   ZIP archives (`.zip`) containing CSV files, with one source per CSV file.
*   `$fmt(field)` - show the formatted value of the given field
*   `$image(field, image)` - show image for the given field
*   `--config <path>` : specify the application config file path
*   `--debug-jvm` : start application in debug mode waiting for debugger on `5005` port. Attach your favourite Java debugger on this port to start debugging.
*   `--drop`: Drops the existing index and schema before starting.
*   `--mapping <file>`: Use a custom index-mapping file instead of the configured one.
*   `--port <number>` : alternative port, default to 8080
*   `--tenant <tenant_id>`: If multi-tenancy is enabled, you can specify which tenant to index.
*   `<action>` - define an action
*   `<actions>` - add actions on chart menu
*   `<call>` - define a call
*   `<category>` - defines the X-Axis of the chart with
*   `<config>` - custom configuration data
*   `<context>` - define the base context for the action
*   `<dataset>` - JPQL/SQL select query with select name aliases
*   `<domain>` - specify a domain filter to restrict search (jpql where clause)
*   `<field>` - define a field to update
*   `<field>` - specify which field to track
*   `<mail-followers>` - shows the list of followers/subscribers
*   `<mail-messages>` - shows the messages in threaded layout
*   `<message>` - specify messages to display
*   `<param>` - the report parameter
*   `<series>` - list of data series defines the Y-Axis (for the moment only one series is allowed)
*   `<view-param>` - define additional view parameter
*   `<view-type>:<view-name>` value where `<view-type>` is one of the supported view types and `<view-name>`, the name of the view.
*   `<view>` - specify the view to use
*   `ALWAYS` - generate in all cases
*   `Boolean` - convert boolean string to Boolean
*   `CLASS`: The Class strategy (referring `InheritanceType.TABLE_PER_CLASS`) creates separate and independent table for every concrete class. Each table contains all columns (inherited and specific).
*   `CREATE` - generate when record is created
*   `DateTime` - convert the datetime string to `DateTime` instance (with timezone info)
*   `Group` has many `Permission`
*   `Group` has many `Role`
*   `Integer`, `Long`, `Double`, `Boolean`
*   `JOINED`: The Joined strategy creates a separate table for each class, containing only its specific fields. The child table links to the parent table via a Foreign Key. This is the most normalized approach.
*   `List<TenantConfig> findAll(String host)` - find all the TenantConfig for the given hostname
*   `LocalDateTime` - convert the datetime string to `LocalDateTime` instance
*   `LocalDate` - convert date string to `LocalDate` instance
*   `LocalDate`, `LocalTime`, `LocalDateTime`, `DateTime`
*   `LocalTime` - convert time string to `LocalTime` instance
*   `Number` - convert integer or decimal string to respective type
*   `POST_DELETE`
*   `POST_INSERT`
*   `POST_LOAD`
*   `POST_UPDATE`
*   `PRE_DELETE`
*   `PRE_INSERT`
*   `PRE_UPDATE`
*   `PostAction(String name, Context context, Object result)` – fired after action execution
*   `PostLogin(AuthenticationToken token, User user, Throwable error)` – fired after user login
*   `PostRequest(Object source, Request request, Response response)` - fired after a request
*   `PreAction(String name, Context context)` – fired before action execution
*   `PreLogin(AuthenticationToken token)` – fired before user login
*   `PreRequest(Object source, Request request)` - fired before a request
*   `RequestEvent.COPY`
*   `RequestEvent.EXPORT`
*   `RequestEvent.FETCH_NAME`
*   `RequestEvent.FETCH`
*   `RequestEvent.MASS_UPDATE`
*   `RequestEvent.READ`
*   `RequestEvent.REMOVE`
*   `RequestEvent.SAVE`
*   `RequestEvent.SEARCH`
*   `Role` has many `Permission`
*   `SINGLE`: The Single table strategy creates one table for the entire class hierarchy. This is the default if it is not explicitly specified.
*   `ShutdownEvent()` – fired before application shutdown
*   `StartupEvent()` – fired after application initialization
*   `String`, `BigDecimal`
*   `TenantConfig find(String tenantId)` - find a TenantConfig instance for the given tenant id
*   `UPDATE` - generate when record is updated
*   `User` has many `Permission`
*   `User` has many `Role`
*   `User` has one `Group`
*   `X-File-Id` - the file id returned by the first chunk upload request
*   `X-File-Name` - the name of the file being uploaded
*   `X-File-Offset` - the chunk offset
*   `X-File-Size` - actual file size
*   `X-File-Type` - file mime type
*   `__bean__(beanClass)` - Get a bean instance of a given type.
*   `__bean__` Helper
*   `__check_version`\- `true` to check record version in form view when tab is active
*   `__config__` - global context configuration
*   `__date__` - current date as `LocalDate`
*   `__datetime__` - current datetime as `ZonedDateTime`
*   `__id__` - ID of the current record
*   `__ids__` - list of IDs of the selected records
*   `__parent__` - the parent record
*   `__ref__` - the first selected record in multi-object search view
*   `__repo__(modelClass)` - Get a repository for a given model class.
*   `__self__` - the corresponding record from the database
*   `__this__` - the record being edited (representing form values)
*   `__time__` - current datetime as `LocalDateTime`
*   `__user__` - current user
*   `_showRecord` - show the record by given id in form view
*   `_showSingle` - `true` to show the only record in form view
*   `_source` - name of the action source (field name)
*   `_viewName` - name of the current view
*   `_viewType` - type of the current view
*   `_views` - all the views defined by current action-view
*   `abstract` - generate abstract repository class (module may provide concrete implementation)
*   `action: …​` - call a given action
*   `action` : Action to execute.
*   `activateOn` - the time from when access should be activated
*   `active` - whether the job is enabled
*   `allocationSize` - the amount to increment by when allocating sequence numbers from the sequence
*   `as(Object, Class)` - cast the object as the given class (generally, casting is automatic in EL but useful to convert context to a model class)
*   `auto-reload` - enable view auto-reloading with value specified in seconds
*   `axelor-config.properties` - the application configuration
*   `axisScale` - used with radar chart, define the axis scales. Values can be :
*   `blocked` - whether the user is blocked
*   `build()`: Constructs an `AxelorCache` instance without automatic value loading.
*   `build(loader)`: Constructs an `AxelorCache` instance that uses the provided cache loader to compute values for keys that are absent from the cache.
*   `button-group` - group of buttons
*   `button` - a button widget that executes some action
*   `button` - define a button to execute an action
*   `cacheable` - whether to make this entity cacheable
*   `cacheable` - whether to make this entity cacheable (default is false)
*   `call: …​` - call a given controller method
*   `canCreate` - whether to grant create permission
*   `canExport` - whether to grant export data permission
*   `canRead` - whether to grant read permission
*   `canRemove` - whether to grant delete permission
*   `canWrite` - whether to grant update permission
*   `close` - close current view, can be used at the end only
*   `code` - the user login name
*   `colors` - specify base colors for charts, each color is used to provide 4 gradient shades
*   `columns` - comma-separated list of dataset fields as table columns (if not specified, uses keys from dataset items)
*   `com.axelor.data.ImportTask` - abstract class to configure import tasks
*   `com.axelor.data.Importer` - the importer api interface
*   `com.axelor.data.Launcher` - base class to create command line task launcher
*   `com.axelor.data.Listener` - data import event listener
*   `com.axelor.data.csv.CSVImporter` - csv data importer
*   `com.axelor.data.xml.XMLImporter` - xml data importer
*   `com.axelor.db.tenants.TenantConfigProvider` - an interface to obtain TenantConfig, may be from external resource
*   `com.axelor.db.tenants.TenantConfig` - an interface to provide tenant connection config values
*   `com.axelor.report.ReportEngineProvider` - provides a preconfigured singleton instance of `IReportEngine`
*   `com.axelor.report.ReportGenerator` - provides methods to generate reports
*   `comment` - some comments for/by language translator
*   `conditionParams` - comma-separated list of condition params (evaluates against current context)
*   `condition` - permission condition (JPQL where clause with positional parameters)
*   `config.encryptor.algorithm`:Algorithm to be used by the encryptor
*   `config.encryptor.iv-generator-classname`: IV generator to be used by the encryptor
*   `config.encryptor.key-obtention-iterations`: Number of hashing iterations to obtain the signing key
*   `config.encryptor.provider-class-name`: Security provider to be used for obtaining the encryption algorithm
*   `config.encryptor.provider-name`: Name of the security provider to be asked for the encryption algorithm
*   `config.encryptor.salt-generator-classname`: Salt generator to be used by the encryptor
*   `config.encryptor.string-output-type`: Sets the form in which String output will be encoded
*   `configure(task, options, params)` - called before the report is run, to configure the task (timezone, render options…​)
*   `contains` - if the field value contains the given input value
*   `context` - a list of file names with line numbers where the text can be found
*   `cron` - the cron string to schedule the job
*   `default-search-filters` - comma-separated list of search filter names to apply by default (used in conjunction with `search-filters`)
*   `default`
*   `default` - generate default repository class (it’s default behavior)
*   `depth`: (For related entities) How deep to index the related entity’s fields
*   `description`: provide detail description about the changes including migration steps if any. (Optional)
*   `details-view` - `true` to show grid and form views side by side
*   `download` - `true` to mark view as pointing to a downloadable link
*   `dynamicUpdate` - whether SQL update statements are generated dynamically (default is auto-detected)
*   `editable` - mode shows field editors with values
*   `editable` - whether the form is editable
*   `editable` - whether the grid is editable
*   `encryptFile` : Search and encrypt for values wrapped with `ENC()` in configuration file
*   `encryptText` : Encrypt a single given String
*   `endsWith` - if the field value ends with the given input value
*   `entity`: The fully qualified name of the entity to configure
*   `equalsIncludeAll` - whether to include all the simple non-function fields in equality test (default is false)
*   `equals` - if the field value equals the input value (default matchStyle)
*   `eval: …​` - evaluate as groovy expression
*   `expireAfterAccess(duration)`: Configures entries to expire after a specified duration following their last access.
*   `expireAfterWrite(duration)`: Configures entries to expire after a specified duration following their last write operation.
*   `expiresOn` - the time from when access should expire
*   `expr="#{…​}"` - use EL
*   `expr="eval: …​"` - use groovy
*   `expr="select: …​"` - use EL
*   `expr="…​"` - return as it is (constant)
*   `extends` - inheritance base entity class
*   `field` - binds a model field, automatically selects appropriate widget
*   `field` - define a column bound to the model fields
*   `field`: The name of the property in the entity
*   `fields`: List of fields to be indexed
*   `files` - specify whether to track attached files
*   `filter` : messages type to show : `all` (default), `comment`, `notification`.
*   `fmt:text(String, Object…​)` - string format helper
*   `forceEdit` - `true` to force to open in editable mode
*   `forceTitle` - `true` to force to use action title instead of view title
*   `getAtomicLong(name)`: Returns a distributed-aware atomic long for the specified name, useful for maintaining counters or sequence numbers across distributed instances.
*   `getLock(name)`: Returns a distributed-aware reentrant lock for the specified name, prefixed with the caller class name for uniqueness. This lock can be used to synchronize access to shared resources or cache entries in a distributed setup.
*   `getLockIfDistributed(name)`: Returns a lock only if the cache is configured for distribution; otherwise, it provides a no-op lock, avoiding unnecessary synchronization overhead in single-instance setups.
*   `getTopic(name)`: Returns a publish/subscribe topic for broadcasting messages to all instances. In a single-instance setup, messages are dispatched in-process only. The current tenant context is carried with each message, so listeners observe the same tenant as the publisher.
*   `greaterOrEqual` - if field value is greater than or equal to the input value
*   `groups` - the groups assigned to the user
*   `height` - height of the chart
*   `hideActions` - `true` to hide the actions in the search view
*   `hideLegend` - show/hide the legend
*   `hilite` - define rules to highlight rows/cells
*   `i
*   `icon` - icon name
*   `if="#{…​}"` - use EL
*   `if="eval: …​"` - use groovy
*   `if="select: …​"` - use EL
*   `if="…​"` - use groovy
*   `imp(String)` - import a class by name
*   `implements` - list of interfaces to implement (generally empty, or confirming the getter/setter)
*   `important`
*   `important` - important style (red)
*   `include`/`exclude`: (For related entities) Explicitly include or exclude specific paths
*   `index`: (Optional) Index name - when specified, the entity becomes directly searchable. When omitted, the entity’s field configuration is used only when it’s embedded in other indexed entities
*   `info` - information style (blue)
*   `int`, `long`, `double`, `boolean`
*   `inverse`
*   `is(Object, Class)` - check whether the given object is instance of the class
*   `java.lang.ClassLoader`
*   `java.lang.Class`
*   `java.lang.ProcessBuilder`
*   `java.lang.ProcessHandle`
*   `java.lang.Process`
*   `java.lang.Runtime`
*   `java.lang.System`
*   `java.lang.ThreadGroup`
*   `java.lang.Thread`
*   `java.time.*` - match all classes in this package and its immediate sub-packages
*   `java.time` - match all classes in this package
*   `java.util.Properties`
*   `java.util.ResourceBundle`
*   `java.util.Timer`
*   `job` - the job class implementing `org.quartz.Job` interface
*   `jsonAttrs` - whether to enable/disable generating "attrs" json field
*   `kanban-column-width` - desired kanban column width
*   `kanban-hide-columns` - hide specific columns in kanban (comma separated list of names)
*   `key` - the original string
*   `label` - a label to describe the value
*   `label` - can be used to set a static label
*   `lessOrEqual` - if field value is less then or equal to the input value
*   `lessThan` - if field value is less than the input value
*   `limit` - maximum number of records per page (grid/cards view) or per column (kanban view)
*   `limit` - query result limit (in case of `jpql` and `sql`)
*   `limit` : maximum number of messages to display. Default to 10 messages.
*   `logUpdates` - whether to enable update logging (default is true)
*   `maxSeries` - maximum number of series (dimensions) to display. When the dataset produces more series than this limit, only the top N series by value are shown. Pie, donut, radar, line, area, and scatter charts aggregate the remaining series into an "Others" bucket; bar and horizontal bar charts drop tail series to preserve scale accuracy. Defaults to `200`. Set to `0` to disable the limit. This is useful for charts with large datasets to prevent excessive memory consumption.
*   `max`: the number of icon to display. Default to `5`.
*   `max`: upper bound of the value
*   `maximumSize(size)`: Sets the maximum number of entries the cache can hold.
*   `menubar` - define custom menubar
*   `message` - the translated string
*   `min/max` - used with gauge and radar chart(max support), define the minimum and maximum values.
*   `min`: lowest bound of the value
*   `model` - fully qualified model name
*   `name` - name of the Entity (should begin with upper case letter)
*   `name` - name of the job
*   `name` - permission name
*   `name` - the display name
*   `name` - unique name for the chart
*   `name` - unique name of the view
*   `name` : Name of the action
*   `newBuilder(name)`: Creates a cache builder supporting either in-memory or distributed caching, depending on application configuration. The name, combined with the caller class, forms a globally unique cache identifier that is used in case of distributed caching.
*   `newInMemoryBuilder()`: Creates a `CaffeineCacheBuilder` for an in-memory cache. This is useful when you need in-memory caching while using `AxelorCache` API.
*   `new` - start a new record, can be used at the end only
*   `nonTenantAware()`: By default, when multi-tenancy is active, the cache automatically segregates entries based on the current tenant context. This option disables this behavior and allows the cache to be shared globally across all tenants.
*   `none` - do not generate repository class (if not required or module provides custom repository class)
*   `notEquals` - if the field value is not equal to the input value
*   `object` - the object name (class name or wild card package name)
*   `onChange` - when a field value is changed
*   `onClick` - call specified action with clicked data in context
*   `onClick` - when a field/button is clicked
*   `onInit` - action to call during chart init
*   `onLoad` - action to execute when loading a record
*   `onLoad` - when record is loaded in form view
*   `onNew` - action to execute when creating new record
*   `onNew` - when creating new record
*   `onSave` - action to execute when saving the record
*   `onSave` - when record is about to save
*   `onSelect` - when select record button is clicked (relational fields only)
*   `orderBy` - order by the given field
*   `panel-dashlet` - dashlet panel can be used to embed another views
*   `panel-dashlet` - dashlet panel can be used to embed other views
*   `panel-include` - include another panel form
*   `panel-related` - a panel to put o2m/m2m fields
*   `panel-stack` - contains other panels which are attached
*   `panel-tabs` - contains other panels which are shown as notebook tabs
*   `panel-tabs` - holds another panels which are shown as notebook tabs
*   `panel` - nested panel to fine tune the layout, with `stacked="true"` the contents can be stacked vertically (useful when showing widgets using `showIf/hideIf` expressions or by other means)
*   `panel` - panel with 12 columns, generally used to put simple fields
*   `parent` - id of parent directory
*   `password` - the password (stored encrypted in database)
*   `pattern` - file name match pattern
*   `percent` - a percent value in dataset (formatted with `percent` filter)
*   `percent` - used with pie chart, show labels in percent
*   `permissions` - explicit permissions granted to the user
*   `persistable` - whether this entity is persistable (in database).
*   `persistence.xml` - hibernate/jpa configuration
*   `popup-save` - `false` to hide OK button used to save record upon closing the popup
*   `popup.maximized` - `true` to open as maximized popup
*   `popup.show-footer` - `false` to hide popup footer
*   `popup.show-header` - `false` to hide popup header
*   `popup` - `true` to open view as popup, `reload` to reload parent upon closing the popup (details)
*   `readonly` - mode shows fields values as html text
*   `reload-dotted` - `true` to refresh the grid when switching back from form view
*   `removalListener(listener)`: Attaches a listener to be notified when entries are removed from the cache (async).
*   `replace` - specify whether to replace original change track config
*   `reports.design-dir` - the external directory of design files and related resources
*   `reports/css` - contains style sheets
*   `reports/img` - contains images
*   `reports/lib` - contains library files (`.rptlibrary`)
*   `reports` - contains design files (`.rptdesign`)
*   `repository=[none|default|abstract]` - how to generate repository class
*   `roles` - the roles assigned to the user
*   `save` - to save record, can be used anywhere
*   `search-filters` - name of custom search filters
*   `search="…​"` - search expression on `action-record` are handled with EL
*   `select: …​` - execute a select query and return first matched record
*   `select[]: …​` - execute a select query and return all matched records
*   `shades` - number of gradient shades used for colors
*   `show-confirm` - `false` to disable dirty check
*   `show-toolbar` - `false` to hide form toolbar
*   `showArchived` - `true` to include archived records
*   `spacer` - can be used to skip a cell
*   `stacked` - whether to create stacked chart
*   `startsWith` - if field value starts with the given input value
*   `str(Object)` - convert object to string (if null, returns empty string "")
*   `strategy=[SINGLE|JOINED|CLASS]` - inheritance strategy (default is SINGLE)
*   `subscribe` - specify whether to auto subscribe for change notifications
*   `success`
*   `success` - success style (green)
*   `sums` - comma-separated list of dataset fields to show sums
*   `table` - table name for the entity
*   `tag-css` - CSS class to apply to tag
*   `tag` - a tag to show on title area of the box
*   `target` - in case of html view, it opens the link in a new tab. `_blank` opens the url in new browser tab.
*   `title` - chart title
*   `title` : Title of the button displayed on chart menu
*   `title`: describe the entry. (Mandatory)
*   `toolbar` - define custom toolbar buttons
*   `type` - dataset type (`jpql`, `sql` or `rpc`)
*   `type`: type of the entry (feature, fix, …​). (Mandatory)
*   `up` - boolean expression for the up or down icon beside the percent value (or no icon if null)
*   `validate(report, params)` - called once the report design is opened, throw an exception to abort the report generation
*   `validate` - validate current form, can be used anywhere
*   `value` - a number value in dataset
*   `warning`
*   `warning` - warning style (yellow)
*   `weakKeys()`: Wraps each key in a `WeakReference`, allowing garbage collection if no strong references exist.
*   `weakValues()`: Wraps each value in a `WeakReference`, allowing garbage collection if no strong references exist.
*   `width` - width of the chart
*   `x-color-picker-show-alpha`: whether to accept color with alpha (ie, opacity). Not supported with `x-lite` attribute. Default to `true`.
*   `x-initial-country`: initial country selection by specifying its two-letter country code (defaults to user/browser locale)
*   `x-lite`: change color picker popper to a basic palette. Default to `false`.
*   `x-only-countries`: in the country dropdown, only display the specified countries (comma-separated list of two-letter country codes)
*   `x-placeholder-number-type`: country-dependent number type to use for the placeholder: `FIXED_LINE` (default) or `MOBILE`
*   `x-precision`: precision of the decimal value (total number of digits).
*   `x-preferred-countries`: countries to appear at the top of the list (comma-separated list of two-letter country codes) (defaults to user/browser locales)
*   `x-rating-color`: color to use when checked. It also supports comma-separated list of colors.
*   `x-rating-fill`: whether the icon should use fill style when checked. Defaults to `true`.
*   `x-rating-highlight-selected`: whether to highlight only the selected icon. Defaults to `false`.
*   `x-rating-icon`: Bootstrap icon to use. It also supports comma-separated list of icons. Default to `star`.
*   `x-scale`: scale of the decimal value (total number of digits in decimal part). It accepts an integer for a fix scale, or a field name for a dynamic evaluation.
*   `x-slider-show-min-max`: display min and max values below slider. Default to `false`.
*   `x-step`: amount to increment or decrement on each step. Accept negative and decimal/integer values. Default to `1`.
*   `x-step`: amount to increment or decrement on each step. Accept negative and integer values. Default to `1`.
*   `x-step`: slider’s step value. Default to `1` for `integer` fields type and to scale value for `decimal` fields type.
*   `xFormat` - custom x-axis format, like `MM-YYYY` or `DD/MM/YYYY`
*   `zoomThreshold` - controls the data zoom slider for x-axis categories (or y-axis for horizontal bar charts). Defaults to `50`. Use a positive value as a threshold, `0` to show zoom controls fully zoomed out (all data visible), or a negative value to disable zoom entirely.
*   `…​` - if none of the above, consider the expression as static value
*   a pre-defined palette name : `material`, `roma`, `chartjs`, `roma` or `macarons`
*   action expression - another action, prefixed with `action:`
*   action-import - is an action to configure & launch data import task
*   action-ws - is an action to configure SOAP web service
*   add `<flow default="true" …​/>` — "if none of these apply, carry on this way";
*   an `action-view`. The first view of that action-view will be used in dashlet.
*   area
*   attribute nodes can be located with `@attribute` syntax
*   bar
*   call expression - call a method, prefixed with `call:`
*   calling controller methods
*   change tracking
*   changing field attributes
*   changing form values
*   check for permissions assigned to the roles of the user
*   check for permissions assigned to the user object
*   check for the permissions assigned to the group of the user
*   check for the permissions assigned to the group’s roles
*   color – background HTML color
*   comma-separated list of named and/or hex colors
*   constant expression - the expression is considered as constant value
*   contains compiled resources — JPA entities and enums (Models), or
*   copy webapp from all other modules in dependency order
*   copy webapp from axelor-web
*   default value for `confirmDate` is provided with groovy expression.
*   description - a short description of the application
*   directory and executable scripts in the `bin/` directory.
*   document discussions
*   donut
*   email integration
*   extracted war application in the `app/` directory
*   finally, copy own webapp
*   funnel
*   gauge
*   groovy expression - prefixed with `eval:`
*   group discussions
*   hbar
*   launcher script dependencies in the `lib/`
*   line
*   name – name of the node
*   pie
*   providing default values
*   put a `<wait on="condition">` **before** the split — "the thing I am testing has not happened yet". A split decides on what the record says now; it never waits.
*   radar
*   read the cookie named `CSRF-TOKEN`
*   scatter
*   select expression - JPQL select queries, prefixed with `select:`
*   should be packaged as a deployable WAR (the **Build** button on the revision — Lifecycle).
*   text nodes can be located with `text()` method
*   the values of column confirmed is processed to convert in valid boolean value.
*   title - display title for the application
*   title – display title
*   validating current record
*   when performing your request, pass the value of that cookie in a header named `X-CSRF-Token`
*"An order form with lines and a computed total"* → parent and line models with the relation, an editable lines panel, computed totals.
*"Give Todos a status flow with an approval step"* → a status selection, the field with its default, transition buttons and validations, a status bar on the form — optionally a workflow automating the transitions.
**A split says how branches start. A join says when they end. Nothing is inferred.**
**Adaptive Back-Pressure**
**Cancel** discards the file and the mapping and returns to file selection. The importer reads the file as you upload it, so a file with a column you are not allowed to import is refused at this point — before any mapping — with the reason.
**Configuration Options:**
**Configuration Priority:**
**Delayed Feedback**
**Excluded Fields**
**Features**
**Global Default:**
**Objects**
**Per-Entity Configuration:**
**Permission**
**Save** stores your work in the project. View designers also offer a live **Preview** of the view as the application will render it.
**Special Field Types:**
**User**
-- AuditLog
-- MailMessage
---
-------Configs-------
-------OUTPUT-------
...
./gradlew classes
./gradlew generateChangelog
./gradlew generateLauncher
// Include modules
// Set 500 ms timeout (locally overrides application-wide script timeout configuration)
// extracted, but not translated here
// fails: the task would run on the session of "tenant-a"
// get singular or plural translation based on the given number
// get the translation for the given key
// get the translation for the given text
// in a web request made on tenant "tenant-a"
// translated later, depending on the language request
// works: the task runs in another thread, with its own session on "tenant-b"
1.   **Available fields** — every exportable field of the model, with its technical name below the label. Check the fields to export.
1.   The detected sources, with the overall mapped/total column counter.
1.  **Choose a model** — the chat model that runs the conversation (it must support tools). This is optional: if left unset the agent uses the user’s selected model or the global default. Optionally set a cheaper *utility model* for background work.
1.  **Click the search icon** in the top navigation bar:
1.  **Description** — one or two sentences, always visible in the agent’s prompt. This is the routing signal: it must say clearly **when** to load the skill.
1.  **Enable the AI feature** for the application — the **AI** menu and the chat launcher appear once it is on.
1.  **Read the form.** Ask an admin agent to run `inspect_process` on the model (see Check procedures against the forms). It lists the action-views that open the form, its buttons and their conditions, and every chain with the questions it can ask.
1.  Checkout "Manage API key?"
1.  Click **Build** on the revision. A job is submitted.
1.  Click the **AI Assistant** button (bottom right, on any screen — including inside the designers).
1.  Create a listener class.
1.  Create a project and open its revision — Projects & Resources.
1.  Create an XML file under `src/main/resources/workflows/` (one file may contain several `<workflow>` elements).
1.  Create the queries — one per figure, with column metadata filled in so titles and formats render properly. See Queries.
1.  Data Mapping: the assignment of data items from the source to the destination
1.  Drag **panels** from the palette — a form is a 12-column grid of panels; fields never sit at the root.
1.  Drop the file in `src/main/resources/workflows/` of your module.
1.  Enable the **Allow entity** option on the revision (Projects & Resources).
1.  Every flow is taken — an `all` split evaluates no conditions, and its flows may carry neither `when` nor `default`.
1.  Go to the revision’s **Fields** tab and click **New**.
1.  In advanced search, select **Import**. To import from a form, select   **Import…​**.
1.  In the model’s advanced search, apply the filters and sorting that define the export set.
1.  Inject `HeadlessForms`.
1.  Key validation
1.  Navigate to the screen you want to change.
1.  Open **Administration → Workflow Management → Workflow Runs** (filters for **Failed** and **Waiting** runs are built in), or, from a record’s own form, the **Workflow status** icon in the toolbar — it appears once the record has runs, and becomes an hourglass, **Workflow running in the background**, while a background node on the record has yet to finish.
1.  Open **Approvals → My Approvals** — everything actionable by you: tasks assigned to you, claimed by you, or sitting unclaimed in a role/group pool you belong to. (Admins additionally get **Pending Approvals** — every pending task.) The number of approvals waiting on you also shows beside **My Approvals** in the application header.
1.  Open **Studio → Configuration → Repositories** and click **New**.
1.  Open **Studio → Projects** and click **New**.
1.  Open **Studio → Projects**, open your project and its working revision (Projects & Resources).
1.  Open the AI chat and choose **Agent Builder** in the agent picker. It is listed only for AI administrators.
1.  Open the revision’s **Actions** tab, click **New** and pick the kind.
1.  Open the revision’s **Menus** tab and click **New**.
1.  Open the revision’s **Queries** tab and click **New**.
1.  Open the revision’s **Selections** tab and click **New**.
1.  Open the revision’s **Views** tab, click **New** and pick **Chart View**.
1.  Open the revision’s **Views** tab.
1.  Open your project revision and go to the **Models** tab.
1.  Session-based authentication
1.  The `Todo` model (Models).
1.  The acting user’s own Axelor permissions, exactly as if the user ran the operation by hand — see Per-user enforcement.
1.  The flows are tested **in the order written**. `big` is tested first; if it holds, `blocked` is never evaluated. Order is precedence, and you chose it.
1.  The user enters their valid username and password.
1.  `allocationSize` defined in entity XML definition
1.  react - modern JavaScript framework
1.  the `eval:` expressions are considered groovy expressions
10.  **Export** — one click produces Excel; the arrow offers **Export as CSV…​** and **Export as Excel…​**.
10.  **Flat import** — dotted to-one columns find or create the related record and attach it. Selected automatically for a single CSV file.
11.  Saved mappings — load or save an import configuration.
12.  **Import** — start writing records; unmapped columns are skipped after a confirmation.
192.0.2.10, 198.51.100.0/24, 2001:db8::/32
2.   One source per sheet or CSV file, with its own counter.
2.   The expand arrow opens a relationship to pick nested fields — `Customer > Email` exports as `customer.email`.
2.  **Instructions** — the full guidance (markdown), loaded when the model calls `use_skill` with the skill’s code.
2.  **Set a provider key** — under   **Configuration**  **Providers**, fill in the API key on your provider (keys are never seeded). See Providers & Models.
2.  **Use the keyboard shortcut**: Press Ctrl+/ from anywhere in the application
2.  **Write `procedures.yaml`** next to the process skill’s `SKILL.md`:
2.  **Write the system prompt** — markdown instructions that define how the agent behaves.
2.  API key authentication
2.  An action view `action-todo-view` opening its grid and form (Actions).
2.  Click "Add" to create a new API key
2.  Click **New** and pick the type: form, grid, cards, kanban, calendar, tree, chart, custom or dashboard.
2.  Click **New**. The model designer opens.
2.  Click the **Studio** button in the view toolbar (visible to technical users).
2.  Create a **Custom View** and compose the template; the designer edits it with syntax highlighting and previews the result live.
2.  Create a configurator class that implements `HibernateListenerConfigurator`.
2.  Create entities and enums from the **Entities** and **Enums** tabs.
2.  Create the `Todo` model and its status selection — Models, Selections.
2.  Create the root: set the **Name** (`menu-todo`), **Title** ("Todo"), an **Icon** and icon background, and an **Order**. Leave **Action** and **Parent** empty.
2.  Data Import: the process of importing data based on the data mapping
2.  Define the workflow: identity attributes, one `<start>` node first, then the graph.
2.  Describe the agent: what it is for, who uses it, which records it reads and which it changes.
2.  Describe what you want: *"Add a reminder date field to the Todo model"*, or *"A Todo app with statuses, priorities and a due date"*.
2.  Drag fields into the panels. Pair short fields side by side (span 6 each), give identifiers and long text the full width.
2.  Fill in the **Name** (lowercase, `todo-app` style), the **Group** (a package name like `com.axelor.apps`), a **Title** and a **Description**.
2.  Give it a readable, prefixed **name** — `action-todo-validate`. This name is what views and menus reference.
2.  If MFA is active:
2.  In the **Data Set** section, write the query that returns the figures.
2.  In the inspector, set the **Name** (dotted lowercase: `sales.orders.by.status`) and pick the **Model** and its alias.
2.  Name the selection `model.field.select` — e.g. `todo.status.select`.
2.  On the **Workflows** tab, click **New**. The designer opens on a full-screen canvas with the start node in place.
2.  Open **Studio → Build Jobs** to follow it — each job shows its status, a progress bar and the current stage.
2.  Open a run to see its trigger, timing, last node and any recorded error, and its **Steps** (every park at any trace level, every node at `nodes`). The **View graph** button draws the run over its workflow.
2.  Open a task. **Open record** shows the business record it is about.
2.  Open the **Export** menu and select **Export more…​**.
2.  Open the form’s spec on a new record.
2.  Per-entity configuration: `application.entity.sequence.<SEQUENCE_NAME>.allocation_size`
2.  Pick the target model (e.g. `Product`).
2.  Restart (or update the module). The workflow loads, validates and activates.
2.  Select an `.xlsx` workbook, a `.zip` archive containing CSV files, or a single `.csv` file (such as a flat export of this model).
2.  Set the repository **Path** (URI), the **auth token** (and user), and the committer **name** and **email**.
2.  The agent’s permissions: what its job needs, set on the agent — see Agent permissions.
2.  The branches run **one after another, in the order written**, against the same record and the same `vars`. "All" is about which paths are taken, not about running them at the same time. (Camunda’s default is the same; only its async continuations differ.)
2.  The first flow whose `when` holds is taken. If none holds, the `default` flow is taken.
2.  Validity checks
2.  bootstrap - CSS framework
2.  the `select:` expressions are considered Java EL expression
3.   **Audit fields** — reveals `createdBy`, `createdOn`, `updatedBy` and `updatedOn` in the list.
3.   A mapped column: the file column, the target field it maps to, and the field’s label. The green check marks a mapping; **Link** and **Unlink** controls appear when hovering the row.
3.  **Chat** — open the launcher (bottom-right on any screen). The **Default Assistant** answers questions, looks up records, and acts through tools.
3.  **Grant capabilities** — the tools it may call, the skills it may load, and the knowledge bases it may search.
3.  **Link it.** Give the agent the skill and the `run_procedure` tool, and `update` on the procedure’s model in its `permissions` — `create` for one that starts a new record.
3.  **References** — named documents loaded individually, so the model pulls in only the detail it needs (e.g. a widget catalog, concrete examples) rather than the whole body at once.
3.  A root menu `menu-todo` plus a leaf `menu-todo-tasks` pointing at the action.
3.  Add an action view that opens it, and a menu entry — Actions, Menus.
3.  Add fields exactly as in the model designer.
3.  Adjust the generated form and grid — Views.
3.  Answer its questions. The forms do not hold the process, so it asks about it: the rules and their exceptions, where each value comes from, what "done" looks like, and two or three requests your users really make. Each question comes with its likeliest answer, to accept or correct. It reads the AI configuration with `inspect_ai_config`, the models, and the forms involved with `inspect_process`, and asks what a Java step does when a form runs one.
3.  Bind the configurator in your `AxelorModule`.
3.  Build the project — activation alone is not enough for compiled resources. See Build Jobs & Repositories.
3.  Build the query section by section on the canvas:
3.  Click **Test Connection…** to validate the credentials.
3.  Configure the trigger on the start node: the model, the trigger (**On create**, **On update**, **On message**, **On timer** or **Manual**), watched fields, condition and repeat policy. Fields the chosen trigger does not take are hidden, and the ones the engine requires — a message name, a timer’s delay and unit, an update’s condition — are marked as required.
3.  Confirm an order and watch the run under **Administration → Workflow Management → Workflow Runs**.
3.  Create the leaf the same way: set **Parent** to the root menu, and set **Action** to the action view that opens your screen (Actions).
3.  Drag **Item** entries from the palette, one per value.
3.  Each branch ends at `merge`. When the last one arrives, `merge` runs **once** and continues to `persist`.
3.  Fill in the kind’s editor: a validate action lists its validators (message plus firing condition), a view action its target views, parameters and context, a script action its code with syntax highlighting…
3.  For a right-hand sidebar (status, dates, action buttons), use a narrow panel of span 3.
3.  Global default: `application.entity.sequence.default_allocation_size`
3.  If the task sits in a pool, **Claim** it first — you cannot act on a task another member holds.
3.  In **Available fields**, expand relationship fields and select the values to export. Use the arrow control or double-click to add them to **Export fields**.
3.  In the inspector, set the **Name** (PascalCase, e.g. `Todo`) and a **Title**.
3.  Open a job to read its live output. A running job can be cancelled from its form.
3.  Provide a name
3.  Restart or update the module — the file validates and the workflow activates.
3.  Review each detected source and its columns. Columns whose header is a field name or a field label path (`customer.email` or `Customer > Email`) are already mapped when the file is read. Use **Auto-map fields** to map the rest by name, then verify every mapping before importing.
3.  Run the steps.
3.  Save. The project starts with an initial revision.
3.  Set the **Category** (the x-axis field) and add one or more **Series** — each with its field, chart type (bar, line, pie…) and optional aggregate.
3.  The assistant creates or updates the resources and tells you exactly what it did; the designer opens or refreshes on the changed resource.
3.  The designer opens directly on that view — including the generated views of a custom model.
3.  The designer opens; pick the target model and build the view.
3.  The path that was taken runs on. `approve` and `reject` both lead to `confirm` — the alternatives **meet again at an ordinary node**. There is no join, because there is nothing to wait for: only one of them ever ran.
3.  The restrictions in force: what the AI may never read, set centrally — see Restrictions.
3.  expression wrapped inside `#{…​}` are considered Java EL expression
4.   **Toggle compute** — re-save this source’s successful records once all sources are imported (also toggled by double-clicking the source).
4.   Adds the checked fields to the export. The icons beside it search the list and check or uncheck all fields at once; double-clicking a field adds it directly.
4.  **Approve** or **Reject** it (an administrator opening the same task under **Workflow Tasks** sees **Approve** as **Complete**). A comment dialog opens only when the node’s `comment` requires a comment for the action you took — it may name `complete`, `reject`, `always` or neither (`none`) — and the comment is then required. An action that needs no comment is taken on the spot.
4.  **Decide who can use it** — roles, groups or users (with all three empty, only AI administrators can).
4.  **Load it.** Restart, or use **Reload built-in defaults** on the Import / Export screen. A file that does not read is refused at load. A procedure that does not match the form loads with a warning in the log, naming the procedure and the step, and a run refuses it until it is fixed.
4.  **Save** and activate the revision — the section appears in the navigation.
4.  **Save**.
4.  Add **Columns** metadata — a title and type per output column. Dashboards and tables render headings and formats from this, so filling it in is what makes results presentable.
4.  Add an action and a menu entry to open it — Actions, Menus.
4.  Drag field types from the palette onto the model — String, Date, Boolean… — and reorder them by dragging.
4.  Fallback default: `1`
4.  For a column, select the link control, double-click it or press **Enter** to choose a target field. Select the unlink control, or press **Delete**, to remove a mapping.
4.  For each item set the **title** (displayed), the **value** (stored), and optionally a **color** and an **icon**. Reorder items by dragging them in the list.
4.  Inspect the result. Adjust in words ("make the due date required") or directly in the designer.
4.  On success, the produced WAR is attached to the job as a downloadable **artifact**.
4.  On the project form, pick the repository under **Settings**.
4.  Optionally add search fields (user filters), actions and config entries.
4.  Read the result.
4.  Review the draft. It shows everything before saving: the agent’s configuration and prompt, the skill’s instructions, its procedures, and any new tool.
4.  Review the ordered export-field list. Open **Options** (the sliders icon) to choose **Allow re-import**, **Flat export** or **Link sheets**.
4.  Save, then activate the revision — the fields appear on the model’s existing views, in their own panel by default.
4.  Select any item to edit it in the inspector: title, span, visibility conditions (**show/hide/readonly/required if**), widget, and events.
4.  Set an expiration date (default is one month from creation)
5.   **Export fields** — the resulting columns, in order.
5.   **Unlink all** on a source — clear that source’s mappings.
5.  **Save**, and use **Preview** to see the rendered chart.
5.  **Save**.
5.  Activate (if it is still a draft) and publish the revision when you’re happy — Lifecycle.
5.  Activate the revision and try it — Lifecycle.
5.  Add **Parameters** for values users should control at runtime — typed (string, integer, long, decimal, boolean, date, time, datetime, or a many-to-one / many-to-many relation) with a label, required flag and default. Dashboards can expose them as shared filters.
5.  Add **buttons** where users trigger actions, and wire the form’s own events — `onNew`, `onLoad`, `onSave` — to actions (Actions).
5.  Approve each save. Every save asks on its own card — **Create the skill?**, **Create the agent?** — with a note on what it starts as, or on who else a change reaches.
5.  Optionally, restrict the IP addresses allowed to use the API key (see Restricting API keys by IP address)
5.  Select **Export** for Excel or choose CSV from the arrow beside it. The file is generated and downloaded; **Export** stays disabled until at least one field is selected.
5.  Select **Import**. The import runs while the dialog is open; when it finishes, the result workbook is downloaded.
5.  Select each field to edit its properties (see below).
6.   **Auto-map fields** — map the columns still unmapped in all sources, by field name or label (ignoring case, spaces and underscores).
6.   Removes the checked fields from the export.
6.  **Save**.
6.  Approve its trials. It runs the saved agent with `try_agent` on your requests and on an edge case, reads every call it made, and fixes and saves again where one went wrong. See Trial runs.
6.  Click "Create API key"
6.  Mark one String field as the **name field** — this is how records show up in lists and references.
7.   **Allow re-import** — technical headers and values plus the record keys, for files that will be imported again. The same switch is in **Options**.
7.   **Unlink all** — clear the mappings of every source.
7.  Click **Save**.
7.  Finish on the forms. Under   **Configuration**  **Agents**, review the new agent, enable it, and choose the roles, groups or users who may use it. Review and enable any new tool, and fill any secret it names.
8.   **Options** — **Allow re-import**, **Flat export** and **Link sheets**. A dot on the icon shows that an option is on.
8.   **Show unmapped only** — hide mapped columns to focus on what remains.
9.   Expand or collapse all sources, and search the sources.
9.   Saved configurations — restore or save the current field selection and options.
<!-- Dashboard box with custom template -->
<!-- Entity model -->
<!-- IN with literal values -->
<!-- If a toolbar and/or a menubar already exist, -->
<!-- Insert a dashlet as first element inside the view. -->
<!-- JSON (custom) model -->
<!-- Sample custom view definition using report-box template -->
<!-- Sample custom view definition using report-table template -->
<!-- These two references generate only one join to title -->
<!-- This adds options to the default language selection of "en", "fr" -->
<!-- This query uses startDate/endDate instead of fromDate/toDate -->
<!-- bind name node depending on type attribute value -->
<!-- bind text value of a node -->
<!-- bind value of code attribute -->
<!-- find country codes and put them in the context -->
<!-- if image is binary field -->
<!-- if image is m2o to MetaFile -->
<!-- show binary field image of custom in sale order card -->
<!-- the dashlet is inserted after those. -->
<![CDATA[
<![CDATA[ __bean__('com.example.Stats').rebuild(self); ]]>
</DataDashboard>
</action-attrs>
</action-group>
</action-method>
</action-record>
</action-report>
</action-script>
</action-view>
</adapter>
</agent>
</calendar>
</cards>
</chart>
</csv-input>
</csv-inputs>
</custom>
</dashboard>
</data-queries>
</domain-models>
</entity>
</extend>
</extra-code>
</extra-imports>
</form>
</gantt>
</grid>
</insert>
</join>
</kanban>
</menubar>
</object-views>
</panel-tabs>
</persistence>
</replace>
</script>
</search>
</selection>
</split>
</template>
</toolbar>
</tree>
</workflows>
</xml-inputs>
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<?xml version="1.0" encoding="UTF-8"?>
<?xml version="1.0"?>
<DataDashboard params={{ query: "sale.kpi", names: ["fromDate", "toDate"] }}>
<DataDashlet query="other.query"
<action-attrs name="action-test">
<action-group name="action-validate-invoice">
<action-method name="act.hello">
<action-record name="default-order-record" model="com.axelor.sale.db.Order">
<action-report name="action-report-invoice"
<action-script
<action-script name="create.hello" model="com.axelor.meta.db.MetaJsonRecord">
<action-view name="contact.all" title="Contacts"
<action-view name="contact.friends" title="My Friends"
<action-view name="sale.orders" title="Sale orders" model="com.axelor.sale.db.Order">
<action-view name="team.tasks.all" model="com.axelor.team.db.TeamTask" title="Tasks">
<adapter name="Boolean" type="com.axelor.data.adapter.BooleanAdapter">
<adapter name="DateTime" type="com.axelor.data.adapter.JavaTimeAdapter">
<adapter name="LocalDate" type="com.axelor.data.adapter.JavaTimeAdapter">
<adapter name="LocalDateTime" type="com.axelor.data.adapter.JavaTimeAdapter">
<adapter name="LocalTime" type="com.axelor.data.adapter.JavaTimeAdapter">
<agent id="classify" ref="support-triage" next="route">   **(1)**
<attribute name="<attribute name>" value="<attribute value>"/>
<bind node="../../../@location" alias="location_contact"/>
<bind node="@code" to="code" />
<bind node="city/@country" alias="city_country"/>
<bind node="name[@type='F']" to="firstName" />
<bind node="name[@type='L']" to="lastName" />
<bind node="some-flag" to="active" adapter="Boolean" .../>
<bind node="text()" to="name" />
<boundary id="chase" host="approve" on="timer"
<button ... onClick="action-report-invoice" /> **(1)**
<button ... onClick="save,action-some,action-report-invoice" /> **(2)**
<button ... onClick="save,action-some,action-report-invoice,action-another" /> **(3)**
<button name="greet" title="Greet" onClick="com.axelor.contact.web.HelloController:say" />
<button type="button" class="btn" ui-action-click="some.action" />
<calendar name="project-task-calendar-my"
<cards name="contact-cards" title="Contacts" model="com.axelor.contact.db.Contact" orderBy="fullName">
<chart ...>
<chart name="chart.sale.per.day" title="Sales per day">
<chart name="chart.sale.turnover.by.product" title="Turnover by product">
<chart name="chart.sales.per.month" title="Sales per month"> **(1)**
<config name="maxSeries" value="0" />
<csv-inputs xmlns="http://axelor.com/xml/ns/data-import"
<custom name="my-dashboard" title="My Dashboard">
<custom name="report-box-sales-month" title="Sales this month">
<custom name="report-table-order-lines" title="Order lines">
<custom name="report.total.sale" title="Total sale" css="report-box">
<custom name="view-name" title="View Title">
<custom-fields for="com.axelor.sale.db.Product" on="attrs">
<dashboard name="welcome.dashboard" title="Welcome!">
<data-queries xmlns="http://axelor.com/xml/ns/data-queries"
<domain-models ...>
<domain-models xmlns="http://axelor.com/xml/ns/domain-models"
<email id="notify" template="id:42" async="false" next="done"/>   **(2)**
<end id="done"/>
<entity name="Contact">
<entity name="Product" jsonAttr="true">
<entity name="Product">
<entity name="SaleOrder">
<entity name="Title" repository="abstract">
<extend target="/">
<extend target="<XPath expression>" if-feature="<feature name>" if-module="<module name>">
<extra-code>
<extra-imports>
<field name="code"/>
<field name="color" widget="ColorPicker" x-lite="true"/>
<field name="color" widget="ColorPicker"/>
<field name="date" widget="Date" /
<field name="decimal" widget="Decimal" x-scale="currency.decimalPlaces" x-precision="18" x-step="2.5" />
<field name="email" widget="email" />
<field name="fidelity" type="Integer" widget="Rating"/>
<field name="myRating" type="Integer" widget="Rating" max="8" x-rating-icon="airplane"/>
<field name="myRating" type="Integer" widget="Rating" x-rating-icon="1-square,2-square,3-square,4-square,5-square"/>
<field name="myRating" type="Integer" widget="Rating" x-rating-icon="heart"/>
<field name="password" widget="password" />
<field name="phone" widget="phone" />
<field name="price" widget="Decimal" x-scale="2" x-precision="18"/>
<field name="price" widget="Slider" min="1" max="10" x-scale="currency.decimalPlaces" x-slider-show-min-max="true" />
<field name="price" widget="Slider" x-step="10" />
<field name="productUid" widget="Uuid"/>
<field name="quantity" widget="Integer"/>
<field name="satisfaction" type="Integer" widget="Rating" x-rating-icon="emoji-angry,emoji-frown,emoji-neutral,emoji-smile,emoji-laughing" x-rating-color="#d32f2f,#d32f2f,#ed6c02,#2e7d32,#2e7d32" x-rating-highlight-selected="true" x-rating-fill="false"/>
<field name="url" widget="url" />
<finder name="findByAnyOf" using="long:id,email,String:country"
<finder name="findByCountry" using="String:country"
<finder name="findByName" using="fullName" />
<finder name="findByNameOrEmail" using="fullName,email" />
<form ...>
<form name="contact-form"
<form name="contact-form" model="com.axelor.contact.db.Contact">
<form name="contact-form" title="Contact" model="com.axelor.contact.db.Contact"
<form name="sale-order-form" title="Sale Order" ....>
<fqn>:<method>[(var1,var2[,...])]
<from model="CustomInvoice" as="inv" type="json"/>
<from model="com.axelor.contact.db.Contact" as="c"/>
<from model="com.axelor.sale.db.SaleOrder" as="o"/>
<from model="com.axelor.sale.db.SaleOrder" as="s"/>
<gantt name="project-task-gantt" title="Task Planning" model="com.axelor.project.db.ProjectTask"
<grid ...>
<grid name="contact-grid" title="Contacts"
<groupBy field="line.productName"/>
<groupBy field="o.name"/>
<img src={$image('customer', 'image')}>
<img src={$image('image', 'content')}>
<img src={$image(null, 'image')}>
<insert position="before|after|inside">
<join field="c.title" as="t" type="left"/>
<join id="merge" for="checks" wait="all" next="persist" title="All checks done"/>
<join model="com.axelor.sale.db.SaleOrderLine" as="line" type="left">
<kanban name="project-task-kanban" title="Project Tasks" model="com.axelor.project.db.ProjectTask"
<menubar>
<menuitem name="menu-contact-book"
<menuitem name="menu-contact-friends"
<menuitem name="menu-mail-inbox"
<module name="contact" package="com.axelor.contact.db" />
<move position="before|after|inside" source="<XPath expression>"/>
<object-views xmlns="http://axelor.com/xml/ns/object-views"
<panel title="Overview">
<persistence version="3.0"
<replace>
<script id="auditTrail"  next="merge"><![CDATA[ track(_t('Checks run')); ]]></script>
<script id="confirm" next="done"><![CDATA[ self.status = 'CONFIRMED'; save(); ]]></script>
<script id="creditCheck" next="merge"><![CDATA[ vars.creditOk = self.customer.rating >= 3; ]]></script>
<script id="persist" next="done"><![CDATA[ save(); ]]></script>
<script id="rebuild" async="true" next="done">   **(3)**
<script id="reject" next="done"><![CDATA[ self.status = 'REJECTED'; save(); ]]></script>
<script id="stockCheck"  next="merge"><![CDATA[ vars.stockOk  = self.items.every(i => i.available); ]]></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
<search name="sale-order-search" title="Sales Search" limit="100">
<select field="c.email" as="email"/>
<select field="c.fullName" as="name"/>
<select field="c.id" fn="COUNT" as="total"/>
<select field="c.title.name" as="titleName"/>
<select field="line.productName" as="product"/>
<select field="o.name" as="orderName"/>
<select field="t.name" as="titleName"/>
<select fn="SUM" field="line.price" as="total"/>
<select value="Active" as="status"/>
<selection name="select.language" id="select.language.extra">
<split id="after" mode="one">
<split id="checks" mode="all" title="Run every check">
<split id="route" mode="one">
<start id="start" on="update" watch="confirmed,totalAmount"
<task id="approve" role="sales.manager" comment="always" next="after"/>
<task id="approve" role="sales.manager" next="confirm"/>
<template><![CDATA[
<toolbar>
<tree name="project-task-tree" title="Project Tasks">
<ul id="product-list"></ul>
<view-param name="details-view" value="another-form-view" />
<view-param name="details-view-mode" value="inline" />
<view-param name="grid-width" value="25%" />
<where field="c.age" op="gte" param="minAge"/>
<where field="c.email" op="eq" value="jsmith@example.com"/>
<where field="c.email" op="in">
<where field="c.firstName" op="like" value="J%"/>
<where field="c.title.code" op="eq" ref="t.code"/> **(1)**
<where field="c.title.code" op="eq" value="mr"/>
<workflows xmlns="http://axelor.com/xml/ns/workflows">
<xml-inputs xmlns="http://axelor.com/xml/ns/data-import"
===== https://docs.axelor.com/adk/10.0/changelogs/changelog-10.0.html | 10.0 Changelog :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/changelogs/changelog-8.0.html | 8.0 Changelog :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/changelogs/changelog-8.1.html | 8.1 Changelog :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/actions/action-group.html | Group Action :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/actions/action-method.html | Method Action :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/actions/action-record.html | Record Action :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/actions/action-script.html | Script Action :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/actions/action-view.html | Actions & Menus :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/actions/index.html | Actions :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/agent-builder.html | Agent Builder :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/agents.html | Agents :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/chat.html | Chat & Context :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/configuration.html | Configuration & Seeding :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/index.html | AI :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/knowledge.html | Knowledge Bases :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/procedures.html | Procedures :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/providers.html | Providers & Models :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/security.html | Security :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/skills.html | Skills :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/tools.html | Tools :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/ai/usage.html | Usage Policies & Logs :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/cache.html | Caching :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/cli.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/cli.html | Command line :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/config.html | Configurations :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/develop.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/develop.html | Development :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/index.html | Overview :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/logging.html | Logging :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/multi-tenancy.html | Multi-Tenancy :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/scripting-policy.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/application/scripting-policy.html | Scripting Security Policy :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-exchange/export.html | Export Data :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-exchange/import.html | Import Data :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-exchange/index.html | Advanced Import & Export :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-exchange/reference.html | Reference & Administration :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-import/adapters.html | Adapters :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-import/csv-import.html | CSV DataSource :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-import/index.html | Data Transformation :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-import/integration.html | Integration :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-import/scripting.html | Groovy Scripting :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-import/soap-import.html | SOAP DataSource :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/data-import/xml-import.html | XML DataSource :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/custom-fields.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/custom-fields.html | Custom Fields :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/custom-models.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/custom-models.html | Custom Models :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/data-queries.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/data-queries.html | Data Queries :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/index.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/index.html | Overview :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/models.html | Models :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/repositories.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/repositories.html | Repositories :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/sequences.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/models/sequences.html | Sequences :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/coding.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/coding.html | Services & Controllers :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/events.html | Events :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/global-search.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/global-search.html | Global Search :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/hibernate-listeners.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/hibernate-listeners.html | Hibernate Event Listeners :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/i18n.html | Internationalization :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/index.html | Overview :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/messaging.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/messaging.html | Messaging :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/reports.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/reports.html | Reports :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/scala.html | Scala Support :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/scheduler.html |  =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/scheduler.html | Job Scheduling :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/modules/security.html | Security :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/actions.html | Actions :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/ai-assistant.html | Building with the AI Assistant :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/analytics.html | Analytics :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/build-and-git.html | Build Jobs & Repositories :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/index.html | Studio :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/lifecycle.html | Lifecycle: Versions & Deployment :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/menus.html | Menus :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/models.html | Models :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/projects.html | Projects & Resources :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/queries.html | Queries :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/selections.html | Selections :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/studio/views.html | Views :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/calendar.html | Calendar View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/cards.html | Cards View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/charts.html | Chart View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/custom.html | Custom View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/dashboard.html | Dashboard :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/data-widgets.html | Data Widgets :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/details.html | Details View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/extensions.html | Extension Views :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/form.html | Form View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/gantt.html | Gantt View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/grid.html | Grid View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/headless.html | Headless Forms :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/index.html | Object Views :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/kanban.html | Kanban View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/search.html | Search View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/views/tree.html | Tree View :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/advanced.html | Advanced Customization :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/collaboration.html | Views Collaboration :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/index.html | Web Client :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/quick-menu.html | Quick Menus :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/shortcuts.html | Keyboard Shortcuts :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/themes.html | Themes :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/view-attributes.html | View Attributes :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/view-processor.html | View Processors :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/views.html | Views :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-client/widgets.html | Widgets :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-services/advanced.html | Advanced Services :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-services/auth.html | Auth Services :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-services/dms.html | Document Services :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-services/index.html | Web Services :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-services/meta.html | MetaData Services :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/web-services/rest.html | REST Services :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/definitions.html | Workflow Definitions :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/designer.html | Workflow Designer :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/execution.html | Workflow Execution :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/index.html | Workflows :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/migrating-from-bpm.html | Migrating from the BPM module :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/nodes.html | Workflow Nodes :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/split-join.html | Branching and Joining :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/dev-guide/workflows/user-tasks.html | User Tasks & Approvals :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/getting-started/eclipse.html | Eclipse :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/getting-started/idea.html | IntelliJ IDEA :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/getting-started/vscode.html | VSCode :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/migrations/migration-8.0.html | 8.0 Migration Guide :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/migrations/migration-8.1.html | 8.1 Migration Guide :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/tutorial/step3.html | Step 3: Define Models :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/tutorial/step4.html | Step 4: Define Views :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/tutorial/step5.html | Step 5: Define Actions :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/tutorial/step6.html | Step 6: Configuration :: Axelor Documentation =====
===== https://docs.axelor.com/adk/10.0/tutorial/step7.html | Step 7: Start the Server :: Axelor Documentation =====
@ExtendWith(GuiceExtension.class)
@GuiceModules(DataModule.class)
@RequestScope **(1)**
@RequestScoped
@ScriptAllowed
@Singleton
A CSS grid container (12 columns) that arranges dashlets. Supports shared dashboard-level filters that propagate to all child dashlets.
A `major.minor.patch` version of the project that holds the resources. Draft revisions are editable; published ones are locked snapshots.
A `panel-tabs` contains other panels which are shown as notebook tabs. It includ
A `panel` can have the following attributes:
A `task` node parks the workflow until a person decides. This page covers the approval screens built on it and the task lifecycle underneath.
A boundary declared with `cancel="false"` does not close the approval at all: the task stays open for the assignee while the run starts a separate escape branch from the boundary’s `next`. See Boundaries.
A built-in tool implemented in Java; its description and schema come from the code, so the record only names the `systemTool` key. These cover data access (`search_records`, `query_records`, `read_record`, `create_record`, `update_record`, `delete_record`, `save_query`, `read_activity`), charts and tables in the answer (`show_data`, see Data widgets in answers), metadata (`describe_model`, `list_models`, `resolve_view`), the caller’s own identity (`current_user`), knowledge (`search_knowledge`), skills (`use_skill`), consulting another agent (`consult_agent`, added to any agent that has sub-agents), form procedures (`run_procedure`, see Procedures), the Agent Builder (`inspect_ai_config`, `inspect_process`, `save_agent`, `save_skill`, `save_tool`, `try_agent`, see Agent Builder), and the Studio builder (`studio_*`). See Extend with a custom SystemTool to add your own.
A call with no user is refused, never treated as trusted: an assistant call always runs as someone, a workflow `<agent>` node as whoever started the run. Nothing in these checks swallows a failure either — a check that throws fails the call.
A card container with optional header (title, icon, pagination, refresh).
A chart view requires following information:
A condition may use `?` for values the user supplies, listed comma-separated in the restriction’s `conditionParams` (`*user*`, `*user*.group`, …).
A confirmation flow on sale orders: when an order becomes confirmed, large orders require a manager’s approval before the workflow records a confirmation note.
A cycle made only of required references — each record needing the other to exist before it can be saved — has no order that works. The import is refused before any record is written, with an error naming the references in the cycle.
A dashboard view is a grid of **dashlets**, each embedding another view — typically charts and filtered grids. Design the content views first, then compose them. For charts and data components, see Analytics.
A data dashboard is a `DataDashboard` holding `DataDashlet` panels. Each dashlet runs one query and hands its result to `render` as a single dataset, `data`. Every widget takes that dataset as `data={data}` and binds fields by name:
A data dashboard is a custom view whose template composes the data widgets — `DataDashboard` as the 12-column container, one `DataDashlet` per figure bound to a saved query, and a visualization inside: `DataChart`, `DataKPI`, `DataTable`, `DataPivot`, `DataProgress`, `DataList`, `DataFlow`… Each dashlet hands its query result to the widgets inside it as `data`, and the widgets bind to the query’s columns by name.
A data query is defined using the `<query>` element inside a `<data-queries>` file. Query files are placed in the `src/main/resources/queries/` directory of a module and are automatically loaded during application startup.
A database session is bound to the tenant that was current when the session was opened. Changing the tenant afterwards has no effect on an already opened session.
A definition’s identity is a stable `xmlId` that survives undeploy/redeploy, so a run or task already parked against it keeps resolving correctly even after the definition row is recreated.
A domain model (entity) can have custom fields if it has either `jsonAttr="true"` attribute defined or has a `string` field with `json="true"`.
A domain model is defined using `<entity>` tag, it supports some attributes.
A family may also carry its own `exclude`. Sync adds each selected model, named by the provider’s code and its id, **disabled** — a model nobody has looked at is not offered in the chat until you enable it. A model the provider already lists is matched on its `modelId`, and only what the vendor itself reports (name, type, capabilities, window, embedding size) is refreshed on a later sync: the `defaults` are a guess, so they never overwrite a value you corrected. A sync never removes or disables a model, and it writes nothing if it fails.
A few habits that keep selections tidy:
A field a widget binds that the query does not return shows an error naming the columns the query does return, rather than an empty widget.
A field of a node is written after its path: `items[-1].qty`. A custom field is `attrs.name` or its bare name; a field of a referenced record is `customer.name`.
A flat, searchable list of every resource across all projects.
A floating launcher (also toggled with Ctrl+J / Cmd+J) opens the assistant from any screen. In the panel the user picks an agent (the **default** agent is pre-selected), types a prompt, and watches the answer stream in. The work behind the answer — the agent’s thinking and the tools it called — collapses into one activity line above it. While it runs the line names the step in hand (`Working on {0}`, `Thinking: {0}`). Afterwards it says what was used — the tool’s own name for one call, `{0} {1} times` for a repeated one, `Used {0} tools` for several, `Thought and used …` when the agent also thought — with `· {0} approved` when a person allowed a step. A failure turns the line instead (`{0} steps failed of {1}`, `Nothing worked`). The line opens into a timeline of every step, each thought between the calls it led to, so the user can see what was read or written; the bubble holds only the answer, with its tables and code blocks standing between the paragraphs.
A form does more than save a record. Its fields run `onChange` actions, its buttons run chains, its lines have their own hooks, `onSave` checks what is about to be saved, and each response can set values, show a message or ask a question. Saving through a repository skips all of that.
A form view is defined like this:
A generated key such as `contact-42` matches the record with that `id` only while the record has no `importId` of its own.
A grid view can be defined like this:
A knowledge base (`AiKnowledgeBase`) indexes documents and records into embeddings so the assistant can retrieve relevant passages — retrieval-augmented generation (RAG) — via the `search_knowledge` tool.
A many-to-many field, or a collection custom field, is exported as one column of its owner. The cell lists one value per related record, separated by `|`:
A new field `receivedOn` has been added on `MailMessage`. Run the following SQL script to adjust `mail_message` table change :
A pending task closes exactly once — completion is race-safe, the first decision wins:
A permission denial names the operation and the model — "you are not allowed to read User records" — so the assistant can relay a real cause instead of inventing one. It never names the rule, role or condition behind the denial: the user learns that access is missing, not the shape of the policy that withheld it.
A policy that is neither global nor lists anyone is refused.
A procedure is a named run of a form’s own steps — set a field, add a line, click a button, save — stored on a skill. An agent linked to that skill runs it with the `run_procedure` tool, giving only the procedure’s name, the record’s id and the inputs the procedure declares. The steps are yours; the model never supplies them. Each step runs the form’s chains on the server, as the browser would (see Headless Forms).
A provider (`AiProvider`) is a connection to an LLM vendor; each provider exposes one or more models (`AiModel`) that the rest of the module references by code (e.g. `openai/gpt-6.1-sol`).
A query has the following elements, all optional except `<from>`:
A query resource is a saved, named data query — the data layer behind dashboards and reports. Because dashlets reference queries by name (`sales.orders.by.status`), you can tune the figures without touching any view.
A quick menu have a title, a position in the top bar (the biggests on the right) and a list of items. Each item have a title, and a selected flag, an action that will be executed when clicking on that item and a context. The items are displayed according to their order of insertion in the list.
A record source names the fields its template reads, comma-separated, a dotted path reading through a relation:
A record with pending tasks shows an **Approvals** button with a count badge on the right of its form toolbar. It is record-centric — "this record is waiting on approvals" — so it counts **all** pending tasks on the record, whoever they are assigned to; what each viewer can **do** with a task is still decided per task. The button opens the record’s pending task list.
A record’s `code` is its file name — or its folder name, for skills and knowledge bases — not a `code` key inside the file; a key that differs is ignored, with a warning in the log. Governance files are the exception: they are identified by their `name`. A file that does not parse is skipped and logged, and the rest still load.
A request using the API key from any other address is rejected with HTTP status `401 Unauthorized`. Leave the list empty to allow any address. Host names are not supported. The list is limited to 2048 characters once normalized, i.e. at least 45 entries.
A root message is created when record is created. All the followup messages are considered as replies to this root message. This done to keep change tracking messages in threaded format.
A row can name a record created later in the same sheet, or two sheets can name each other — a contact its primary address, and the address its contact. The importer leaves such references out of the first pass, and sets them in a second pass once every source has loaded. A reference that still names no record then is reported in the **Errors** sheet; its record is kept without it.
A row can name records the same file creates, later in its sheet or in another sheet; those references are set once every source has loaded. One that still names no record is listed in **Errors**, while its row counts as imported. See Records the same file creates.
A selection is a named list of value/title pairs — what a dropdown, a status bar or a set of tags offers to pick from. Selections are plain data: they deploy live with the revision and can grow new values at any time.
A service firing an event is an event source. To fire an event, a service needs to inject a parameterized Event object and invoke its `fire` method with an instance of the event object as parameter:
A session holds the record as the client holds it — JSON-shaped values, the lines inside their collections — and names each node by a path:
A skill file can also name the agents to attach itself to, so a module adds a skill to an agent it does not own:
A skill has three tiers, revealed as the model needs them:
A skill is a folder under `src/main/resources/ai/skills/<code>/`:
A source is named after its model, such as `Order`; a custom model is named after the custom model. A sheet or CSV whose name is not a model is ignored. In an Excel workbook, a `__config__` sheet written by the exporter maps shortened sheet names back to the full ones.
A split carries a `mode`, and always says it. A join carries `for` (which split it closes) and `wait` (what it waits for), and always says both. The engine never guesses which join belongs to which split, never reads a node’s role off how many arrows touch it, and never counts arrows into a join to decide when to continue. If two things are drawn, two things are written.
A tag on the entry — static text, a record count, or a value computed by an action, each with a style (info, success, warning, important).
A task references 
A template helper function `$image(field, image)` can be used to put an image.
A tile per record — pick the fields and the card template.
A tool (`AiTool`) is a capability the model can invoke during a conversation — reading and writing records, calling an API, running a script, or asking the user something. Each tool declares a JSON input schema and can require the user’s approval before it runs.
A tree view can be defined like this:
A widget given `records` instead of `data` treats them as of unknown completeness: nothing counted them.
A workflow is a single path until a `<split>` opens several, and a `<join>` closes them again. This page walks through every shape the two elements make — a choice, a fan-out, a race, a quorum, a rejection that stops everything — and what the engine does with each at run time. The attribute-by-attribute reference is in split and join.
ALTER TABLE mail_message ADD COLUMN received_on timestamp(6);
AOP provides a Gradle plugin to simplify changelog management.
AOP reads configuration values from multiple sources (in this ascendant order):
API key authentication allows clients to authenticate API requests without maintaining a session. This is particularly useful for server-to-server communication and automated scripts.
API keys are managed by the `com.axelor.auth.db.UserToken` object. Each user can have multiple API keys with different names and expiration dates.
API keys can be created from the User Preference form. To create a new API key:
API-KEY: <your-api-key>
Accept: application/json
Actions
Actions are re-usable. So each action should be given a unique name.
Actions are the behavior layer: what happens when a button is clicked, a value changes, a record is saved, or a menu entry opens. Studio designs the same action types documented in the Actions chapter.
Actions can be performed on various events. This includes:
Actions can be used to perform some advanced operations on the view, including:
Activate the revision and **Todo → Tasks** appears in the navigation.
Activated
Activating a revision makes its resources live; deactivating withdraws them. Nothing you edit is visible in the application until activated.
Activation deploys views, custom models, actions, menus, selections, queries and workflows instantly — no build. You need a build only when the project
Adaptive back-pressure mechanism can be controlled with the following properties : `application.audit.logs.flush-threshold`, `application.audit.processor.batch-delay`, `application.audit.processor.activity-window`, `application.audit.processor.busy-backoff-interval`, `application.audit.processor.busy-backoff-max-retries` and `application.audit.processor.batch-size`.
Adding actions on chart menu (gear icon on the top right) is supported using following syntax :
Additionally, job configuration can have parameter values (list of key → value pairs).
Additionally, the following are available in EL:
Admins can also **Reassign**, **Cancel** or **Force complete** any task. A node may withdraw any of three actions for its own tasks — `allowReject="false"` refuses a **Reject**, `allowForceComplete="false"` a **Force complete**, and `allowCancel="false"` a **Cancel**, the last two even from an admin. A withdrawn action’s button is not offered; the refusal still stands behind it for a stale screen or a direct call — see Restricting how a task may be closed.
Advanced Import & Export is an interactive data-exchange tool for business users. It exports selected records, fields and relationships to an Excel workbook or CSV archive, and imports an Excel workbook or CSV archive after the columns have been mapped to model fields.
Advanced import accepts these file types:
Advanced import never fires workflows, and rows are saved in batches: a rejected row does not stop the others. See Review the result workbook.
Advanced import never fires workflows, the final compute save included, since imported records can be partial.
After a few seconds, you should see some logs and at the end something like this:
After a file has been parsed, select the settings icon to load or save an import configuration. A saved configuration includes the column-to-field mapping and per-source compute and flat-mode choices. It does not store the uploaded file. Mappings are listed for everyone who imports into that model.
After the task closes, the run resumes from the node’s `next` with the `task` binding available to conditions and scripts:
After the transaction **commits**, the captured events dispatch:
After-commit dispatch and scheduler recovery use the same claim protocol. A capture moves from `pending` to `dispatching` under a database-timed lease. Its `dispatched` status commits in the same transaction as the workflow’s database changes. A crash before that commit leaves a recoverable attempt, rather than a completed marker without its work. The captured user is restored through the execution and commit; an inactive or deleted user yields no user attribution.
Agent
Agents are seeded from markdown files in a module’s `src/main/resources/ai/agents/` directory — YAML frontmatter for the configuration, the body for the system prompt:
All API requests are authenticated through the following security checks:
All built-in events are located inside the `com.axelor.events` package.
All conditions (`split` flows, `wait` conditions) and `script` bodies are JavaScript, evaluated against the running record. Available bindings:
All custom fields defined for the given json field will be visible inside this panel widget. However, visibility in grid view is controlled by `Show in grid` flag which we will see in next section.
All nodes share:
All the widgets represents a domain object field and can override all the properties (min, max, required, readonly etc.) of underlying fields.
All type access — bare names as well as `Java.type()` — is governed by the scripting policy. Depending on the configured policy a given class may or may not be accessible; a denied class fails at resolution, so don’t assume an arbitrary type is reachable.
Allow entity
Allow json entity
Also, both `_domain` and `criteria` can be used for search.
Also, make sure to use JDK 21 in the IDE as well as in your terminal (if needed).
Alternatively, the JNDI name can be set with the `non-jta-data-source` element of `META-INF/persistence.xml`:
Alternatively, the application can use a `DataSource` managed by the servlet container and looked up by its JNDI name.
Alternatively, you can opt for an AMQP 1.0 message broker (RabbitMQ, ActiveMQ Artemis, etc.) by configuring the `view.collaboration.amqp.*` properties. In this case, ensure the specified address supports publish-subscribe behavior (often referred to as a fanout exchange type, multicast routing type, or similar, depending on your broker).
Always use tools to look up real data — never guess.
An API key can be restricted to a comma-separated list of IPv4 or IPv6 addresses or CIDR ranges:
An `<extend>` tag is composed of one or more extension operations, among `insert`, `replace`, `move`, and `attribute`.
An `AiAgent` is a configured assistant: a system prompt, a model, the tools, skills, knowledge bases and sub-agents it may use, and the data models it may reach — plus access scoping (roles/groups/users) and runtime overrides. The default agent answers the chat launcher; specialized agents (e.g. the built-in **Studio Assistant**) target specific jobs. See Agents.
An `AiKnowledgeBase` indexes documents and records into embeddings so the assistant can retrieve relevant passages (RAG) via `search_knowledge`. See Knowledge Bases.
An `AiProvider` (OpenAI, Anthropic, Mistral, Google, Ollama, …) exposes one or more `AiModel` entries — chat or embedding models with their capabilities (streaming, tools, vision, reasoning) and limits. One chat model is the global default; agents may also name a cheaper **utility model** for background work. See Providers & Models.
An `AiSkill` is on-demand expertise — a short description the model always sees, plus full instructions and references loaded only when the model calls `use_skill`. This keeps prompts small while giving deep, focused guidance when needed. See Skills.
An `AiSkill` is on-demand expertise. The model always sees a short **description**; it loads the full **instructions** and **references** only when it calls `use_skill` — keeping prompts small while giving deep, focused guidance exactly when needed.
An `AiTool` is a capability the model can invoke — a built-in **system** tool (read/write records, describe models, drive Studio), a **client** tool (ask the user, open a view), a **script** tool (JavaScript), an **HTTP** tool (call an API), or an **action** tool (run an existing Axelor action). Tools declare a JSON input schema and may require user approval before running. See Tools.
An `AiUsagePolicy` sets limits for everyone, or for the roles, groups and users it lists:
An `agent`, `email` or `script` node can run **after** the walk that reached it has committed, on a worker of its own, instead of inside it. The run stops at the node the way it stops at a `wait`; everything before it is saved; then the node runs and the run carries on from there, reading `agent`, `task`, `error` and `parent` as it would have inline. `old` and `event` are gone by then, as after any park.
An `editable` grid allows to update records inline. This can be used for quick data updates.
An action to run when the value changes — see Actions.
An agent (`AiAgent`) is a configured assistant — a system prompt and a model, plus the tools, skills, knowledge bases and sub-agents it may use, who is allowed to use it, and a few runtime settings. The *default* agent answers the chat launcher; you add specialized agents for specific jobs (the built-in Studio Assistant is one).
An agent can plug itself into another one without editing its file: `delegateTo: [default-assistant]` in its frontmatter adds it to those agents' sub-agents, and a skill’s `agents:` list (see Skills) adds that skill to those agents. Both add to what the target already has, so one module can extend another’s agent.
An agent reaches only the data models its job needs, listed on the agent’s **Permissions** tab — see Restrict what an agent can touch. Each row names an object and the operations the agent may do there:
An agent that sets `status` with `update_record` skips everything the form does: the `onChange` that stamps a date, the `onSave` checks, the workflows that start when the record is confirmed. A **procedure** changes the record the way a user would — through the form.
An agent’s own permissions are its file’s `permissions` list (Agents), not a governance file.
An application is nothing but a configuration of a set of modules. The modules are built-time packages handled with Gradle build system.
An approval closed by a cancelling `<boundary>` (the default) is **withdrawn**, not answered: nobody decided, so the run leaves by the boundary’s own edge rather than the node’s `next`. Why it closed is still recorded — a timer boundary leaves `outcome` as `timeout` and sets `timedOut` — so a missed deadline stays distinguishable from an approval somebody cancelled.
An authentication provider usually consists of a client and its configuration. There are a few base settings common to all the providers. All non-base settings are passed to the client configuration or the client itself.
An expression is either a:
An invalid definition is rejected as a whole: the file must pass the schema, and the validator enforces the graph-wide rules — every `next` resolves, all nodes are reachable, the trigger is coherent.
And we define model fields as the child nodes. Following fields are supported:
Another important build script is the `settings.gradle` where we configure the gradle build and aggregates all the feature module projects to be used in current build process.
Answer concisely and link to the record when relevant.
Any branch may hold a `<task>` or a `<wait>`. When one branch parks, the engine writes down where **every** branch of that split got to, and the join counts them back in as each finishes. The run shows `waiting` until the last branch it is owed reports back; the join then runs exactly once. Completing one approval never carries the run past a barrier its siblings 
Any multithreaded or multiprocess tasks should be wrapped to enable execution within a context-aware environment.
Application-wide script timeout configuration:
As the grid views fetch many records to display in as list, it’s important to show only important information.
As you can see, a mapping file maps input files to target objects and binds csv columns to target object fields. The syntax is self-explanatory and easy to understand.
Assignment follows the node’s attributes:
At this stage, our first application is now ready. However, before we run the application, we have to provide some configuration details like database connection etc.
Authentication is the process of identity verification and authorization is the process of determining access rights to resources in an application.
Authentication is the process of identity verification, i.e. allowing users to log in into to the system to use it.
Authorization has four core elements permissions, roles, groups and users. They are represented by corresponding backing domain objects `Permission`, `Role`, `Group` and `User` respectively.
Authorization is a critical element of any application, but it can quickly become very complex. Based on the simplicity of Apache Shiro, the Axelor Open Platform provides very simple yet powerful way to define authorization rules.
Authorization, also called access control, is the process of determining access rights to resources in an application.
Axelor Open Platform has multi-tenancy support. The term multi-tenancy refers to a software architecture in which a single instance of software runs on a server and serves multiple tenants. A tenant is a group of users who share common access with specific privileges to the software instance.
Axelor Open Platform is a web application framework used to create web applications. So by default, it provides form-based user authentication.
Axelor Open Platform use logback as logging framework.
Axelor Open Platform will auto configure logging so there is no need for any custom logging configuration file `logback.xml` unless you want total control over how to log (it’s still possible).
Badge
Base authentication provider settings:
Because of the context column being a multiline value, it’s difficult to edit the CSV files in plain text editors. So always prefer editing with some spreadsheet editors (Excel or LibreOffice).
Because the run is no longer tied to the connection, **closing a tab no longer stops a response** — use **Stop** to cancel it instead. Stop also ends the model call in flight, so a model still writing stops costing, and the tools it had named do not run. The owner’s Stop cancels any run in the chat; a Can-ask member’s Stop cancels only a run they themselves started — it can’t cut off a run another driver is waiting on.
Before executing email, agent, or script nodes, dispatch commits a separate `effectStarted` marker. Scripts are conservative here: they can call services whose effects are outside the workflow transaction. If such an attempt is interrupted, its capture becomes `outcome_unknown` and is not replayed automatically. Unmarked expired attempts return to `pending`. A caught dispatch transaction failure is retained as `failed`, or `outcome_unknown` when marked. Node failures successfully recorded by the engine still count as dispatched. The effect marker uses a second database connection while the dispatch transaction is open; allow connection-pool headroom for these independent commits.
Before you can use the search, you need to build the search index.
Behavior flags; each also has a conditional variant (**required if**, **readonly if**, **show/hide if**) taking an expression over the record’s fields, e.g. `status == "done"`.
Besides Java, the most natural candidates to write business code are pure JVM languages like Groovy, Scala or Kotlin. The Groovy support is built-in, just make sure to add `apply plugin: groovy` to your modules `build.gradle` script. For other languages, check gradle integration for them.
Besides these attributes, fields can also have other attributes supported by form view fields. These attributes are used by the inline editors.
Besides theses, when user subscribes to a messaging group, a personal menu is added as *Messaging → Groups → Group Name*
Binary fields never appear in the field lists. `id`, `importId` and the audit fields are hidden unless asked for as described above. In the **Available fields** list, required fields are shown in bold, unique fields in italics and underlined; fields already added to the export are dimmed.
Bind a String field to the selection by name in the model designer (Models). Create the selection first, then reference it.
Binds a String field to a named value list — see Selections.
Body
Both params are optional and in that case lists root directory.
Build
Build Jobs
Build and export behavior is tuned in `axelor-config.properties` (defaults shown):
Build it in this order:
Building an agent comes down to a few decisions:
But we can also configure view attributes directly from the UI for and even more advanced configuration.
By default, Axelor Open Platform applications manage their own database connection pool (HikariCP), using the above database settings.
By default, Gradle resolves dependency version conflicts by using the newest version of the library. This is generally ok, but sometimes, depending on the modules used and on AOP versions used when they have been published, it may use an unwanted version.
By default, Hibernate uses a static `PreparedStatement` that updates all columns in the table, even if only one field changed. Enabling `dynamicUpdate` causes Hibernate to generate the SQL statement at runtime, updating only the columns that actually changed.
By default, `<field>` are tracked only if it’s value is changed and given `if` expression evaluates to `true`.
By default, `star` icon will be colored in yellow when checked and `heart` in pink. The record value of the first icon is `1`, the last is the one defined in `max` attribute. By clicking on the last checked icon, it reset the value to `0`.
By default, a green border surrounds the profile picture. This means that the user is simply consulting the record.
By default, all applications comes with a default theme and a dark mode. There is also a special theme "Auto", that will use either the default light or the dark theme depending on your system settings.
By default, initial messages files are generated for `en` and `fr` languages. Use the `--languages` option to generate messages for additional languages.
By default, it returns hex code format `#RRGGBB`. When alpha is enabled, it returns hex code format `#RRGGBBAA`, where alpha is `A`.
By default, the search is done on all objects (defined by the `<select>` tags). It is possible to select on which the search is carried out.
By default, themes aren’t available for users. To allow a theme to be selected by users from their preferences, click on `Make theme available`. When making the theme available to users, make sure that the name is unique. To undo, click on `Do not make the theme available`. This will revert any users having this theme with the default theme
CLI Command
CLIENT
CREATE INDEX audit_log_idx_processing
CREATE INDEX mail_message_received_on_idx ON mail_message (received_on);
CREATE SEQUENCE audit_log_seq START WITH 1 INCREMENT BY 100;
CREATE TABLE audit_log
CSV files are UTF-8. Sheet names in Excel are limited to 31 characters: a longer source name is shortened with a hash suffix, and a `__config__` sheet at the end of the workbook records the full names so an import still finds them. A single Excel cell holds at most 32,767 characters; a longer value fails the export with a message suggesting CSV, which has no such limit.
Calendar
Canvas
Canvas positions and edge routes are not node attributes: the designer keeps them in the definition’s own `<layout>` block, which the engine ignores.
Cards
Cards in columns driven by a selection field, draggable between columns.
Change a specified attribute on the target element.
Change tracking
Chart views embed anywhere a dashlet fits — dashboards and form panels alike. The full attribute reference is in Charts.
Charts can be configured with specific config values. These configurations may not be applicable to all chart types.
Chat
Check Gradle migration to update your builds: Upgrading your build from Gradle 8.x to the latest
Choose the right option by environment :
Click **Save**: the definition is validated server-side — the same validator that guards XML loading (every `next` resolves, all nodes reachable, trigger coherence, node essentials). A refused save lists its problems over the canvas, each naming the node it concerns (select one to bring that node into view); there are no client-side rules that could drift from the engine.
Click **Sync** on the revision: the revision is exported as source files, committed, and pushed to a `dev-<version>` branch of the repository (e.g. `dev-1.0.0`).
Clients with session support should send `X-Tenant-ID` header with login request.
Clients without session support (e.g. direct basic auth) should provide `X-Tenant-ID` header with every request to select a tenant.
Code an administrator wrote runs as that code always has, and is not filtered: script, action, HTTP and MCP tools, a workflow’s prompt templates, a record knowledge template’s own script helpers, and a form’s `onChange` and `onSave` when a procedure runs it. What such code hands the model is its author’s decision. An agent’s permissions do not narrow it either, and what it returns is not recorded as data that entered the conversation (see What leaves with a conversation).
Colors can be specified with `colors` config value. It can be either :
Commands:
Compilation jobs — see Build Jobs & Repositories.
Computed fields
Configuration values can be encrypted. Value should be wrapped in `ENC()` to indicate that the value is encrypted: `db.default.password = ENC(<some_thing>)`
Configuration → Repositories
Configure `cors.allow-origin` with a comma-separated list of exact origins (`scheme://host[:port]`). Configured values are lowercased, and trailing slashes and default ports (`:443` for `https`, `:80` for `http`) are removed, as browsers never send them in the `Origin` header. Invalid entries, such as regular expressions or wildcard hosts, are ignored with a warning. If no valid origin remains, all cross-origin requests are rejected. When set to ``**, the filter ignores `cors.allow-credentials` and never allows credentials. The `null` origin cannot be listed explicitly: it is only accepted with ``**, without credentials.
Configure connection parameters for the Elasticsearch/OpenSearch backend.
Congratulations! You have learned how to create simple axelor application. Follow the Developer Guide for more detailed documentation.
Content-Disposition -> attachment; filename="some.pdf"
Content-Length -> 7296
Content-Length:148009
Content-Transfer-Encoding -> binary
Content-Type -> application/octet-stream
Content-Type: application/json
Content-Type:application/octet-stream
ContextAware.of().withTenantId("tenant-b").build(task).run();
Controllers
Controllers generally don’t implement business logic, but deal with RPC requests only.
Conversations are persisted as `AiChat` (one per conversation) and `AiChatMessage` (user, assistant and tool turns), so they can be resumed, audited, and browsed — read-only — under   **Operations**  **Chats** and   **Operations**  **Messages**. A chat’s record has a **Messages** tab, a **Usage** tab with its model calls, and a **Summary** tab that appears only once a long conversation has been condensed.
Conversations stream token-by-token in the chat panel, rendering each tool call as a card. A conversation can be shared with other people, who follow it, post in it, or — with **Can ask** — bring the agent in themselves. See Chat & Context.
Conversations stream token-by-token in the chat panel, rendering each tool call as a card. Behind the scenes a pipeline of plugins manages long-conversation compaction, titles and session notes.
Correct the rejected source rows and import a new file. Do not re-import successful rows unless the file retains the stable identifiers needed to update them.
Create a class that implements `com.axelor.db.audit.HibernateListenerConfigurator`. This class is responsible for registering your listeners with Hibernate’s `EventListenerRegistry`. You can inject your listener instances directly into the configurator.
Create a class that implements `com.axelor.script.ScriptPolicyConfigurator` interface. The application will scan for all classes implementing this interface and will call them in module resolution order to configure the scripting policy.
Create a major version
Create a minor version
Create a patch version
Create a provider under   **Configuration**  **Providers**, or seed it from a YAML file in `src/main/resources/ai/providers/` — the file name is the provider’s `code` — with its models nested. Models are also listed on their own under   **Configuration**  **Models**, and a provider’s form has a **Models** tab:
Create the agent under   **Configuration**  **Agents**, or seed it from a file in your module, `src/main/resources/ai/agents/<code>.md` — YAML frontmatter for the configuration, the body for the system prompt. The file name is the agent’s `code`:
Create the database using the postgresql’s `createdb` utility:
Criteria `operator` can be:
Criteria has the following attributes:
Custom fields are implemented using `JSON` data type support from underlying database.
Custom models and custom fields are supported too: their fields appear in the field lists as extra groups, and export and import use the same dialogs.
Custom models are defined as `com.axelor.meta.db.MetaJsonModel` records with following properties:
Custom themes can be defined within the application. You can customize the existing ones but also create new themes according to your requirements.
DELETE /ws/rest/:model/:id
DELETE /ws/rest/com.axelor.contact.db.Contact/1 HTTP/1.1
Dashboard
Dashlets are nothing but embedded views. The following view types are supported: `grid`, `chart`, `custom`, `cards`, `kanban`, `calendar`, `tree`, `gantt`, `html`.
Data are essential to all the operations of every company. As businesses evolve, usage of legacy systems create loads of information stored in different forms.
Data import through SOAP web services is supported using xml actions:
Data policies (see Restrictions) ship as files too, so a site’s rules move between environments with the rest of its configuration. The platform ships none; a module adds its own. A file names one policy by `name`:
Data queries provide a declarative XML-based DSL for building type-safe, permission-checked queries against entity and JSON models. Queries are defined in XML files, stored as `MetaQuery` records, and executed through the query engine with automatic JPQL generation, parameterized execution, and row-level security.
Data transformation involves two key phases:
Data transformation is the process of converting data from one format to another, usually from the format of a source system into the required format of a new destination system.
Data widgets are a set of React components for building data dashboards inside custom views. They integrate with data queries to fetch, display, and interact with query results.
Default supported languages are `en` and `fr`. To add more languages, you need to enrich the `select.language` selection.
Default value
Define a rule to control customer field
Define a rule to hide total amount
Defining extension views causes computed views to be generated (views with `computed="true"`) with a priority higher than the original views'. Those computed views are regenerated whenever the extension views or the original views are updated.
Definition
Dependencies have been upgraded to major versions. Check the changelog for a detailed list.
Depending on the structure of the webapp folder, it may overwrite resources of dependency modules.
Deploy
Deployed. The revision’s resources are live in the application.
Directory Structure
Discussion groups can be used to create messaging groups where users can subscribe and post messages.
Dispatch renews active claims; the scheduler recovers expired claims. The default `workflow.capture.lease-seconds` is 300 (minimum 3); renewal runs every third of that interval. Claim tokens fence both activity invocation and completion, so an obsolete worker cannot commit its database changes.
Do not use a non-technical export as an import template: translated selection labels and display values are intended for reading, not for identifying records.
Domain
Don’t use this feature extensively. Use abstract repository class and provide more features using concrete implementation. This is more readable and better supported in IDE code editors.
Dotted field paths like `c.title.name` automatically generate LEFT JOIN clauses. The engine deduplicates joins, so multiple references to the same relation share a single join.
Downloads the revision as an app package — the resource definitions in a portable form, ready to import into another instance or keep under version control. For continuous sync to git, see Build Jobs & Repositories.
Draft
Drop the folder in `src/main/resources/ai/skills/` and restart, or use **Reload built-in defaults** on the Import / Export screen. Records are also editable under   **Configuration**  **Skills**.
Duplicate classes in classpath can cause unexpected behavior at runtime. Generally, they come from transitive dependencies, and most of the time we want to exclude them. The plugin checks whether 
During flush, the engine detects changes and snapshots the record’s fields before and after (custom fields included). Before commit it writes those snapshots to `MetaWorkflowCapture` in the same transaction as the business change. A failed capture write rolls back that change. Models without any dispatchable workflow are filtered by an in-memory gate.
Dynamic expressions:
EFevga4IJ68kgt+YS8nuRXt/7TmvL94aVGCU2l5WeBLDn4ie8tZM7UjypiBZA4rCTv4VogKAB1wRAJZpa3q12w==
Each `<select>` must define exactly one source: `field`, `value`, `param`, or a nested `<calc>` / `<case>` element.
Each `AiKnowledgeSource` contributes content to the base:
Each `references/*.md` file becomes a reference: its filename is the reference `name`, its frontmatter `title` the display title, and its body the `content`. The model loads a reference by name after loading the skill.
Each broker has its own address format, so refer to your broker’s documentation for guidance. Below are links to addressing documentation for some popular brokers:
Each configuration type lives under its own sub-directory:
Each deploy that really changes the definition mints a new revision, and runs already in flight stay on the one they started (When a definition changes under a parked run). If the deploy leaves runs parked on the revision it just replaced, the mover opens on the new one so you can bring them forward — or close it and decide later, which changes nothing either way.
Each designer exposes exactly the attributes documented on the type’s reference page.
Each entry of the `CHANGELOG.md` file is generated from files in the `changelogs/unreleased/` folder.
Each field type supports some attributes. Here are few of them:
Each file should have proper declaration:
Each new revision is a full copy of its predecessor’s resources, so editing it never disturbs the published one.
Each of these sources overrides values of the previous. The final configuration is the aggregation of the properties defined by all these sources. For example, a property configured using an environment property overrides the value provided using the axelor-config.properties file.
Each source exposes controls that affect only that source:
Each user can:
Editing `syncRules` directly is the way to follow a family further; the seed file’s `sync:` block is applied only when the provider’s rules are blank, so a re-seed does not flatten an edit.
Editing a resource in a draft revision never touches the running application. The revision’s lifecycle decides when your work goes live, when it is locked, and how it travels to another environment. All the buttons below live on the revision form (Projects & Resources).
Editing the graph is allowed while runs are parked on it, and it does not disturb them: every change to the XML mints a new **revision**, and each run finishes on the revision it started with. See Execution. **Removing** a definition, or undeploying it from Studio, is still rejected while it has anything in flight — a parked run, a pending `task`, or an armed `timer`/`once` trigger — because a removal takes the identity with it and leaves nothing for those instances to be deployed against. Complete or cancel them first. Toggling `active` alone changes nothing about parked instances: it only gates future dispatch.
Encrypt or re-encrypt all encrypted field values. This command should be run in the following situations:
Enums are a named list of items, optionally with explicit numeric values.
Environment variables should be prefixed by `AXELOR_CONFIG_`. It uses the `AXELOR_CONFIG_<key>=value` format, where `<key>` is underscored uppercase equivalent of the configuration key. For example `db.default.user` becomes `AXELOR_CONFIG_DB_DEFAULT_USER`.
Every branch of one run shares a single in-memory record. Let the branches accumulate their changes and persist them once past the join, as `persist` does above. Saving inside each branch writes the record once per branch: every write runs the record’s save hooks, may re-trigger a workflow watching a field that branch just set, and exposes half-updated states to anything reading the record in between. One save past the join goes from the old state to the final one.
Every field type has a default rendering; set the **widget** property to override it. The ones you’ll actually reach for:
Every import downloads an Excel result workbook. Review it even when the import completes without an alert:
Every model call is recorded as an `AiUsageLog` — a chat turn, each background task (titles, the conversation subject, session notes, compaction summaries and recaps) and each embedding call, indexing or a knowledge search:
Every resource is written to the application’s metadata, exactly as if a module had shipped it. Views, models, actions, menus, selections, queries, workflows and translations all take effect immediately.
Every setting above maps to a field on the agent record:
Every way the assistant reads or writes a record is held to the acting user’s own permissions — the platform’s permission records, and nothing else:
Every web service returns JSON data in a specific format. Also, some web services requires JSON data as request body.
Everything in this table has a direct equivalent. See Nodes for the details of each.
Everything the designers edit:
Everything you build with Studio lives in a **project**. A project is versioned as **revisions**, and a revision holds **resources** — one per custom model, view, action, menu, selection, query or workflow. Every resource opens in a visual **designer**.
Example AMQP 1.0 configuration for view collaboration using pre-declared RabbitMQ fanout exchange:
Example Java helper
Example usage in script
Example usage with a custom template:
Example usage:
Example:
Example: custom\_fr.csv
Examples:
Except for a diverging `split` (which branches through its flows) and `end`, every node has a required single `next`.
Execute an action
Export
Export and import both run inside the request, with the dialog open; there is no background job or progress report. The generated file is a temporary file on the server, downloaded once the request completes. For very large data sets split the export with filters, and import in several files.
Export requires read and export access to every model included in the export. The current security filter limits the records that can be exported, including the related records written to their own sources.
Extension views have one or more `<extend>` tags defining the extensions:
Feature can be disabled with `view.collaboration.enabled` property. By default, it is enabled. On groups, there is a boolean `canViewCollaboration` to determine whether members can view collaboration (`true` by default).
Fetches data from a named query and passes the dataset to a render function.
Figure 1. Custom Fields (grid)
Figure 1. Custom Models (grid)
Figure 1. Sample report box
Figure 1. Translate icon
Figure 2. Custom Fields (form)
Figure 2. Custom Models (form)
Figure 2. Sample report table
Figure 2. Translation dialog
Figure 3. Grid View
Figure 4. Form View
File & media
Files exported by earlier versions may contain link sources, named after the field they fill (`OrderLine.taxes`), with one row per link. They still import after the main sources, and only add links.
Finally, bind your configurator in your module’s `configure()` method using helper method `addHibernateListenerConfigurator()` that uses Guice’s `Multibinder` to be able to bind multiple configurators.
First `<field>` item is used as event title. More `<field>` items can be specified for usage in the `<template>`.
First, register the quick menu in module class :
First, remove the `db.default.url`, `db.default.user` and `db.default.password` settings from `axelor-config.properties`, and set the JNDI name of the `DataSource`:
First, we can provide any method with call attribute to input tag to post-process the data object once it’s populated but before persisting to the database.
Following are the services to get metadata of domain models.
Following chart types are supported:
Following configuration settings should be provided via `axelor-config.properties`.
Following custom field types are supported:
Following helpers are provided
Following type adapters are pre-defined:
Following variables are available in script execution context:
Following widgets have been implemented:
For a file that you will edit and import again, enable **Allow re-import** when exporting. The output uses technical field names and values, and includes the key used to find existing records. Keep that key unchanged. When a business key must change, also include `id` or `importId` so the importer can still locate the existing record.
For a new app section you typically create two entries:
For additional configuration options including schema management, automatic indexing strategies, and performance tuning, see the Hibernate Search Configuration Reference.
For any other class, resolve it explicitly with `Java.type()`:
For best practice, you should prefer applying the rules on service interfaces, not implementations.
For convenience, 2 Gradle task has been added to deal with encryption :
For each row the importer looks for an existing record, in this order: the model’s key column — a required unique field such as `code`, `email` or a `*Seq` field, else `importId` — then `importId`, then `id`, whichever of those columns are mapped. The first hit is updated; with no hit a new record is created. Only columns that are mapped are used.
For each token, you can perform the following operations:
For example, here the default implementation of say method returns ``"Welcome 'Some Name!'"``` message. If we want to replace this message with say `"You are welcome 'Some Name!'"` without changing the original code, we provide a new implementation.
For example, if a user selects `fr-CA` (Canadian French) as their language and a specific translation is not available in `messages_fr-CA.csv`, the translation will fall back to `messages_fr.csv` (French). If the translation is still not found, the original translation key is used, which is typically the message for the default language, `en` (English).
For example:
For indirect clients, the user is redirected to an external identity provider for login and then back to the application. If no callback URL is configured, it defaults to `application.base-url` + "/callback".
For more configuration options, refer to:
For more information on `action-view` see the Developer Guide.
For multi-step features, ask for the outcome — the assistant knows the build recipes and creates each piece as a reviewable resource:
For relation fields, a filter restricting which records can be picked, e.g. `self.isActive = true`.
For relationship fields, the same rule applies to the referenced record. Include the relationship’s stable identifier when editing a referenced record’s unique value.
For security and performance reasons, certain field types are automatically excluded from audit tracking:
For some different business requirements, we may have to provide some different implementation.
For that, you can create manually a file `src/main/resources/i18n/custom_<language>.csv`. It should follow the same format as `messages_<language>.csv`.
For the above example, an implementation may look like this:
For this reason, the `ContextAware*` system runs the task inside its own database session, opened with the tenant of the task and closed once the task is completed. This is also the case when the task runs on a recycled thread (thread pools), so each task works on the database of its own tenant.
Form and grid views can be altered by defining a new view that has the same `name`, a unique `id` defined, and `extension="true"`. That kind of view is called an *extension view*.
Form view can have the following attributes:
Form view has the following properties:
Form view has two modes:
Found and encrypt 1 setting(s) : db.default.password
Four words carry the whole system:
From `start`, the engine walks `script`, `agent`, `email`, `split`, `join`, `call`, `subflow`, `task`, `wait` and `send` nodes until an `end`, with a `boundary` attached to any node it should be able to interrupt or catch. See Nodes; for how a `split` and a `join` make a choice, a fan-out or a race, see Branching and Joining.
From a form view, select   **Import…​** to import into that model, or   **Export…​** to export the current record. Form export is limited to that record. The form entries appear when the form’s toolbar allows them, and **Export…​** only for a saved record.
From nothing to a working assistant:
From the `<start>` node, the engine walks nodes connected by `next` edges until an `<end>`. This page is the reference for every node type.
From the eclipse, import the project using   **Import…​**  **Gradle**  **Existing Gradle Project**
From the project:
From the running application:
From the startup dialog, click on **Import Project** and select the project directory. From next dialog, select **Import project from external model** and select **Gradle**. From next dialog, click on finish button.
From the vscode, open the project folder using   **Open Folder**.
From there you tailor it — add your own agents, tools, skills and knowledge bases, all seeded from files or editable in the UI.
Full-text search management. Requires a subcommand.
GET /logout HTTP/1.1
GET /ws/dms/attachments/:model/:id
GET /ws/dms/attachments/com.axelor.sale.db.Order/1
GET /ws/dms/download/1
GET /ws/dms/download/:id
GET /ws/dms/files
GET /ws/dms/files?parent=2
GET /ws/dms/files?parent=2&pattern=some
GET /ws/dms/files?parent=id&pattern=matching
GET /ws/meta/fields/com.axelor.contact.db.Contact HTTP/1.1
GET /ws/meta/models HTTP/1.1
GET /ws/path
GET /ws/rest/:model
GET /ws/rest/:model/:id
GET /ws/rest/com.axelor.contact.db.Contact/1 HTTP/1.1
GET /ws/rest/com.axelor.contact.db.Contact?offset=0&limit=10 HTTP/1.1
Gantt view attributes:
Generally, we will configure logging from `axelor-config.properties` files:
Generate the global search index — typically after installation, a migration, or a mapping change.
Generation runs on the server, independent of the browser connection. If the tab loses its connection mid-answer, the run keeps going and completes in the background; reopening the conversation replays it — live if it is still running, or the finished answer otherwise. The same conversation open in several tabs streams to all of them at once, kept in sync over websocket, with a periodic refresh underneath as a fallback.
Git repositories projects can sync to.
Global Search is enabled by setting the Hibernate Search backend to Elasticsearch. The same configuration works for both Elasticsearch and OpenSearch.
Global log level can be changed with `logging.level.root` property. Package specific log levels can be configured with `logging.level.<package-name> = <level>` settings.
Gradle has also been upgraded to a newer version. Upgrade the Gradle Wrapper to benefit from new features and improvements: `./gradlew wrapper --gradle-version=8.14.3 && ./gradlew wrapper`.
Grid view has some advanced features, like grouping, row/cell highlight, buttons etc.
Grids and forms carry their own button bars: the **toolbar** (buttons) and the **menubar** (dropdown menus whose items run actions). Edit them inside the view designers with the same item-and-action mechanics — see Views.
Handled by the web client rather than the server — asking the user for input or confirmation (`ask_to_input`, `ask_to_select`, `ask_to_continue`), opening or refreshing views (`open_view`, `refresh_view`), and reading/writing t
Header
Headless forms (`com.axelor.meta.headless`) run a form’s actions on the server, with no browser, in the context of the record — or of the line — they act on, and end with the record as those actions left it. The requests are the ones the web client sends, so the form’s own logic, the server’s checks and the workflows that watch the record all apply.
HelloController.scala
HelloModule.scala
HelloService.scala
HelloServiceImpl.scala
Here are some examples:
Here is a directory structure of a typical axelor application:
Here is an example configuration for indexing different types of entities.
Here is an example groovy script:
Here is an example job implementation:
Here is an example of java methods :
Here is an example:
Here is how to determinate the right value:
Here is the full SQL migration script for all built-in AOP entities :
Here, the cache is configured with a maximum size of 1000 entries and uses weak references for values. The `XMLViews::findAction` loader dynamically loads actions not present in the cache.
Hibernate 6.6 is compliant with Jakarta Persistence 3.1 and is a major part of the Jakarta EE migration. This will require the most careful attention during the migration process of your application. Here are some of the major changes:
Hibernate Search 7.2 supports the following backend versions:
Hibernate event listeners should be used sparingly because of performance concerns. Each listener adds overhead to database operations, and excessive or poorly optimized listeners can significantly impact application performance. Consider the necessity of each listener and optimize their logic to minimize processing time.
Hidden, groups
Hide the entry, or restrict it to user groups.
Hierarchical records — set the parent relation and the columns.
History opens a rail of past conversations. Each row shows an avatar (the other person’s, or the agent’s), a title (falling back to who the chat is with when none is set), a one-line preview of the last activity — "*Agent* is answering…" while streaming, otherwise the last message — and a relative timestamp. An unread dot marks activity the user hasn’t seen yet; an unopened invitation shows an **Invitation** pill instead. **New** starts a fresh conversation; **Delete** is owner-only.
How it renders is the view’s choice — default dropdown, `NavSelect` status bar, radio buttons or multi-select — see Views.
How the engine behaves at runtime: what happens on a save, how runs are recorded and monitored, how parked runs wake up, and how to configure the scheduler.
However, if the process is not started from a web request (directly or indirectly), you have to pass the desired tenant id and user manually. Otherwise, it will assume a default tenant and no user.
However, in most cases the scheme described here works just fine.
However, the same thing can be achieved like this:
However, when the target element is `"/"` (root element of the view), the meaning is altered: `before` means before first child element, and `after` means after last child element: Special cases where some elements such as `<toolbar>` and `<menubar>` that need to stay on top are dealt with automatically:
I18n.get(
I18n.get("Full name");
I18n.get("so.customer.title");
I18n.get("{0} record selected.", "{0} records selected.", selected.size());
If `reports.design-dir` configuration is given, the resource locator first searches design files and related resources from that directory and fallbacks to the module provided resources.
If `shades` config value is provided (should be greater than `1`), it will generate a smooth range of variations for each color by adjusting the brightness.
If a `<message>` is supposed to be used as a `tag`, following predefined css class names should be used:
If a node is `draggable` it can be dropped on any of the parent node to change the parent of the dragged node.
If all the parameters are field names and `filter` is not given then an ANDed filter on the given names is generated.
If any of these checks fail, the request is rejected with HTTP status `401 Unauthorized`.
If no elements are specified, the target element is removed.
If the entity has `attrs` field, the `form` and `grid` views can show custom fields automatically. Otherwise, for differently named json fields, we have to include those fields in view:
If the thread already has an open database session, for example when the task is run directly with `.run()` or `.call()` from a web request, the task reuses that session. The task must then target the same tenant as the session, otherwise an `IllegalStateException` is thrown:
If the user is editing the record, the border turns orange.
If the user saves their changes, the border turns red: the data on your page is no longer up to date with the database and you may need to refresh your page.
If the value is empty, the attribute is removed from the element.
If uploaded in chunk, first upload request with offset `0` returns a unique file id. This file id should be passed as `X-File-Id` header on subsequent chunk uploads for remaining content.
If we provide `jsonAttr="true"`, which is default, a field `string` field named `"attrs"` is automatically generated in entity class which is same as second example.
If you open a record at the same time as another user, their profile picture will appear to the right of the record’s toolbar.
If you run the app in debug mode as mentioned above, changes to XML views are hot reloaded. However, you still have to refresh current view with browser refresh button.
If you want to redirect the current request to a new URL, you may use `WebUtils.issueRedirect`.
Implement one of Hibernate’s event listener interfaces. For example, to execute logic before an entity is inserted, you would implement `org.hibernate.event.spi.PreInsertEventListener`.
Import requires write and import access to each imported model, and import access to every mapped field. Grant the least access required for the data-exchange job; the existing Security guide describes model and field permissions.
Importing a link sheet only adds links. To remove one, import the inline column.
In **overwrite** mode a file replaces the policy’s content — a restriction or a field it no longer lists goes — but keeps the record. A file naming an agent, model, provider, role, group, user or field that is none, a key that is none, or a list
In `js` scripts, a bare capitalized name resolves directly to a Java **type** — entity and repository classes (by simple name, no import or FQN), plus the common `java.time`, `java.math` and `java.util` helpers (`LocalDate`, `LocalDateTime`, `ZonedDateTime`, `Instant`, `BigDecimal`, `HashMap`, `ArrayList`, `Arrays`, …​). Static members and constructors are usable directly:
In case of advance requirements, you can provide an implementation of `MetaThemeService`. This will allow to define which themes are available for users, by also force the specific theme depending on user context (ie, provides themes by companies, themes by groups, …​).
In case of operator `OR`, `AND` and `NOT` the other property `criteria` is a list of one or more criteria. It can be nested to create complex search filters.
In order to access object views, we need application menu. The menu is also defined using xml syntax along with views & view actions.
In order to avoid using an AOP version coming from transitive dependencies (selected by Gradle) and thus using the AOP version defined in the project itself, apply the `DependenciesSupport` plugin on the root project:
In previous chapter we have checked about the object views. The views however requires actions to do something useful other than just CRUD operations.
In the case of grid view displayed as child of a form view or as a dashlet, first menu will be displayed.
In the case of grid view displayed as child of a form view or as a dashlet, first three buttons will be displayed.
In the next few sections, we will see how authentication and authorization are supported in Axelor Open Platform.
In the next few sections, we’ll see built-in support for various source data formats.
In this case, as there is no title given, a human-readable text `Full name` is generated and used as the key. Also, the `help="true"` is used to automatically generate key for help attribute. The format of auto generate help key is `help:<entity>.<field>` so in this case a key `help:Contact.fullName` is generated.
In this chapter we seen how to define menus. In the next chapter we will see how to configure the application properties like database connection etc.
In this chapter we seen how to provide application configure. In the next chapter we will see how to run the application and access the web frontend.
In this chapter we will see one of the main component of the modules, the domain objects.
In this chapter we will see the object views. The object views are xml definitions about the user interface to represent the object models to the end users.
In this chapter we will see various configuration options available to the Axelor Open Platform applications.
In this chapter we’ll see different kind of actions.
In this chapter, we will see how to develop axelor applications effectively.
In this chapter, we’ll see about the application & module structures.
In this document, we will see the major steps to migrate from 7.x to 8.0.
In this document, we will see the major steps to migrate from 8.x to 8.1.
Initialize the database (schema creation and demo data import).
Input data
Insert specified elements at a position relative to the target element.
Inspect unresolved `MetaWorkflowCapture` records, ensure the original worker has stopped, and check the external systems before deciding whether to replay. The administrator-only Java service method `CaptureDispatcher.reconcile(id, replay, reason)` requires a nonblank reason: `replay=true` queues the whole captured event again; `false` closes it as `resolved`. The administrator, time, and reason remain on the capture. This method refuses pending, active, and completed captures. There is no capture reconciliation screen yet.
Inspector
Install Java 21 and then increase the Java version number in the `build.gradle` file:
Internationalization, often referred to as i18n, is a very important feature of any business application in today’s globalized economy.
It can be controlled with following settings:
It can be fixed with the following changes:
It cannot write MCP tools (they come from their server) or client tools (they come from the browser), change who may use an agent, or change itself — its agent, the tools it is given or its skill.
It has the following attributes:
It is for AI administrators only. It follows the practices that make an agent reliable — one task, named tools, form changes through procedures — so what it builds is a good starting point to review, not a finished product.
It is separate from Data Import, which is the XML-based data-transformation framework for application developers, and from `action-import` and `action-export`.
It means the key is found in those files on the given line. This allows translators to locate the text and understand the context to provide correct translation or suggest changes in case of conflicting meanings. In that case, we can choose to use some logical non-human readable keys and provide readable text from the translation.
It will not work as expected as the current tenant context is not available outside the current thread. Also, it will not set current admin running the process.
Items you drag onto the canvas: fields for a model, widgets for a form, node types for a workflow. The **Structure** tab shows the canvas as an outline, handy for selecting items in deeply nested layouts.
It’s up to the `MyTenantConfigProvider` to decide how to resolve tenants (may be using jdbc connection to some external database).
Java 21 (LTS) is now our minimal version to build and run applications.
Java text blocks are also supported, either with `I18n.get(…​)` or with the `/**$$(**/ …​ /**)**/` marker. They are extracted the same way javac processes them: incidental indentation is stripped, then escape sequences are translated.
Jobs are executed by a separate process running under an admin session. The services executed can be transactional. All database operations will be executed using the admin access.
Joins an arbitrary model with explicit `<on>` conditions. Useful for analytics queries that need to join tables without a direct relation.
Joins via a relation field path. The target model is inferred from the relation metadata.
Just perform delete request on `com.axelor.dms.db.DMSFile` to delete the attachment represented by the file.
Kanban
Keep the `render` callback to widgets and field names. It is still plain JSX, so a shape no widget prop can express can be built there and passed to a widget as `records` (with `columns`), but values, colours and orderings belong in widget props and in the query.
Knowledge base
Legacy BPM ran the process **inside the transaction that saved the record**: if the process failed, the business save rolled back with it.
Length and numeric constraints.
Let’s create a controller class `HelloController` that uses the above `HelloService`:
Let’s create a simple HelloService using Scala:
Let’s create an action and a menu item for the Contact object:
Let’s create some address book objects:
Let’s see each type of panel.
Let’s see the binding in details:
Let’s see them in details:
Let’s see these views in some more details:
Let’s see with an example:
Like the object models, views are also defined using xml format.
List a base’s `code` under an agent’s `knowledgeBases`, or mark the base `isGlobal` to expose it to all agents. See Agents. Knowledge bases and sources are managed under   **Configuration**  **Knowledge Bases** and can be seeded from `src/main/resources/ai/knowledge/`.
List a skill’s `code` under an agent’s `skills` (or `["*"]` for all). Listing a skill only exposes its description; the model decides when to pull in the instructions with `use_skill`, and then which references to read. See Agents.
Locked. A published revision is an immutable snapshot; further changes go into a new revision.
MFA settings are managed through the MFA Configuration form in user preferences.
Makes sure to add the necessary permissions check to display or not the QuickMenu and the items. If returning *null* in `create()` method or if the QuickMenu has no items, the quick menu will not be displayed.
Mapped columns are checked against the file’s source model as soon as the file is read: without write and import access to the model, or import access to a mapped field, the file is refused.
Master–detail
Menus are located in the toolbar top right corner of default page :
Menus put your app into the application’s navigation. Navigation is a tree: a **root menu** is a top-level section (title and icon, no action); a **leaf entry** carries an **action** that opens a screen when clicked.
Min/max size, precision, scale
Models
Modules can include web resources from `src/main/webapp folder`. Make sure to run `./gradlew copyWebapp` whenever the web resources are changed.
Modules can provide different implementation of a repository and configure them using Guice module (however, only one implementation can be bound).
More details here
More entry options in the inspector:
More information here.
Moreover, this feature is experimental and has limitations. For example, it can only detect XML file changes once the application is started. Any changes done before application start are not recognized. That issue will be resolved in upcoming releases.
Most Studio resources go live the moment a revision is activated. Two things go further: **build jobs** compile what can’t be live (JPA entities, WAR packaging), and **repositories** push a project’s sources to git.
Most important config values are:
Most of the time, the conversion is automatic but in some cases conversion is required. For example, non-iso date format, boolean flags, numbers etc.
Most of what an agent needs is already **built-in** (`SYSTEM` tools) — data access, metadata, knowledge search, the whole Studio builder. To use one, just list its `code` under an agent’s `tools` (see Agents).
Move a specified source element to a position relative to the target element.
Multi-Factor Authentication (MFA) is an optional feature that enhances account security by requiring users to verify their identity using a second factor in addition to their password.
Node binding uses xpath expressions to bind a node (element or attribute) values to the object fields.
Nodes
None substitutes for another. An agent permitted `*` reaches everything **the user** can see and change — and nothing more. Agent permissions and restrictions only ever narrow: they cannot hand a user access to a model their own permissions deny.
Normally, `before` means before the target element, and `after` means after the target element.
Note that this internal configuration file is optional.
Now it’s time to configure our scala services. Create a Guice module:
Now it’s time to test the application. The application can be tested either by creating a war package and deploying on a tomcat server or by using the embedded tomcat server.
Now the business service should be utilized somewhere to fulfill the business requirement. Generally, use web controllers to expose services.
Now the new implementation must be configured so that the application can know about it. This should be again done from the configuration module.
Now the task will have the current tenant and current user context.
Now the view have to be made available to the UI. This is done using menus.
Now we have created the application project and a module, it’s time to add some functionality to it. In this chapter, we’ll see how to add new domain models (data entities).
Now we have some models defined, it’s time to define views for them.
Now, the audit tracking system processes tracking messages asynchronously after the user transaction. This allows improving application responsiveness when creating many tracking messages. So tracking messages are not created immediately when a record is created/updated. Instead, they appear in the stream after a brief delay till they are processed.
Number & date
Object result = helper.eval("while (true) { /* infinite loop */ }");
Observer methods may also use the built-in `@EntityType` qualifier to select which entity type to observe.
Observer methods may use the `@Named` qualifier with the name of the action to observe.
Observer methods may use the `@Named` qualifier with the name of the request to observe:
Observing fetch events, it is possible to add workflow status as tags in the form view.
On change
On first start the bundled configuration is applied in **seed-once** mode: records are created only if missing, so your edits are never overwritten, and a record you delete stays deleted — an `AiSeed` marker remembers what was seeded, so a restart does not bring it back. The **Reload built-in defaults** button on the Import / Export screen re-applies the same bundled files in **overwrite** mode.
On import, the cell is the record’s complete set: remove a value to unlink that record, clear the cell to unlink all of them. A file without the column leaves the collection unchanged. If any value in the cell names no record, the row fails and its collection is left as it was.
On the graph, each node the run touched is ringed by what became of it: a pale ring for a node the run passed through, the same colour solid for one it is still stopped at, amber for a branch a race cancelled, red for a failure, green for the `end` it reached, and the edges the run took are drawn in the accent. With tracing off only parks, failures and each split’s choice of flows are written down; the nodes between them are ringed because the viewer replays the run over its graph from those records, following a node’s only way out and never deciding a condition again. When a run’s records cannot be replayed — an operator moved it, say — only the recorded nodes are ringed. A key above the graph names the rings the run wears (**Went through**, **Waiting here**, **Cancelled**, **Failed**, **Ended here**), and the panel below it names every one of those states in words, so nothing is said in colour alone. Each node’s tooltip adds how long it waited and worked, how many passes it took, and which way it left: a park that a boundary took reads "Left by" that boundary, and a failure an `error` boundary caught reads "Failed, caught by" it. What a race is, and why a branch ends up cancelled, is explained in Branching and Joining.
On the provider form’s **Model sync** tab, **Sync models** fetches the vendor’s current model catalogue over its API and applies `syncRules` to pick the few models worth having — instead of entering every model by hand. It’s disabled while `syncRules` is blank. **Reset rules to default** restores the shipped rules for that provider’s type. Supported out of the box: OpenAI, Anthropic, Google, Mistral, and Ollama (which lists whatever models the server has pulled).
On the toolbar, the designer icon will open theme designer popup allow you to update the base theme through multiple properties.
Once MFA is enabled, the authentication process follows these steps:
Once activated, the search interface provides:
Once registered, it can be used like this:
Once the initial index is created, Hibernate Search automatically keeps the index synchronized with database changes. Any creation, update, or deletion of an indexed entity will trigger a corresponding update in the search index.
Once the revision is activated, **Deploy** puts a later edit live on its own. Saving never does: an author can leave work half-finished without it becoming the definition new runs start on. Deploy is enabled once there are no unsaved edits, because it deploys what is stored rather than what is on the canvas.
One execution of the graph. Failures are always recorded for auditing; set `workflow.trace` to `runs` or `nodes` to record every run (including successful and skipped ones). A run that reaches a `task` or `wait` node, or a `call` or `subflow` whose child parks — parks durably and resumes later: when a person decides, a timer elapses, a state condition becomes true, another workflow sends a message or broadcasts a signal it was waiting for, or the called workflow ends. See Execution.
One unit of customization — a model, a view, an action… Each opens in a visual designer.
Only records displayed on top form are supported. Popup and others record rendering aren’t supported.
Only relevant headers and request body is shown.
Open a model’s advanced search, apply the filters that define the records to work with, and select **Import**, or open the **Export** menu and select **Export more…​**. The export uses the current search filter and ordering, and every record the filter matches is exported — not only the rows loaded in the grid. **Export more…​** is the advanced export. It sits in the same menu as the standard **Export** and **Export full** entries, which export the columns of the grid.
Open the `src/main/resources/axelor-config.properties` file and set the database configuration as described bellow.
Open the given link in your browser and log in
Open the project and, from its **Revisions** list, open the revision you are working on — day-to-day that’s the latest one. The revision is where everything happens:
Optional `<template>` element is used to define the event popover content.
Or a free form controller method
Order
Other `track` attributes:
Other palette items: tabbed panels for secondary content, separators and labels, a **related records** panel that embeds an editable grid for a OneToMany/ManyToMany field (how master–detail forms like an order and its lines are built), dashlets and view includes.
Others optional properties can be added to use custom encryption:
Override the workflow (last resort)
Overrides how the field renders (image, HTML editor, tag list…) — see Views.
POST /callback HTTP/1.1
POST /ws/action HTTP/1.1
POST /ws/action/
POST /ws/files/upload
POST /ws/rest/:model/:id
POST /ws/rest/:model/:id/fetch
POST /ws/rest/:model/removeAll
POST /ws/rest/:model/search
POST /ws/rest/com.axelor.contact.db.Contact/1 HTTP/1.1
POST /ws/rest/com.axelor.contact.db.Contact/1/fetch HTTP/1.1
POST /ws/rest/com.axelor.contact.db.Contact/removeAll HTTP/1.1
POST /ws/rest/com.axelor.contact.db.Contact/search HTTP/1.1
PUT /ws/dms/attachments/com.axelor.sale.db.Order/1
PUT /ws/rest/:model
PUT /ws/rest/com.axelor.contact.db.Contact HTTP/1.1
Package rules match by package name, while class rules match by inheritance. Denied classes/packages take precedence over allowed classes/packages.
Palette
Perform database maintenance operations. Requires a subcommand.
Pick and order the columns, set default sorting and grouping, mark the grid **editable** for inline editing, and add buttons. Grids also carry their own toolbar and menubar — edited here with the same mechanics as menus.
Pick the shape from what you want to happen:
Please check the getting started guide for pre-requisites and configuring your favourite IDE.
Plugin can be configured with the following properties set in the `changelog` extension:
Policies are managed under   **Governance**  **Usage Policies**. They complement the per-model `rateLimit` (see Providers & Models) and the per-agent access scoping (see Agents).
Position among siblings (lower first — leave gaps: 10, 20, 30).
Prefer **composition**
Prevent infinite loops with script execution timeouts.
Programmatic timeout configuration per script:
Project
Projects
Provider & Model
Providers, roles, tools, knowledge bases, skills, agents and the governance rules are **data**, seeded from files in a module’s `src/main/resources/ai/` directory and editable in the UI. The Import / Export screen (  **Configuration**  **Import / Export**) reloads the bundled configuration, downloads the live one, or applies a bundle from another environment.
Published
Publishing locks the revision permanently: its resources become read-only and the revision joins the project’s history. To keep working, create a new revision.
Quartz `JobStoreTX` job store with clustering features are automatically enabled when setting `application.cache.provider` to a distributed cache provider such as `redisson` or `redisson-native`. This is required for proper scheduling in multi-instance deployments.
Quartz clustering is further tunable with the following optional property:
Queries can also be created and managed through the UI at **Administration > View Management > Queries**.
Queries with column metadata, the dashboard view, the action and menu to reach it.
Quick Menus allow running some actions or/and add some shortcuts directly accessing on the default page.
Reach for Studio when the customization is configuration-shaped: new business objects, screens, navigation, reports and process automation, iterated quickly on a running instance.
Reach for the AI module when you want natural-language access to the ERP — answering "how many open orders this month?", filling and updating records by describing them, surfacing knowledge from indexed documents, or letting a builder customize the app in plain language. Compared to the alternatives:
Reaching a `task` node creates a **pending** task carrying the workflow identity, the business record, the assignment and the deadline. At most one task is open per (record, node): if a repeat trigger re-reaches the node while its task is still pending, the existing task is reused rather than duplicated. A node whose `when` is already true, with `autoComplete` set, is the one exception — the task is created already **completed**, with no assignment, so it never becomes pending at all; see Gating approval on a condition.
Ready to serve...
Record sources let the assistant answer from live ERP data described in natural language — each matching record is rendered through `template` and indexed. Indexing is manual, never automatic: open the source and click **Index**, or click **Reindex All** on the knowledge base’s form to index every source. Do it again when a source’s content changes; the `status` reflects progress and any error.
Records as events — set the start/stop date fields (or a default duration), a color-by field and the initial mode (month, week, day).
Reference for the `schema` parameter used by `studio_save_view`.
Reflection is used to configure authentication clients. The syntax for the property keys is `auth.provider.<provider-name>.<setting-name>`. Kebab case and camel case are both supported for setting names. There are a few built-in providers described below with default settings that are overridable. For special needs, you can manually configure any other clients supported by pac4j using your own custom provider name. You may even create and use your own custom authentication clients.
Relational
Relations — ManyToOne, OneToMany, ManyToMany — can target another custom model or an existing JPA entity (e.g. `com.axelor.auth.db.User`).
Replace the target element by the specified elements. Only one `replace` operation may be applied to one target element.
Reports
Reports can be executed using a special xml action `action-report`.
Repository classes are further customized with `<finder>` and `<extra-code>` sections. However, it’s always advisable to generate only required repositories and if extra features are required generate abstract repository and provide concrete implementation with more features.
Request
Request with API Key Authentication
Required, readonly, hidden
Resource
Resources
Response
Response:
Returns response with HTTP status `200` if login success otherwise returns HTTP status `401`.
Revision
Revisions are numbered `major.minor.patch`. The project form offers three buttons:
Rows are saved in batches, directly through the persistence layer: audit fields are set, but the model repository’s `save` logic does not run. Use **Toggle compute** when that logic must run, once, after all sources are loaded. Workflows are never run.
Run
Run the Liquibase migration scripts.
Run the following command in terminal:
Run the following command in the terminal to run the application :
Run the following task to generate a `Run` launcher:
Running at http://localhost:8080/axelor-demo
Runs are recorded with a bias for lightness: failed runs are always recorded, and parked runs persist while they wait — but successful (and gate-skipped) runs leave no row unless run tracing is enabled (see Engine options). To inspect runs:
SO00001
SO00002
SO00003
SO0000N
SYSTEM
Same way, you can use `XMLImporter` class.
Save / Preview
Save a query when its result feeds something — a data dashboard, a KPI, a report consumed over the query API — or when several places need the same figures. For a one-off filtered list, a grid view with a domain filter is enough.
Save it as `support-assistant.md` in `src/main/resources/ai/agents/` and restart, or use **Reload built-in defaults** on the Import / Export screen. Agents, skills and tools a restart has already seeded are not replaced; see Seeding, reload and modes.
Scala is a general-purpose programming language providing support for functional programming and a strong static type system. Designed to be concise,\[10\] many of Scala’s design decisions aimed to address criticisms of Java.
Scheduled jobs can be configured from `Administration → Jobs → Schedules` menu. The schedule configuration data requires:
Schedules
Schema generation is disabled in multi-tenancy mode.
ScriptHelper helper = new GroovyScriptHelper(context).withTimeout(500);
Search results display:
Search using advanced criteria
Search using domain filter
Second, you can specify simple groovy expression via `eval` attribute. This expression will be evaluated with the context of current CSV record’s (column name → value) map.
Security
See Expandable and TreeGrid for usage and available widget attributes. On top-level grid, `x-expand-all` is not supported.
See Global and Component-specific Cache Configurations for application configuration details.
See Guice documentation for more details on dependency injection and bindings.
See available helper functions in script helper functions documentation.
See the JDK 21 migration guide and JDK 21 release notes for details.
See the Jakarta EE Platform Specification for details.
See the given examples for the respective actions.
Select **Link sheets** to export each many-to-many field as a link sheet of its own instead, named after the owner and the field, such as `OrderLine.taxes`. It has one row per link, holding the owner’s key and the related record’s key. The option is not available for a flat export, which is always inline.
Select the settings icon in the export dialog to open configurations. Choose an existing configuration to restore its fields and options, or enter a name and select **S
Selection
Sequence fields will be automatically assigned while saving new records. If you want to obtain sequence values in some rare cases, you can do something like this:
Services
Session-based authentication requires the client application to keep track of session ID and cookies between requests.
Several things must all happen before the run may continue.
Shows the **Entities** and **Enums** tabs — compiled JPA models that require a build.
Shows the **Models** tab — custom models, live immediately on activation. Enabled by default on new projects.
Similar to the object authorization, view access permissions can be used to control object view fields for users, groups and roles.
Single sign-on in Axelor Open Platform relies on the various clients from the PAC4J security engine. There are two kinds of clients: direct and indirect clients.
Skill
Skills follow the open Agent Skills convention (originally from Anthropic): a skill is a folder with a `SKILL.md` (metadata + instructions) plus optional bundled references, surfaced to the model through progressive disclosure. The same authoring model is used here, backed by `AiSkill`/`AiSkillReference` records.
So for the above example, sequences are generated like this:
So now, a single instance of Axelor app can serve multiple tenants (users, companies etc).
Some `<action-menu>` can be defined in order to run quick actions. The `Launch` button with trigger the given `action-menu#action` with the given context :
Some built-in variables are available to be used with expressions. This includes:
Some examples (pseudo code):
Some examples:
Some libraries that can keep track of sessions:
Some permission examples (pseudocode):
Some words/sentences that need to be translated may not be scanned and extracted from the source code due to how they are used/coded.
Sometime while importing large data, it’s required to process the data and transform it according to our needs. Doing this manually on all the CSV files is time-consuming and error-prone. However, Axelor Open Platform provides embed groovy scripting support to process/transform the data during the import process.
Sometimes we may have to predefine few custom fields. This can be done with data import feature. Here is an example data import rules and input format:
Special context variable names
Standard export produces sources for the selected model and related models. One-to-many children get a source of their own, which names its parent. A many-to-many field, or a collection custom field, is one column of its owner that lists the related records — see Many-to-many columns. Flat mode keeps the main model’s many-to-many columns and omits one-to-many fields and related sources.
Start the embedded Tomcat server.
Starting from Axelor Open Platform v5, we can now add custom data models dynamically at runtime. The feature can be used for use cases like dynamic survey forms, or preparing quick prototype etc.
Starting from Axelor Open Platform v5, we can now add custom fields to the domain models dynamically at runtime.
Starts `(major+1).0.x` for milestone changes.
Starts `major.(minor+1).x` for incremental feature work.
Static attributes:
Status & selection
Status workflow
Storage details are described in Custom fields and Custom models.
String title = I18n.get(IMPORT_ID_TITLE);
Strings that are translated later, through a variable, can be marked with the `/**$$(**/ …​ /**)**/` comments. The string is extracted, but not translated where it is defined:
Studio builds analytics two ways: classic **chart views**, and **data dashboards** — custom views composing the data widgets over saved queries. Prefer data dashboards for new work; a chart view is still the right tool for a single chart embedded as a dashlet.
Studio is the Axelor Open Platform low-code builder. You design custom models, views, actions, menus, selections, queries, dashboards and workflows visually, group them in a versioned **project**, and deploy them into the running application — no module to write, no restart. What you deploy is exactly the same metadata a module would ship, so anything built in Studio behaves like regular application code.
Studio offers three ways to shape data, plus enumerations. Pick the right kind first — it matters more than anything else on this page.
Submits a build job that assembles a deployable WAR of the application including the project. Also required for revisions containing compiled JPA entities. Follow progress under **Studio → Build Jobs**.
Supporting machinery: versions, deployment and export and build jobs & git repositories.
Suppose the following controller:
Suppose you have the following code that executes a task using a separate background process:
Sync is one-way — Studio stays the source of truth; the repository is the reviewable, diffable history of what each revision contains.
System properties can be handed to the application through the `-D` flag during startup System properties should be prefixed by `axelor.config.`. It uses the `axelor.config<key>=value` format, where `<key>` is a setting name.
Table 1. Attributes
Table 2. Attributes
Technically, we can provide pure implementation of `HelloService` other then extending the default implementation but that requires much more efforts to configure the application. In that case, the main application module should exclusively bind the business services.
Text & content
That’s it. Your app module can now use Scala to implement business logic.
That’s it…​
The **Actions** tab’s **New** menu offers one entry per kind:
The **Deactivate** button withdraws the revision: all its deployed metadata is removed and the revision returns to draft (a published revision stays published — only its deployment is withdrawn).
The **Studio** menu appears for users of the `admins` group when the Studio feature is enabled with `features.studio = true` in `axelor-config.properties`. Its entries:
The AI assistant can drive Studio for you: describe what you want in chat and it creates the resources in your project, opening the designer as it works so you review everything visually. Its output is ordinary project resources — you can always continue by hand in the designers.
The API Keys tab displays a list of all tokens for the user with the following information:
The API key authentication does not create a session, so each request must include the API-KEY header.
The Agent Builder is an agent that builds agents. Describe what you need in the chat; it learns the process from you, reads what the application defines, drafts the agent with its skill, procedures and any tools, saves them once you approve, and tries the agent before handing it over.
The Axelor Open Platform applications generally implements all business logic using modules. As we have seen earlier, a typical business module consists:
The Axelor Open Platform applications utilizes the internal hibernate connection to configure the report data sources.
The Axelor Open Platform artifacts, including the gradle plugin, are published in the Axelor maven repository. Its access requires the credentials provided with your Axelor Commercial License. Configure them in your gradle user properties:
The Axelor Open Platform automatically configures the JDBC JobStore to use the application’s main database and creates the necessary Quartz tables (`qrtz_*`) if they don’t exist on application startup.
The Axelor Open Platform can be built as a command line application.
The Axelor Open Platform embeds a conversational AI assistant in your application. Users chat from any screen; the assistant answers questions, looks up and edits records through **tools**, pulls in domain knowledge, and can even build the application itself with Studio. Everything the assistant can do is **configuration** — providers, models, agents, tools, skills and knowledge bases are data, seeded from files and editable in the UI.
The Axelor Open Platform has CSRF protection enabled using pac4j. If you want to call web services from a browser client, you need to make sure you handle the CSRF token:
The Axelor Open Platform implements a subset of the CDI 2.0 event notification model. Event observer classes need to be bound and have observer methods, ie. methods that take an event as parameter, annotated with `@Observes`, optional `@Priority` (observer methods are called in ascending order of priority) and other optional qualifiers in order to narrow down which events to observe. Observer methods are called whenever the corresponding event is fired.
The Axelor Open Platform integrates a feature rich quartz scheduler library for job scheduling.
The Axelor Open Platform integrates powerful BIRT reports for reporting.
The Axelor Open Platform provides REST like JSON web services.
The Axelor Open Platform provides a generic caching interface that wraps various cache implementations, providing a unified API for caching operations. The API aims to stay close to Google’s Guava Cache and Caffeine, while adding support for potentially distributed caching.
The Axelor Open Platform provides a lightweight, declarative workflow engine. A workflow is bound to one model, starts from a single trigger, and walks a small graph of nodes — covering both automation ("when a record reaches state X, do Y") and human approval flows. You can write workflows as XML in a module or build them visually in the Studio designer; both are the same format.
The Axelor Open Platform provides a mechanism for registering custom listeners for various Hibernate events, such as pre-insert, pre-update, post-insert, etc.
The Axelor Open Platform provides a very efficient way to make your application multilingual.
The Axelor Open Platform provides easy to use API to handle report generation.
The Axelor Open Platform provides integrated messaging & stream features:
The Axelor Open Platform provides powerful way to achieve this with declarative manner using xml syntax. The mapping is provided with special xml config files that defines rules to transform the source data.
The Axelor Open Platform provides some additional non-standard api for such cases:
The Axelor Open Platform support several kind of views for an object. This includes:
The Axelor Open Platform supports CORS, generally required for calling web services from mobile applications.
The Axelor Open Platform supports several action types. The `action-view` can be used to define menu actions.
The Axelor Open Platform uses xml definition to define the views. In this section, we’ll see how to create `grid` and `form` views for the `Contact` model:
The Axelor Open Platform uses xml definitions to define the data models. The code generator than generates JPA compatible Java POJO classes with some additional helper methods and meta data used by the framework for UI purpose.
The Axelor Open Platform web application provides some built-in widgets. These widgets are used to represent data in form view.
The Axelor Open Platform web is the only and official frontend application included with the Axelor Open Platform.
The CSV (comma-separated values) are most widely used legacy data format.
The CSV data mapping definitions are defined using XML syntax. A typical config file looks like this:
The CSV data transform requires `csv-config` files which are xml based data mapping rules.
The CSV files have four columns:
The Gantt view shows data in a Gantt chart:
The Global Search feature provides a powerful, system-wide full-text search capability, allowing users to quickly find information across different types of records in the application. It is built on top of Hibernate Search and backed by Elasticsearch or OpenSearch.
The Grid & Form views are the main views. If these views are not provided for model, a set of default views are generated automatically. However, they may not produce good-looking interface, it’s always advised to provide views for domain models.
The REST like services for common search, create, read, update, delete operations.
The REST services strictly follows traditional rules for restful api. However, there are few cases which are difficult to achieve with pure REST.
The Scripting Security Policy provides control over Java class accessibility from scripts. This prevents unauthorized access to sensitive operations while allowing necessary business logic execution.
The Search view can be used to search on multiple objects:
The Studio feature itself is enabled with `features.studio = true` — see Projects & Resources.
The Studio workflow designer builds the same workflow definitions visually. Designed workflows and XML workflows are one format: what the canvas edits is exactly the DSL described in Definitions and Nodes, and both deploy through the same validation gate.
The User object has various properties, most important of them are:
The XML data mapping definitions are defined using XML syntax. A typical config file looks like this:
The XML data transform requires `xml-config` files which are xml based data mapping rules.
The `%tenant` pattern outputs the current tenant identifier. A fallback can be given as option, used when no tenant is set on the thread: `%tenant{-}` outputs `-` in that case, so every log line has the same format. When multi-tenancy is enabled, the `LOG_TENANT_PATTERN` variable is set to ``[%tenant{-}] `, so `${LOG_TENANT_PATTERN:-}`` in the default patterns outputs the tenant before the thread name. When disabled, it is empty and the log format is unchanged.
The `-c` option can be used to provide axelor config file.
The `<action-group>` can be used to gather actions.
The `<action-method>` can be used to call a controller method.
The `<action-record>` can be used to construct an object with some values.
The `<action-report>` is used to define the action reports.
The `<action-script>`, introduced in v5, can be used to create complex actions using scripting languages.
The `<action-view>` is used to define the action views.
The `<bind>` tag can again have nested `<bind>` tags in case of binding relational fields.
The `<bind>` tag can be used to map nodes to target object fields.
The `<button>` item can be used to put buttons at any row.
The `<column>` items are used to define display columns for the tree view.
The `<dataset>` element is used to define a dataset.
The `<extra-import>` and `<extra-code>` tags are used to define additional code to be included in generated repository classes.
The `<field>` element can be used to provide metadata information about a dataset item. This is the same as fields in `grid` view.
The `<field>` is the most important and required item in a grid view definition. It defines a column that binds to some field of the given domain object.
The `<field>` tags can be used to define columns that bind to model fields.
The `<finder>` tag can be used to define finder methods for the repository classes.
The `<from>` element defines the root model for the query.
The `<hilite>` attributes are:
The `<hilite>` item should be applied on the grid view to highlight whole rows and on fields to highlight those specific cells.
The `<input>` tag is used to map a source csv file to a target model type.
The `<input>` tag is used to map a source xml file to a target model type.
The `<join>` element supports two modes: relation joins and cross joins.
The `<menubar>` item can be used to define custom menus. These menus are also shown in the top toolbar.
The `<menuitem>` is used to define a menu item. The application menu is hierarchical so menu items can be organized as parent child.
The `<node>` item can have the following attributes:
The `<on>` child elements use the same syntax as `<where>` conditions. Use `ref` to reference fields from other aliases.
The `<panel-mail>` can be used to show change tracking streams or discussion messages in threaded layout.
The `<query>` element supports these attributes:
The `<result-fields>` defines the possible result fields which can be mapped with actual object fields.
The `<search-fields>` defines fields to be used to provide search criteria (inputs).
The `<select>` element defines a column in the result. If no `<select>` elements are specified, the query returns full entity objects.
The `<select>` tag defines search criteria per object and maps the object fields to the result fields.
The `<sequence>` tag has the following attributes:
The `<start>` node carries the trigger configuration:
The `<template>` element is used to define a template to render the data.
The `<template>` should be used to provide template to prepare the context of cards. It can use only the defined `<field>` values.
The `<toolbar>` item can be used to define custom toolbar buttons. These buttons are shown along with the top toolbar.
The `<view-param>` parameter name accepts the following options:
The `<where>` element defines filter conditions. Multiple `<where>` elements at the same level are combined with AND.
The `<where>` tag defines the conditions (it can be recursive). You can use FQN to match against any field value from the object graph.
The `ActionRequest` and `ActionResponse` are special classes to deal with action requests and responses. For more details see the API documentation.
The `AxelorCache` interface offers a range of methods for managing cached data:
The `CacheBuilder` class is used to configure and construct `AxelorCache` instances.
The `Decimal` widget is used for `decimal` data fields and works similarly to `Integer` widget.
The `HelloServiceSaleImpl` extends the `HelloServiceImpl` and overrides the `say` method with different message.
The `I18n.get` only works when JPA context is started as the translation is loaded from the database table (which is imported from the CSV files during database initialization). So the `I18n.get` should not be called if the code is executed before the JPA context is initialized (like static variables).
The `I18n` is defined under `com.axelor.i18n` package and provides static methods to get translations and custom ResourceBundle which can be used with standard Java translation API.
The `ImportTask` class can be used to advanced usages like providing input data from arbitrary data streams.
The `Integer` widget is used for `integer` data fields.
The `MetaFile` record obtained with upload service can be used to create attachments.
The `Permission (fields)` defined on `User`, `Group` and `Role` objects can be used to define permission rules for view item.
The `Slider` widget works on `integer` and `decimal` fields. It provides the ability to select a value within a range.
The `TenantConfigProvider` defines following methods to implement:
The `Uuid` widget is used for `uuid` data fields. The input provides a mask for user guidance, helping to format the value correctly.
The `__bean__(Class<T>)` is a script safe alternative to `com.axelor.inject.Beans.get(Class<T>)`. It ensures that the requested bean class complies with the scripting policy. If the class is not allowed by the policy, `IllegalArgumentException` is thrown.
The `_archived` can be used to search on archived records. By default, archived records are not returned.
The `_domain` is a simple JPQL `where` clause with `self.` as object prefix. The named parameter values can be provided with `_domainContext`.
The `action-report` must be the last action in the group of actions. For example:
The `action-script` can be used for custom models too. Here is an example:
The `action-script` is nothing but the controller method dynamically created using a scripting language. The `$request` and `$response` variables are nothing but the `ActionRequest` and `ActionResponse` parameters of controller method.
The `action` can be single or list of comma-separated actions. An action can be either an xml action or a method call.
The `allocationSize` attribute controls ID generation performance by determining how many IDs Hibernate pre-allocates from the database sequence in a single call.
The `axelor-config.properties` has few more settings that you can adjust if you wish.
The `axelor` script, located in `bin/` directory, is an executable command line tool that can be used to execute various commands provided by the app:
The `bind(HelloService.class).to(HelloServiceImpl.class);` tells the application that "bind HelloService interface to HelloServiceImpl".
The `build.gradle` file is a build script used by gradle to build the application.
The `build` (and `assemble`) task packages the distribution into both a ZIP and a TAR archive, created at `build/distributions/{project-name}-{project.version}.{ext}`. Each archive can also be generated on its own with `distZip` or `distTar` (or `assembleDist` for both).
The `com.axelor.app` gradle plugin defines an extension point `axelor` where we can define various properties.
The `condition` is optional and the boolean flags are grant only, that is, `false` value doesn’t mean deny.
The `context` column is populated only if `--with-context` option is used.
The `data` is an array with id of deleted record as only element.
The `db.default.ddl` configuration property is used to customize the Hibernate database schema generation process, and it can take the following values:
The `dynamicUpdate` attribute controls whether Hibernate generates SQL update statements dynamically for the entity, using the `@DynamicUpdate` annotation.
The `expr` has following format:
The `groups`, `roles`, and `permissions` are associated with authorization which we will see in next section.
The `id` should be a `DMSFile` record id.
The `if-feature` attribute works with a class extending `com.axelor.app.AppConfig` and specified by `application.config-provider` configuration in `axelor-config.properties` file:
The `if` expressions are simple JEL boolean expressions evaluated against current values of the record.
The `include 'modules:axelor-contact'` line tells gradle to include the module `axelor-contact` in current build cycle. It is required to list all the modules used by the application in `settings.gradle` file.
The `messages.csv` is the template from which we have to create language specific `messages_<language>.csv` files. The template should not be updated manually as it’s automatically generated using the string extraction utility.
The `modules` directory contains application specific feature modules. First, let’s see about some important files here before checking module structure.
The `onChange` script actions and readonly result fields for derived values.
The `panel` can use following widgets:
The `persistable` attribute can be used to define a non-persistable entity class annotated with `@MappedSuperclass` that can be used as base class of other entities.
The `repository` attribute on `<entity>` can be used to customize the repository class generation.
The `src/main/webapp` from modules will be copied in this dependency order:
The `status` attribute can have the following values:
The `strategy` attribute can be used on base entity only. Each strategy results in a different database structure with specific trade-offs regarding performance and data integrity.
The `tag-style` can be one of the:
The `track` information is provided with:
The `track` messages are generated `on` the following operations:
The `where` condition is determined from `match="any|all"` attribute that corresponds to the `OR` and `AND` respectively.
The action can be an action-view or a rpc method. That action will take the item context as context. If the action is an action-view, a new tab will be opened.
The action report can have the following elements:
The action required `<field>` items to set object properties.
The action service allows executing one or more actions.
The action view requires the following elements:
The actions are also defined using xml and can be used to change views, objects, call controllers or doing some specific tasks like sending email, importing remote data etc.
The actual business implementation is done at service layer. Services are Java classes whose lifecycle is managed by Guice framework.
The adapter then has to be registered from the mapping file like this:
The address checked against that list is the client IP address, read from the header set by the reverse proxy, as described in Client IP address. The application trusts that header as it is, so make sure the proxy is configured as described there: otherwise, clients can forge their address and bypass the restriction.
The advanced importer accepts Excel workbooks, ZIP archives and single CSV files. A flat file (Excel, or a single CSV) can therefore be edited and imported back through the same grid, so the export and import round-trip. When importing a single CSV, enable **Flat import** so the flattened relationship columns are resolved back to their records.
The advanced search service allows searching for records with advanced search criteria.
The allocation size is determined in the following order (highest to lowest priority):
The application configuration is provided through various configuration files. These are:
The application menu is also defined using xml definition. A menu item when clicked executes an action. The actions again have to be defined using xml.
The application project can be imported in IntelliJ IDEA as gradle project.
The application project can be imported in VSCode as Java project.
The application project can be imported in eclipse as buildship project.
The application project is configured to be eclipse webtool compatible. Create a tomcat 10.1 server, add the `open-platform-demo` module and run the server.
The assistant is stricter than the web client in three places, all deliberately: the activity it reads withholds tracked changes of fields the user may not read, which the activity stream in the browser shows; administrators are held to field rules, which the browser shows them past; and a query that selects no columns, which would return whole records, is refused.
The attributes are:
The audit tracking system processes tracking messages asynchronously after the user transaction. This allows improving application responsiveness when creating many tracking messages.
The authentication and authorization support in Axelor Open Platform is based on Apache Shiro, while the different kinds of authentications mechanisms are implemented with the PAC4J security engine.
The authentication data is sent in the body of the request.
The browser import dialog rejects files larger than 5 MiB before upload. Server upload policy or `data.import.max-size` can impose a lower limit.
The built-in type adapters are registered like this:
The bundle also includes a `README.txt` file with usage instructions and a `LICENSE` file by default. All the files in the `src/main/dist` directory will automatically be included in the distribution.
The calendar data shows records as events.
The calendar view attributes are:
The calendar view shows data with schedule/agenda like interface with drag and drop support.
The cards view attributes are:
The cards view can be used to show related data like photo, text and a link about a single subject as cards.
The change tracking feature can be used to record audit trail in the form of stream of messages when document/record gets changed.
The change tracking streams can be shown on any form views with following markups:
The chart view is not bound to any object but depends on dataset retrieved with JPQL/SQL queries or the given rpc (method call).
The chart view shows data as 2D graphs and is powered by Apache ECharts.
The color picker widget is used for `string` data fields. It provides the ability to pick a color in a popper. The value is stored in hexadecimal.
The columns are bound to node fields described below.
The command line application distribution is built automatically by Gradle as part of the standard build:
The complete component catalog with props and examples is in Data widgets.
The composer accepts images, PDF, DOCX and XLSX files, and plain-text-ish files (Markdown, plain text, CSV, TSV, logs), up to 5MB each. The accepted list mirrors exactly what the server can turn into model input: attaching anything else is refused before it ever leaves the browser, with a message naming what got skipped, rather than being silently dropped after upload. If a file the client didn’t reject still reaches the server unusable — a stale client, a corrupted PDF — the server drops it without surfacing an error, so a missing attachment fails quietly rather than breaking the turn.
The configuration of these enhanced view attributes is done from the application UI, in the menu *Administration → View Management → View Attributes*.
The console logger may log with colors if terminal supports colors.
The container of one app’s customizations, with module-like coordinates (name, package group, title).
The content of attached files can also be indexed. You can configure the maximum file size and the types of files to be indexed.
The context is a list of file name + line number where the key is found:
The context is a map of key-value pair of the current object being edited. The context may contain some extra information like `__parent__` context. Also, the values of multi-value fields (O2M/M2M) are marked with `selected` flag to check whether the record is selected.
The controller methods can be used from XML actions and views:
The controllers are intermediary between views & service layer.
The counter beside each source shows mapped columns over total columns. If any columns remain unmapped, the confirmation identifies how many will be skipped. Unmapped columns do not stop the remaining mapped columns from being imported.
The custom fields are defined dynamically at runtime using graphical interface. All defined fields are accessible from   **Model Management**  **Custom Fields**.
The custom fields are saved as `com.axelor.meta.db.MetaJsonField` records. Following fields are defined:
The custom implementation should be integrated from application module like this:
The custom models can be defined from   **Model Management**  **Custom Models**.
The custom sequences can be used to generate a patterned sequential string values. These are especially useful to generate sequences for sale order, employee, invoice etc.
The custom view allows to show arbitrary data using templates. This view is generally useful for creating readonly reports.
The custom view definition is:
The dashboard is used to provide overviews. The dashboard view is composed of dashlets and optional search fields.
The dashlet `action` can be either:
The data import feature can be easily integrated in the business application.
The database configuration keys with format `db.<tenant-id>.<key>` is used to configure database connections.
The dataset result is available as `data` and the first result of the data is available as `first`.
The date widget is used for `Date` data fields. Clicking on the icon opens a calendar popper to select a date easily in edit mode.
The default algorithm is `PBEWITHHMACSHA512ANDAES_256`. Most of the time, default encryption configuration will be enough.
The default allocation size is `1` for backward compatibility, meaning every insert requires a database call. While this ensures strict sequential IDs, it impacts performance.
The default country is locale aware and is based on user language. If user language doesn’t contain country code, a matching country is searched in user’s browser locales. In case of no country match in browser locales, there is some fallback behavior. For example, if user language is `fr`, and browser locales are `fr`, `fr-CA`, `en`, `en-US`, then country would be `ca`. if user language is `ja`, country would fallback to `jp`.
The default implementation would configure mail sender and fetches from the application configuration settings:
The default multi-tenancy implementation uses multiple databases per tenant and requires configuration from `axelor-config.properties`.
The default tenant is required and used for all unauthenticated requests.
The default value is `200`. To disable the limit entirely, set it to `0`:
The details view shows grid and form views side-by-side as a single view. It can be defined using `action-view` using a view parameter `details-view`.
The distribution contents will be generated at `build/install/{project-name}` folder which includes:
The domain objects are JPA pojo classes. The Axelor Open Platform uses Hibernate as the JPA provider.
The domain objects are defined using XML in the `src/main/resources/domains` folder. The definition is then used by code generator to generate entity and repository classes.
The domain objects, also called models or entities are nothing but a representation of data in object form used by the modules.
The elements are:
The embedded server is easiest way to run the application during development.
The entity classes represents domain models and are defined using xml format.
The entity designer looks like the model designer but produces a compiled JPA entity: fields get real database columns, and the palette adds entity-only options — OneToOne relations, `unique` constraints, `mappedBy`/`orphanRemoval` on collections, and enum-typed fields. Entities carry a Java package name (e.g. `com.axelor.invoice.db`) because they generate code.
The essentials, all edited in the inspector:
The everyday branch: route on the record, take exactly one way out.
The everyday button. Copies the latest **published** revision into a new draft with the patch number incremented — publish what works, patch to continue.
The external configuration file is similar to the internal configuration file. It can a properties file or a YAML file format.
The failure message names both fixes, and they mean different things:
The field has few properties, but most common of th
The field must be included in card view definition with `<field>` tag.
The field picker does not offer binary fields, `id` or `version`; `importId` is offered.
The field values can be translated by clicking on a flag icon visible on that field:
The file is expected to be a YAML file in the following format:
The finder method parameters are specified by the `using` attribute value (comma-separated list). A parameter can be a field name defined above or/and a definition in the format `type:name` where `type` can be either of the following type:
The first node item should define data source of the type referenced by the `parent` attribute of the next node item. Subsequent nodes should follow the same rule.
The first rule grants readonly permission to all the objects under `com.axelor.sale.db` package. The second rule grants create permission to all the objects under `com.axelor.sale.db` package. The third rule grants read, write, delete, export permission on `com.axelor.sale.db.Order` to the creator user.
The first rule hides the `totalAmount` field from the views. The second rule defines how the `customer` field should behave depending on user group.
The following Gradle task can be used to extract and update message files:
The following MFA methods are supported :
The following `axelor-config.properties` settings apply to advanced exchange:
The following attributes are supported:
The following color & background styles are defined:
The following helper functions are available in all supported scripting languages:
The following links talk more about the Jakarta EE transition: Jarkata EE blog post, Oracle blog post.
The following special actions can be used to perform some special operations:
The form designer is the one you’ll use most.
The form uses responsive layout that adjusts according to the available screen size. The form is divided into 12 columns. The first 8 columns are used to place main panels and the rest 4 columns are used to place the sidebar panels. If sidebar panels are not provided the normal panels will occupy all the 12 columns.
The form uses responsive layout that adjusts according to the available screen size. The form is divided into 12 columns. The first 8 columns are used to place the normal `panel` and `panel-related` panels and the rest 4 columns are used to place the `sidebar` panels. If sidebar panels are not provided the normal panels will occupy all the 12 columns.
The form view is used to show/edit a single record. This is the most important view for an object and provide rich set of widgets.
The form view shows a single record in form layout. It’s the main view to see a record with details.
The format of using controller method is like this:
The free form controller methods can accept any parameter. The views/actions can pass the param values from the current context.
The full catalog is in the Form view reference.
The gain is that a workflow is now a first-class platform resource: authored in XML alongside views and actions, or drawn in the Studio designer, versioned with the module, and validated on save rather than at deploy time.
The general upload limit and temporary-file location are configured separately by `data.upload.max-size` and `data.upload.temp-dir`. They affect the upload pipeline and disk space available for generated files; see Files Storage.
The generated entity classes are JPA compatible pojo classes with some added features to deal with collection fields & computed fields.
The generated repository classes provides methods for CRUD operations and some finder methods. The repository class generation is configurable, we’ll see about this very soon.
The global search feature provides a simple yet powerful interface for finding information across your entire application.
The grid view has the following attributes:
The grid view has the following child items:
The grid view is used to show the record list. Grid view has following properties:
The grid view shows data in a list with several columns.
The group action requires following items:
The headers are:
The image bellow shows the form view for a custom model `Question`.
The image bellow shows the form view to create/edit custom fields:
The image bellow shows the form view to create/edit custom models:
The image bellow shows the grid view for a custom model `Question`.
The image bellow shows the grid view listing all the defined custom fields:
The image bellow shows the grid view listing all the defined custom models:
The importer first uses a model’s required unique field to find an existing record — preferring `code`, `email`, `emailAddress` or a field ending in `Seq`. A model with none has no business key, so its key is `importId`, which an export with **Allow re-import** fills with a generated value such as `contact-42` where it is empty. If that lookup fails, it can use `importId` and then `id` when those technical columns are present. This permits an export-edit-import workflow where a business key changes without duplicating the record.
The importer ignores empty rows and imports sources in dependency order: a source loads after the sources its references name. A row that references a record it cannot find — a missing source, row or identifier — is reported as a "Relation not found." error in the result workbook; a link sheet row whose owner is not found is reported as "Record not found."
The importer updates a matching record and creates a record only when it cannot find one. A mapped column with an empty cell clears that field on an existing record, so delete columns you do not want to touch instead of blanking them. Always test a new mapping with a small, representative export first.
The indexing process can be tuned for performance.
The initial index for all entities is created using a mass indexer. This process can be started via the command-line interface.
The initial value for new records.
The input values from CSV or XML data source are string values, so we need type adapters to convert them to target data type.
The interface defines two methods to fulfill our business requirements. The application module that defines the interface can provide a default implementation of this interface.
The interface should provide the blueprint of your business requirements that should be fulfilled.
The kanban view attributes are:
The kanban view is a agile dashboard like view.
The key is the original text extracted from the Java, Groovy or XML files. In case of fields where title is not given, the field name is automatically converted to human-readable form.
The label and the tooltip.
The language part in the filename should follow the IETF BCP 47 language tag standard (e.g. `en`, `en-US`, `fr`, `fr-CA`). The language tags are case-insensitive, but it is recommended to use the canonical form (e.g. `en-US` instead of `en-us`). Once loaded into the database, the language tags are normalized to the canonical form.
The last upload request returns following response:
The launcher badges with the count of conversations waiting for attention — unread activity plus pending invitations — and clicking it opens the one waiting chat directly, or the rail filtered to **Unread** when there’s more than one. The same count badges the panel’s own rail-toggle icon when the rail isn’t shown alongside it.
The login response returns session cookies which should be tracked by client application.
The main `axelor-config.properties` provides various configuration values for the application. It’s located under `src/main/resources` directory of the application project.
The matchStyle can be used to tell how to match the inputs. Possible value can be:
The messages are shown according to the `<mail-messages>` with following attributes :
The messaging & stream feature can be configured to send/receive email messages from SMTP/IMAP servers.
The messaging menu provides quick links to see the messages.
The method action requires following items:
The most important of them is `axelor-config.properties`.
The most recent messages are shown first. More messages can be loaded with a link provided at the end of message list (if there are more messages).
The normal building rhythm is a loop: edit in the designers → **Activate** → check the result in the application → edit again.
The object being built — a form layout, a field list, a menu tree.
The optional `<search-fields>` can be used to define input fields to provide query parameter values or context for the rpc calls.
The owner renames a conversation by clicking its title in the panel header, which turns into a plain text field — Enter commits, Escape reverts. There’s no rename affordance on the rail rows themselves.
The package name pattern can be like:
The pages of this chapter walk through building a small **Todo** app:
The pattern is like this:
The pattern is something like this:
The permission object defines the access rule. It has the following properties:
The permission resolution is done in this order:
The permission rules are applied to all the views associated with the given object. The view items should have a name in order to define a rule for them.
The phone widget can be used for `string` fields to enter and formats phone numbers. It renders the field as a phone number link in readonly mode, and as a phone number input with a country/region selector in edit mode.
The plugin will parse all entries in the `changelogs/unreleased/` folder to generate the changelog of the version in `CHANGELOG.md`. The unreleased entries are also automatically removed.
The policy is applied to all supported scripting engines: Groovy, JavaScript, and Expression Language. It is also applied to Groovy template engines.
The projects you are building — the usual starting point.
The properties of whatever is selected, edited on the right.
The rail opens on **Chats** — everything — beside **Spaces** and **Unread**, which carries the count; collapsed to a strip, those three are what it shows. One more filter sits behind the filter icon: **Mine** for the conversations you own, **Shared** for the ones shared with you, **Direct** for everything not marked a Space, and — once something has named a record — that record, labelled with it. Picking the filter already in force returns to **Chats**, and turning the record filter off lets the record go rather than leave a narrowing to a record nobody is looking at any more. The search box above the rows matches a conversation’s title, its agent, and the names of the people in it.
The rating widget is used for `integer`/`long`/`decimal` data fields. It provides ability to collect measurable opinions/experiences/feedbacks/…​
The recommended way is to use an `action-view` instead of `<view-type>:<view-name>`. It provides more controls and configuration of what is displayed.
The records array are `MetaFile` records (obtained with upload service).
The relationship between the authorization objects allows to achieve finer level of granularity on access control.
The reports can also be provided from modules itself from the `src/main/resources/reports` directory which follows same structure.
The reports directory structure should be as follows:
The reports should only use `JDBC Data Source` to create data sets for the report.
The repository classes provides data access and manipulation methods for the domain models.
The request also accepts query params:
The request body should be chunk of file data. The `Content-Length`, `X-File-Offset` and `X-File-Size` headers should be used to provide details about chunk so that:
The response attributes are service dependent, only the specific attributes may be returned by the service.
The response data represents `DMSFile` records.
The response record represents a `MetaFile` record.
The result of the actions are returned as data array.
The rule also allows setting client side conditions (js expressions) to control readonly/visibility of the fields/items.
The rules are JSON, written as a `sync:` block in a seed file:
The rules in details:
The run task accepts the following command line options:
The running example is a sale order confirmed from chat. Confirming is what the form’s **Confirmed** switch does: its `onChange` sets the confirm date and the status, and the workflows watching `confirmed` start.
The running example is a sale order with lines, created from scratch. Its action-view opens a form whose `items` are edited in their grid:
The same applies to a reference: the value is looked up by the referenced model’s key, then by the `importId` and `id` columns of that reference. A reference that matches nothing fails the row with "Relation not found." The key must be a field that identifies one record; the name column that a re-import export writes beside a key is for reading and is ignored on import. For the same reason a many-to-many column of names, as written by an export without **Allow re-import**, can be imported only if the name is itself required and unique.
The same holds where no tool is called: a mentioned user’s details, the field a message was sent from, the record open beside the chat, and knowledge drawn from records — each held to the agent’s reach and the AI policy too. What the user configures or is shown rather than what the agent reads stays on the user’s permissions alone: which knowledge bases they may use, the pinned subject’s label in their chat list, where a recap may be posted, and a file they attach to a message, which is theirs to hand over. A record knowledge source declares the fields its template reads, the template renders from those alone, and a record’s text is shown only to a reader who may read the record and every one of them — see Knowledge.
The same marker can be used in JavaScript and TypeScript files.
The same way, you have to change and tasks running in different threads:
The scheduler is disabled by default. It can be enabled with the following configuration:
The search fields will be added on top of the dashboard. They can be filled with `onInit` event on dashboard. As soon they are filled or/and changed, dashboard dashlets will use the values in their respective context.
The select and input tags can have optional `if` condition taking any boolean expression in Groovy that evaluates against the input values. If the result of the expression is false then those elements are skipped.
The sequence can be defined like this:
The services should be configured with a special class called Guice module but in our case should be derived from the `com.axelor.app.AxelorModule`.
The session can be established with login services:
The single `<start>` node says when the workflow fires: on `create`, on `update` (with watched fields and a condition), on a `timer`, on a `message` another workflow sends, or manually.
The skill is added to those agents' skills, and what they already have is kept; an unknown agent code is logged and skipped.
The statuses: **Pending** (queued), **Running**, **Success**, **Failed**, **Cancelled**. On failure, the output and error message tell you why — typically a compilation error in an entity definition.
The string values from XML sources don’t require any special treatment, but translatable strings in you code must be wrapped with a special method `I18n.get(…​)`.
The string widget represents the `string` data type. It’s used for simple string fields.
The structure of the translation files in an Axelor module looks like this:
The system provides visual indicators for token expiration:
The template renders from those fields alone: one that names another fails, and so does the indexing, with the field named in `errorMessage`. A record’s text is then shown only to someone who may read the record and every declared field, since the text is those fields' values — the same rule as reading them with a tool (see Per-user enforcement). A source that declares no fields is not indexed, and one indexed before sources declared them is shown to no one until it is re-indexed.
The translation dialog looks like this:
The translation messages are imported in the database during the db initialization. The corresponding database table only stores `key` and `message`.
The translations defined over there will take precedence over `messages_<language>.csv` as they are loaded after.
The tree view shows data in hierarchical tree list with several columns.
The upload service allows to upload files in chunk. This is useful to upload large files effectively.
The upload service doesn’t include file to DMS directly, but creates `MetaFile` records pointing to the uploaded file. The `MetaFile` record can be used later to create a `DMSFile` record (normal or attachment).
The value translation feature allows translating record values.
The value translations are stored with key in `value:<value>` format. For example, `value:Laptop` or `value:Hard Disk` etc.
The view action is used to open object views. The view actions are used to define application menu.
The view definition is minimal and you only have to define layout of fields. The fields defined in the view binds to the object fields, if a corresponding field doesn’t exist in the object it’s considered as dummy field and values from dummy fields has to be handled manually.
The view designers build the same views a module ships as XML — one format, same capabilities. This page covers the designers; each view type’s full reference lives in the Views chapter.
The views represent the information to the users.
The way timeout check is performed depends on the script type:
The web app is generic enough to cover most needs. Most of the time, developers only need to work on XML views, actions, and server-side Java code.
The web client is developed using the following web technologies:
The web service is accessible with following url pattern:
The web services are accessible `/ws/` endpoint, for example:
The workflow engine is the successor to the Camunda-based BPM module, and it is built to be the place your existing processes land. The aim is that every construct a real BPM process uses has a direct, mechanical equivalent here — close to Camunda in shape, naming and observable behaviour, without being a BPMN implementation or claiming compatibility with it.
The workflow itself — bound to one model, shipped as XML in a module or built in the Studio designer. See Definitions.
The working state — add, edit and delete resources freely. Nothing is visible in the application.
The xml actions uses dynamic expressions to access object values or conditional test expressions to enable/disable actions.
The xpath is relative to the parent node or the `root` node of the given `<input>`.
Themes can be configured from `Administration → Theme management → All themes` menu. The theme requires:
Then declare its **input schema** (what the model must supply) and decide whether it needs **approval**. Tools are seeded from YAML in `src/main/resources/ai/tools/` (one file per tool) or created under   **Configuration**  **Tools**. A built-in tool only names its key:
Then use this repository in the `settings.gradle` file:
There are two ways to access the global search:
There is a translation fallback mechanism that ensures that if an exact match for a translation is not found, the translation for the primary language is used instead. This is particularly useful for avoiding duplicate translation effort for languages with regional variations, as well as for maintaining a consistent user experience even when some translations are missing.
There is no restriction of the number of allowed quick menus displayed. For better readability and user experience, be sure to add only the necessary things.
These are the same coordinates a hand-written module would have — a deployed project behaves exactly like one.
These events are fired during application startup and shutdown.
These events are fired during server requests (REST service).
These events are fired during user login process.
These events are fired when actions are called.
These expressions can be defined in groovy or Java EL syntax. The Java EL support has been added in v4.0.
These extra attributes are available :
These request attributes are service dependent, only the required attributes have to be provided.
These rules are added after any custom configuration.
These services provide basic access to various DMS features.
These utilities are essential for applications leveraging distributed caches, as they ensure consistent and safe access to cached data in multi-node deployments.
They are evaluated on form view events `onNew` and `onLoad`, even if these attributes are not defined explicitly in the form view. These attributes take the precedence over the ones defined on the XML view and in the *action-attrs* (only during `onNew` and `onLoad` events for this latter).
They are loaded in dependency order — providers → roles → tools → knowledge → skills → agents → policies — so that an agent can reference the tools, skills and knowledge bases defined before it, and a policy the agents, models, providers and roles it names.
They are what AI procedures run on (Procedures), and they suit any code that must change a record "as if a user typed it": an import, a scheduled job, a backend test of a form’s logic.
This applies to `some` and `all`. A `one` split runs exactly one branch, so the `save()` in the node that acts is already a single write.
This command will find all entities configured for indexing and process them.
This engine dispatches **after the commit**. The save always stands; a failure is recorded on the run and surfaced there, and never blocks the write that triggered it. This is deliberate — a broken workflow must not stop people from working — but it inverts a behaviour some BPM processes lean on. If a rule must prevent a save, it belongs where it always belonged: in a validation or a constraint on the model, not in the workflow.
This fallback mechanism is used in translated messages, as well as in translated search results.
This is a specialized `delete` service besides the standard REST service to delete records in bulk.
This is a specialized `read` service besides the standard REST service to partially read record.
This is deliberate: such code reads through the platform’s own API, not through the assistant’s checks, and its result is whatever value it builds — the platform cannot tell which fields it came from. Checking it would mean either trusting a declaration an administrator must keep in step with the code, or treating every result as unknown data, which would bar the conversation from any model not cleared for everything. The administrator who writes the tool knows what it returns; granting it to an agent is the decision.
This is the one difference a mapping table cannot express for you: a process that leaned on "the save rolls back when the process fails" keeps running after migration, but no longer rolls anything back. Check for it deliberately.
This keeps the base prompt small — an agent can list many skills cheaply, because only descriptions are ever-present — while still offering deep instructions on demand.
This page lists all the changes introduced in 10.0 releases. See also the release notes and the migration guide.
This page lists all the changes introduced in 8.0 releases. See also the release notes and the migration guide.
This page lists all the changes introduced in 8.1 releases. See also the release notes and the migration guide.
This reduces database I/O and network payload when updating wide tables or entities with large text and binary fields. However, generating SQL at runtime adds CPU overhead because Hibernate cannot reuse cached prepared statements across different update operations.
This service can be used to download a file. It should be used as normal http request.
This service can be used to find list of files attached to some specific record.
This service can be used to find list of files under a specific directory.
This service can be used to get properties of a domain model.
This service returns list of all domain models
This task will re-compile updated classes and the debugger will try to hot reload the changes.
This template renders data as a small and simple report box (useful in dashboard).
This template renders the dataset as a table. It uses field metadata for formatting and can use any widgets supported on `grid` view. It also supports sorting by columns.
This widget can be used for `string` fields to enter email address. The input value will be validated to ensure user provides a valid email id. Clicking on the icon opens your default email client with the destination email pre-filled.
This widget can be used for `string` fields to enter url value. The input value will be validated to ensure user provides a valid url. Clicking on the icon opens the url on a new tab.
This widget can be used for `string` fields to securely enter password values. It replaces each character with a dot symbol unless you click on the eye icon which toggles field input visibility.
This will encrypt all settings in the configuration file for you. By default, it looks for a configuration file in current project. If needed, that file can be overridden with parameter `--file="<path_to_file>"`. Encryption settings (`algorithm`, `key-obtention-iterations`, …​) are determinate from that configuration file. This can be overridden with CLI arguments : `--algorithm="PBEWithMD5AndTripleDES"`, …​
This will generate `.vscode/launch.json`. Switch to "Run and Debug" CTRL+SHIFT+D panel and debug with the `Run` task.
This will generate for you, the necessary properties and the encrypted value to used inside `ENC()`.
Thread task = new Thread(() -> {
Thread task = new Thread(ContextAware.of().build(
Three checks gate everything the assistant reads or writes, and **all** must pass:
Title, help
To **add** behavior — notify someone, write a log, start something else — author a separate **complementary** workflow on the same model. Independent workflows on one event run in `sequence` order, so yours runs alongside the shipped one without touching it. This is the recommended approach for most customizations.
To **restructure** the shipped graph — insert or remove steps in the middle — import it into Studio and edit the copy. The Studio copy is saved at a higher priority, so it wins at dispatch and supersedes the module original.
To add a custom Hibernate event listener, you need to follow these steps:
To add your own capability, pick a type and define it:
To authenticate using an API key, include the API key in the `API-KEY` HTTP header with each request:
To avoid preflight cors requests, do not add `X-Requested-With` header and provide `Accept: application/json` header for `GET` and `POST` requests and use `Content-Type: text/plain;json` header for `POST` methods.
To balance the system’s resources between user experience (foreground tasks) and data consistency (background audit processing), an adaptive Back-Pressure mechanism is implemented. The following properties control how AuditLog records are managed and ensure the audit processor is "polite" when users are active but "persistent" enough to never fall too far behind.
To create an order with one line, as a user would:
To customize the generated reports, use `com.axelor.report.ReportConfigurer`. It is called for every report generated by `ReportGenerator`:
To enable and configure the Global Search feature, you need to set several properties in your `axelor-config.properties` file.
To enable change tracking on an object, the object definition has to provide tracking details.
To enable persistence using the `JobStoreTX`, set the following property:
To encrypt a single given String, run:
To export one record, open its form and select   **Export…​**.
To generate the `CHANGELOG.md` with unreleased entries, run the following Gradle task:
To get the distribution contents directly in an extracted form, run:
To know how to use the supported commands, call the tool like this:
To lay out a form:
To migrate your application, you first need to change references in class imports, configuration files, etc. For an automated process, one option is to use the Eclipse Transformer. The most laborious process will then be to update your application to work with the new versions of the dependencies.
To override a workflow shipped by another module, define one with the same `model` and `name` and a higher `priority` — among active definitions, the highest priority wins.
To put the workflow live the first time, activate the Studio revision (Lifecycle). It deploys as an active `MetaWorkflow`, indistinguishable from one shipped in a module — including priority overrides. The project export includes workflows as regular workflow XML.
To put your work live, click the **Activate** (rocket) button on the revision.
To run a task for another tenant, always run it in another thread.
To search and encrypt all properties wrapped with `ENC()` in configuration file, run:
To support any file storage system (local, s3, …​), a utility function has been created to deal with files included in reports (images, etc…).
To try it:
To use encrypted secrets, `config.encryptor.password` properties should be added: this is the secret key used to encrypt/decrypt data.
To use external configuration file, either add `AXELOR_CONFIG` environment variable or `axelor.config` system property. Note that system properties gets preferences over the environment variable
To use the plugin, in your `build.gradle`:
To use them:
Today a legacy process is moved by rewriting it node by node against the map below. For the shapes people actually built in BPM — a gateway, a user task with a deadline, a timer, a service task, a parallel fork — that is a short exercise, because each one maps one-for-one.
Too many requests to this site right now. Wait before retrying, or open a different source.
Tool
Tools published by a remote MCP server are not written by hand at all: connect the server and synchronize it (see MCP servers).
Tracking messages are not created immediately when a record is created/updated. Instead, they appear in the stream after a brief delay.
Tree
Tree view requires `<node>` items to define data sources for the tree nodes.
Trigger
Two **Options** on the revision control which model kinds it may contain:
Two mechanics apply everywhere:
Two more buttons on the revision hand your work to other environments:
Two template tags are built in:
Typing `@` at the very start of a message offers a choice of mentioning a person or — for the owner only, and only with no tool approval pending and nothing streaming — switching the conversation’s agent; `@` anywhere else in the message goes straight to mentioning a person. A leading `/` opens a command picker that offers only the commands that apply to this conversation and the sender’s role:
UPDATE mail_message set received_on = created_on;
Unlike the object permission rules, view permission rules follows `Grant all → Deny Selectively` strategy.
Unlike the standard Java practice to provide translations catalogs with properties files, the translations are stored in separate CSV files for each language. This is because the Axelor Open Platform stores and loads translations from database to allow live update of translations by end-users.
Until now, we have seen how to define objects, view, actions using xml syntax. However, the business code has to be implemented by writing some real code.
Update the database schema. Optionally restrict the update to specific modules.
Usage policies (see Usage Policies & Logs) go under `governance/usage/`, one file each, also named by `name`:
Usage policies bound how much the assistant may consume, and every model call is logged for auditing and reporting.
Usage: axelor [-hV] [-c=FILE] [COMMAND]
Use **Preview** in the designer at any time to see the view exactly as the application will render it, and **Save** when done.
Use **Show unmapped only** to focus on incomplete mappings. The search, expand, collapse and unlink-all controls are useful for large workbooks.
Use `@com.axelor.script.ScriptAllowed` annotation to allow script access.
Use `paramMap` when a query uses different parameter names than the shared dashboard params:
Use `source-address` and `target-address` if separate addresses are needed for consumers and producers. If the same address can be used for both, configure only the `address` property.
Use a reference to an external file : `file:<path_to_file>` as password value.
Use a workflow when the reaction to a record change is business logic that evolves: approval chains, notifications on state changes, follow-up record creation, timed escalations.
Use advanced export to create a tailored data extract or a file that can be imported again after editing.
Use advanced import to load a workbook, CSV archive or single CSV file into a model. The import dialog first inspects the file and then lets you review the mapping for every source before any records are written.
Use dynamic images to allow blob images to be inserted into the report. With the onCreate event script, set the image data.
User information is backed by the application database and it’s also possible to integrate LDAP backend.
Users can enable either method based on their preference.
Values are formatted by the `format`, `currency` (or `currencyField`) and `scale` their query column declares, unless a widget prop overrides it. A missing value shows as a dash, never as zero.
Values are read in your locale — the formats the export writes — or as ISO dates (`2026-10-15`). A value that cannot be read, or that fails the model’s validation (required fields, size limits, constraints), rejects its row. Selection values must be the stored values, not translated labels.
View attributes are usually set directly in the XML of the view. Some of them can also be updated thanks to Attrs Actions.
View collaboration AMQP properties:
View processors allow to programmatically add view elements. They are automatically discovered on application startup, and they are executed in module resolution order, after finding view in `MetaService::findView`, which is used by `view` API endpoint.
Views
Views are generally mapped to some domain object, here the `grid` and `form` view are defined for the `Contact` object.
Views collaboration allows to see users that are seeing/editing/updating the current opened record.
WARNING : Do not add property `config.encryptor.password` with the password in your configuration file.
We are using Java EL 3.0 (from tomcat8). See the Java EL documentation for more details.
We can also define multiple json fields in domain model:
We can also provide alternative form view by specifying view name as `details-view` param value, like:
We can by-pass auto configuration from `axelor-config.properties` by including `logback.xml` under `src/main/resources`. In that case, you have to configure it on your own. We can also specify an external config location with `logging.config = /path/to/logback.xml` if we don’t want to include the config in war package.
We can call this method with action-method like this:
We can configure database connection settings with following properties:
We can mix both expression syntax in same action definition. The rules are:
We can override this default implementation by providing custom implementation of these two interfaces:
Web services support two authentication methods:
What happens:
What the assistant asks for and may not read is refused, naming the field. What comes along unasked — a record’s name field, a relation’s name, a tracked change — is withheld and listed under `$hidden` on the value that would have held it, so the model knows something is there and does not take the gap for "no data". A relation into a model the user may not read is its id alone. A write naming a field the user may not write is refused, the field named by its path (`items[2].discount`).
What the assistant can read, write and reach — and who has to agree before it does.
Whatever the resource type, the designer has the same layout:
When Hibernate requests one value from the sequence, the database increments the sequence by the given `allocationSize` and gives a "block" of, let’s say 50 IDs (e.g., 100–149). Hibernate keeps these in RAM and assigns them instantly. It only calls the DB again when it runs out (after the 50th insert). So with, let’s say `allocationSize=50`, you save 49 database round trips per block, significantly improving insert performance in high-volume scenarios.
When `data.export.max-size` is set, verify that the limit is appropriate for the business task before a user exports. Related data can make a standard relationship export considerably larger than its number of main records suggests.
When `details-view-mode` is set to `inline`, you can also customize the grid width by adding the `grid-width` param value:
When `dynamicUpdate` is not set explicitly, it is enabled automatically if either of the following conditions is met (evaluated over the XML-declared fields of the entity and of its super entities, excluding collections, inverse associations with `mappedBy`, transient fields, and formula fields):
When `params` is set, a floating filter button appears in the top-right corner. Clicking it opens a filter dialog with the specified parameters (metadata and defaults are fetched from the query’s describe endpoint). Applying the filter updates all dashlets that share those parameter names.
When a chart dataset produces a large number of series (e.g. thousands of distinct products), the browser may consume excessive memory. The `maxSeries` config limits the number of displayed series by keeping the top N by value. Pie, donut, radar, line, area, and scatter charts aggregate the remaining series into an "Others" bucket; bar and horizontal bar charts drop tail series to preserve scale accuracy.
When a chart has many x-axis categories (or y-axis categories for horizontal bar charts), a data zoom slider is automatically enabled to let users pan and zoom without overwhelming the view. The `zoomThreshold` config controls this behaviour:
When a state is worth keeping, click **Publish** on the activated revision.
When an agent that can reach a knowledge base calls `search_knowledge`, the query is embedded with the base’s `embeddingModel`, matched against the indexed chunks, and the top passages (bounded by `maxResults`/`minScore`) are returned for the model to ground its answer.
When firing your events, you can also `select` your own qualifiers in order to narrow down which observer methods to call:
When the scheduler is enabled, `RAMJobStore` is used by default, which stores job and trigger information within memory. For persistence, you can configure Quartz to use a JDBC JobStore, which stores that information in the database. This is required for multi-instance deployments, but can also be useful for single-instance deployments to ensure missed jobs during downtime are executed at the next application startup.
When the server cut the result down to its row cap, the dashlet notes it under its content, with the counted total.
When using a JDBC JobStore (`JobStoreTX` whether clustered or not), an underlying `HikariDataSource` connection pool is configured to use the application’s main database settings and can be tuned with these optional properties:
When using a multi-instance configuration with `application.cache.provider = redisson`, Redis/Valkey Publish-Subscribe messaging is used for view collaboration communication between instances.
When we create custom models, `form` view and `grid` views along with a `menu` are automatically created.
When you need to adapt a workflow that a **module** ships, prefer composition before copying its graph so the shipped workflow keeps receiving the module’s updates.
Whenever the sources are changed, re-run following task:
Where an action runs from:
Where:
Widget
Widget support partial rating on decimal fields but only for display purpose (for example, an average).
With **Allow re-import** the headers are field paths (`customer.email`), selection and enum values are the stored values, and dates and numbers are native values. A to-one reference is written as its key column (`customer.code`); when the key is not the record’s name, the name follows in a second column that is only there for reading — the importer ignores it. When the related model has no key of its own, the generated `importId` (such as `contact-42`) is written instead, together with the related `id`.
With **Allow re-import**, the column holds each related record’s key — `tags.code` above. Without it, the column holds the names instead (or the key, for a model with no name field). Names identify records for reading only; see How rows are matched. Unlike a many-to-one reference, the cell never carries both. A `|` or `\` inside a value is written as `\|` or `\\`.
With TreeGrid widget, there are some additional limitations:
With this page you can finish the running example — three resources make the app reachable:
With version 8.0, we are migrating to Jakarta EE 10+, which involves a significant namespace change from `javax.*` to `jakarta.*` and an upgrade of all the dependencies to be compliant with the new Jakarta EE namespace. This change affects the entire application and requires careful attention during the migration process.
Without **Allow re-import** the file is made for reading:
Without a **Select** clause the query is a filter and returns records; with one it aggregates and returns computed rows. The full DSL — operators, functions, joins, subqueries — is documented in Data queries.
Without a `default`, a `one` split whose conditions all come out false **fails the run** at the split. The symptom is easy to misread: the run is recorded as failed, the trigger fires again on the record’s next update, and every node **before** the split runs a second time — so what you notice is duplicated work upstream, not a split that matched nothing.
Workflows are defined in XML, validated against an XSD, and loaded into `MetaWorkflow` records — mirroring how views and actions work. Workflows built in the Studio designer are the same format and load through the same gate.
X-File-Name:some.tar.gz
X-File-Offset + Content-Length <= X-File-Size
X-File-Offset:0
X-File-Size:148009
X-File-Type:application/gzip
XML is another widely used format to store information.
YAML format is also supported. `axelor-config.properties` can be in YAML format (`yml` or `yaml` ext). It should only have a one internal configuration file (in properties or YAML format).
You are a support assistant for our ERP. **(4)**
You are a support assistant for our ERP. **(6)**
You can also describe the workflow in chat: the AI assistant saves the definition through Studio and opens (or lets you reload) the designer on the result — so generated workflows are reviewed on the canvas before deployment.
You can also work with `IReportEngine` instance directly (not recommended though) like this:
You can apply rules on top-level classes and interfaces only. Nested/inner classes are checked against rules applied to their top-level classes.
You can configure the policy using either annotation-based whitelisting and/or via programmatic configuration.
You can create a new application module using scala with following `build.gradle`:
You can create your own events. An event object can be any kind of POJO:
You can define how users provided by central authentication should be dealt with. You can choose between `create` (create and update users), `link` (only update users), and `none` (do nothing). You can also specify the default group for new users. If you need anything more advanced, you may redefine `AuthPac4jUserService`.
You can define what logout URL to use when no `url` request parameter is provided to the logout endpoint. You can also define the logout URL pattern that the `url` parameter must match (only relative URLs are allowed by default). By default, only local logout is performed, but you may choose whether central logout should be performed as well (needs to be supported by the configured central authentication).
You can generate reports from your code like this:
You can implement your own type adapter by extending the `com.axelor.data.adapters.Adapter` and overriding `adapt` method.
You can mark the implementation with appropriate scope if required (read the docs carefully before using them).
You can observe your custom events in an event observer. Remember that the observer class needs to be bound and consists of observer methods.
You can override the allocation size for specific sequences using:
You can reconfigure them accordingly.
You can register listeners for any event type defined in the `org.hibernate.event.spi.EventType` enum. Common event types include:
You can register listeners for any of these event types using the `EventListenerRegistry` provided in the `registerListeners` method.
You can see that,
You can see the `<domain>` filter uses named parameters. These parameters are evaluated against the context.
You can see the `criteria` can be nested, to create complex search filters:
You can see the mapping is almost identical to CSV mapping format. The only difference is the `<bind>` tag which required `node` attribute that tags xpath expressions to bind a particular node to the object field.
You can specify inline groovy expressions to process individual field value, provide default field value or can process the newly constructed data object. This should be specified in the mapping file like this:
You can use Scala to create app modules.
You can use `ui-action-click` directive in template to execute any action on click event.
You can use the following options:
You define which entities and fields should be indexed in a YAML configuration file. By default, the application looks for a file named `axelor-search.yaml` in the classpath. You can specify a different file using the `global.search.mapping.file` property.
You need to write your own script-allowed helper to selectively allow access to application properties.
You would see something like this:
\~/.gradle/gradle.properties
]]>
`<actions>` should have at least one `<action>`. The action will get current chart name and data in context. Example :
`<hilite>` items can be used to conditionally apply styles to events. All hilites that match their `if` conditions are applied.
`ActionResponse.setSignal(signal, data)` is used to send any arbitrary signal to the client. Here are a couple of them that might be of interest:
`AuditLog` entity for persistent audit event storage with full state capture has been introduced. It supports retry logic with max retries and error tracking. Run the following SQL script to create the table :
`DistributedFactory` is a utility class that facilitates concurrency control in distributed cache environments. It provides static methods to access distributed-aware synchronization primitives, ensuring thread safety across multiple application instances when using distributed caching systems. These primitives are scoped to the current tenant context when multi-tenancy is enabled.
`Duration`, `Progress`, `Rating`.
`Image`, `Binary`, `BinaryLink`.
`NavSelect` shows a selection as the horizontal status bar on top of workflow forms; `RadioSelect`, `MultiSelect`, `TagSelect` and `InlineCheckbox` cover the other shapes.
`PostLogin` observer methods may use a `@Named` qualifier with either `PostLogin.SUCCESS` or `PostLogin.FAILURE`.
`SKILL.md` carries the configuration in frontmatter and the instructions in the body:
`SuggestBox` (default ManyToOne autocomplete), `TagSelect` for ManyToMany, `MasterDetail` for editing a collection next to its grid.
`Text` (multi-line), `Html` (rich text), `CodeEditor`.
```
````
````yaml
```bash
```csv
```gradle
```groovy
```html
```java
```js
```json
```markdown
```none
```properties
```scala
```sh
```shell
```sql
```text
```xml
```yaml
`action-method` can also be called from any objects with arbitrary arguments. The result of the method can be assigned to any field.
`agent`, `task` and `error` hold the last answer of their kind on the path the run took, and a park does not lose them — whether a `wait`, a `task` or a background node made it, the walk that resumes reads what the walk that parked read. Each branch of a split starts from what the split read; after a `join` none of them is bound, since no single branch’s answer is the one to read, so copy what a later node needs into `vars` before the join. `parent` reads the same on every walk of a run. `old` and `event` describe the save that started the run and are read on its first walk only — up to the first park — so copy into `vars` what a node after a park needs from them.
`com.axelor.app.AppSettings` is forbidden to scripts, as it allows unrestricted access to all application settings, which can include sensitive data.
`com.axelor.report.tool.ImageTool.getImageBytes(Long metaFileId, boolean cache)` accept as first parameter the id of the `MetaFile` and as second parameter whether to cache the file (see `data.object-storage.cache.*` properties).
`db.default.datasource` takes precedence over `non-jta-data-source`.
`render` receives the query result as it came from the server, plus what the dashlet controls:
`status` should be a list of maps with the following keys:
`task` carries `outcome` (`complete`, `reject` or `condition`), the booleans `completed` / `rejected` / `timedOut`, the `comment`, the `visit` (which pass over the node this approval was), and `completedBy` (the deciding user’s login; empty when a boundary closed the approval, or when `outcome` is `condition` — nobody decided either way).
`workflow.capture.retain-days` defaults to 7 and removes only old `dispatched` captures. Failed, unknown, and administratively resolved records are retained. Registry eligibility is resolved at dispatch time; the captured registry stamp is diagnostic and does not pin the definitions eligible when the event occurred. This protocol covers record-trigger dispatch; it does not add activity-level checkpoints or retries to other workflow entry points.
a special `__ref__` built-in variable can be used in expression. It will refer to the first selected record in multi-object search view.
active: true
agents: []                     # by code
agents: [default-assistant]
ai/skills/studio-view-design/
allprojects {
and a concrete implementation of generated `AbstractTitleRepository` like this:
and an implementation:
application.entity.sequence.MY_ENTITY_2_SEQ.allocation_size = 20
application.entity.sequence.MY_ENTITY_3_SEQ.allocation_size = 1
application.entity.sequence.MY_ENTITY_SEQ.allocation_size = 100
application.entity.sequence.default_allocation_size = 50
application.multi-tenancy = true **(1)**
application.script.timeout = 300000
apply plugin: 'com.axelor.app-module'
apply plugin: 'scala'
apply plugin: com.axelor.gradle.support.ChangelogSupport
apply plugin: com.axelor.gradle.support.DependenciesSupport
auth.callback-url = http://localhost:8080/open-platform-demo/callback
auth.logout.central = false
auth.logout.default-url =
auth.logout.local = true
auth.logout.url-pattern =
auth.user.default-group = users
auth.user.provisioning = create
axelor { **(2)**
axelor-config.properties
axelor-contact/src/main/resources/domains/Address.xml
axelor-contact/src/main/resources/domains/Contact.xml
axelor-contact/src/main/resources/domains/Title.xml
axelor-contact/src/main/resources/views/Contact.xml
axelor-contact/src/main/resources/views/Menu.xml
axelor-demo
axelor-search.yaml
axelor_registry_password=<your-password>
axelor_registry_url=https://repository.axelor.com/nexus/repository/maven-enterprise/
axelor_registry_user=<your-username>
bash
build.gradle
canCreate: true
canExport: true
canRead: true
canRemove: true
canWrite: true
changelog {
class HelloController @Inject() (service: HelloService) {
class HelloModule extends AxelorModule {
class HelloServiceImpl extends HelloService {
class Validators extends JpaSupport {
code: describe_model
condition: self.createdBy = ?
conditionParams: __user__
config.encryptor.password = MySecureKey
csv
db.db1.driver = org.postgresql.Driver
db.db1.hosts = host1,host1:8080 **(5)**
db.db1.name = DB1 **(4)**
db.db1.password =
db.db1.url = jdbc:postgresql://localhost:5432/open-platform-demo-db1
db.db1.user = axelor
db.db2.driver = org.postgresql.Driver
db.db2.hosts = host2,host2:8080
db.db2.name = DB2
db.db2.password =
db.db2.url = jdbc:postgresql://localhost:5432/open-platform-demo-db2
db.db2.user = axelor
db.db3.driver = org.postgresql.Driver
db.db3.hosts = host3,host3:8080
db.db3.name = DB3
db.db3.password =
db.db3.url = jdbc:postgresql://localhost:5432/open-platform-demo-db3
db.db3.user = axelor
db.default.datasource = java:comp/env/ds/AxelorDS
db.default.ddl = update
db.default.ddl = update **(1)**
db.default.ddl = update **(3)**
db.default.driver = org.postgresql.Driver
db.default.password =
db.default.password = secret **(3)**
db.default.password = secret **(4)**
db.default.url = jdbc:postgresql://localhost:5432/axelor-demo  **(1)**
db.default.url = jdbc:postgresql://localhost:5432/my-database **(2)**
db.default.url = jdbc:postgresql://localhost:5432/open-platform-demo-db
db.default.user = axelor
db.default.user = user **(2)**
db.default.user = username **(3)**
db.default.visible = false **(2)**
def mode = __bean__(com.axelor.app.script.ScriptAppSettings).getApplicationMode()
def result = service.myMethod()
def service = __bean__(com.example.MyService)
define change tracking and notifications
define security
define various reports
defines actions to interact with services from views
defines domain data
defines views for the domain objects
dependencies {
dependencyResolutionManagement {
description: The AI never reads a contact's email or phone, nor archived contacts
description: What the ai-user role may ask in the chat panel
description: When and how to quote an order.
description: |
description: |- **(2)**
example:
examples:
executor.submit(() -> {
executor.submit(ContextAware.of().build(
executor.submit(ContextAware.of().withTenantId("some-tenant").withUser(AuthUtils.getUser("admin")).build(
executor.submit(ContextAware.of().withTenantId("tenant-b").build(task));
final ExecutorService executor = Executors.newFixedThreadPool(numWorkers);
global.search.file.max-size = 5
global.search.file.mime-type.custom = application/json,application/javascript
global.search.indexer.batch-size = 100
global.search.indexer.threads = 4
global.search.indexer.timeout = 600
global.search.mapping.file = /path/to/my-search-mapping.yaml
global: false                  # true: every AI call, and no lists below
global: false                  # true: every user, and no lists below
gradle
groovy
groups: []                     # by code
hibernate.search.backend.connection_timeout = 3000
hibernate.search.backend.hosts = localhost:9200
hibernate.search.backend.password = changeme
hibernate.search.backend.protocol = https
hibernate.search.backend.read_timeout = 60000
hibernate.search.backend.request_timeout = 60000
hibernate.search.backend.type = elasticsearch
hibernate.search.backend.username = elastic
html
http://localhost:8080/open-platform-demo/ws/
i18n
if (imgData != null) {
import com.axelor.app.AppConfig;
import com.axelor.app.AppSettings;
import com.axelor.app.AvailableAppSettings;
import com.axelor.app.AxelorModule
import com.axelor.app.AxelorModule;
import com.axelor.contact.db.Contact
import com.axelor.contact.db.Contact;
import com.axelor.contact.service.HelloService
import com.axelor.contact.service.HelloService;
import com.axelor.contact.service.HelloServiceImpl;
import com.axelor.data.csv.CSVImporter;
import com.axelor.db.JpaSupport
import com.axelor.db.Model;
import com.axelor.event.Event;
import com.axelor.event.NamedLiteral;
import com.axelor.event.Observes;
import com.axelor.event.Priority;
import com.axelor.events.PostAction;
import com.axelor.events.PostLogin;
import com.axelor.events.PostRequest;
import com.axelor.events.RequestEvent;
import com.axelor.events.qualifiers.EntityType;
import com.axelor.hello.db.Hello
import com.axelor.hello.service.HelloService
import com.axelor.hello.service.{HelloService, HelloServiceImpl}
import com.axelor.meta.CallMethod;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Response;
import com.axelor.rpc.{Response, ActionRequest, ActionResponse}
import com.axelor.sale.db.Order
import com.axelor.sale.service.SaleOrderService
import com.axelor.script.ScriptAllowed;
import com.axelor.test.GuiceExtension;
import com.axelor.test.GuiceModules;
import com.google.inject.Inject
import com.google.inject.Injector
import com.google.inject.Injector;
import com.google.inject.servlet.RequestScoped;
import jakarta.inject.Inject
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
include 'modules:axelor-contact'
indexes:
isEnabled: true
java
js
json
knowledgeBases: [product-docs]
logging.level.com.axelor = info
logging.level.org.hibernate = warn
logging.level.root = error
logging.path = {user.home}/.axelor/logs
logging.pattern.console = %clr(%d{yyyy-MM-dd HH:mm:ss.SSS}){faint} %clr(%5p) %clr(${PID:- }){magenta} %clr(---){faint} %clr(${LOG_TENANT_PATTERN:-}){blue}%clr([%15.15t]){faint} %clr(%-40.40logger{39}){cyan} %clr(:){faint} %m%n
logging.pattern.file = %d{yyyy-MM-dd HH:mm:ss.SSS} %5p ${PID:- } --- ${LOG_TENANT_PATTERN:-}[%t] %-40.40logger{39} : %m%n
main/java/com/axelor/contact/controller/HelloController.java:57
main/resources/domains/Contact.xml:100
main/resources/domains/Contact.xml:150
markdown
maxSteps: 12
model: openai/gpt-6.1-sol **(1)**
model: openai/gpt-6.1-sol **(2)**
models:
models: [openai/gpt-6.1-sol]     # by code
name: AI users
name: Contact details
name: Describe Model
name: OpenAI
name: Support Assistant
name: Support Assistant **(1)**
name: perm.sale.create.all
name: perm.sale.read.all
name: perm.sale.self
name: perm.sales.customer-change
name: perm.sales.hide-total
object: com.axelor.sale.db.*
object: com.axelor.sale.db.Order
or
package com.axelor.app.script;
package com.axelor.contact.db.repo;
package com.axelor.contact.jobs;
package com.axelor.contact.service;
package com.axelor.contact.web;
package com.axelor.contact;
package com.axelor.data;
package com.axelor.hello
package com.axelor.hello.service
package com.axelor.hello.web
package com.axelor.sale.service;
package com.axelor.sale;
permissions: ["*"] **(5)**
permissions: ["com.axelor.sale.db.* read update"] **(3)**
pluginManagement {
plugins {
private static final AxelorCache<String, Action> ACTIONS =
process task
properties
protected final Logger log = LoggerFactory.getLogger(getClass());
provide scheduled job implementation
providers: []                  # by code
provides business services
provides glue layer between views and services
provides i18n catalogues
public List<String> getFooNames() {
public Title saveAndLog(Title title) {
public class AppService implements AppConfig {
public class BooleanAdapter extends Adapter {
public class CSVTest {
public class ContactModule extends AxelorModule { **(1)**
public class ContactObserver {
public class ContactSaved {
public class ContactService {
public class CustomPolicy implements ScriptPolicyConfigurator {
public class DemoImport {
public class DemoModule extends AxelorModule {
public class Hello {
public class HelloController {
public class HelloJob implements Job {
public class HelloServiceImpl implements HelloService {
public class HelloServiceSaleImpl extends HelloServiceImpl {
public class LoginObserver {
public class MyHibernateListenerConfigurator implements HibernateListenerConfigurator {
public class MyMetaThemeService implements MetaThemeService {
public class MyModule extends AxelorModule {
public class MyPreInsertEventListener implements PreInsertEventListener {
public class MyQuickMenu implements QuickMenuCreator {
public class MyReportConfigurer extends ReportConfigurerImpl {
public class MyService {
public class MyViewProcessor implements ViewProcessor {
public class OrderCreator {
public class PrintService {
public class SaleOrderController {
public class SaleOrderObserver {
public class SaleOrderService implements SaleOrderService {
public class ScriptAppSettings {
public class TitleRepository extends AbstractTitleRepository {
public interface HelloService {
public interface SaleOrderService {
public static final String IMPORT_ID_TITLE = /*$$(*/ "Import ID" /*)*/;
public void onFetch(@Observes @Named(RequestEvent.FETCH) PostRequest event) {
quartz.data-source.connection-test-query =
quartz.data-source.idle-timeout = 0
quartz.data-source.maximum-pool-size = 3
quartz.enable = false
quartz.enable = true
quartz.job-store.class = org.quartz.impl.jdbcjobstore.JobStoreTX
quartz.job-store.cluster-checkin-interval = 7500
quartz.thread-count = 3
rateLimit: 2
reports.design-dir = {user.home}/axelor/reports
restrictions:
roles: [ai-user]               # by name
roles: [ai-user] **(5)**
rootProject.name = 'axelor-demo'
rules:
running a task for another tenant
scala
settings.gradle
sh
shell
should be changed to:
skills: [data-operations]
skills: [data-operations] **(4)**
sources:
sql
src/main/resources/ai/
src/main/resources/axelor-config.properties
src/main/resources/i18n/messages.csv
src/main/resources/i18n/messages_en.csv
src/main/resources/i18n/messages_fr.csv
start ──► split ─┤                                    ├──► join ──► publish
studio.build.local.args = -x test
studio.build.local.timeout = 30
studio.export.dir = {user.dir}/data/studio/apps
studio.export.source.webapp =
subAgents: [studio-assistant]
sync:
systemTool: describe_model
task.start();
tenant aware process task
tenant aware threaded task
text
then, to define the quick menu, create a class that implements `QuickMenuCreator` :
this.altText = "";
threaded task
title: Quotation Rules
title: Some text
title: Studio View Design **(1)**
tokenQuotaMonthly: 100000
tools: [describe_model, search_records, read_record, open_view] **(2)**
tools: [describe_model, search_records, read_record, open_view] **(3)**
trait HelloService {
type: OPENAI
type: SYSTEM
type: feature
users: []                      # by code
utilityModel: openai/gpt-6-luna
var UUID = Java.type('java.util.UUID');
var amount = new BigDecimal('1.50');   // constructor
var id = UUID.randomUUID().toString();
var imgData = com.axelor.report.tool.ImageTool.getImageBytes(row["<my_file_id>"], true);
var isOrder = record instanceof Order; // instanceof
var order = new Order();               // entity constructor
var repo = __repo__(Order);            // usable as a Class argument
var today = LocalDate.now();           // static method
view.collaboration.amqp.address = /exchange/amq.fanout
view.collaboration.amqp.password = guest
view.collaboration.amqp.url = amqp://localhost:5672
view.collaboration.amqp.username = guest
where :
where `fqn` is fully qualified name of the controller, followed by a colon `:` followed by `method` name and optionally parameter values from current context if the method is a free form method.
xml
yaml
{
|  |  |
|  | *   repeat `./gradlew generateCode` whenever you add/change any domain model definitions  *   repeat `./gradlew copyWebapp` if you run gradle clean task or delete build directory |
|  | *   repeat `./gradlew generateCode` whenever you add/change any domain model definitions  *   repeat `./gradlew generateLauncher` if you run gradle clean task or delete build directory |
|  | **Action Record works on JPA entities only.** It targets real entity properties, so on a custom model the values silently don’t persist. For custom models: set defaults with the field’s **default value** in the model designer, and use an **Action Script** for computed values and transitions. |
|  | **Choose your strategy carefully.**  Changing the inheritance strategy after going to production requires a complex data migration.  *   **Recommended:** Use `SINGLE` for simple hierarchies or `JOINED` for complex data models requiring strict data integrity.  *   **Caution with `CLASS`:** While the `CLASS` strategy may seem convenient, it has significant drawbacks related to performance: queries targeting the parent entity can become extremely slow as data grows (due to `UNION ALL` operations). |
|  | **Create a patch version** refuses to run while the latest revision is still unpublished — publish (or delete) that revision first. |
|  | **Database Sequence Alignment**  The allocation size configuration must match the database sequence’s `INCREMENT BY` value. Mismatches can cause ID collisions, gaps, or other unexpected behavior. Make sure to CREATE or ALTER the database sequence with the right increment :  ```sql -- in case of a new entity CREATE SEQUENCE MY_ENTITY_SEQ START WITH 1 INCREMENT BY 50; -- in case of existing entity ALTER SEQUENCE MY_ENTITY_SEQ INCREMENT BY 50; ```  sql |
|  | **Reload built-in defaults** overwrites the bundled records with their shipped version — discarding local edits to them. Use it after an upgrade or to intentionally reset to defaults. Records you created yourself are left untouched. |
|  | A `CUSTOM` provider cannot serve chat or embeddings yet — creating a model on one fails at call time. It exists so an OpenAI-compatible endpoint can be reached by model sync, which talks to it through the OpenAI adapter. |
|  | A `one` split never has a `<join>`. Writing one for it is refused (`join-for-invalid`), because a barrier that only one branch can ever reach would wait for nothing. Where the alternatives come back together, point them at the same node. |
|  | A leaf without an action does nothing — that’s the most common reason a new menu "doesn’t work". |
|  | A new agent is saved disabled and shared with no one; a new tool is saved disabled and asking for approval. The builder cannot enable, share or grant anything — those steps are always yours. |
|  | A resolved type exposes the class’s **static** members and its constructor, not the instance methods of `java.lang.Class`. To reach the `java.lang.Class` object — for reflection, or `getName()` / `getSimpleName()` — go through `.class` (e.g. `Order.class.getName()`), and use the `instanceof` operator rather than `Class.isInstance(…​)`. This applies to the `js` engine; in `groovy`, a bare name is the `java.lang.Class` object and statics, constructors and `Class` methods all work on it. |
|  | A workflow override is a **full-graph copy**, i.e. a fork. Once you override a shipped workflow, later module updates to that workflow are **shadowed** — your copy keeps winning and does not adopt them automatically. Such changes are called out in the release **changelog**; when you see one, review your override and either re-apply the module’s changes into it or drop the override to adopt the new base. Prefer composition when possible to avoid this fork. |
|  | API keys are **never seeded**. Set them per environment on the Providers screen (the provider’s `apiKey`/secret) — otherwise chat calls fail with an auth error. |
|  | API keys should be treated as sensitive information. Do not share your API keys and store them securely. |
|  | After the command completes successfully, remove any `encryption.old-password` or `encryption.old-algorithm` entries from `axelor-config.properties`. |
|  | All `quartz.data-source.*` properties are passed and used to configure the data source via reflection in case you need advanced configuration. If you do that, make sure the appropriate setters exist on the data source. |
|  | An action view is also how a custom model gets its entry screen: point it at the model’s grid and form views, then attach it to a menu. |
|  | An existing module workflow can be brought into the project with the **Import** button on the same tab, then edited on the canvas. |
|  | Any extra `quartz.job-store.*` properties are passed and used to configure the job store via reflection in case you need advanced configuration. If you do that, make sure the appropriate setters exist on the job store. |
|  | At least one of them must resolve to somebody, otherwise the run fails loudly instead of parking a task nobody can see. |
|  | Because API key authentication happens on every request, `Last used` is refreshed at most once every 5 minutes rather than on each request. |
|  | Both Elasticsearch and OpenSearch are supported as backend search engines. This documentation uses "Elasticsearch" for simplicity, but all features apply to OpenSearch as well. |
|  | Collection joins (one-to-many, many-to-many) are not supported. Only single-value relations (many-to-one, one-to-one) can be joined. |
|  | Create your selections first (Selections) so you can bind status and priority fields while designing the model. |
|  | Cross joins require at least one `<on>` condition. |
|  | Custom fields can also be designed visually and versioned as part of a Studio project — see Studio models. |
|  | Custom models can also be designed visually and versioned as part of a Studio project — see Studio models. |
|  | Deactivating removes the customizations from the live application. Data of custom models is not deleted, but it becomes inaccessible until a revision defining those models is activated again. Be deliberate with this on a production system. |
|  | Field paths remain visible in the selected list. Prefer explicit paths such as `customer.email` over similarly named display labels, especially in a saved configuration. |
|  | Field paths traverse ManyToOne relations (`self.customer.name`). To aggregate across a collection, query from the detail model instead — from `OrderLine` up to its order — or add an explicit join. |
|  | Field-level permissions apply to import only — every mapped field is checked individually. Export enforces permissions at the model level. |
|  | For detailed information about Hibernate Search capabilities, see the Hibernate Search Reference Documentation. |
|  | For filters shared by the whole page (a date range, a status), declare them once on the `DataDashboard` — they propagate to every dashlet as query parameters. |
|  | For production deployments, use HTTPS and proper authentication credentials. |
|  | Give a default flow to every `one` split whose conditions do not provably cover every case. The designer seeds no default for you. |
|  | Grant an agent a focused set of tools. A large, overlapping tool list makes the model’s tool selection worse — expose only what the agent’s job needs. |
|  | If the project already has a build pending or running, clicking **Build** returns that job instead of queuing a second one. Jobs keep their output and artifacts, so the build history stays inspectable. |
|  | If you are coming from BPMN, `one`/`some`/`all` are the exclusive, inclusive and parallel gateways, and `wait="any"` is the event-based gateway’s race. The mapping is spelled out in Coming from BPMN, and every split-mode × policy combination in Every combination, side by side. |
|  | In case of distributed caching, you need to make sure cache keys/values are serializable by the underlying cache implementation. For example, when using Redisson, keys/values should be serializable by its codec, the default codec being `org.redisson.codec.Kryo5Codec`. |
|  | Java 21 or higher is required to run the command line application. |
|  | Java reserved keywords can’t be used as field names. PostgreSQL reserved keywords can’t be used as column names. |
|  | Knowledge bases require a vector store, configured with the `ai.vector-store.*` options — see Application configuration. Without one, knowledge features are disabled gracefully. |
|  | On custom-model views, field names are bound through the model’s JSON storage (`attrs.` prefix). The designers handle this for you when you drag fields; it only matters when typing expressions by hand — there, custom fields are `attrs.status` while real record fields like `id` stay unprefixed. |
|  | On the **Workflows** tab you can also import an existing module workflow into the project. The workflow designer itself is documented in Workflow designer. |
|  | Only one revision — across all projects — is active at a time. Activating a revision deactivates any other active one. |
|  | Please check the changelog for a detailed list of fixes, changes, and improvements introduced in 8.0. |
|  | Please check the changelog for a detailed list of fixes, changes, and improvements introduced in 8.1. |
|  | Point `utilityModel` at a small, cheap model. Background tasks — conversation titles, summaries, session notes — run on it and stay inexpensive; the main `model` is used only for the conversation itself. When unset it falls back to `model`, then the global default chat model. |
|  | Prefer building visually? The same graph takes a few minutes in the Studio workflow designer — no module or restart needed. |
|  | Re-index a source after its content changes — the source’s `status` tracks progress and surfaces any indexing error. A knowledge base seeded from `ai/knowledge/<code>/` is created with its sources not yet indexed: the folder name is its `code`, and nothing is sent to the embedding model until you click an Index button. |
|  | React template support for the following templates has been added in version *7.4.3*. If you use a previous version, use the legacy templates. |
|  | Records saved **by** a workflow script go through the same detection, so workflows can cascade; a re-entrancy guard prevents self-triggering loops within a dispatch. |
|  | Restrict API keys to the public addresses your services connect from. An IP restriction limits the impact of a leaked API key, it doesn’t replace keeping the key secret. |
|  | Saving a resource in a draft revision never changes the running application. Changes go live when the revision is activated; from then on the revision’s resources go live as you save them (a workflow is deployed from its designer) — see Lifecycle. |
|  | Seeded agents, skills and tools can be edited too. A **Reload built-in defaults** of the built-in configuration overwrites those edits. |
|  | Sequences are stored as `MetaSequence` records, you must update meta records after adding new sequences. |
|  | Setup — providers, models, enabling the assistant — belongs to the AI module: see Configuration & Seeding. |
|  | Sheets or CSV files that do not match a known model are skipped silently — they simply do not appear among the detected sources. A single CSV file is the exception: its source is the model you are importing into, regardless of the file name, so a flat export can be edited and imported back through the same grid. Enable **Flat import** so its flattened relationship columns are resolved. |
|  | Special user `admin` and members of group `admins` have full access to all the resources. |
|  | Support of these various options depends on the underlying cache implementation and may be approximated or ignored if not supported at all. |
|  | Tell the agent when to run each procedure in the skill’s instructions. The model sees the procedures — name, title, guard and inputs — only once it has loaded the skill. |
|  | The **Structure** tab beside the palette shows the whole layout as a tree — the easiest way to select something buried in nested panels. |
|  | The `<dataset>` element is optional when using `DataDashlet` — data fetching is handled via the query REST API. |
|  | The `ContextAware*` system will run the task inside a new transaction by default. If this is not the expected behavior, you can disable it with `.withTransaction(false)` before starting the thread. |
|  | The `elasticsearch` backend type is used for both Elasticsearch and OpenSearch. Hibernate Search’s Elasticsearch backend is compatible with OpenSearch. |
|  | The assistant works in the active project’s revision. When no project is active, an implementation request makes one and activates it, and in an activated revision a saved resource goes live as it is saved — a workflow excepted, which is deployed from its designer (see Lifecycle). It publishes a revision or creates a new version only when you ask. Ask it for a review or a design first if you want to look before anything goes live. |
|  | The badge updates in realtime — task changes are pushed to clients viewing the record over the built-in websocket. Clustered deployments with the redisson cache provider relay pushes across nodes automatically; without it, cross-node updates fall back to a periodic re-count. |
|  | The field name `attrs` is now reserved for defining json field to store custom field values. |
|  | The run acts as the current user (`AuthUtils.getUser()`), with that user’s permissions — the same checks as the web client’s requests. |
|  | The same widgets draw in an AI chat answer: the `show_data` tool takes a query and one widget with its props as JSON, and the chat renders it as a card inside the answer. See Data widgets in answers. |
|  | There is a shortcut from anywhere in the application: on any view, **technical** users see a **Studio** button in the toolbar. It opens the designer directly on the view you are looking at — no need to find the resource in a project first. |
|  | To place the new fields precisely on the form, open that form with the toolbar **Studio** button and drag them where you want them. |
|  | Two **active** definitions with the same `(model, name)` and the same priority are rejected. |
|  | Unlike the trigger’s sandboxed `when`, node expressions execute against the **full** record — reference fields and collections may be traversed. |
|  | Users must validate the configuration before it becomes active and ready to use as the default second authentication method. |
|  | Using versions outside this range may result in compatibility issues or unsupported features. For the latest compatibility information, see Hibernate Search 7.2 Release Notes. |
|  | Version number is used in order to ensure non-conflicting modifications of the record, and thus must be specified. |
|  | We can define multiple models in single xml file but it’s recommended to create separate xml file for each model, this allows the build system to re-generate code for only modified files. |
|  | We can use Eclipse for Scala, but for best experience, use IntelliJ IDEA. |
|  | When `<view-param>` `popup` is set to `reload` on a dashlet, there is a save confirmation dialog before opening the popup. The parent record is then reloaded if the popup is closed via the OK button or close action. |
|  | When a `DataSource` is used, `db.default.ddl` is ignored. Use `hibernate.hbm2ddl.auto` instead, for example `hibernate.hbm2ddl.auto = update` in `axelor-config.properties`. The `hibernate.hikari.*` se
|  | When a new API key is created, it will be displayed only once. Make sure to copy and store it securely as you won’t be able to view it again later. |
|  | When in doubt, start with a custom model. You keep the fast iteration loop and can graduate to an entity when a hard requirement appears. |
|  | When the revision is activated, the model automatically gets a default form and grid. Add a menu entry to open it — see Menus — and adjust the generated views in the view designers. |
|  | With `canMove`, sequencing is done on field specified by `orderBy`, and it must be only one integer field. If not specified, not sequencing is done. On top-level grid, `orderBy` is required with `canMove`. |
|  | With `editable="true"` (inline edit), pressing `Enter` commits the current row, but when it is the last row of the grid, it will also add a new row. |
|  | Workflows are the exception to editing an activated revision. Saving one never writes it to the application; the designer’s own **Deploy** button does, one workflow at a time (Workflow designer). Every other resource type in an activated revision goes live as you save it. |
|  | You can also just describe the app in the chat and review what the assistant builds — see Building with the AI Assistant. |
|  | You can also provide config value with system properties `-Daxelor.config.db.default.password=secret` |
|  | You can also provide external config file with `-Daxelor.config=/path/to/dev.properties` |
|  | You can parent your entry onto an **existing** application menu instead — pick the standard menu as **Parent** to slot your entry among the app’s own. |
|  | You manipulate the view structure at this point. It is important to understand and validate each changes depending on object manipulated in order to avoid unexpected behavior during the rendering. Use it with caution. |
|  | `--preview` argument can also be used to preview the generated changelog without deleting/updating files. |
|  | always execute run task with gradle using `--no-daemon` to avoid application clean up issues (known gradle problem) |
| (empty)               | The record.                                                                                                                                                             |
| **1**           | Low-volume entities, when strict sequential IDs are required | Slowest: DB call per insert                  |
| **1** | : All not null search fields                |
| **1** | Index related entity fields up to depth 2                          |
| **1** | Name of the QuickMenu                             |
| **1** | See entity listeners. |
| **1** | The Axelor maven repository          |
| **1** | The `ref` attribute references another field instead of a literal value. |
| **1** | The action-view gives the model, the form and the context every action carries. The form’s `onNew` runs on the first `run`, as when the browser opens a new record. |
| **1** | The application config file                                   |
| **1** | The grid view with the give fields are grid columns                     |
| **1** | The guice module class used to configure services |
| **1** | Use axelor application plugin  |
| **1** | `model` - resource model name                |
| **1** | `model`/`utilityModel` reference an `AiModel` by code                                                  |
| **1** | `status` - response status                                               |
| **1** | a deadline needs no split: an unanswered approval leaves by the boundary’s own edge, so `escalate` is reached without anything downstream having to test for it. |
| **1** | automatic schema generation option                     |
| **1** | controller lifecycle                                               |
| **1** | create a csv importer (subject to change in v4)                |
| **1** | create a new empty context for `MetaJsonRecord` for the `hello` model |
| **1** | define a chart view                                                 |
| **1** | define a grid view for the given domain model        |
| **1** | define a many-to-one field `title`          |
| **1** | define a many-to-one field `title` referencing `Title` object       |
| **1** | define a top-level menu with no parent                  |
| **1** | define a top-level menu with no parent      |
| **1** | define a tree column with the given name and type          |
| **1** | define an `action-view` for the given object            |
| **1** | fires on updates of `confirmed`, only when it just became `true`, once per "episode" (it can fire again only after the condition turns false and true again) |
| **1** | form view for the given domain model                                  |
| **1** | in the background: `async` defaults to `true` on an a
| **1** | providers and their models — Providers & Models                                                                                                  |
| **1** | required to enable multi-tenancy feature                                                           |
| **1** | standard groovy expressions                                                             |
| **1** | the `code` is how agents and knowledge bases reference the model |
| **1** | the display **name**; the skill’s **code** is its folder name, `studio-view-design` |
| **1** | the display name; the agent’s unique `code` is the file name, `support-assistant.md`                                                                                                                           |
| **1** | the field is marked as translatable |
| **1** | the grid view used by this action                                                                                                                               |
| **1** | the name of the action (required)                                      |
| **1** | the skill itself — frontmatter + instructions                                         |
| **1** | the workflow name (required) — with `model`, the workflow’s identity                                 |
| **1** | use the database `axelor-demo` |
| **1** | valid, only one action                    |
| **10-20**       | Medium-volume entities (users, products)                     | Balanced performance and waste               |
| **2** | : Selected search result ids group by model |
| **2** | Bind the service with desired implementation      |
| **2** | Java EL expression needs to be wrapped inside `#{…​}`, also no need of null value check |
| **2** | Only include specific paths from the related entity                |
| **2** | Order of the QuickMenu                            |
| **2** | The application project config |
| **2** | The axelor app gradle plugin version |
| **2** | The form view is used to view/edit a record                             |
| **2** | The minimal persistence xml file to confirm JPA requirement   |
| **2** | The value is written, then the field’s `onChange` runs. A reference is `{id}`.                                                                                      |
| **2** | `offset` - current pagination offset                                     |
| **2** | `offset` - pagination offset                 |
| **2** | add a data import event listener (optional, for statistics)    |
| **2** | define a child menu item with parent                    |
| **2** | define a child menu item with parent        |
| **2** | define a column bound to a field of the domain model |
| **2** | define a string field `firstName`                                   |
| **2** | define a string field `firstName`           |
| **2** | define search fields (the input values can be used as query params) |
| **2** | define the root node data source                           |
| **2** | each file becomes an `AiSkillReference`, loadable on its own                          |
| **2** | inject a service                                                   |
| **2** | mark one enabled chat model as the global default                |
| **2** | panel to group relevant fields                                        |
| **2** | routes on a JavaScript condition evaluated against the record                                                                                                |
| **2** | the `ai-admin` and `ai-user` roles                                                                                                               |
| **2** | the always-visible description — keep it tight and say when to load                 |
| **2** | the chat model, referenced by its `AiProvider/AiModel` code                                                                                                                                                    |
| **2** | the context allows seamless access to custom field values             |
| **2** | the default database should be invisible as it’s a fallback                                        |
| **2** | the form view used by this action                                                                                                                               |
| **2** | the fully qualified model name (required)                                                            |
| **2** | the jdbc url to connect to                             |
| **2** | the name of the context model                                          |
| **2** | the postgresql user            |
| **2** | tools, skills, knowledge bases and sub-agents are referenced by code — use `["*"]` to grant everything |
| **2** | use the `contact-grid` view defined for the `grid` view |
| **2** | valid, action-report is last action       |
| **3** | A new line: its defaults, then its `onNew`. The first line added is `items[-1]`.                                                                                    |
| **3** | Optional custom index name - makes this entity directly searchable |
| **3** | The directory to keep gradle wrapper files                    |
| **3** | The panel that can be used to group relevant fields                     |
| **3** | Use Java 21                    |
| **3** | Use maven central                    |
| **3** | Whether to show selected state on items           |
| **3** | `call:` expressions are handled with JavaEL                                             |
| **3** | `details-view` params configures the grid view to show details view on the right side                                                                           |
| **3** | `limit` - pagination limit                   |
| **3** | `total` - total number of records matched                                |
| **3** | an input field bound to the given model                               |
| **3** | controller method                                                  |
| **3** | define 2nd level node data source with root node as parent |
| **3** | define a calculated string field `fullName`                         |
| **3** | define a calculated string field `fullName` |
| **3** | define the data source for the chart (jpql, sql or rpc)             |
| **3** | everything below the frontmatter is the instructions (markdown)                     |
| **3** | find a `world` model record by field `name`                           |
| **3** | invalid, action-report is not last action |
| **3** | only default database supports DDL operations, schema for other tenants should be created manually |
| **3** | optional — the skill’s procedures, checked against the forms when the skill is loaded |
| **3** | override priority (default `20`) — the highest active definition per `(model, jsonModel, name)` wins |
| **3** | parks the run on a durable task for the `sales.manager` role; the `<boundary>` gives up after 3 days rather than waiting forever. See task and boundary      |
| **3** | run a data import task with the given task instance            |
| **3** | scripting language to use (required, currently `js` and `groovy` only) |
| **3** | the data models it may reach, and what it may do there (see Restrict what an agent can touch)          |
| **3** | the display text of the menu item                       |
| **3** | the display text of the menu item           |
| **3** | the postgresql user’s password |
| **3** | the tools this agent may call (by tool code)                                                                                                                                                                   |
| **3** | tool definitions — Tools                                                                                                                         |
| **3** | use the `contact-form` view defined for the `form` view |
| **3** | user name to be used to connect to the database server |
| **4** | A step on a line runs in the line’s context: the line is the record, the order is `_parent`, and what the response sets lands on the line.                          |
| **4** | JSON field - content indexed automatically                         |
| **4** | List of QuickMenuItem associated to the QuickMenu |
| **4** | The Node.js repository               |
| **4** | The directory to keep module projects                         |
| **4** | The editor can be used to define custom editor for the field            |
| **4** | Use JUnit5 for unit testing    |
| **4** | `details-view-mode` params configures how to show details view either as `overlay` (default - in form of popup) or `inline` (it will show side by side to grid) |
| **4** | `errors` - validation errors (key is field name, value is error message) |
| **4** | `select:` expressions are handled with JavaEL                                           |
| **4** | `sortBy` - list of fields to sort the result |
| **4** | an editor can be used to define custom editor for the field           |
| **4** | define a domain filter (jpql where clause)              |
| **4** | define a one-to-many field `addresses`      |
| **4** | define a one-to-many field `addresses` referencing `Address` object |
| **4** | define the category axis                                            |
| **4** | definitions are active by default; an inactive definition never fires                                |
| **4** | display name of the tenant                                                                         |
| **4** | everything below the frontmatter is the system prompt (markdown)                                       |
| **4** | get the view context and convert to business object                |
| **4** | one folder per knowledge base: `KB.yaml` holds its config and RECORD sources, the optional `content.md` provides a TEXT source — Knowledge Bases |
| **4** | posts a confirmation note on the order’s message stream                                                                                                      |
| **4** | provide data input streams                                     |
| **4** | record(s) intended for relational field values must be saved manually |
| **4** | skills the agent can load on demand with `use_skill`                                                                                                                                             
| **4** | the action (of type action-view) to execute             |
| **4** | the action (of type action-view) to execute |
| **4** | user password to authenticate the user                 |
| **4** | whether the code is transactional                                      |
| **5** | A step on the order leaves the line first: ``items’ own `onChange`` runs, in the order’s context, then the button’s `onClick`.                                      |
| **5** | Add dependencies               |
| **5** | The shell and batch scripts to execute the build with wrapper |
| **5** | The viewer can be used to define custom template to display field value |
| **5** | Title of the QuickMenuItem                        |
| **5** | `data` - json map or array depending on the service type                 |
| **5** | `data` - json map, varies on web service     |
| **5** | a viewer can be used to define custom template to display field value |
| **5** | call service method                                                |
| **5** | define a context variable                               |
| **5** | define a custom finder method `findByName`                          |
| **5** | define a custom finder method `findByName`  |
| **5** | define an `action-view` for the given object            |
| **5** | define the series for the chart                                     |
| **5** | exactly one `<start>` node, written first, carrying the trigger                                      |
| **5** | handle data import error, continue data import if returns true |
| **5** | host name based filter, users can only access one tenant in case of hosts match                    |
| **5** | set relational value (m2o)                                            |
| **5** | skills — Skills                                                                                                                                  |
| **5** | the `ActionRequest` is available as `$request`                         |
| **5** | the get tag value from the given method     |
| **5** | who may use it: `roles` by name, `groups` and `users` by code — see Control who can use it             |
| **50-100**      | High-volume entities (logs, events, orders)                  | Best performance, more wasted IDs on restart |
| **6** | Action of the QuickMenuItem                       |
| **6** | The gradle settings script                                    |
| **6** | The panel-related can be used to show o2m/m2m fields                    |
| **6** | `onSave`, then the order and its lines saved in one request, read back, then `onLoad`.                                                                              |
| **6** | `records` - list of json maps or record ids  |
| **6** | a panel-related can be used to show o2m/m2m fields                    |
| **6** | agents — Agents                                                                                                                                  |
| **6** | handle input errors, continue data import if returns true      |
| **6** | mark the response to flash the message on client                   |
| **6** | the `ActionResponse` is available as `$response`                       |
| **6** | use the `contact-grid` view defined for the `grid` view |
| **6** | user the given static tag                   |
| **7** | Context associated to the QuickMenuItem           |
| **7** | How to answer a question the form asks — here, No to everything. See Answer the form’s questions.                                                                   |
| **7** | The form view to edit the address in popup                              |
| **7** | The gradle build script                                       |
| **7** | `fields` - name of the fields                |
| **7** | a panel to show in the right sidebar                                  |
| **7** | data policies — see Governance files                                                                                                             |
| **7** | free form controller method should be annotated with `@CallMethod` |
| **7** | use the `contact-form` view defined for the `form` view |
| **8** | A field error, an `error` message or a refused step ends the run early; the result says which.                                                                      |
| **8** | The panel to show in the right sidebar                                  |
| **8** | free form controller method                                        |
| **8** | selected state of the QuickMenuItem               |
| **8** | usage policies — see Governance files                                                                                                            |
| **`<dataset>`**  | dataset definition                                            |
| **`<template>`** | a template                                                    |
| **`as`**    | Alias for the joined model                                  |
| **`as`**    | Alias for the joined model               |
| **`columnBy`**       | a field to create columns. Can be an enum, selection or a reference field.                                |
| **`design`** | the design file name (.rptdesign file)                                                    |
| **`field`** | The relation field path (e.g. `c.title`) |
| **`if`**     | boolean expression                 |
| **`if`**  | boolean expression                                                                               |
| **`model`**          | fully qualified name of the domain model                                                                  |
| **`model`**    | the fully qualified name of the domain model this view belongs to                                         |
| **`model`**  | fully qualified name of the domain model                                                               |
| **`model`** | Fully qualified entity class name, or JSON model name with `type="json"` |
| **`model`** | The target model name (e.g. `com.axelor.sale.db.OrderLine`) |
| **`model`** | fully qualified name of the domain model      |
| **`model`** | name of the data source model                             |
| **`name`**           | name of the view                                                                                          |
| **`name`**     | name of the view, duplicate name is considered as overriding                                              |
| **`name`**    | name of the button                                              |
| **`name`**    | name of the calendar view                                                                                                                               |
| **`name`**   | name of the action                                                                        |
| **`name`**   | name of the view, duplicates are considered overriding                                                 |
| **`name`**  | method name, as a convention use `findBy` prefix                 |
| **`name`**  | name of the view                              |
| **`name`**  | name of the view          |
| **`name`**  | the name of the sequence (required)                              |
| **`name`** | name of the field                                              |
| **`name`** | name of the node        |
| **`onClick`** | the name of the action to execute when button is clicked        |
| **`operator`** | matching operator (see bellow)                            |
| **`output`** | name of the output file (can use `${name}`, `${date}`, `${time}` to provide dynamic name) |
| **`query`**  | `string`          | Name of the data query to execute                                                |
| **`render`** | `function`        | `(data) ⇒ ReactNode`, receiving the dataset                                      |
| **`sequenceBy`**     | a field to use to re-order the cards (numeric fields only)                                                |
| **`title`**    | the grid title                                                                                            |
| **`title`**   | title of the panel                                                                    |
| **`title`**  | the form view title                                                                                    |
| **`title`** | display title of the view |
| **`type`** | data type of the column |
| **`using`** | fields to be used as method params, see bellow for custom params |
| **model** | the domain model to construct the object of                                             |
| **name**        | name of the menu item                                          |
| **name**  | name of the action                                                                      |
| **name** | name of the action                         |
| **name** | name of the action |
| **title**       | display title                                                  |
| ---- | ---------------- |
| ------ | ------------------------------------------------------ | --------------------------------------------- |
| ------- | ------ | ----------------- |
| ------- | ----------------------------------- |
| -------- | ------------------ |
| -------- | ------------------------------------------ |
| -------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| --------- | -------------------------- |
| --------- | ----------------------------- |
| --------- | ------------------------------- |
| --------- | ---------------------------------- |
| --------- | --------------------------------------- |
| --------- | -------------------------------------------------- |
| --------- | --------------------------------------------------------------------------------------- |
| --------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ---------- | ----------------- | --------------------------------------------------------------------------- |
| ---------- | ------------------- |
| ---------- | ----------------------- |
| ---------- | ------------------------------------------------ |
| ---------- | ------------------------------------------------------------- |
| ---------- | -------------------------------------------------------------- |
| ---------- | -------------------------------------------------------------------------------- |
| ---------- | ------------------------------------------------------------------------------------------------------- |
| ---------- | ---------------------------------------------------------------------------------------------------------- |
| ----------- | -------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ----------- | ---------------------------------------- |
| ----------- | -------------------------------------------------------- |
| ----------- | --------------------------------------------------------- |
| ----------- | ----------------------------------------------------------- |
| ----------- | ---------------------------------------------------------------- |
| ----------- | ----------------------------------------------------------------- |
| ----------- | ------------------------------------------------------------------------ |
| ----------- | ---------------------------------------------------------------------------- |
| ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| ------------ | ----------------- | -------------------------------------------------------------------------------- |
| ------------ | ------------------------------- |
| ------------ | ---------------------------------- |
| ------------ | ---------------------------------------- |
| ------------ | ----------------------------------------------------------------------------------------- |
| ------------ | ------------------------------------------------------------------------------------------------------ |
| ------------ | -------------------------------------------------------------------------------------------------------------------------------- |
| ------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------- | -------- | ------------------------------------------------------------- |
| ------------- | --------------------------------------------------------------- |
| ------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| ------------- | ------------------------------------------------------------------ |
| ------------- | ------------------------------------------------------------------------------------- |
| ------------- | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| -------------- | --------------------------------------------------------- |
| -------------- | --------------------------------------------------------------------------------------------------------- |
| -------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| -------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| --------------- | ------------------------------------------------------------ | -------------------------------------------- |
| --------------- | -------------------------------------------------------------- |
| --------------- | ------------------------------------------------------------------------------- |
| ---------------- | ------------------------------------------------------------- | ---------------- |
| ---------------- | ------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------- |
| ----------------- | --------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| ----------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| ------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| --------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ---------------------- | ----------------------
| ---------------------- | ---------------------------------- |
| ----------------------- | ------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| ----------------------- | ------------------------------------------------------------------------- |
| ------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------- |
| ------------------------- | ------------------------------------------------------------------ |
| ------------------------- | ------------------------------------------------------------------------------------------------------------- |
| -------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| ----------------------------- | ------------------------------------------- |
| ----------------------------- | ------------------------------------------------------------------------------------- |
| ---------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------------------------------------------- | ---------------- | -------------------------------------------- |
| ------------------------------------------------- | ----------------- | ----------------------------------------------------------------------------- |
| -------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| --------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ----------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| --------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| -------------------------------------------------------------------- | ------------------------------ |
| -------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ------------------------------------------------------------------------- | ----------------------------------------------- | ---------------------------------------------------------------------------- |
| ---------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| -------------------------------------------------------------------------------------- | --------------- |
| --------------------------------------------------------------------------------------- | ---------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| -1   | failure          |
| -4   | validation error |
| 0    | success          |
| A field no form rule touches — a note, a tag                                           | `update_record` |
| Action Attrs     | Change view attributes live — hide, require, set a domain     | Attrs Action     |
| Action Condition | Check preconditions field by field                            | Condition Action |
| Action Method    | Call a Java method of a module                                | Method Action    |
| Action Record    | Set field values on a record (defaults, computed updates)     | Record Action    |
| Action Script    | Run a script — the escape hatch when nothing declarative fits | Script Action    |
| Action Validate  | Show errors, alerts and confirmations before proceeding       | Validate Action  |
| Action View      | Open a grid/form/dashboard, optionally filtered               | Action View      |
| Actions                                                              | Actions                        |
| Actions             | Actions run when the user interacts with a view. Workflows react to the **record** changing, whatever saved it — a form, a web service, an import.                                            |
| Actions & Workflows | Deterministic automation you author up front. The assistant is **interactive** and reasons per request; it **reuses** your actions and models through tools rather than replacing them.   |
| Agents        | Disabled, shared with no one                                     | Any agent but itself; its enabled state and who may use it are kept                   |
| Allocation Size | Use Case                                                     | Trade-offs                                   |
| Alternative         | Difference                                                                                                                                                                                                                                 |
| Alternative         | Difference                                                                                                                                                                                    |
| Alternative         | Difference                                                                                                                                                                                |
| Alternative   | Difference                                                                                                                                         |
| Anything a form controls — a status, a confirmation, a computed total, a button’s work | A procedure     |
| Anything above, conversationally                                     | Building with the AI Assistant |
| Anything else | —                                                                | —                                                                                     |
| Attribute               | Required     | Description                                                                                                                                                                                                                                                                                                                                                                                                  |
| Attribute            | Description                                                                                               |
| Attribute            | Description                                                                    |
| Attribute         | Description                                                                                                                                                    |
| Attribute      | Description                                                                                               |
| Attribute      | Meaning                                                   |
| Attribute     | Description                                                                                                                                             |
| Attribute     | Description                                                                           |
| Attribute     | Description                                                        |
| Attribute     | Description                                                     |
| Attribute     | Required | Description                                                   |
| Attribute    | Description                                                                                                                      |
| Attribute    | Description                                                                                            |
| Attribute    | Description                        |
| Attribute   | Description                                                              |
| Attribute   | Description                                                      |
| Attribute   | Description                                                 |
| Attribute   | Description                                               |
| Attribute   | Description                                   |
| Attribute   | Description                              |
| Attribute   | Description               |
| Attribute   | Required | Description                                                                                                                                                                                        |
| Attribute  | Description                                                                                                |
| Attribute  | Description                                                                                             |
| Attribute  | Description                                                                      |
| Attribute  | Description                                                    |
| Attribute  | Description                                                   |
| Attribute  | Description             |
| Attribute | Description                                                                                      |
| Attribute | Description                                        |
| Attribute | Description                     |
| Attribute | Description                |
| CSV    | A ZIP archive containing one CSV file per data source. | One CSV file.                                 |
| Camunda / BPMN                                                                          | Workflow engine                                                  | Notes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| Change fields no form rule touches                                        | A repository `save`                             | No                                                                           |
| Charts and data dashboards                                           | Analytics                      |
| Code | Reason           |
| Command                | What it does                                                                                                                                     |
| Conditional start event                                                                 | `<start on="create&#124;update" watch when>`                     | richer here: `watch` narrows the trigger to named fields                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Custom fields alone | Fine for adding a few fields to an existing model by hand. Studio does the same with a designer — plus whole models, views and logic — and keeps everything versioned in a project.                                                        |
| Custom fields on an existing model | You don’t need a new object — just extra fields on Product, Order, Partner…                                                                                                              |
| Custom model                       | A new business object, live immediately on activation — no build, no restart. The default for Studio work.                                                                               |
| Custom models, entities, enums, custom fields                        | Models                         |
| Description                          | Windows/Linux | macOS          |
| Do what a user does on a form and its lines: set, add a line, click, save | Headless forms                                  | Yes — `onNew` or `onLoad`, `onChange`, `onClick`, the lines' hooks, `onSave` |
| Element          | Description                                                   |
| Element     | Description                                              |
| Enum                               | A fixed, compiled value set for JPA entities. For custom models, use a selection instead — selections can evolve without a build.                                                        |
| Enum (Models) | Compiled and visible to Java code, but changing values requires a build. For entities with code-level logic on the values.                         |
| Excel  | One workbook with a sheet for each data source.        | One workbook containing the flat data source. |
| Exclusive gateway ✕                                                                     | `<split mo
| Field                                                                | Meaning                                                                                                                                                                                                                                                                                                          |
| Field                                                            | Meaning                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
| Field                                                           | Meaning                                                                                                                                                                                   |
| Field                                                   | Meaning                                                                                                                                                       |
| Field                                              | Meaning                                                                                                                                                 |
| Field                         | Meaning                                                                               |
| Field                      | Meaning                                                                                                                              |
| Field                     | Meaning                                                                                                       |
| Field          | Meaning                                                                                                                                                             |
| Field      | Description         |
| Field     | Description                   |
| Field   | Description                         |
| Field type   | Description                              |
| Flat     | You need one row per main record for analysis or for updating scalar, to-one and many-to-many values. Nested fields use dotted paths such as `customer.email`. One-to-many fields are excluded.                                                                             |
| Format | Standard export                                        | Flat export                                   |
| Global search       | Search finds records by keyword. The assistant **understands intent**, joins several lookups, aggregates, and explains — calling `search_records`, `query_records` and friends as needed. |
| Hibernate listeners | Listeners are code, compiled into a module, and run inside the saving transaction. Workflows are data — declarative, overridable, editable in Studio — and run after the transaction commits. |
| I want to…​                                       | Split            | Join                                         |
| JPA entity                         | A compiled Java entity. Choose it when you need real database columns and constraints, Java code against the model, or a distributable module. Requires a build, so iteration is slower. |
| Job scheduling      | Scheduled jobs run on a calendar. A workflow `timer` trigger runs **per record**, when that record’s own condition becomes true.                                                              |
| Key            | Meaning                                                                                                                                                      |
| Key Name                                 | Description                                     |
| Kind                               | When to use it                                                                                                                                                                           |
| Kind             | Typical use                                                   | Reference        |
| Logic that lives in an action and needs no form                                        | An ACTION tool  |
| Menus                                                                | Menus                          |
| Message start event                                                                     | `<start message="…​">`                                           | close to `correlateStartMessage`, and different in the way the rest of this family is: every definition naming the message starts, rather than the first. The message’s key must be the started workflow’s own record id                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| Method                                                      | Description                                                                                             |
| Mode        | Behavior                                                                     |
| Mode     | Use it when                                                                                                                                                                                                                                                                 |
| Name            | Description                                                                     |
| Name            | Description                                                    |
| Name         | Description                                                                               |
| Name        | Description                                                       |
| Name       | Description                                      |
| Name      | Description                                                                                                                                                                                                                                                                                  |
| Name      | Description                                                                             |
| Name     | Description                                |
| Name     | Description        |
| None start event (manual)                                                               | `<start on="manual">`                                            |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| Operator               | Description                        |
| Operator     | Meaning                         |
| Operator  | Description                        |
| Option                                                                       | Description                                                                                                                                                                                              |
| Option                        | Description                                 |
| Option                    | Description                                                        |
| Option                  | Description                                                               |
| Outcome     | Meaning                                                                                                                                                                                                                                                                                                                              |
| Path                  | Node                                                                                                                                                                    |
| Prop                                              | Type              | Description                                                                   |
| Prop         | Type              | Description                                                                      |
| Prop       | Type              | Description                                                                 |
| Property          | Type            | Description                                                                                                                            |
| Property         | Description                                                                                       | Default                                                           |
| Record        | Creates                                                          | Edits                                                                                 |
| Related model | When the "values" carry data of their own — a Category with a manager and a budget is a model, not a selection.                                    |
| Resource                                                             | Documentation                  |
| Run one action you know by name                                           | `ActionExecutor`, or a call from another action | That action only                                                             |
| Saved queries                                                        | Queries                        |
| Selection     | Values are configuration: statuses, priorities, categories. The record stores a simple string; colors, icons and ordering come from the selection. |
| Selections                                                           | Selections                     |
| Setting                  | Description                                                                                                                                                                                                      | Default |
| Setting     | Description                                                                                                                      |
| Skills        | Enabled — a skill does nothing until an agent links it           | Any skill but its own; the card names the agents that use it                          |
| Standard | You need a relationship-aware exchange. The export includes the main source and any selected related sources; one-to-many children get their own source, and many-to-many values are listed in a column of their owner. This is the appropriate mode for a full round trip. |
| Status       | Meaning                                                                                                                                                                         |
| Step                                                | What runs                                                                                                                                                                                             |
| Style     | Description                             |
| The AI assistant    | Not an alternative — a faster way to drive Studio. Describe what you want in chat; the assistant creates the same resources and the designers remain your review surface.                                                                  |
| The change                                                                             | Use             |
| Timer start event                                                                       | `<start on="timer" …​>`                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
| Tool                | Safety     | Does                                                                                                                                                                                                                                                                                             |
| Tools         | SCRIPT, HTTP, ACTION or SYSTEM, disabled and asking for approval | Any of those types but its own; the card warns when what an enabled tool runs changes |
| Type           | Display Name | Description                                                             |
| Views — form, grid, cards, kanban, calendar, tree, dashboard, custom | Views                          |
| Workflows                                                            | Workflow designer              |
| Writing a module    | Code — reviewable, testable, and required when you need Java business logic or integrations. Studio covers the declarative layer with a much faster loop, and can graduate: compiled entities and WAR export bridge into module territory. |
| You want to…                                                              | Use                                             | Runs the form’s logic?                                                       |
| `!=`         | not equal to                    |
| `$em`       | the `EntityManager` if script is `transactional`                  |
| `$json`     | instance of `MetaJsonRecordRepository` to work with custom models |
| `$request`  | the `ActionRequest`                                               |
| `$response` | the `ActionResponse`                                              |
| `--base-dir=<path>`                                                          | The Tomcat base directory.                                                                                                                                                                               |
| `--cache-max-size=<n>`                                                       | Set the maximum cache size for resources.                                                                                                                                                                |
| `--context-path=<path>`                                                      | The webapp context path.                                                                                                                                                                                 |
| `--max-threads=<n>`                                                          | Set the maximum number of worker threads.                                                                                                                                                                |
| `--pluggability-scan-jars=<pluggabilityScanJars>[,<pluggabilityScanJars>…​]` | Comma-separated jar name patterns (e.g. `axelor-*.jar`) to include when scanning for Servlet 3.0 pluggability (``META-INF/web-fragment.xm`l and `@WebServlet``/`@WebFilter`/`@WebListener` annotations). |
| `--port=<port>`                                                              | The Tomcat port number. Defaults to `8080`.                                                                                                                                                              |
| `--proxy-url=<url>`                                                          | Set proxy URL if running behind a reverse proxy.                                                                                                                                                         |
| `--tld-scan-jars=<tldScanJars>[,<tldScanJars>…​]`                            | Comma-separated jar name patterns (e.g. `jstl-**.jar,taglibs-**.jar`) to include when scanning for JSP taglib descriptors (`META-INF/***/**.tld`).                                                       |
| `-i, --iteration=<iteration>` | Specify the number of hash iterations used. |
| `-m, --mapping=<mapping>` | Spec
| `-m, --module=<module>` | Specify the module to update. Can be repeated to update multiple modules. |
| `-t, --tenant=<tenant>`   | Specify the tenant id.                                             |
| `<=`         | less or equal to                |
| `<`          | less than                       |
| `<field>`        | field definitions for the dataset (optional, can be multiple) |
| `<from>`    | **Required.** The source model and its alias             |
| `<groupBy>` | Group-by expressions                                     |
| `<having>`  | Conditions on grouped results                            |
| `<join>`    | Explicit relation joins or cross joins                   |
| `<limit>`   | Maximum number of results                                |
| `<meta>`    | Column, parameter and query-total metadata declarations  |
| `<offset>`  | Number of results to skip                                |
| `<orderBy>` | Sort order                                               |
| `<select>`  | Fields or expressions to return (omit for entity result) |
| `<where>`   | Filter conditions                                        |
| `=`          | equal to                        |
| `>=`         | greater or equal to             |
| `>`          | greater than                    |
| `C-001` | Laptop | `promo&#124;clearance` |
| `FormStep.add(collection)`, `add(collection, seed)` | A new line: the line model’s defaults, its `onNew` in the line’s context, then the seed, without its `onChange`. `add("items[-1].taxes")` adds a line to a line.                                      |
| `FormStep.click(button)`, `click(node, button)`     | The button’s `prompt`, if any (a question), then its `onClick` chain, in the node
| `FormStep.remove(line)`                             | The line out of its collection; the collection’s `onChange` runs at once.                                                                                                                             |
| `FormStep.set(values)`, `set(key, value)`           | Each value is written into its node, then that field’s `onChange` runs in the node’s context. A many-to-many takes a list of references.                                                              |
| `OVERWRITE` | Re-apply files, overwriting existing records (**Reload built-in defaults**). |
| `SEED_ONCE` | Create missing records; leave existing ones untouched (startup).             |
| `_t`      | translation function                                                                                                                                                                                                                                                                         |
| `actionLabel`                                      | The approval card’s button verb (falls back to **Allow**) — see Approval & safety.                                                                      |
| `actionName`, `actionModel`                        | The Axelor action to run and its model, for `ACTION` tools.                                                                                             |
| `action`       | Required. An action-view: it gives the model, the form and the context the form expects.                                                                     |
| `active`                   | Off: the policy is kept but applies to nobody.                                                                                       |
| `active`    | no       | defaults to `true`                                                                                                                                                                                 |
| `adapter`  | type adapter, followed by an optional string argument separated by `&#124;` character |
| `agent`   | after an `agent` node: `text` (raw answer), `result` (JSON-parsed answer when possible)                                                                                                                                                                                                      |
| `alias`    | if node is relative xpath, a simple name to be used in context                   |
| `all`       | whether to return all values (default false)                     |
| `allowNoEntry`   | Whether to allow generating changelog without entries                                             | false                                                             |
| `and`        | `AND` nested criteria list      |
| `apiKey`                  | Secret credential (stored encrypted).                                                                         |
| `asMap()`                                                   | Returns a thread-safe `ConcurrentMap` view of the cache, where modifications directly affect the cache. |
| `as`        | Alias for the model (auto-generated if omitted)                          |
| `as`      | Column alias in the result                         |
| `attached`    | whether to attach the panel with previous one                                         |
| `attachment` | boolean, whether to attach the generated report to current object                         |
| `background` | name of the background color style |
| `baseUrl`                 | Override the vendor endpoint — required for `OLLAMA`/`CUSTOM`, optional otherwise.                            |
| `between`              | Range with `low`/`high` or `param` |
| `between`    | search in range                 |
| `boolean`      | Boolean      | For fields fields                                                       |
| `button`       | Button       | A virtual field to create a button widget (with `onClick` action)       |
| `cacheable` | whether the select query used is cacheable                       |
| `call`            | call a method on the transformed object before saving it to database                                                                                           |
| `canArchive`   | whether to allow archiving/unarchiving records                                                            |
| `canArchive` | whether to allow archiving/unarchiving record (JavaScript expression)                                  |
| `canAttach`  | whether to allow attaching files to record (JavaScript expression)                                     |
| `canCollapse` | specify whether the panel is collapsible                                              |
| `canCopy`    | whether to allow copying record (JavaScript expression)                                                |
| `canDelete`    | whether to allow deleting records                                                                         |
| `canDelete`  | whether to allow deleting record (JavaScript expression)                                               |
| `canEdit`      | whether to allow editing records                                                                          |
| `canEdit`    | whether to allow editing record (JavaScript expression)                                                |
| `canMove`      | whether to allow re-ordering of rows with drag & drop                                                     |
| `canNew`       | whether to allow creating new records                                                                     |
| `canNew`     | whether to allow creating new record (JavaScript expression)                                           |
| `canSave`      | whether to allow saving records                                                                           |
| `canSave`    | whether to allow saving record (JavaScript expression)                                                 |
| `cardWidth` | specify the widget of a card (default 33.33%) |
| `children` | `ReactNode`       | `DataDashlet` components                                                    |
| `chunkSize`, `chunkOverlap`   | How source text is split into indexable chunks.                                       |
| `client`    | client class name                                                                                                                |
| `code`                                                          | Unique identifier — the agent’s identity on re-seed and in the frontmatter.                                                                                                               |
| `code`  | `name` | `tags.code`       |
| `code`, `name`                                     | Unique identifier (referenced by agents) and display name.                                                                                              |
| `code`, `name`            | Unique identifier and display name.                                                                           |
| `code`, `name` | Unique identifier (referenced by agents and by `use_skill`) and display name.                                                                                       |
| `code`, `name`, `description` | Identifier, display name and purpose.                                                 |
| `colSpan`     | number of columns taken by the widget                                                 |
| `colSpan`    | `number`          | Grid column span (1-12, default: full width)                                     |
| `collapseIf`  | specify a boolean expression to collapse/expend this panel                            |
| `colorBy`     | name of the field to be used to colorize the events (colors are used consistently according to the field and there is a maximum of 30 different colors) |
| `color`      | name of the text color style       |
| `columns`         | `DataColumn[]`  | Column metadata, including declared format and aggregate                                                                               |
| `complete`  | approved; the run resumes through the node’s `next`                                                                                                                                                                                                                                                                                  |
| `completed`  | ran out of graph at an `end`                                                                                                                                                    |
| `completeness`    | `string`        | `complete`, `page`, `truncated` or `unknown` (see data queries)                                                                        |
| `condition` | nobody decided — with `autoComplete` set, the node’s own `when` was already true, or became true while the task was pending; the run resumes through `next` the same as `complete`, see Gating approval on a condition                                                                                                               |
| `content`                                               | The raw text, for text sources.                                                                                                                               |
| `context` | context of the action         |
| `create`   | `false` in order to prevent creation if an existing record is not found          |
| `criteria`     | list of criteria (for `OR`, `AND` or `NOT` operator only) |
| `css`         | custom CSS class to apply                                       |
| `customSearch` | whether advanced custom search is enabled                                                                 |
| `data.export.fetch-size` | Number of records fetched per export batch. Tune this for large exports without exceeding database limits.                                                                                                       | `500`   |
| `data.export.max-size`   | Maximum number of main records in one export. Use `-1` for no export cap. An export of the main records stops at the cap; related data that exceeds it fails the export with "Related data too large to export." | `-1`    |
| `data.import.max-size`   | Maximum advanced-import file size, in KB. Leave unset to disable this additional server-side limit.                                                                                                              |         |
| `data`              
| `date`         | Date         | For date fields                                                         |
| `datetime`     | DateTime     | For datetime fields                                                     |
| `dayLength`   | working hours per day (default is 8)                                                                                                                    |
| `decimal`      | Decimal      | For decimal fields                                                      |
| `defaultContent` | The content of the generated changelog if there is no entries (for example, `No notable changes`) |                                                                   |
| `defaultValue`  | default value for the field                                                     |
| `default` | do not highlight                        |
| `description`                                      | What the tool does — this is what the model reads to decide when to call it. Write it for the model. (SYSTEM tools supply their description from code.) |
| `description`  | The always-visible routing summary — write it to say **when** to load the skill.                                                                                    |
| `description`  | What it does, for the agent.                                                                                                                                 |
| `description` | no       | free documentation                                            |
| `distinct` | When `true`, eliminates duplicate rows                        |
| `domain`        | the domain filter for relational fields                                         |
| `domain`    | domain filter to restrict node data                       |
| `draggable` | whether the node is draggable                             |
| `edit-icon`    | whether to show edit icon in first column (default true)                                                  |
| `editable`     | whether the grid is inline editable                                                                       |
| `editable`   | whether the form is editable                                                                           |
| `embeddingModel`              | The `EMBEDDING` `AiModel` used to vectorize content and queries.                      |
| `enumType`      | fully qualified name of the enum if it’s an enum type field                     |
| `enum`         | Enum         | For enum fields                                                         |
| `eq`      | Equal (`=`)                        |
| `error`   | on the path an `error` boundary catches: `message` and `code` (null when the failure had no name)                                                                                                                                                                                            |
| `error` | exception that caused login failure |
| `estimatedSize()`                                           | Provides an approximate count of cache entries, accounting for concurrent and pending updates.          |
| `eval`     | groovy expression, to transform the value                                        |
| `eventLength` | if eventStop is not given, the length of an event in hour (default is 1)                                                                                |
| `eventStart`  | name of the field of type date/datetime to be used as event start time                                                                                  |
| `eventStop`   | name of the field of type date/datetime to be used as event stop time                                                                                   |
| `event`   | the trigger snapshot: `event.self` / `event.old`; first walk only                                                                                                                                                                                                                            |
| `failed`     | a node raised an error (recor
| `fieldName`    | name of the field to check                                |
| `field`   | A field path (e.g. `c.fullName` or `c.title.name`) |
| `file`            | the source input file name                                                                                                                                     |
| `file`    | the source input file name |
| `filter`    | provide custom filter expression (jpql where clause)             |
| `flush`     | whether the query flush mode is auto (default true)              |
| `fn`      | A function to apply (see Functions)                |
| `formView`      | if it’s a relational field, the form view to use for popup editor               |
| `format`     | output format: `pdf` (default), `docx`, `xlsx`, `doc`, `xsl`, `odt`, `ods`, `html`        |
| `freeSearch`   | specify the free-search mode: 'all' (default), 'none', or comma-separated list of field names             |
| `gap`      | `number &#124; string` | Gap between dashlets (default: `"1rem"`)                                    |
| `get(key)`    `get(key, mappingFunction)`    `getAll(keys)` | Retrieves or computes the values associated with the keys.                                              |
| `getLock(key)`                                              | Offers a key-specific reentrant lock for managing concurrent access to cache entries.                   |
| `global`                   | Applies to every user; the lists below are cleared.                                                                                  |
| `gridView`      | if it’s a relational field, the grid view to use for list widget and selector   |
| `groupBy`      | comma-separated list of field names to group the records                                                  |
| `gt`      | Greater than (`>`)                 |
| `gte`     | Greater than or equal (`>=`)       |
| `header`         | Header value when generating changelog for the current version                                    | "${version.get()} (${new Date().format("yyyy-MM-dd")})"           |
| `height`     | `number &#124; string` | Fixed height for the dashlet                                                     |
| `help`          | short help                                                                      |
| `help`        | help text displayed on mouse hover                                                    |
| `hidden`        | whether to hide the field by default\`                                          |
| `hidden`      | whether to hide the widget                                                            |
| `hideIf`        | conditional js expression to show/hide the field                                |
| `hideIf`      | boolean expression to hide the panel                                                  |
| `httpUrl`, `httpMethod`, `httpHeaders`, `httpBody` | Request definition, for `HTTP` tools.                                                                                                                   |
| `icon`        | name of the icon to show                                        |
| `icon`      | icon displayed on login page                                                                                   
| `id`           | if overriding some existing one, provide a unique id to identify this one                                 |
| `id`          | yes      | unique within the workflow; the target of `next` edges        |
| `id`         | If overriding some existing one, provide a unique id to identify this one.                             |
| `id`        | no       | the stable identity that runs, tasks and state bind to — set it on anything you ship, and do not change it once the workflow is deployed. It also disambiguates module overrides, as for views     |
| `if-empty` | only update the target value if target field is empty (or null)                  |
| `if-feature` | name of a feature and only apply this extension if this feature is enabled *(optional)*                                          |
| `if-module`   | use the widget if the given module is installed                                       |
| `if-module`  | name of a module and only apply this extension if this module is installed *(optional)*                                          |
| `if`       | boolean groovy expression, only bind if condition passed                         |
| `in` / `notIn`         | Value list or parameter            |
| `includeIf`     | server expression to check whether to use this field                            |
| `increment` | the increment step for the numeric part (default 1)              |
| `initial`   | the initial value of the numeric part (default 1)                |
| `inputPath`      | Path of the unreleased entries                                                                    | changelogs/unreleased/                                            |
| `inputSchema`                                      | JSON Schema for the arguments the model must produce.                                                                                                   |
| `inputTokens`, `outputTokens`, `cacheReadTokens`, `cacheWriteTokens` | Token accounting, the same for every provider: `inputTokens` is every prompt token, cached or not, of whic
| `inspect_ai_config` | Read-only  | Lists agents, skills with their procedures, tools, knowledge bases and chat models, with which agents use each. Reads one record in full; an agent’s adds the tool calls refused in its recent chats. Never shows a secret’s value, nor a credential written into a tool’s URL, headers or body. |
| `inspect_process`   | Read-only  | Digests how a model’s forms work, or checks a skill’s procedures against them. See Procedures.                                                                                                                                                                                                   |
| `instructions` | The full guidance, authored in markdown, returned when the skill is loaded.                                                                                         |
| `integer`      | Integer      | For integer fields                                                      |
| `invalidate(key)`    `invalidateAll()`                      | Discards cached entries.                                                                                |
| `isEnabled`                   | Activation.                                                                           |
| `isEnabled`    | Activation.                                                                                                                                                         |
| `isEnabled`, `isInternal` | Activation, and whether the provider is hidden as a built-in.                                                 |
| `isGlobal`                    | Whether every agent may search it (otherwise only agents that list it).               |
| `isNull`     | search for null values          |
| `isNull` / `isNotNull` | Null checks                        |
| `itemSpan`    | default span for child items                                                          |
| `items[#42]`          | The line of `items` with id 42.                                                                                                                                         |
| `items[-1].taxes[#7]` | A line of a line, to any depth.                                                                                                                                         |
| `items[-1]`           | The first line added in the session, `items[-2]` the second: new lines get negative ids, as in the browser. The path keeps naming the line after a save gives it an id. |
| `items[0]`            | The first line of `items` as it stands when the step runs.                                                                                                              |
| `jsonModel` | no       | the custom model name; when set, `model` is `com.axelor.meta.db.MetaJsonRecord`                                                                                                                    |
| `like`       | search for values like          |
| `like`    | Pattern match (`LIKE`)             |
| `limit`              | pagination limit per column                                                                               |
| `limit`      | `number`          | Page size for server-side pagination                                             |
| `loading`         | `boolean`       | `true` during the initial fetch                                                                                                        |
| `log`     | logger: `log.info(…​)`, `log.debug(…​)`, `log.warn(…​)`, `log.error(…​)`                                                                                                                                                                                                                     |
| `lt`      | Less than (`<`)                    |
| `lte`     | Less than or equal (`<=`)          |
| `many-to-many` | ManyToMany   | For ManyToMany relationship                                             |
| `many-to-one`  | ManyToOne    | For ManyToOne relationship                                              |
| `maxResults`, `minScore`      | Retrieval limits — how many passages to return and the minimum similarity to include. |
| `maxSize`       | maximum size of value                                                           |
| `mcpServer`, `mcpToolName`                         | The MCP server the tool came from and its name on that server, for `MCP` tools. Both are set by synchronization — see MCP servers.                      |
| `message` | when a message or a signal woke this run: `name`, `key`, `data` (what the sender’s `<payload>` evaluated to, an empty object when it sent none) and `sentAt`. `null` whenever something else started the walk                                                                                |
| `metaFile`                                              | The uploaded file, for document sources.                                                                                                                      |
| `metaForm` | Form view to use for this model                  |
| `metaGrid` | Frid view to use for this model                  |
| `metaMenu` | Menu to use for this model                       |
| `minSize`       | minimum size of value                                                           |
| `mode`               | view mode, between `year`, `month`, `week`, or `day` (default to `month`)      |
| `mode`        | default view mode (month, week or day)                                                                                                                  |
| `modelCode`, `providerCode`                                          | Which model and provider were used.                                                                                                                                                                                                                                                                              |
| `modelField`    | the name of the json field on which this custom field is defined (e.g. `attrs`) |
| `model`                                                         | The chat `AiModel` (by code, e.g. `openai/gpt-6.1-sol`) that runs the conversation.                                                                                                       |
| `model`              | fully qualified name of the domain model                                       |
| `model`         | fully qualified name of the model for which the field is defined                |
| `model`       | fully qualified name of the domain model                                                                                                                |
| `model`     | yes      | fully qualified name of the bound model                                                                                                                                                            |
| `model`, `filter`, `fields`, `template`                 | For record sources: the model to index, an optional filter, the fields the template reads, and a template that renders each record to text from those fields. |
| `models`                  | The `AiModel` entries this provider offers.                                                                   |
| `nameField`     | whether to use this field as name field                                         |
| `name`                                                          | Display name, shown in the chat launcher’s agent selector.                                                                                                                                |
| `name`               | name of the Gantt view                                                         |
| `name`          | name of the custom field (required)                                             |
| `name`        | name of the panel                                                                     |
| `name`      | yes      | workflow name; identity is the natural `(model, jsonModel, name)` key — so custom-model workflows (which all share `model =   com.axelor.meta.db.MetaJsonRecord`) are distinguished by `jsonModel` |
| `name`     | Name of the custom model                         |
| `name`     | Unique name for the query (required when stored as MetaQuery) |
| `name`    | name of the action            |
| `name`    | name of the attribute to change |
| `name`, `description`      | Identify the policy and say why its limits exist.                                                                                    |
| `ne`      | Not equal (`<>`)                   |
| `new`          | `true` for a procedure that creates a record: it starts from the form’s `onNew` and takes no id.   
| `node`     | xpath expression to locate the node                                              |
| `notBetween` | search not in range             |
| `notLike`    | search for values not like      |
| `notLike` | Negated pattern match (`NOT LIKE`) |
| `notNull`    | search for non-null values      |
| `not`        | negate the nested criteria list |
| `offset`, `limit` | `number`        | The window the server applied                                                                                                          |
| `old`     | the record’s fields before the save that triggered the run (update trigger); first walk only. Unlike in a trigger’s `when`, it is always available                                                                                                                                           |
| `onChange`      | actions to call when field changes                                              |
| `onChange`    | action to call when event is changed (with drag or resize)                                                                                              |
| `onClick`       | actions to call when field is clicked (button)                                  |
| `onClick`   | action to execute when double-click on a node             |
| `onCopy`     | action call when record is copied                                                                      |
| `onDelete`           | action to call when deleting a card                                                                       |
| `onDelete`     | action to call when deleting selected records                                                             |
| `onDelete`    | action to call when deleting an event                                                                                                                   |
| `onDelete`   | action to call when deleting record                                                                    |
| `onDelete`  | action to call when deleting a card           |
| `onFilter`        | `function`      | Opens the filter dialog for dashlet-specific params (only when the query has filterable params not covered by shared dashboard params) |
| `onLoad`     | action call when record is loaded                                                                      |
| `onLoad`   | Action to call when loading record of this model |
| `onMove`             | action to call when moving a kanban card                                                                  |
| `onMove`    | action to call when moving a node                         |
| `onNew`              | a field to use when creating record on the fly                                                            |
| `onNew`      | action to call on creating new record                                                                  |
| `onNew`    | Action to call when creating new record          |
| `onSave`       | action to call on saving form in editable grid                                                            |
| `onSave`     | action to call on saving this form                                                                     |
| `onTabSelect` | an action to execute when the panel tab is selected (if it’s top-level in panel-tabs) |
| `one-to-many`  | OneToMany    | It’s actually same as ManyToMany relationship but uses OneToMany widget |
| `or`         | `OR` nested criteria list       |
| `orderBy`      | comma-separated list of field names to sort the records                                                   |
| `orderBy`   | a field to use to order cards                 |
| `orderBy`   | comma-separated list of field name to order the node data |
| `orderBy`   | name of the field to order the result                            |
| `output`         | Path to the changelog file                                                                        | CHANGELOG.md                                                      |
| `padding`   | the padding width of the numeric part of the sequence (optional) |
| `panel`        | Panel        | A virtual field to create a new panel widget for subsequent fields      |
| `paramMap`   | `object`          | Maps query param names to shared param names (e.g., `{ startDate: "fromDate" }`) |
| `param`   | A runtime parameter name                           |
| `parameters`      | `object[]`      | The parameter values the query ran with                                                                                                |
| `params`     | `object`          | Query parameters to pass                                                         |
| `params`   | `object`          | Shared filter config: `{ query: "queryName", names: ["param1", "param2"] }` |
| `parent`    | name of the parent field                                  |
| `parent`  | read-only view of the record of whatever invoked the graph you are in, and its variables: the calling run inside a `call`, the run itself inside a `subflow`. It chains, so inside a subflow of a **called** workflow `parent` is that workflow’s record and `parent.parent` is the caller’s |
| `position` | position where to insert these elements, relative to the target element: `before`, `after`, or `inside` |
| `position` | position where to move this source element, relative to the target element: `before`, `after`, or `inside` |
| `precision`     | precision for decimal type fields                                               |
| `prefix`    | the prefix string (optional)                                     |
| `prepare-context` | call a method to prepare context before transforming the csv row                                                                                               |
| `primary` | highlight style to show some importance |
| `priority`  | no       | picks the winner among active definitions with the same `(model, jsonModel, name)`; defaults to `20`                                                                                               |
| `procedures`   | The procedures an agent linked to the skill can run with `run_procedure`, as the skill’s `procedures.yaml` holds them. The model sees them once it loads the skill. |
| `prompt`      | text to show if confirmation is required when button is clicked |
| `put(key, value)`    `putAll(map)`                          | Associates values with the keys.                                                                        |
| `rateLimit`                | Requests/second cap.                                                                                                                 |
| `rawRecords`      | `object[]`      | The same rows with stored values                                                                                                       |
| `readonlyIf`    | conditional js expression to make field readonly                                |
| `readonlyIf`  | boolean expression to mark the panel readonly                                         |
| `readonlyIf` | boolean expression to make form readonly                                                               |
| `readonly`      | whether the field is readonly                                                   |
| `readonly`    | whether the widget should be considered readonly                                      |
| `records`         | `object[]`      | Result rows, with a selection column’s values replaced by their titles                                                                 |
| `references`   | `AiSkillReference` documents (`name`, `title`, `content`) the model can load individually.                                                                          |
| `refresh-app` | refresh browser tab (send null data)                    |
| `refresh-tab` | refresh current tab in the application (send null data) |
| `refresh`         | `function`      | Re-fetch the data                                                                                                                      |
| `regex`         | regular expression to validate field value                                      |
| `reject`    | refused (comment requirement set by `comment`, refused entirely if `allowReject="false"`); the run also resumes through `next` — route on it with a downstream `split` on `task.rejected`                                                                                                                                            |
| `request`  | request object      |
| `requiredIf`    | conditional js expression to make field required                                |
| `required`      | whether the field is required                                                   |
| `requiresApproval`                                 | Whether a `WRITE` tool asks the user to confirm before running — see Approval & safety.                                                                 |
| `response` | response object     |
| `result`  | object returned by the action |
| `roles`    | Roles who have permission to see these models    |
| `roles`, `groups`, `users` | Who the policy applies to — a user matches through any of their roles (directly or through their group), their group, or themselves. |
| `root`    | the root element name      |
| `running`    | the walk is in flight                                                                                                                                                           |
| `save_agent`        | Asks first | Creates or updates an agent from the fields of an agent file’s frontmatter. Its answer names the links the agent’s words lead it to but its permissions leave unreadable.                                                                                                                        |
| `save_skill`        | Asks first | Creates or updates a skill: instructions, references and procedures, which are checked against the form
| `scale`         | scale for decimal type fields                                                   |
| `script`                                           | JavaScript body, for `SCRIPT` tools.                                                                                                                    |
| `search-call`     | call a method to return a bean. Used to search a bean in case of complex searching. `search` JPQL expression will be ignored in favor of `search-call` method. |
| `search`          | JPQL where clause search for existing record                                                                                                                   |
| `search`   | jpql where clause search for existing record                                     |
| `secrets`                                          | Secret values (e.g. API keys) referenced from HTTP definitions; stored encrypted.                                                                       |
| `selection`     | name of selection list if the field is selection field                          |
| `self`    | the record (fields readable and, in scripts, writable)                                                                                                                                                                                                                                       |
| `separator`       | the separator character (default is comma `,`)                                                                                                                 |
| `separator`    | Separator    | A virtual widget to create separator widget                             |
| `sequence`      | ordering in auto generated view                                                 |
| `sequence`  | no       | execution order when several workflows of the same model fire on one event, lowest first; defaults to `0`                                                                                          |
| `setOffset`       | `function`      | Change the pagination offset                                                                                                           |
| `showFrame`   | whether to show frame around the panel                                                |
| `showIf`        | conditional js expression to show/hide the field                                |
| `showIf`      | boolean expression to show the panel                                                  |
| `showTitle`   | whether to show the panel title                                                       |
| `sidebar`     | whether to show this panel in sidebar                                                 |
| `sortOrder`                                                     | Ordering in the agent grid and the launcher’s selector, lowest first, then by name.                                                                                                       |
| `sortOrder`               | Ordering among providers in the chat model picker (providers group first, by this field, then by name).       |
| `source`   | XPath expression to select the source element of the `move` operation                                      |
| `source`   | source of the event |
| `sources`                     | The `AiKnowledgeSource` entries feeding the index.                                    |
| `stacked`     | whether the stack panel items                                                         |
| `status`, `chunkCount`, `lastIndexedAt`, `errorMessage` | Indexing state and diagnostics.                                                                                                                               |
| `string`       | String       | For string fields                                                       |
| `strong`     | whether to show text in bold fonts |
| `styles`  | comma-separated list of styles to apply: `fill` (default), `outline`, `stripe`, `strike`, `fade` |
| `suffix`    | the suffix string (optional)                                     |
| `summary`         | `object[]`      | Query-scope totals the query declares under `<summary>`                                                                                |
| `syncRules`               | Model sync rules as JSON — see Sync models from the provider. Blank disables syncing.                         |
| `systemPrompt`                                                  | The instructions that define the agent, authored in markdown.                                                                                                                             |
| `systemTool`                                       | The built-in tool key, for `SYSTEM` tools.                                                                                                              |
| `targetModel`   | if it’s a relational field, the fully qualified name of the target model        |
| `target`     | XPath expression to select the target element of the extension operation (extend operation is performed on the first match only) |
| `taskDuration`       | name of the duration field                                                     |
| `taskEnd`            | name of the field of type date/datetime to be used as end time                 |
| `taskParent`         | name of the parent field                                                       |
| `taskProgress`       | name of the progress field                                                     |
| `taskSequence`       | name of a field to order tasks in sequence                                     |
| `taskStart`          | name of the field of type date/datetime to be used as start time               |
| `taskUser`           | name of the user field related to task                                         |
| `task`    | after a `task` node: `outcome`, `completed`, `rejected`, `timedOut`, `comment`, `completedBy`, `visit`                                                                                                                                                                                       |
| `terminated` | stopped by an `<end terminate="true"/>` — the other paths were cancelled and their approvals withdrawn                                                                          |
| `time`         | Time         | For time fields                                                         |
| `timestamp`                                                          | When the call happened.                                                                                                                                                                                                                                                                                          |
| `title`              | title of the Gantt view                                                        |
| `title`         | the display title                                                               |
| `title`        | Required. What the approval card asks, and how the agent refers to it.                                                                                       |
| `title`       | no       | human-readable label (shown in the designer and in approvals) |
| `title`       | title text for the button                                       |
| `title`     | title displayed on login page                                                                                                    |
| `title`    | Display name of the custom model                 |
| `title`    | column title            |
| `title`    | title to be shown as column header, calculated if not provided |
| `to`       | the target model field name                                                      |
| `tokenQuotaMonthly`        | Maximum tokens per month asked in the chat panel.                                                                                    |
| `token` | authentication token                |
| `tools`, `skills`, `knowledgeBases`, `subAgents`                | What the agent may use — see Grant capabilities.                                     
| `total`           | `number &#124; null` | Counted rows, or `null` when no count ran                                                                                              |
| `type`                                                  | The kind of source: `DOCUMENT` (an uploaded file), `RECORD` (ERP records), or `TEXT` (free text, e.g. a seed’s `content.md`).                                 |
| `type`                                             | `SYSTEM`, `CLIENT`, `SCRIPT`, `HTTP`, `ACTION` or `MCP` — see Tool types.                                                                               |
| `type`                    | `OPENAI`, `ANTHROPIC`, `GOOGLE`, `MISTRAL` or `OLLAMA`. `CUSTOM` serves model sync only — see the note below. |
| `type`            | the target model name                                                                                                                                          |
| `type`          | field type, see bellow for supported types                                      |
| `type`      | Set to `json` for JSON (custom) models                                   |
| `type`      | `inner` or `left` (default is inner)                        |
| `type`      | `inner` or `left` (default is inner)     |
| `types`          | List of types                                                                                     | \["Feature", "Change", "Deprecate", "Remove", "Fix", "Security"\] |
| `update`          | `true` to only allow updating (if an existing record is not found, it will not be created)                                                                     |
| `update`   | `true` in order to allow updating an existing record                             |
| `user`  | authenticated user                  |
| `utilityModel`                                                  | Optional cheaper model for background work (titles, summaries, session notes).                                                                                                            |
| `value2`       | second value for bounding check (for between, notBetween) |
| `valueExpr`     | simple js expression to compute value                                           |
| `value`        | value to match                                            |
| `value`   | A literal value                                    |
| `value`   | new value of the attribute      |
| `vars`    | the run’s variables — set by earlier nodes, and kept across a pause so a value set before an approval is still there after it                                                                                                                                                                |
| `version`        | Current version                                                                                   | current project version                                           |
| `view.collaboration.amqp.address`        | AMQP 1.0 address for view collaboration         |
| `view.collaboration.amqp.password`       | AMQP 1.0 broker password for view collaboration |
| `view.collaboration.amqp.source-address` | AMQP 1.0 source address for view collaboration  |
| `view.collaboration.amqp.target-address` | AMQP 1.0 target address for view collaboration  |
| `view.collaboration.amqp.url`            | AMQP 1.0 broker URL for view collaboration      |
| `view.collaboration.amqp.username`       | AMQP 1.0 broker username for view collaboration |
| `view`         | `form`, the only view type for now. Omit it.                                                                                                                 |
| `visibleInGrid` | whether the field should be visible in grid view                                |
| `visit`   | which pass over the current node the walk is on, so a loop can count without a field (see Bounding a loop that comes back to a park)                                                                                                                                                         |
| `waiting`    | parked on a `task` or `wait` node, at a `call` waiting for the workflow it called, inside a `subflow` whose body has stopped, or held there by a live escape branch (see below) |
| `warning` | highlight style to show warni
| `widget`        | alternative widget to use                                                       |
| `widget`       | name of the widget to be used in the grid: `expandable`/`tree-grid`                                       |
| `width`      | The preferred width style of the view: `mini`, `mid`, `large` or `*` (occupy all the available width). |
| `x-collapse-columns` | comma-separated list of column names that should be collapsed by default (reference fields not supported) |
| `x-finish-to-finish` | name of the M2M field containing tasks to finish before finishing current task |
| `x-finish-to-start`  | name of the M2M field containing tasks to finish before starting current task  |
| `x-no-fetch`   | whether to fetch initial records                                                                          |
| `x-selector`   | specify the row selection control: `checkbox` (default) to show checkbox selection, `none` to disable it. |
| `x-start-to-finish`  | name of the M2M field containing tasks to start before finishing current task  |
| `x-start-to-start`   | name of the M2M field containing tasks to start before starting current task   |
| action          | the action to be executed on menu item click                   |
| binary       | Binary type field                        |
| boolean      | Boolean type field                       |
| cancelled   | a cancelling `<boundary>` took the park, the branch holding the task lost a race or was stopped by a terminate end (see Branching and Joining), an admin abandoned the task, or the record it was about was deleted; the run does not resume through `next`. A non-cancelling boundary (`cancel="false"`) leaves the task untouched. |
| carry on once enough of them are done             | `mode="all"`     | `wait="quorum" quorum="N"`                   |
| close the current view tab           | Ctrl+Q        | ⌘Сmd+Q         |
| column        | database column name                                               |
| copy      | if record is found, whether to create a copy of it                                      |
| create new record                    | Ctrl+Insert   | ⌘Сmd+Insert    |
| date         | Date type field (uses LocalDate)         |
| datetime     | DateTime type field (uses LocalDateTime) |
| decimal      | Decimal type field (BigDecimal)          |
| delete current/selected record(s)    | Ctrl+Delete   | ⌘Сmd+Delete    |
| do every one of several steps                     | `mode="all"`     | `wait="all"`                                 |
| do only the steps that apply                      | `mode="some"`    | `wait="all"`                                 |
| duplicate current record             | Ctrl+D        | ⌘Сmd+D         |
| edit selected record                 | Ctrl+E        | ⌘Сmd+E         |
| enum         | Enumeration type field                   |
| focus first or selected item in view | Alt+G         | ⌘Сmd+⌥Opt+G    |
| focus left menu search box           | Ctrl+M        | ⌘Сmd+M         |
| groups          | comma-separated list of user groups who can see this menu item |
| help          | help string (used by UI layer)                                     |
| hidden          | whether to hide this menu                                      |
| hidden        | whether the field is hidden (used by UI layer)                     |
| icon            | display icon name                                              |
| icon     | icon displayed on top-level navigation tab |
| icon-background | icon background color (predefined or html hex color)           |
| integer      | Integer type field                       |
| left            | whether to show this menu on left                              |
| let the first of several finish and drop the rest | `mode="all"`     | `wait="any"`                                 |
| long         | Long type field                          |
| many-to-many | The ManyToMany field                     |
| many-to-one  | The ManyToOne field                      |
| max           | maximum size of dat
| min           | minimum size of data (depends on field type)                       |
| model    | fully qualified name of the model object   |
| name          | name of the field                                                  |
| navigate to next page/record         | Alt+Page Down | ⌥Opt+Page Down |
| navigate to previous page/record     | Alt+Page Up   | ⌥Opt+Page Up   |
| one-to-many  | The OneToMany field                      |
| one-to-one   | The OneToOne field                       |
| order           | menu item display order sequence                               |
| parent          | name of the parent menu item                                   |
| readonly      | whether the field is readonly (used by UI layer)                   |
| ref       | reference to the existing record from context, gets preference over `search`            |
| refresh current view                 | Ctrl+R        | ⌘Сmd+R         |
| required      | whether the field is required                                      |
| save current record                  | Ctrl+S        | ⌘Сmd+S         |
| saveIf    | save if the given expression is true and `id` is `null` or `version` value is provided. |
| search    | search for existing record before creating new                                          |
| search for records                   | Alt+F         | ⌘Сmd+⌥Opt+F    |
| stop the whole run if any branch says no          | any of the above | plus `<end terminate="true"/>` in the branch |
| string       | String type field                        |
| tag             | specify a tag to show on menu item                             |
| tag-count       | specify whether to use count of menu action records as tag     |
| tag-get         | specify a method call to get tag value                         |
| tag-style       | specify the tag display style                                  |
| take one path or another                          | `mode="one"`     | none — the paths simply meet again           |
| time         | Time type field (uses LocalTime)         |
| title         | display name of the field (used by UI layer)                       |
| title    | override the view title                    |
| toggle left menu                     | F9            | F9             |
| top             | whether to show this menu on top                               |
| unique        | whether the field is unique                                        |
}
});
│           └── META-INF
│           ├── axelor-config.properties **(1)**
│       └── resources
│       ├── java
│   └── main
│               └── persistence.xml **(2)**
│       └── gradle-wrapper.properties
│       ├── gradle-wrapper.jar
│   └── wrapper
└── build.gradle **(7)**
└── src
├── gradle **(3)**
├── gradlew **(5)**
├── gradlew.bat **(5)**
├── modules **(4)**
├── settings.gradle **(6)**
