if [ -z "$1" ]; then
 echo must provide port number:  docker-shell.sh port-number
 exit 1
fi
docker exec -it daquery-testsite-$1 /bin/bash

