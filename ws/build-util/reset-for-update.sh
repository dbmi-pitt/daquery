rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-centraldb
rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-db
cp -rp /opt/apache-tomcat-6.0.53/conf/daquery-centraldb.bak /opt/apache-tomcat-6.0.53/conf/daquery-centraldb
cp -rp /opt/apache-tomcat-6.0.53/conf/daquery-db.bak /opt/apache-tomcat-6.0.53/conf/daquery-db
rm -rf /home/devuser/daquery_docker_data/daquery-4001
cp -rp /home/devuser/daquery_docker_data/daquery-4001.bak /home/devuser/daquery_docker_data/daquery-4001
cp /home/devuser/projects/daquery.war.1526 /home/devuser/projects/daquery/ws/target/daquery.war 
