pipeline {
    agent any

    stages {
        stage('Run tests') {

            steps {
                sh 'mvn clean test'
            }
        }
    }
}