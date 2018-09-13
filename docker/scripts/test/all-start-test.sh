#!/bin/bash
# all-start-test.sh
# This file launches 3 items: a Daquery Central Server and two sites.
# These items can be used for testing.

# build the code before testing it on Docker
cd ../../..
./build-all.sh

cd docker/scripts/test

./start-test-central.sh --daquery_home=/Users/chb69/git/daquery --db_home=/Users/chb69/daquery_docker_data
./start-test-connected.sh --daquery_home=/Users/chb69/git/daquery --db_home=/Users/chb69/daquery_docker_data --ojdbc_lib_dir=/Users/chb69/git/daquery/ws/lib/ --central_url="http://130.49.179.45:4001"
./start-test-noconnection.sh --daquery_home=/Users/chb69/git/daquery --db_home=/Users/chb69/daquery_docker_data --ojdbc_lib_dir=/Users/chb69/git/daquery/ws/lib/ --central_url="http://130.49.179.45:4001"


