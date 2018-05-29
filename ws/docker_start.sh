# docker_start.sh
# This file launches a working Daquery site.  You can use this site for testing.
# To run this file: edit the parameters below as necessary.  Note: if you want to
# run multiple instances of a Daquery site, 1) you need to make a copy of the docker_start.sh file
# to run another instance and 2) you need to make sure the CONTAINER_NAME, 
# TOMCAT_REDIRECT_PORT, and TOMCAT_DEBUG_PORT are unique between the two instances.

# CONTAINER_NAME is the docker name for this Daquery container.  This name must
# be unique if running multiple Daquery sites (ex: daquery-testsite1, daquery-testsite2)
CONTAINER_NAME="daquery-testsite"
docker stop $CONTAINER_NAME
docker pull cborromeo/daquery-baseline
docker rm $CONTAINER_NAME
# TOMCAT_REDIRECT_PORT is the port used to access the Daquery website
# from the host system (ex: http://localhost:4000)
TOMCAT_REDIRECT_PORT="4000"
# TOMCAT_DEBUG_PORT is the port used to debug the Daquery website from the host system
TOMCAT_DEBUG_PORT="7272"
# OJDBC_DIR is the directory on the host machine containing the Oracle JDBC driver
# this file must be named ojdbc6-11.1.0.7.0.jar
OJDBC_DIR="/home/devuser"
# DAQUERY_WAR_DIR is the directory on the host machine containing the Daquery war file
# this file must be named daquery.war
DAQUERY_WAR_DIR="/home/devuser/projects/daquery/ws/target"
# The file $OJDBC_DIR/ojdbc6-11.1.0.7.0.jar gets copied to CONTAINER_OJDBC_DIR
CONTAINER_OJDBC_DIR="/localdata/jdbc_driver"
# The file $DAQUERY_WAR_DIR/daquery.war gets copied to CONTAINER_DAQUERY_WAR_DIR
CONTAINER_DAQUERY_WAR_DIR="/localdata/daquery_war"
# TOMCAT_HOME is the Tomcat directory path within the container.  Both daquery.war
# and ojdbc6-11.1.0.7.0.jar get deployed to paths within TOMCAT_HOME
TOMCAT_HOME="/usr/local/tomcat"
# DAQUERY_CENT_URL is the IP address (or hostname) of the Daquery Central server you want the site
# to use
DAQUERY_CENT_URL="10.0.2.15"
# DAQUERY_HOME is the file path for the Daquery container's Derby database on the host.
# This parameter allows the Daquery docker site to maintain a state between runs 
DAQUERY_HOME="/home/devuser/daquery_data"
# CONTAINER_DAQUERY_HOME is the file path for the Daquery container's Derby database on the container
# This file will create a new directory called $CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT
# to ensure the creation of a unique Derby database.  
CONTAINER_DAQUERY_HOME="/localdata/daquery_data"
docker run --name $CONTAINER_NAME -dt -v $OJDBC_DIR:$CONTAINER_OJDBC_DIR -v $DAQUERY_WAR_DIR:$CONTAINER_DAQUERY_WAR_DIR -v $DAQUERY_HOME:$CONTAINER_DAQUERY_HOME -p $TOMCAT_REDIRECT_PORT:8080 -p $TOMCAT_DEBUG_PORT:8000 -e OJDBC_DIR=$OJDBC_DIR -e DAQUERY_WAR_DIR=$DAQUERY_WAR_DIR -e TOMCAT_HOME=$TOMCAT_HOME -e CONTAINER_OJDBC_DIR=$CONTAINER_OJDBC_DIR -e CONTAINER_DAQUERY_WAR_DIR=$CONTAINER_DAQUERY_WAR_DIR -e DAQUERY_HOME=$CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT -e DAQUERY_CENT_URL=$DAQUERY_CENT_URL cborromeo/daquery-baseline:latest

