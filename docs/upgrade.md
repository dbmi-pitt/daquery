---
layout: page
---
## Daquery Data Tool: Upgrading

To upgrade Daquery it is usually a simple manner of redeploying the Daquery war file.  If other steps are needed for a particular build those steps will be listed on the release page for that build. Before proceeding check the [release](https://github.com/dbmi-pitt/daquery/releases) for any additional instructions.

* Login to your Daquery server as root or a user who has root privileges.

* Stop Tomcat
```
[root@pathi2b2 ~]# service tomcat stop
```
* Remove the Daquery war and Tomcat's Daquery directories, as root run the following commands:
```
[root@pathi2b2 ~]# rm /path/to/tomcat/webapps/daquery.war
[root@pathi2b2 ~]# rm -rf /path/to/tomcat/webapps/daquery
[root@pathi2b2 ~]# rm -rf /path/to/tomcat/work/Catalina/localhost/daquery
```
* Download a copy of the war file from the Daquery [release page](https://github.com/dbmi-pitt/daquery/releases) then copy it to the Tomcat webapps directory:
```
[root@pathi2b2 ~]# cp daquery.war /path/to/tomcat/webapps/
[root@pathi2b2 ~]# chown tomcat:tomcat /path/to/tomcat/webapps/daquery.war
```
Start Tomcat
```
[root@pathi2b2 ~]# service tomcat start
```
