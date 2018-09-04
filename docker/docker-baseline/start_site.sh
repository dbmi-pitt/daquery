#!/bin/bash
echo 'Deploy JDBC driver A' > /tmp/ds.log
cp $CONTAINER_OJDBC_DIR/*.jar $TOMCAT_HOME/lib/ >> /tmp/ds.log 2>&1

echo 'Deploy daquery.war to Tomcat' >> /tmp/ds.log 2>&1
cp $CONTAINER_DAQUERY_WAR_DIR/daquery.war $TOMCAT_HOME/webapps/ >> /tmp/ds.log 2>&1
/usr/local/tomcat/bin/catalina.sh run
