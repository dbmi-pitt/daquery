The JDBC drivers for Oracle and SQL Server must be downloaded and placed in this lib directory as these libraries aren't available 
via mvn.  

Also, the support JNI file for the SQL Server driver must be placed in this directory.

These files are:
  ojdbc7.jar
  sqljdbc42.jar
  sqljdbc_auth.dll

If the names/versions are changed update the names in run.bat.