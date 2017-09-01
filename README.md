# Distributed Data Query Application

## Prerequisites
- JDK 1.7 or later
- Maven 3 or later
- node.js/npm 6

If you encounter an error on Tomcat startup: "java.lang.ClassNotFoundException: org.glassfish.jersey.servlet.ServletContainer", check the Eclipse properties
for this project (Properties->Deployment Assembly).  Make sure the listed assembly includes the Maven Dependencies.  If not, click "Add", select "Java Build Path Entries", select "Maven Dependencies", then click "Finish".

Oracle Database Connection Steps:
NOTE regarding Maven and Oracle:
Unfortunately due the binary license there is no public repository with the Oracle Driver JAR. This happens with many dependencies but is not Maven's fault. 

This post helps: https://stackoverflow.com/questions/1074869/find-oracle-jdbc-driver-in-maven-repository

Step 1: Download the odbc.jar file.  http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-111060-084321.html

Step 2: copy the file (ojdbc6.jar) to a different directory.  Run the maven command from that directory.

Step 3: install on maven: mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.1.0.7.0 -Dpackaging=jar -Dfile=ojdbc6.jar -DgeneratePom=true
NOTE: the -Dfile references the file within the current directory.

Step 4: add the following entry to the pom.xml file:
<dependency>
	<groupId>com.oracle</groupId>
	<artifactId>ojdbc6</artifactId>
	<version>${oraclejdbc.version}</version>
</dependency>





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
