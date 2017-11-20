Pull the daquery-common project to the same location as this project.
 - run "mvn install" in daquery-common.

Pull the daquery repository to the same location as this project.
 - follow the instructions in this repository to install node/npm and all needed libraries
 - run "npm run prod"

To create a local application database for development purposes
run the standalone Java program edu.pitt.dbmi.daqueryws.test.TestAppSetup.
Make sure to change the "catalina.home" property to the directory where
your Tomcat instance is installed.  Make sure this directory exists and is
writable with a subdirectory of conf/

Obtain a copy of the Oracle JDBC driver, version 11.1.0.7.0 from the Oracle web site.
Install the Oracle jdbc driver into your local mvn repository with the command:
  mvn install:install-file -Dfile=/path/to/file/ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.1.0.7.0 -Dpackaging=jar


--build daquery-ws with: "mvn install"

--deploy target/daquery-1.0-SNAPSHOT.war in Tomcat as daquery.war