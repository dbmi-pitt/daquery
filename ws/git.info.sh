rm -f build.version
echo branch=`git rev-parse --abbrev-ref HEAD` > build.version
echo build.no=`git shortlog | wc -l` >> build.version
