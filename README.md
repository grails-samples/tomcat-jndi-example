# tomcat-jndi-example

This repository shows how to configure a DataSource with JNDI in a Grails 3 app deployed in tomcat.

1. Define resource in _/apache-tomcat-8.5.2.3/conf/context.xml_

https://github.com/grails-samples/tomcat-jndi-example/blob/master/apache-tomcat-8.5.2.3/conf/context.xml#L31

2. **Configure DataSource to use JNDI** - In the Grails 3 application, _app_ configure for production environment to _jndiName_ for _dataSource_ configuration.

https://github.com/grails-samples/tomcat-jndi-example/blob/master/app/grails-app/conf/application.yml#L109

3. **Create DB**. This repository contains a [simple datatabase schema](https://github.com/grails-samples/tomcat-jndi-example/blob/master/sql-schema.txt). 

Create a database with the database name and user / password credentials you defined in the previous resource.  

4. **Generate WAR file**. build your grails app with _./gradlew assemble._

5. Copy your app to tomcat _webapps_

_cp app/build/libs/app-0.1.war apache-tomcat-8.5.2.3/webapp/app-0.1.war_


6. Start tomcat

_apache-tomcat-8.5.2.3/bin/$ ./startup.sh_


Your grails application should [populate the database with three books](https://github.com/grails-samples/tomcat-jndi-example/blob/master/app/grails-app/init/jndi/BootStrap.groovy#L6).


