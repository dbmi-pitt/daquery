#!/bin/bash
echo 'Deploy JDBC driver'
cp $CONTAINER_OJDBC_DIR/ojdbc6-11.1.0.7.0.jar $TOMCAT_HOME/lib

echo 'Deploy daquery.war to Tomcat'
cp $CONTAINER_DAQUERY_WAR_DIR/daquery.war $TOMCAT_HOME/webapps/
/usr/local/tomcat/bin/catalina.sh run
