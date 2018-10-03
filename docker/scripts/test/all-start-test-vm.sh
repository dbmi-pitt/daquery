#!/bin/bash
# all-start-test.sh
# This file launches 3 items: a Daquery Central Server and two sites.
# These items can be used for testing.

# export some environment variables for ij
export DERBY_INSTALL=/usr/local/db-derby-10.12.1.1-bin
export CLASSPATH=$DERBY_INSTALL/lib/derby.jar:$DERBY_INSTALL/lib/derbytools.jar:
export DB_HOME=/home/devuser/daquery_docker_data
export CENTRAL_IP_ADDRESS="http://10.0.2.15"
# build the code before testing it on Docker
cd ../../..
./build-all.sh

cd docker/scripts/test

./start-test-central.sh --daquery_home=/home/devuser/projects/daquery/ --db_home=$DB_HOME
#./start-test-connected.sh --daquery_home=/home/devuser/projects/daquery/ --db_home=/home/devuser/daquery_docker_data --ojdbc_lib_dir=/home/devuser/projects/daquery/ws/lib --central_url="http://10.0.2.15:4001"
# remove existing site database
sudo rm -rf $DB_HOME/daquery-4002
./start-test-connected.sh --port=4002 --daquery_home=/home/devuser/projects/daquery/ --db_home=$DB_HOME --ojdbc_lib_dir=/home/devuser/projects/daquery/ws/lib --central_url="$CENTRAL_IP_ADDRESS:4001"
# remove existing site database
sudo rm -rf $DB_HOME/daquery-4003
./start-test-noconnection.sh --port=4003 --daquery_home=/home/devuser/projects/daquery/ --db_home=$DB_HOME --ojdbc_lib_dir=/home/devuser/projects/daquery/ws/lib --central_url="$CENTRAL_IP_ADDRESS:4001"

# change owner of the daquery databases (just in case root takes ownership of the .lck file)
sudo chown -R devuser:devuser $DB_HOME/*

# update the database with the correct values
java org.apache.derby.tools.ij << EOF
connect 'jdbc:derby:$DB_HOME/daquery-4001/conf/daquery-centraldb/';
UPDATE site set URL='$CENTRAL_IP_ADDRESS' || ':4002' WHERE name='dev-4002'; 
UPDATE site set URL='$CENTRAL_IP_ADDRESS' || ':4003' WHERE name='dev-4003'; 
disconnect;
connect 'jdbc:derby:$DB_HOME/daquery-4002/conf/daquery-db/';
UPDATE site set URL='$CENTRAL_IP_ADDRESS' || ':4002' WHERE name='dev-4002'; 
exit;
EOF





