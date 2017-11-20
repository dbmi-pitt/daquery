node {
    stage('Dependency: daquery-common') {
        dir('daquery-common') {
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-common.git', credentialsId: 'cborromeo-git'
            echo 'Building daquery-common'
            sh "mvn -B -DskipTests clean install"
        }
    }
    stage('Checkout and Build Web Services') {
        dir('daquery-ws') {
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery.git', credentialsId: 'cborromeo-git'
            echo 'Extracting daquery UI'
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-ws.git', credentialsId: 'cborromeo-git'
            echo 'Building daquery-ws'
            sh "mvn -B -DskipTests clean install"
       }
    }

}
