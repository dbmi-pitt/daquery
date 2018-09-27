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

/usr/local/tomcat/bin/startup.sh
/bin/bash
