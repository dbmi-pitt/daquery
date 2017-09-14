Pull the daquery-common project to the same location as this project.
Run mvn install in daquery-common.

Pull the daquery repository to the same location as this project.
  
To create a local application database for development purposes
run the standalone Java program edu.pitt.dbmi.daqueryws.test.TestAppSetup.
Make sure to change the "catalina.home" property to the directory where
your Tomcat instance is installed.  Make sure this directory exists and is
writable with a subdirectory of conf/

--build with: mvn install

--deploy target/daquery-1.0-SNAPSHOT.war in Tomcat as daquery.war