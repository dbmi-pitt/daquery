#!/bin/bash

echo 'Deploy daquery-central.war to Tomcat'
echo "Using command: cp $CONTAINER_DAQUERY_WAR_DIR/daquery-central.war $TOMCAT_HOME/webapps/ > cp_output 2>&1" > start_central_output
cp $CONTAINER_DAQUERY_WAR_DIR/daquery-central.war $TOMCAT_HOME/webapps/ >> start_central_output 2>&1

/usr/local/tomcat/bin/catalina.sh run
