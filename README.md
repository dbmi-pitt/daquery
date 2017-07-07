# Distributed Data Query Application

## Prerequisites
- JDK 1.8 or later
- Maven 3 or later
- MySQL 5.6 or later

If you encounter an error on Tomcat startup: "java.lang.ClassNotFoundException: org.glassfish.jersey.servlet.ServletContainer", check the Eclipse properties
for this project (Properties->Deployment Assembly).  Make sure the listed assembly includes the Maven Dependencies.  If not, click "Add", select "Java Build Path Entries", select "Maven Dependencies", then click "Finish".  