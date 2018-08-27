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

# create some default paths.  These paths match the VM paths
DAQUERY_HOME="/home/devuser/projects/daquery"
DB_HOME="/home/devuser/daquery_docker_data"

while [ $# -gt 0 ]; do
  case "$1" in
    --daquery_home=*)
      DAQUERY_HOME="${1#*=}"
      ;;
    --db_home=*)
      DB_HOME="${1#*=}"
      ;;
    --port=*)
      PORT="${1#*=}"
      ;;
    *)
      printf "***************************\n"
      printf "* Error: Invalid argument.*\n"
      printf "***************************\n"
      exit 1
  esac
  shift
done

# remove any trailing slash from the paths
DAQUERY_HOME=$(echo "$DAQUERY_HOME" | sed 's:/*$::')
echo DAQUERY_HOME is $DAQUERY_HOME
DB_HOME=$(echo "$DB_HOME" | sed 's:/*$::')
echo DB_HOME is $DB_HOME
echo PORT is $PORT

# DAQUERY_CENTRAL_WAR_DIR is the directory on the host machine containing the Daquery Central war file
# this file must be named daquery.war
DAQUERY_CENTRAL_WAR_DIR="$DAQUERY_HOME/central/target"

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
if [ -z "$PORT" ]; then
 echo using default port
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

# The file $DAQUERY_WAR_DIR/daquery-central.war gets copied to CONTAINER_DAQUERY_WAR_DIR
CONTAINER_DAQUERY_WAR_DIR="/localdata/daquery_war"
# TOMCAT_HOME is the Tomcat directory path within the container.  
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

DAQUERY_CENT_URL="localhost"

# This code moves the default database into the directory used by the docker image
DAQUERY_CENTRAL_DATABASE="$DAQUERY_HOME/docker/docker-central/daquery_central_db.tar.gz"
DATABASE_FILE_NAME="daquery_central_db.tar.gz"
if [ ! -f $DAQUERY_CENTRAL_DATABASE ]; then
    echo +-+-+-+-+- Cannot find pre-configured database file does not exist in $DAQUERY_CENTRAL_DATABASE.  Exiting. +-+-+-+-+-
    exit 1
fi

if [ -e $DB_HOME/daquery-$TOMCAT_REDIRECT_PORT ]; then
    echo Removing existing database $DB_HOME/daquery-$TOMCAT_REDIRECT_PORT
    rm -rf $DB_HOME/daquery-$TOMCAT_REDIRECT_PORT
fi

cp $DAQUERY_CENTRAL_DATABASE $DB_HOME 
chmod 755 $DB_HOME/$DATABASE_FILE_NAME
tar -xvzf $DB_HOME/$DATABASE_FILE_NAME -C $DB_HOME


# CONTAINER_NAME is the docker name for this Daquery container.  This name must
# be unique if running multiple Daquery sites (ex: daquery-testsite1, daquery-testsite2)
CONTAINER_NAME="daquery-testsite-$TOMCAT_REDIRECT_PORT"
docker stop $CONTAINER_NAME
docker pull cborromeo/daquery-central
docker rm $CONTAINER_NAME

echo "Running command: docker run --name $CONTAINER_NAME -dt -v $DAQUERY_CENTRAL_WAR_DIR:$CONTAINER_DAQUERY_WAR_DIR -v $DB_HOME:$CONTAINER_DAQUERY_HOME -p $TOMCAT_REDIRECT_PORT:8080 -p $TOMCAT_DEBUG_PORT:8000 -e DAQUERY_WAR_DIR=$DAQUERY_CENTRAL_WAR_DIR -e TOMCAT_HOME=$TOMCAT_HOME -e CONTAINER_DAQUERY_WAR_DIR=$CONTAINER_DAQUERY_WAR_DIR -e DAQUERY_HOME=$CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT -e DAQUERY_CENT_URL=$DAQUERY_CENT_URL cborromeo/daquery-central:latest"

if docker run --name $CONTAINER_NAME -dt -v $DAQUERY_CENTRAL_WAR_DIR:$CONTAINER_DAQUERY_WAR_DIR -v $DB_HOME:$CONTAINER_DAQUERY_HOME -p $TOMCAT_REDIRECT_PORT:8080 -p $TOMCAT_DEBUG_PORT:8000 -e DAQUERY_WAR_DIR=$DAQUERY_CENTRAL_WAR_DIR -e TOMCAT_HOME=$TOMCAT_HOME -e CONTAINER_DAQUERY_WAR_DIR=$CONTAINER_DAQUERY_WAR_DIR -e DAQUERY_HOME=$CONTAINER_DAQUERY_HOME/daquery-$TOMCAT_REDIRECT_PORT -e DAQUERY_CENT_URL=$DAQUERY_CENT_URL cborromeo/daquery-central:latest; then
    echo Daquery started on port $TOMCAT_REDIRECT_PORT, debugging on port $TOMCAT_DEBUG_PORT
    echo Using central server at $DAQUERY_CENT_URL
fi
