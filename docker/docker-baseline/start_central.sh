cd /localdata
echo 'Getting latest Daquery code'
git init
git clone https://dbmi-jenkins:dbmi17rojnk@github.com/dbmi-pitt/daquery.git
git checkout jenkins-branch

echo 'Building common Daquery code'
cd /localdata/daquery/common
mvn -B -DskipTests clean install

echo 'Building UI Daquery code'
cd /localdata/daquery/ui
npm install
npm run prod

echo 'Checkout and Build Web Services'
cd /localdata/daquery/ws
mvn -B -DskipTests clean install

echo 'Deploy web ui to Tomcat'
cd /localdata/daquery/ws
cp target/daquery.war $CATALINA_HOME/webapps/
mvn -Dtest=edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite test
$CATALINA_HOME/bin/startup.sh &
sleep 20
mvn -Dtest=edu.pitt.dbmi.daqueryws.test.rest.*Test test

echo 'Deleting Test Database'
rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-db
