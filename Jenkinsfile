pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/NisalJayathilaka/jenkins.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'Build success'
        }
        failure {
            echo 'Build failed'
        }
    }
}