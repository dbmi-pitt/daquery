#!/bin/bash
# start-docker-central.sh
# This file launches a working Daquery Central site.  You can use this site for testing.
# To run this file: edit the parameters below as necessary.  
# The default port is set to 4001, but can be changed by providing a port on the 
# command line as the first (only) argument- ex: ./start-docker-central.sh 4040 will run
# Daquery on port 4040
#
# Additionaly, the DAQUERY_CENTRAL_WAR_DIR variable may need to be updated depending
# on the location of daquery-central.war on your system.  This
# only need to be changed once to match your system, different versions are not
# required when running multiple instances of Daquery on the same system.

#which version of nc do we have?
#if file `which nc` | grep -qe 'link.*ncat'; then
#  NC_CMD=
#else
#  NC_CMD="nc -z"
#fi

# DAQUERY_CENTRAL_WAR_DIR is the directory on the host machine containing the Daquery Central war file
# this file must be named daquery.war
DAQUERY_CENTRAL_WAR_DIR="/home/devuser/projects/daquery-central/target"

if [ ! -f $DAQUERY_CENTRAL_WAR_DIR/daquery-central.war ]; then
    echo +-+-+-+-+- File daquery-central.war does not exist in $DAQUERY_CENTRAL_WAR_DIR.  Exiting. +-+-+-+-+-
    exit 1
fi

# TOMCAT_REDIRECT_PORT is the port used to access the Daquery website
# from the host system (ex: http://localhost:4001)
# This is the default, which can be overridden by passing a port number in 
# on the command line as a single argument to this script.
TOMCAT_REDIRECT_PORT="4001"

# Check to see if a port number was passed in, if not use the default port
if [ -z "$1" ]; then
 echo using default port
else
 TOMCAT_REDIRECT_PORT=$1
fi

# Check to see if something is already running on the port that we want to use
#if nc -z localhost $TOMCAT_REDIRECT_PORT; then
#    echo +-+-+-+-+- Port $TOMCAT_REDIRECT_PORT is in use, cannot start Daquery.  Exiting. +-+-+-+-+-
#    exit 1
#else
#    echo starting Daquery on port $TOMCAT_REDIRECT_PORT
#fi

# Calculate the debug port by adding 1000 to the configured Daquery port
# TOMCAT_DEBUG_PORT is the port used to debug the Daquery website from the host system
TOMCAT_DEBUG_PORT=$(($TOMCAT_REDIRECT_PORT + 1000))

# Check to see if something is already running on the debug port that we want to use
#if nc -z localhost $TOMCAT_DEBUG_PORT; then
#    echo +-+-+-+-+- Port $TOMCAT_DEBUG_PORT is in use, cannot use it as a debug port.  Exiting. +-+-+-+-+-
#    exit 1
#else
#    echo debugging on port $TOMCAT_DEBUG_PORT
#fi

# The file $DAQUERY_WAR_DIR/daquery-central.war gets copied to CONTAINER_DAQUERY_WAR_DIR
CONTAINER_DAQUERY_WAR_DIR="/localdata/daquery_war"
# TOMCAT_HOME is the Tomcat directory path within the container.  Both daquery.war
# and ojdbc6-11.1.0.7.0.jar get deployed to paths within TOMCAT_HOME
TOMCAT_HOME="/usr/local/tomcat"
# DAQUERY_HOME is the file path for the Daquery container's Derby database on the host.
# This parameter allows the Daquery docker site to maintain a state between runs 
DAQUERY_HOME="/home/devuser/daquery_docker_data"
# CONTAINER_DAQUERY_HOME is the file path for the Daquery container's Derby database on the container
# This file will create a new directory called $CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT
# to ensure the creation of a unique Derby database.  
CONTAINER_DAQUERY_HOME="/localdata/daquery_data"

# CONTAINER_NAME is the docker name for this Daquery container.  This name must
# be unique if running multiple Daquery sites (ex: daquery-testsite1, daquery-testsite2)
CONTAINER_NAME="daquery-testsite-$TOMCAT_REDIRECT_PORT"
docker stop $CONTAINER_NAME
docker pull cborromeo/daquery-baseline
docker rm $CONTAINER_NAME


if docker run --name $CONTAINER_NAME -dt -v $DAQUERY_WAR_DIR:$CONTAINER_DAQUERY_WAR_DIR -v $DAQUERY_HOME:$CONTAINER_DAQUERY_HOME -p $TOMCAT_REDIRECT_PORT:8080 -p $TOMCAT_DEBUG_PORT:8000 -e DAQUERY_WAR_DIR=$DAQUERY_WAR_DIR -e TOMCAT_HOME=$TOMCAT_HOME -e CONTAINER_DAQUERY_WAR_DIR=$CONTAINER_DAQUERY_WAR_DIR -e DAQUERY_HOME=$CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT -e DAQUERY_CENT_URL=$DAQUERY_CENT_URL cborromeo/daquery-baseline:latest; then
    echo Daquery started on port $TOMCAT_REDIRECT_PORT, debugging on port $TOMCAT_DEBUG_PORT
    echo Using central server at $DAQUERY_CENT_URL
fi
