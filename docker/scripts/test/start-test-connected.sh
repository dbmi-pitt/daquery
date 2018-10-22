#!/bin/bash
# start-test-connected.sh
# This file launches a working Daquery site.  You can use this site for testing.
# NOTE: THIS IS CONFIGURED TO CONNECT TO THE DAQUERY CENTRAL TEST SITE http://10.0.2.15:4001
# THIS SITE WILL RUN ON PORT 4003.  THIS CONFIGURATION INFORMATION MATCHES THE DEFAULT
# CONFIGURATION FOUND IN THE TEST CENTRAL SERVER
# To run this file: edit the parameters below as necessary.  Note: if you want to
# run multiple instances of a Daquery site you need to run them on different ports.
# The default port is set to 4003, but can be changed by providing a port on the 
# command line as the first (only) argument- ex: ./docker_start.sh 4040 will run
# Daquery on port 4040
#
# Additionaly, the OJDBC_DIR and DAQUERY_WAR_DIR variables may need to be updated depending
# on the locations of ojdbc6-11.1.0.7.0.jar and daquery.war on your system.  These
# only need to be changed once to match your system, different versions are not
# required when running multiple instances of Daquery on the same system.

# OJDBC_DIR is the directory on the host machine containing the Oracle JDBC driver
# this file must be named ojdbc6-11.1.0.7.0.jar

# create some default paths.  These paths match the VM paths
DAQUERY_HOME="/home/devuser/projects/daquery"
DB_HOME="/home/devuser/daquery_docker_data"
DEFAULT_OJDBC_LIB_DIR="/home/devuser/projects/daquery/ws/lib"


#which version of nc do we have?
#if file `which nc` | grep -qe 'link.*ncat'; then
#  NC_CMD=
#else
#  NC_CMD="nc -z"
#fi
# DAQUERY_CENT_URL is the IP address (or hostname) of the Daquery Central server you want the site
# to use
# DAQUERY_CENT_URL="http://10.0.2.15:8080"

# Check to see if a port number, daquery home, ojdbc jar or db home  was passed in, if not use environment
# variables or the defaults set above will be used
while [ $# -gt 0 ]; do
  case "$1" in
    --daquery_home=*)
      DAQUERY_HOME="${1#*=}"
      ;;
    --db_home=*)
      DB_HOME="${1#*=}"
      ;;
    --ojdbc_lib_dir=*)
      OJDBC_LIB_DIR="${1#*=}"
      ;;
    --port=*)
      PORT="${1#*=}"
      ;;
    --central_url=*)
      DAQUERY_CENT_URL="${1#*=}"
      ;;
    *)
      printf "***************************\n"
      printf "* Error: Invalid argument.*\n"
      printf "***************************\n"
      exit 1
  esac
  shift
done

# Check to see if a port number was passed in, if not use the default port
if [ -z "$OJDBC_LIB_DIR" ]; then
 echo using default OJDBC_LIB_DIR Path: $DEFAULT_OJDBC_LIB_DIR
 OJDBC_LIB_DIR=$DEFAULT_OJDBC_LIB_DIR
fi

# remove any trailing slash from the paths
DAQUERY_HOME=$(echo "$DAQUERY_HOME" | sed 's:/*$::')
echo DAQUERY_HOME is $DAQUERY_HOME
DB_HOME=$(echo "$DB_HOME" | sed 's:/*$::')
echo DB_HOME is $DB_HOME
echo OJDBC_LIB_DIR is $OJDBC_LIB_DIR

echo PORT is $PORT

if [ ! -d $OJDBC_LIB_DIR ]; then
    echo +-+-+-+-+- The directory $OJDBC_LIB_DIR does not exist.  Exiting. +-+-+-+-+-
    exit 1
fi

# DAQUERY_WAR_DIR is the directory on the host machine containing the Daquery war file
# this file must be named daquery.war
DAQUERY_WAR_DIR="$DAQUERY_HOME/ws/target"

if [ ! -f $DAQUERY_WAR_DIR/daquery.war ]; then
    echo +-+-+-+-+- File daquery.war does not exist in $DAQUERY_WAR_DIR.  Exiting. +-+-+-+-+-
    exit 1
fi

# TOMCAT_REDIRECT_PORT is the port used to access the Daquery website
# from the host system (ex: http://localhost:4003)
# This is the default, which can be overridden by passing a port number in 
# on the command line as a single argument to this script.
TOMCAT_REDIRECT_PORT="4003"

# Check to see if a port number was passed in, if not use the default port
if [ -z "$PORT" ]; then
 echo using default port: $TOMCAT_REDIRECT_PORT
else
 TOMCAT_REDIRECT_PORT=$PORT
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

# The file $OJDBC_DIR/ojdbc6-11.1.0.7.0.jar gets copied to CONTAINER_OJDBC_DIR
CONTAINER_OJDBC_DIR="/localdata/jdbc_driver"
# The file $DAQUERY_WAR_DIR/daquery.war gets copied to CONTAINER_DAQUERY_WAR_DIR
CONTAINER_DAQUERY_WAR_DIR="/localdata/daquery_war"
# TOMCAT_HOME is the Tomcat directory path within the container.  Both daquery.war
# and ojdbc6-11.1.0.7.0.jar get deployed to paths within TOMCAT_HOME
TOMCAT_HOME="/usr/local/tomcat"

# DAQUERY_HOME is the file path for the Daquery container's Derby database on the host.
# This parameter allows the Daquery docker site to maintain a state between runs 
DEFAULT_DAQUERY_HOME="/home/devuser/daquery_docker_data"
# Check to see if a path to the database was passed in, if not use the database path
if [ -z "$DB_HOME" ]; then
 echo using default database home: $DEFAULT_DAQUERY_HOME
 DB_HOME=$DEFAULT_DAQUERY_HOME
fi

# CONTAINER_DAQUERY_HOME is the file path for the Daquery container's Derby database on the container
# This file will create a new directory called $CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT
# to ensure the creation of a unique Derby database.  
CONTAINER_DAQUERY_HOME="/localdata/daquery_data"

# The connected version of the test site uses a pre-configured database.
# This code moves the database into the directory
DAQUERY_SITE_DATABASE="$DAQUERY_HOME/docker/docker-baseline/daquery_connected_site_db.tar.gz"
DATABASE_FILE_NAME="daquery_connected_site_db.tar.gz"
if [ ! -f $DAQUERY_SITE_DATABASE ]; then
    echo +-+-+-+-+- Cannot find pre-configured database file does not exist in $DAQUERY_SITE_DATABASE.  Exiting. +-+-+-+-+-
    exit 1
fi

if [ -e $DB_HOME/daquery-$TOMCAT_REDIRECT_PORT ]; then
    echo Removing existing database $DB_HOME/daquery-$TOMCAT_REDIRECT_PORT
    rm -rf $DB_HOME/daquery-$TOMCAT_REDIRECT_PORT
fi

cp $DAQUERY_SITE_DATABASE $DB_HOME 
chmod 755 $DB_HOME/$DATABASE_FILE_NAME
tar -xvzf $DB_HOME/$DATABASE_FILE_NAME -C $DB_HOME

# CONTAINER_NAME is the docker name for this Daquery container.  This name must
# be unique if running multiple Daquery sites (ex: daquery-testsite1, daquery-testsite2)
CONTAINER_NAME="daquery-testsite-$TOMCAT_REDIRECT_PORT"
# NOTE: for this line silence an error if it cannot find the container but adding the "|| true" 
docker stop $CONTAINER_NAME || true
docker pull cborromeo/daquery-baseline
docker rm $CONTAINER_NAME || true

if docker run --name $CONTAINER_NAME -dt -v $OJDBC_LIB_DIR:$CONTAINER_OJDBC_DIR -v $DAQUERY_WAR_DIR:$CONTAINER_DAQUERY_WAR_DIR -v $DB_HOME:$CONTAINER_DAQUERY_HOME -p $TOMCAT_REDIRECT_PORT:8080 -p $TOMCAT_DEBUG_PORT:8000 -e OJDBC_LIB_DIR=$OJDBC_LIB_DIR -e DAQUERY_WAR_DIR=$DAQUERY_WAR_DIR -e TOMCAT_HOME=$TOMCAT_HOME -e CONTAINER_OJDBC_DIR=$CONTAINER_OJDBC_DIR -e CONTAINER_DAQUERY_WAR_DIR=$CONTAINER_DAQUERY_WAR_DIR -e DAQUERY_HOME=$CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT -e DAQUERY_CENT_URL=$DAQUERY_CENT_URL -e DAQUERY_CONF_DIR=$CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT/conf cborromeo/daquery-baseline:latest; then
    echo Daquery started on port $TOMCAT_REDIRECT_PORT, debugging on port $TOMCAT_DEBUG_PORT
    echo Using central server at $DAQUERY_CENT_URL
fi
