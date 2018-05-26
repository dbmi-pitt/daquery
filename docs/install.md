---
# You don't need to edit this file, it's empty on purpose.
# Edit theme's home layout instead if you wanna make some changes
# See: https://jekyllrb.com/docs/themes/#overriding-theme-defaults
layout: page
---
## Daquery Data Too Installation Guide

<p style="font-size: 14pt;">Daquery is a distributed query tool specifically designed for use on the PCRF PaTH network.  The tool was designed to run in the Tomcat application server that is currently being used to host SHRINE as part of the PaTH SHRINE+ network.</p>

#### Minimum Requirements
-------------------------------------------------------------------
 - Configured PaTH SHRINE system
   - Tomcat 6.x or greater
   - Java 1.7 or greater
   - Apache HTTP server (optional)

<br />
#### Configuring the server
-------------------------------------------------------------------
We will configure the 
<div class="codebox">
	<div class="innercodebox">
		<code>
			some config stuff<br />
			here<br />
			or something else
		</code>
	</div>
</div>
some config stuff
here
or something else

<br />
#### Initial Application Setup
____________________________________________________________________
After starting Tomcat with the Daquery war in place browse to the newly launched site in a web browser.  
For the PaTH network this will usually be one of the following URLs:
- http://server.name:6443/daquery
- https://server.name:6060/daquery

The port number (6060 or 6443) can vary depending on your Tomcat installation.  
The default for PaTH is 6060 for HTTP and 6443 for HTTPS.

When navigating to the site for the first time you should see an initial setup screen.

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

