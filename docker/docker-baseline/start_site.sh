#!/bin/bash
echo 'Deploy JDBC driver'
cp $CONTAINER_OJDBC_DIR $TOMCAT_HOME/lib

echo 'Deploy daquery.war to Tomcat'
cp $CONTAINER_DAQUERY_WAR_DIR/daquery.war $TOMCAT_HOME/webapps/
/usr/local/tomcat/bin/catalina.sh run
