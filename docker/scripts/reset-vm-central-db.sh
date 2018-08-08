#!/bin/bash
ij <<EOF
  connect 'jdbc:derby:/opt/apache-tomcat-6.0.53/conf/daquery-centraldb/';
  update SITE set ACCESS_KEY='abc123', TEMPKEY=true;
  commit;
  delete from connection_request;
  commit;
  disconnect;
  exit;
EOF
chown -R devuser:devuser /opt/apache-tomcat-6.0.53/conf/*
chmod -R g+w /opt/apache-tomcat-6.0.53/conf/*
