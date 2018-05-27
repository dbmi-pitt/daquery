---
layout: page
---
## Daquery Data Tool Installation Guide

<p style="font-size: 14pt;">Daquery is a distributed query tool specifically designed for use on the PCRF PaTH network.  The tool was designed to run in the Tomcat application server that is currently being used to host SHRINE as part of the PaTH SHRINE+ network.</p>

<p style="background-color: yellow; color: black;">NOTE: These installation instructions assume an installation on Linux. File and directory paths shown are typical only and are based on the statndard PaTH i2b2/PaTH virtual machine setup. The paths may need to be changed to work on your particular setup. Only Linux commands are shown below assume you are logged in as the root user.</p>


#### Minimum Requirements
-------------------------------------------------------------------
 - Configured PaTH SHRINE+ system
   - Tomcat 6.x or greater
   - Java 1.7 or greater
   - Apache HTTP server (optional)

#### Configuring the server
-------------------------------------------------------------------
Daquery will be added to the existing PaTH i2b2/SHRINE+ server.  Daquery will run out of the same Tomcat application server that SHRINE runs in (not JBoss, where i2b2 runs and where the PaTH Export tool is installed).

First log into your production i2b2/SHRINE server and locate the Tomcat directory.  If you don't know where the Tomcat directory is you can locate it by looking for the Tomcat process like this:
```
ps -ef | grep catalina
```
This output should contain the Tomcat directory.&nbsp;&nbsp;&nbsp;Like:

<div class="highlight"><pre class="highlight"><code>[root@pathi2b2 ~]# ps -ef | grep catalina
root     18235 16023  0 14:38 pts/1   00:00:00 grep catalina
tomcat   23312     1  0 Apr13 ?       00:46:14 /usr/java/jdk1.7.0_06/bin/java -Djava.util.logging.config.file
=<font style="color: red;">/opt/shrine/tomcat/</font>conf/logging.properties -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager 
-Djava.endorsed.dirs=<font style="color: red;">/opt/shrine/tomcat/</font>endorsed -classpath <font style="color: red;">/opt/shrine/tomcat/</font>bin/bootstrap.jar -Dcatalina.base
=<font style="color: red;">/opt/shrine/tomcat</font> -Dcatalina.home=<font style="color: red;">/opt/shrine/tomcat</font> -Djava.io.tmpdir=<font style="color: red;">/opt/shrine/tomcat/</font>temp org.apache
.catalina.startup.Bootstrap start</code></pre></div>

The base Tomcat directory shown above in red will be refered to as _TOMCAT-DIR_.

The original PaTH Tomcat setup doesn't allow for enough memory to run SHRINE/i2b2 and Daquery at the same time.  To increase the memory allocation edit (or add if it doesn't exit) the file _TOMCAT-DIR_/bin/**setenv.sh** to include the following line (make sure you get the whole line, scroll to the right):
```
CATALINA_OPTS="$CATALINA_OPTS -server -Xms256m -Xmx1500m -XX:MaxPermSize=256M XX:+CMSClassUnloadingEnabled -XX:+CMSPermGenSweepingEnabled"
```

Stop Tomcat
```
[root@pathid2b2 ~] service tomcat stop
```
Add the Daquery web archive into Tomcat.
Download the latest Daquery web archive (daquery.war) file from Daquery GitHub release page [here](https://github.com/dbmi-pitt/daquery/releases) (login required).
Copy daquery.war into *TOMCAT-DIR*/webapps
```
[root@pathid2b2 ~] cp daquery.war /opt/shrine/tomcat/webapps/
```
Restart Tomcat
```
[root@pathid2b2 ~] service tomcat start
```

Make sure Tomcat is running and the memory parameters set above are being used by again inspecting the Tomcat process with:
```
[root@pathid2b2 ~] ps -ef | grep catalina
```
You should see something like this:
<div class="highlight"><pre class="highlight"><code>[root@pathi2b2 ~]# ps -ef | grep catalina
tomcat   13693     1  0 May25 ?        00:03:21 /usr/java/jdk1.7.0_06/bin/java -Djava.util.logging.config.file=
/opt/shrine/tomcat/conf/logging.properties -Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager 
-server <font style="color: red;">-Xms256m -Xmx1500m -XX:MaxPermSize=256M -XX:+CMSClassUnloadingEnabled -XX:+CMSPermGenSweepingEnabled</font>
-Djava.endorsed.dirs=/opt/shrine/tomcat/endorsed -classpath /opt/shrine/tomcat/bin/bootstrap.jar -Dcatalina.
base=/opt/shrine/tomcat -Dcatalina.home=/opt/shrine/tomcat -Djava.io.tmpdir=/opt/shrine/tomcat/temp org.apache
.catalina.startup.Bootstrap start
root     18198 17944  0 16:22 pts/0    00:00:00 grep catalina</code></pre></div>

**[optional]**Proxy through Apache HTTP service
To make it easier for users to find the application you can create a proxy route to the application through the standard http and https ports (80/443).  

Edit the Apache HTTP configuration, usually located at: /etd/httpd/conf/**httpd.conf**.  Add the lines shown in <font style="color: red;">red</font> below to httpd.conf.  If your Tomcat server isn't using the default SHRINE Tomcat port of 6060, replace the 6060 in the configuration proxy settings with the port that Tomcat is responding to on your system.

<div class="highlight"><pre class="highlight"><code>. . .

ProxyPassReverse /path-ws http://localhost:6060/path-ws
ProxyTimeout 3000

ProxyPass /path-export http://localhost:9090/path-export
ProxyPassReverse /path-export http://localhost:9090/path-export

<font style="color: red;">ProxyPass /daquery http://localhost:6060/daquery
ProxyPassReverse /daquery http://localhost:6060/daquery
ProxyTimeout 3000</font></code></pre></div>
Then restart Apache HTTPD with:
```
[root@pathid2b2 ~] service httpd restart
```
<br />

#### Initial Application Setup
____________________________________________________________________
After starting Tomcat with the Daquery war in place browse to the newly launched site in a web browser.  
For the PaTH network this will usually be one of the following URLs:
- http://server.name:6443/daquery
- https://server.name:6060/daquery

The port number (6060 or 6443) can vary depending on your Tomcat installation.  
The default for PaTH is 6060 for HTTP and 6443 for HTTPS.

When navigating to the site for the first time you should see an initial setup screen with the fields described in the table below. Fill the fields with the required information.  You will recieve an email with your site name and key.

| Field               | Description                                                                                                                    |
|--------------------:|--------------------------------------------------------------------------------------------------------------------------------|
| Site Name           | The name of your site.  This will be provided to you in a separate communication.                                              |
| Site Key            | The initial key/password used to connect to the PaTH network.  This will be provided to you in a separate communication.       |
| Admin Email         | Your email address.                                                                                                            |
| Admin Password      | A password that you will use when logging into the site.                                                                       |
| Real Name           | Your name.                                                                                                                     |

After filling all of the fields click the "Initialize Daquery" button at the bottom of the page.

The application will set up at this point creating a local database for application storage.  After the initial setup is complete navigate to the "Network" section and join the PaTH network.
Additional instructions on joining a network are available [here](join-network.html).

