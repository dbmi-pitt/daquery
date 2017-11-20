node {
    stage('Get Dependencies') {
        echo 'Getting dependencies'
        dir('daquery-common') {
            git url: 'https://github.com/dbmi-pitt/daquery-common.git', credentialsId: 'cborromeo'
        }
    }
    stage('Checkout') {
        echo 'Getting the code'
        checkout scm
    }

    stage("Build") {
        echo 'Building'
        sh "mvn -B -DskipTests clean install"
    }
}
