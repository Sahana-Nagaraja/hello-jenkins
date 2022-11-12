pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -DskipTests clean package'
            }
        }
        stage('FailingStage') {
                    steps {
                        echo 'Failing intentionally....'
                        sh 'false'
                    }
                }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
        failure {
                    echo 'I failed :(. But I will take some actions here :)'
                }
      }
}
