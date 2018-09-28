rm -rf /tmp/daquery_update
mkdir /tmp/daquery_update
cp ../target/daquery.war /tmp/daquery_update/
cp ../src/update/update.sh /tmp/daquery_update/
chmod 755 /tmp/daquery_update/update.sh
cd /tmp
rm -f /var/daquery-central/daquery_updates/daquery_update.zip
zip /var/daquery-central/daquery_updates/daquery_update.zip daquery_update/*

#read the variables from build property file
BUILD_PROP_FILE="/home/devuser/projects/daquery/ws/src/main/resources/build.version"
if [ -f "$BUILD_PROP_FILE" ]
then
  while IFS='=' read -r key value
  do
    key=$(echo $key | tr '.' '_')
    eval ${key}=\${value}
  done < "$BUILD_PROP_FILE"
else
  echo "$BUILD_PROP_FILE not found."
  exit 1
fi

#read the variables from application property file
APP_PROP_FILE="/home/devuser/projects/daquery/ws/src/main/resources/application.properties"
if [ -f "$APP_PROP_FILE" ]
then
  while IFS='=' read -r key value
  do
    key=$(echo $key | tr '.' '_')
    eval ${key}=\${value}
  done < "$APP_PROP_FILE"
else
  echo "$SPP_PROP_FILE not found."
  exit 1
fi


#edit the central server db to add a line for this update
CENTRAL_SERVER_DB_PATH=/opt/apache-tomcat-6.0.53/conf/daquery-centraldb/
/usr/local/derby/bin/ij <<EOF
  connect 'jdbc:derby:$CENTRAL_SERVER_DB_PATH';
  delete from DAQUERY_VERSION;
  INSERT INTO DAQUERY_VERSION (BUILD_NUM, PACKAGE_URL, RELEASE_DATE, VERSION, FORCE_UPDATE) VALUES (${build_no}, 'http://10.0.2.15:8080/daquery-central/daquery_updates/daquery_update.zip', '`date +%Y-%m-%d\ %H:%M:%S`', '${major_version}.${minor_version}.${sub_minor_version}', false);
EOF
chown -R devuser:devuser $CENTRAL_SERVER_DB_PATH
