node {
    stage('Dependency: daquery-common') {
        dir('daquery-common') {
<<<<<<< HEAD
            git url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery-common.git', credentialsId: 'git-readonly'
=======
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-common.git', credentialsId: 'cborromeo-git'
>>>>>>> 8e2851f0ba4a6f895e21264e5c005b47a16ab2af
            echo 'Building daquery-common'
            sh "mvn -B -DskipTests clean install"
        }
    }
    stage('Dependency: daquery UI') {
        dir('daquery') {
<<<<<<< HEAD
            echo 'Checkout daquery UI'
            git url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery.git', credentialsId: 'git-readonly'
        }
        dir('daquery/ui') {
            echo 'Building daquery UI'
            sh "npm install"
            sh "npm run prod"
=======
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery.git', credentialsId: 'cborromeo-git'
            echo 'Extracting daquery UI'
>>>>>>> 8e2851f0ba4a6f895e21264e5c005b47a16ab2af
        }
    }
    stage('Checkout and Build Web Services') {
        dir('daquery-ws') {
<<<<<<< HEAD
            git url: 'https://dbmi-jenkins@github.com/dbmi-pitt/daquery-ws.git', branch: 'chuck-workspace', credentialsId: 'git-readonly'
=======
            git url: 'https://cborromeo@github.com/dbmi-pitt/daquery-ws.git', credentialsId: 'cborromeo-git'
>>>>>>> 8e2851f0ba4a6f895e21264e5c005b47a16ab2af
            echo 'Building daquery-ws'
            sh "mvn -B -DskipTests clean install"
       }
    }

}
<<<<<<< HEAD

=======
>>>>>>> 8e2851f0ba4a6f895e21264e5c005b47a16ab2af
