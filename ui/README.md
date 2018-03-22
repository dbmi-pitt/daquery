# Distributed Data Query Application web UI component

## Prerequisites
- node.js/npm 6

This is the web/UI component of Daquery.

To install node/npm follow these steps:
  For Centos/Redhat
   As root:
     curl --silent --location https://rpm.nodesource.com/setup_6.x | bash -
     yum install -y nodejs

     cd to daquery/ui/
     run: npm install -g

To run through node (will run standalone in Tomcat without node via the war produced by mvn install)
  in daquery/ui/ run "npm start", attach to UI with http://locahost:4200

To compile the UI to include in the daquery-ws war in daquery/ui/ run "npm run prod".  This creates a "dist" directory that is pulled into the daquery-ws.war file by the mvn build process there.  This must be done before building the war in the daquery/ws directory.
