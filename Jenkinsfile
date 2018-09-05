node {

   try {
  
    //checkout the project
    checkout( [$class: 'GitSCM',
       branches: [[name: '*/in-dev' ]],
       userRemoteConfigs: [[
           credentialsId: 'dbmi-jenkins',
           url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery.git']]])

    //env.JAVA_HOME="usr/lib/jvm/java-1.7.0-openjdk-1.7.0.99.x86_64/jre"
    
    stage('Dependency: daquery common') {
        dir('common') {
            echo 'Building daquery common'
            sh "mvn -B -DskipTests clean install"
        }
    }
    stage('Dependency: daquery central') {
        dir('central') {
            echo 'Building daquery central'
            sh "mvn -B -DskipTests clean install"
       }
    }
    stage('Dependency: daquery UI') {
        dir('ui') {
            echo 'Building daquery UI'
            sh "npm install"
            sh "npm run prod"
        }
    }
    stage('Checkout and Build Web Services') {
        dir('ws') {
            echo 'Building daquery Web Services'
            sh "mvn -B -DskipTests clean install"
       }
    }

    /* PREREQUISITES:
    The Tomcat related tests require several prerequisites to be met:
    1.  The tomcat server at /opt/apache-tomcat-6.0.53 must be modified to run
        on a port other than 8080.  Jenkins uses 8080 by default.  Modify the
        /opt/apache-tomcat-6.0.53/conf/server.xml file to change the port (I use 9090).
    2.  The tests require a file called test.properties to exist in /home/jenkins/test.properties
        This file contains several test settings (usernames, passwords, etc.).  This file 
        is NOT STORED in git!!  You must create it and save it in the /home/jenkins directory.
        The port number in this file must match the server.xml port (see above).
    */
    stage('Deploy web ui to Tomcat') {
         dir('ws') {
            sh '/opt/apache-tomcat-6.0.53/clean.sh'
            sh 'cp target/daquery.war /opt/apache-tomcat-6.0.53/webapps/'
            //delete the database at the filesystem level
            //delete the files within the database directory
            //sh 'rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-db'
            //copy the test.properties file to a location that the application expects
            sh 'cp /home/jenkins/test.properties /opt/apache-tomcat-6.0.53/conf/test.properties'
            //run the POJO Junit tests
            //This call also builds the database and added test data for the Rest tests
            sh 'mvn -Dtest=edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite test'
            sh '/opt/apache-tomcat-6.0.53/bin/startup.sh &'
            sleep 20
            ////sh 'mvn -Dtest=edu.pitt.dbmi.daqueryws.test.rest.*Test test'
            sh 'mvn -Dtest=edu.pitt.dbmi.daqueryws.test.rest.UserTest test'
            //sh 'mvn -Dtest=edu.pitt.dbmi.daqueryws.test.rest.SiteTest test'
            //POST-TEST CLEANUP
            //delete the database at the filesystem level
            //delete the files within the database directory
            sh 'rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-db'
                                 
       }

    }
    stage('Deploy Docker Images') {
         dir('docker') {
            //make some of the folders Docker is expecting
            sh 'mkdir -p /home/jenkins/projects/daquery/docker/docker-baseline'
            sh 'mkdir -p /home/jenkins/projects/daquery/ws/target'
            sh 'mkdir -p /home/jenkins/projects/daquery/central/target'
            sh 'mkdir -p /home/jenkins/projects/daquery/docker/docker-central'
            sh 'mkdir -p /home/jenkins/projects/daquery/docker/docker-baseline'
           //copy the two .war files into place
            sh 'cp ../ws/target/daquery.war /home/jenkins/projects/daquery/ws/target'
            sh 'cp ../central/target/daquery-central.war /home/jenkins/projects/daquery/central/target'
            //copy the connected Daquery derby database
            sh 'cp docker-baseline/daquery_connected_site_db.tar.gz /home/jenkins/projects/daquery/docker/docker-baseline/daquery_connected_site_db.tar.gz'
            sh 'cp docker-central/daquery_central_db.tar.gz /home/jenkins/projects/daquery/docker/docker-central/daquery_central_db.tar.gz'
            sh 'scripts/test/all-start-test-jenkins.sh &'

         }

    }
    } catch (err) {

        currentBuild.result = "FAILURE"

           // mail body: "project build error is here: ${env.BUILD_URL}" ,
           // subject: 'project build failed',
           // to: 'chb69@pitt.edu'

    emailext(
        subject: 'project build failed',
        body: "project build error is here: ${env.BUILD_URL}<br/>The error is: ${err}" ,
        attachLog: true,
        compressLog: true,
        recipientProviders: [[$class: 'CulpritsRecipientProvider']]
    )

        throw err
    }


}

