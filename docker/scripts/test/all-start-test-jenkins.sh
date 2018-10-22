#!/bin/bash
# all-start-test.sh
# This file launches 3 items: a Daquery Central Server and two sites.
# These items can be used for testing.
export DB_HOME=/home/jenkins/daquery_docker_data
export CENTRAL_IP_ADDRESS="http://136.142.228.23"

# build the code before testing it on Docker
echo | pwd
echo | ls -al
cd ../../..
./build-all.sh

cd docker/scripts/test

./start-test-central.sh --daquery_home=/home/jenkins/projects/daquery/ --db_home=$DB_HOME
./start-test-connected.sh --daquery_home=/home/jenkins/projects/daquery --db_home=$DB_HOME --ojdbc_lib_dir=/home/jenkins/daquery_lib/ --central_url="$CENTRAL_IP_ADDRESS:4001"
./start-test-noconnection.sh --daquery_home=/home/jenkis/projects/daquery --db_home=$DB_HOME --ojdbc_lib_dir=/home/jenkins/daquery_lib/ --central_url="$CENTRAL_IP_ADDRESS:4001"






