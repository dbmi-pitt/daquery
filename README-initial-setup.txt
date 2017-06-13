--Set up a mysql database to use:
 Replace dbasename/password/myuser in the script below to create a database and user
   create database dbasename;
   create user myuser identified by 'password';
   grant all privileges on dbasename.* to myuser;

--connect to (use) the newly created database in mysql and run sql/db.sql to create a database

--update the url, username, password in src/main/resources/application.properties to match the database that was just created

--build with: mvn install

--deploy target/daquery-1.0-SNAPSHOT.war in Tomcat as daquery.war