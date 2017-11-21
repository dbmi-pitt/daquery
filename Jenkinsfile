node {
    stage('Dependency: daquery-common') {
        dir('daquery-common') {
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-common.git', credentialsId: 'cborromeo-git'
            echo 'Building daquery-common'
            sh "mvn -B -DskipTests clean install"
        }
    }
    stage('Dependency: daquery UI') {
        dir('daquery') {
            echo 'Checkout daquery UI'
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery.git', credentialsId: 'cborromeo-git'
        }
        dir('daquery/ui') {
            echo 'Building daquery UI'
            sh "npm install"
            sh "npm run prod"
        }
        echo 'Copy UI Dist files'
        cp 'daquery/ui/dist/*.*' 'daquery-ws/src/main/webapp/'
    }
    stage('Checkout and Build Web Services') {
        dir('daquery-ws') {
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-ws.git', credentialsId: 'cborromeo-git'
            echo 'Building daquery-ws'
            sh "mvn -B -DskipTests clean install"
       }
    }

}

