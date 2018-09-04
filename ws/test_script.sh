/opt/apache-tomcat-6.0.53/bin/shutdown.sh
mvn -B -DskipTests clean install
./clean.sh
cp target/daquery.war /opt/apache-tomcat-6.0.53/webapps/
rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-db
mvn -Dtest=edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite test
/opt/apache-tomcat-6.0.53/bin/startup.sh &
sleep 20
mvn -e -Dtest=edu.pitt.dbmi.daqueryws.test.rest.NetworkTest test
mvn -e -Dtest=edu.pitt.dbmi.daqueryws.test.rest.SiteTest test
mvn -e -Dtest=edu.pitt.dbmi.daqueryws.test.rest.UserTest test
#mvn -e -Dtest=edu.pitt.dbmi.daqueryws.test.rest.RoleRestTest test
