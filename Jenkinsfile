node {
    stage('Get Dependencies') {
        echo 'Getting dependencies'
        dir('daquery-common') {
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-common.git', credentialsId: 'cborromeo-git'
            echo 'Building daquery-common'
            sh "mvn -B -DskipTests clean install"
        }
    }
    stage('Checkout') {
        dir('daquery-ws') {
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-ws.git', credentialsId: 'cborromeo-git'
            echo 'Building'
            sh "mvn -B -DskipTests clean install"
       }
    }

}
