##TOMCAT_PATH="/opt/apache-tomcat-6.0.53/"

# stop tomcat
#./bin/shutdown.sh

# backup daquery
#cp ./webapps/daquery.war ./daquery_bak.war
#cp -r ./conf/daquery-db ./daquery-db-bak/

# clean daquery
#sudo rm -rf ./work/Catalina/localhost/daquery/
#sudo rm -f ./logs/*
#sudo rm -f ./webapps/daquery.war
#sudo rm -rf ./webapps/daquery/

# copy war file over
#sudo cp ./temp/daquery_update/daquery_update/daquery.war ./webapps/

#sleep 10
# start tomcat
#./bin/startup.sh

#echo "Done" > done.txt

## for /home/devuser/ ##
#TOMCAT_PATH="/opt/shrine/tomcat/"
TOMCAT_PATH="$1"
$TOMCAT_PATH/bin/shutdown.sh
cp $TOMCAT_PATH/webapps/daquery.war $TOMCAT_PATH/daquery_bak.war
cp -r $TOMCAT_PATH/conf/daquery-db $TOMCAT_PATH/daquery-db-bak/
rm -rf $TOMCAT_PATH/work/Catalina/localhost/daquery/
rm -f $TOMCAT_PATH/logs/*
rm -f $TOMCAT_PATH/webapps/daquery.war
rm -rf $TOMCAT_PATH/webapps/daquery/
cp $TOMCAT_PATH/temp/daquery_update/daquery_update/daquery.war $TOMCAT_PATH/webapps/
sleep 10
$TOMCAT_PATH/bin/startup.sh
echo "Done" > done.txt
