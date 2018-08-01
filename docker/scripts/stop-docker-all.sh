for id in `docker ps | awk 'NR>1 {print $1}'`; do
   docker stop -t 0 $id
done
