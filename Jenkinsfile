node {
  
    //checkout the project
    checkout( [$class: 'GitSCM',
       branches: [[name: jenkins-branch ]],
       userRemoteConfigs: [[
           credentialsId: 'git-readonly',
           url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery.git']]])

    //env.JAVA_HOME="usr/lib/jvm/java-1.7.0-openjdk-1.7.0.99.x86_64/jre"
    
    stage('Dependency: daquery common') {
        dir('daquery/common') {
            echo 'Building daquery common'
            sh "mvn -B -DskipTests clean install"
        }
    }
    stage('Dependency: daquery UI') {
        dir('daquery/ui') {
            echo 'Building daquery UI'
            sh "npm install"
            sh "npm run prod"
        }
    }
    stage('Checkout and Build Web Services') {
        dir('daquery/ws') {
            echo 'Building daquery Web Services'
            sh "mvn -B -DskipTests clean install"
       }
    }
    stage('Deploy web ui to Tomcat') {
         dir('daquery/ws') {
            sh '/opt/apache-tomcat-6.0.53/clean.sh'
            sh 'cp target/daquery.war /opt/apache-tomcat-6.0.53/webapps/'
            //delete the database at the filesystem level
            //delete the files within the database directory
            sh 'rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-db'
            //run the POJO Junit tests
            //This call also builds the database and added test data for the Rest tests
            sh 'mvn -Dtest=edu.pitt.dbmi.daqueryws.test.domain.DomainTestSuite test'
            sh '/opt/apache-tomcat-6.0.53/bin/startup.sh &'
            sleep 20
            sh 'mvn -Dtest=edu.pitt.dbmi.daqueryws.test.rest.*Test test'
            //POST-TEST CLEANUP
            //delete the database at the filesystem level
            //delete the files within the database directory
            sh 'rm -rf /opt/apache-tomcat-6.0.53/conf/daquery-db'
             
                    
       }

    }


}

