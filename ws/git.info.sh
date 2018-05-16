rm -f src/main/resources/build.version
echo branch=`git rev-parse --abbrev-ref HEAD` > src/main/resources/build.version
echo build.no=`git shortlog | wc -l` >> src/main/resources/build.version
