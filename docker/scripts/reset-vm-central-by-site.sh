#!/bin/bash
if [ -z "$1" ]; then
  echo "Must provide a site to reset."
  echo "usage: reset-central-bysite sitename"
  exit 1
fi
ij <<EOF
  connect 'jdbc:derby:/opt/apache-tomcat-6.0.53/conf/daquery-centraldb/';
  update SITE set ACCESS_KEY='abc123', TEMPKEY=true where NAME = '$1';
  commit;
  delete from connection_request where from_site_id = (select site_id from site where name= '$1');
  delete from connection_request where to_site_id = (select site_id from site where name= '$1');
  commit;
  disconnect;
  exit;
EOF
chown -R devuser:devuser /opt/apache-tomcat-6.0.53/conf/*
chmod -R g+w /opt/apache-tomcat-6.0.53/conf/*

