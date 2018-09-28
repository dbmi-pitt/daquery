#!/bin/bash
if [ ! -f $DAQUERY_HOME ]; then
  mkdir $DAQUERY_HOME
fi
if [ ! -f $DAQUERY_CONF_DIR ]; then
  mkdir $DAQUERY_CONF_DIR ]
fi
cp -rfp /usr/local/tomcat/conf/* $DAQUERY_CONF_DIR
rm -rf /usr/local/tomcat/conf
ln -s $DAQUERY_CONF_DIR /usr/local/tomcat/conf

echo 'Deploy JDBC driver A' > /tmp/ds.log
cp $CONTAINER_OJDBC_DIR/*.jar $TOMCAT_HOME/lib/ >> /tmp/ds.log 2>&1
echo 'Deploy daquery.war to Tomcat' >> /tmp/ds.log 2>&1
cp $CONTAINER_DAQUERY_WAR_DIR/daquery.war $TOMCAT_HOME/webapps/ >> /tmp/ds.log 2>&1

/usr/local/tomcat/bin/startup.sh
/bin/bash
