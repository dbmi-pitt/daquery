#!/bin/bash
# all-start-test.sh
# This file launches 3 items: a Daquery Central Server and two sites.
# These items can be used for testing.


echo 'Running: scripts/test/start-test-central.sh --daquery_home=/home/jenkins/projects/daquery --db_home=/home/jenkins/daquery_docker_data'
scripts/test/start-test-central.sh --daquery_home=/home/jenkins/projects/daquery --db_home=/home/jenkins/daquery_docker_data
echo 'Running: scripts/test/start-test-connected.sh --daquery_home=/home/jenkins/projects/daquery --db_home=/home/jenkins/daquery_docker_data --ojdbc_lib_dir=/home/jenkins/daquery_lib/ --central_url="http://136.142.228.23:4001"'
scripts/test/start-test-connected.sh --daquery_home=/home/jenkins/projects/daquery --db_home=/home/jenkins/daquery_docker_data --ojdbc_lib_dir=/home/jenkins/daquery_lib/ --central_url="http://136.142.228.23:4001"
echo 'Running: scripts/test/start-test-noconnection.sh --daquery_home=/home/jenkins/projects/daquery --db_home=/home/jenkins/daquery_docker_data --ojdbc_lib_dir=/home/jenkins/daquery_lib/ --central_url="http://136.142.228.23:4001"'
scripts/test/start-test-noconnection.sh --daquery_home=/home/jenkins/projects/daquery --db_home=/home/jenkins/daquery_docker_data --ojdbc_lib_dir=/home/jenkins/daquery_lib/ --central_url="http://136.142.228.23:4001"


