#!/bin/bash
# all-start-test.sh
# This file launches 3 items: a Daquery Central Server and two sites.
# These items can be used for testing.

# build the code before testing it on Docker
cd ../../..
./build-all.sh

cd docker/scripts/test

./start-test-central.sh --daquery_home=/home/devuser/projects/daquery/ --db_home=/home/devuser/daquery_docker_data
#./start-test-connected.sh --daquery_home=/home/devuser/projects/daquery/ --db_home=/home/devuser/daquery_docker_data --ojdbc_lib_dir=/home/devuser/projects/daquery/ws/lib --central_url="http://10.0.2.15:4001"
# remove existing site database
sudo rm -rf /home/devuser/daquery_docker_data/daquery-4002
./start-test-connected.sh --port=4002 --daquery_home=/home/devuser/projects/daquery/ --db_home=/home/devuser/daquery_docker_data --ojdbc_lib_dir=/home/devuser/projects/daquery/ws/lib --central_url="http://10.0.2.15:4001"
# remove existing site database
sudo rm -rf /home/devuser/daquery_docker_data/daquery-4003
./start-test-noconnection.sh --port=4003 --daquery_home=/home/devuser/projects/daquery/ --db_home=/home/devuser/daquery_docker_data --ojdbc_lib_dir=/home/devuser/projects/daquery/ws/lib --central_url="http://10.0.2.15:4001"
# change owner of the central database (just in case root takes ownership of the .lck file)
sudo chown -R devuser:devuser /home/devuser/daquery_docker_data/daquery-4001/*

