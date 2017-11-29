node {
    
    env.JAVA_HOME="usr/lib/jvm/java-1.7.0-openjdk-1.7.0.99.x86_64/jre/bin"
    
    stage('Dependency: daquery-common') {
        dir('daquery-common') {
            sh 'echo $JAVA_HOME'
            git url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery-common.git', credentialsId: 'git-readonly'
            echo 'Building daquery-common'
            sh "mvn -B -DskipTests clean install"
        }
    }
    stage('Dependency: daquery UI') {
        dir('daquery') {
            echo 'Checkout daquery UI'
            git url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery.git', credentialsId: 'git-readonly'
        }
        dir('daquery/ui') {
            echo 'Building daquery UI'
            sh "npm install"
            sh "npm run prod"
        }
    }
    stage('Checkout and Build Web Services') {
        dir('daquery-ws') {
            git url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery-ws.git', branch: 'chuck-workspace', credentialsId: 'git-readonly'
            echo 'Building daquery-ws'
            sh "mvn -B -DskipTests clean install"
       }
    }
    stage('Deploy web ui to Tomcat') {
         dir('daquery-ws') {
            sh '/opt/apache-tomcat-7.0.78/clean.sh'
            sh 'cp target/daquery.war /opt/apache-tomcat-7.0.78/webapps/'
            sh '/opt/apache-tomcat-7.0.78/bin/startup.sh &'
            sleep 20
            sh 'mvn "-Dtest=edu.pitt.dbmi.daqueryws.test.domain.*Test" test'
            sh 'mvn "-Dtest=edu.pitt.dbmi.daqueryws.test.rest.*Test" test'
                    
       }

    }


}

