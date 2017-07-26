# Distributed Data Query Application

## Prerequisites
- JDK 1.8 or later
- Maven 3 or later
- node.js/npm 6

If you encounter an error on Tomcat startup: "java.lang.ClassNotFoundException: org.glassfish.jersey.servlet.ServletContainer", check the Eclipse properties
for this project (Properties->Deployment Assembly).  Make sure the listed assembly includes the Maven Dependencies.  If not, click "Add", select "Java Build Path Entries", select "Maven Dependencies", then click "Finish".

To install node/npm follow these steps:
  For Centos/Redhat
   As root:
     curl --silent --location https://rpm.nodesource.com/setup_6.x | bash -
     yum install -y nodejs

     cd to daquery/ui/
     run: npm install -g

To run through node (will run standalone in Tomcat without node via the war produced by mvn install)
  in daquery/ui/ run "npm start", attach to UI with http://locahost:4200

Database Deployment Steps:
1. Open a database connection and run /src/main/resources/database_setup_oracle.sql in the database to create the tables, sequences, etc.
2. Copy src/main/resources/META-INF/persistence.xml.example as src/main/resources/META-INF/persistence.xml
3. Update the database information in persistence.xml:
```
    <property name="javax.persistence.jdbc.url" value="" />
    <property name="javax.persistence.jdbc.user" value="" />
    <property name="javax.persistence.jdbc.password" value="" />
    <property name="javax.persistence.jdbc.driver" value="" />
    <property name="hibernate.dialect" value="" />

```   
