node {
    stage('Checkout') {
        echo 'Getting the code'
        checkout scm
    }

    stage("Build") {
        echo 'Building'
        sh "mvn -B -DskipTests clean install"
    }
}
