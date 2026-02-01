pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

//     environment {
//         APP_NAME = "jenkins"
// //         DOCKER_IMAGE = "nipuni1994/email-filter-jenkins-docker-aws"
//     }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/NisalJayathilaka/jenkins.git'
            }
        }

        stage('Build with Maven') {
            steps {
                cat 'mvn clean package -DskipTests'
            }
        }

        // ✅ ADD SONARQUBE HERE
//         stage('SonarQube Analysis') {
//             steps {
//                 withSonarQubeEnv('SonarQube') {
//                     bat 'mvn sonar:sonar -Dsonar.projectKey=email-service'
//                 }
//             }
//         }

//        stage("Quality Gate") {
//            steps {
//                timeout(time: 2, unit: 'MINUTES') {
//                    waitForQualityGate abortPipeline: true
//                }
//            }
//        }

//         stage('Docker Login') {
//             steps {
//                 withCredentials([usernamePassword(
//                     credentialsId: 'jenkins-ci-new',
//                     usernameVariable: 'DOCKER_USER',
//                     passwordVariable: 'DOCKER_PASS'
//                 )]) {
//                     bat 'echo %DOCKER_PASS% | docker login -u %DOCKER_USER% --password-stdin'
//                 }
//             }
//         }

//         stage('Docker Build') {
//             steps {
//                 bat 'docker build -t %DOCKER_IMAGE%:latest .'
//             }
//         }

//         stage('Docker Push') {
//             steps {
//                 bat 'docker push %DOCKER_IMAGE%:latest'
//             }
//         }

//         stage('Docker Run') {
//             steps {
//                 bat '''
//                 docker stop %APP_NAME% || echo Container not running
//                 docker rm %APP_NAME% || echo Container not found
//                 docker run -d --name %APP_NAME% -p 8096:8096 %DOCKER_IMAGE%:latest
//                 '''
//             }
//         }
    }

    post {
        success {
            echo '✅ CI/CD pipeline completed successfully!'
        }
        failure {
            echo '❌ Pipeline failed! Check the logs.'
        }
    }
}