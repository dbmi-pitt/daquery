##TOMCAT_PATH="/opt/apache-tomcat-6.0.53/"



TOMCAT_PATH="$1"
ERROR_LOG=$TOMCAT_PATH/temp/daquery_update/daquery_update/daquery-update-error.log
OUTPUT_LOG=$TOMCAT_PATH/temp/daquery_update/daquery_update/daquery-update.out
RESTART_COMMAND=$TOMCAT_PATH/bin/startup.sh

#this function is used when an error occurs
#it restores the war file, application database, restarts tomcat and exits with
#an error code of 1
restore_and_exit() {
  echo Restoring and exiting after an error. Check $ERROR_LOG
  if ! cp -f $TOMCAT_PATH/daquery_bak.war $TOMCAT_PATH/webapps/daquery.war; then
    echo Unable to restore war file during errored update. >> $ERROR_LOG
  else
    echo Application war file restored. >> $ERROR_LOG
  fi
  if ! cp -rp  $TOMCAT_PATH/daquery-db-bak $TOMCAT_PATH/conf/daquery-db/; then
    echo Unable to restore database during errored update. >> $ERROR_LOG
  else
    echo Application database restored. >> $ERROR_LOG
  fi
  $RESTART_COMMAND
  exit 1
}


if ! $TOMCAT_PATH/bin/shutdown.sh > $OUTPUT_LOG 2>&1; then
  echo Tomcat shutdown failed. Nothing updated. >> $ERROR_LOG
  $RESTART_COMMAND
  exit 1
fi

if ! cp $TOMCAT_PATH/webapps/daquery.war $TOMCAT_PATH/daquery_bak.war > $OUTPUT_LOG 2>&1; then
  echo Failed to make a backup of the application war file. Nothing updated. >> $ERROR_LOG
  $RESTART_COMMAND
  exit 1
fi

if ! cp -rp $TOMCAT_PATH/conf/daquery-db $TOMCAT_PATH/daquery-db-bak/ > $OUTPUT_LOG 2>&1; then
  echo  >> $ERROR_LOG
  $RESTART_COMMAND
  exit 1
fi

if ! rm -rf $TOMCAT_PATH/work/Catalina/localhost/daquery/ > $OUTPUT_LOG 2>&1; then
  echo failed to remove the Tomcat working directory: $TOMCAT_PATH/work/Catalina/localhost/daquery/ >> $ERRROR_LOG
  restore_and_exit
fi

#if ! rm -f $TOMCAT_PATH/logs/* > $OUTPUT_LOG 2>&1; then
#  echo Failed to remove the Tomcat log files. >> $ERROR_LOG
#  restore_and_exit
#fi

if ! rm -f $TOMCAT_PATH/webapps/daquery.war > $OUTPUT_LOG 2>&1; then
  echo Failed to remove the application war file.  >> $ERROR_LOG
  restore_and_exit
fi

if ! rm -rf $TOMCAT_PATH/webapps/daquery/ > $OUTPUT_LOG 2>&1; then
  echo Failed to remove the daquery webapp directory.  >> $ERROR_LOG
  restore_and_exit
fi

if ! cp $TOMCAT_PATH/temp/daquery_update/daquery_update/daquery.war $TOMCAT_PATH/webapps/ > $OUTPUT_LOG 2>&1; then
  echo Failed to copy the daquery war file into place. >> $ERROR_LOG
  restore_and_exit
fi

if ! sleep 10 > $OUTPUT_LOG 2>&1; then
  echo blech >> $ERROR_LOG
  restore_and_exit
fi

$RESTART_COMMAND > $OUTPUT_LOG 2>&1


echo "Update Completed Successfully" >> $ERROR_LOG
echo "Done" > done.txt
