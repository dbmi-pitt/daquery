#!/bin/bash
# all-start-test.sh
# This file launches 3 items: a Daquery Central Server and two sites.
# These items can be used for testing.


./start-test-central.sh --daquery_home=/home/devuser/projects/daquery --db_home=/home/devuser/daquery_docker_data
./start-test-connected.sh --daquery_home=/home/devuser/projects/daquery --db_home=/home/devuser/daquery_docker_data --ojdbc_lib=/home/devuser/projects/daquery/ws/lib
./start-test-noconnection.sh --daquery_home=/home/devuser/projects/daquery --db_home=/home/devuser/daquery_docker_data --ojdbc_lib=/home/devuser/projects/daquery/ws/lib


