pipeline {
    agent any 

    stages {
        stage('Build') { 
            steps {
                echo 'Start Build'
                sh './gradlew war'
                echo 'Finish Build'
            }
        }
    }
}