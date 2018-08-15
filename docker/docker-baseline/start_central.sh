#!/bin/bash

echo 'Deploy daquery-central.war to Tomcat'
cp $CONTAINER_DAQUERY_WAR_DIR/daquery-central.war $TOMCAT_HOME/webapps/daquery-central.war
/usr/local/tomcat/bin/catalina.sh run
