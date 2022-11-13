pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building from the test-branch..'
                sh 'mvn -DskipTests clean package'
            }
        }
        /*
        stage('FailingStage') {
                    steps {
                        echo 'Failing intentionally....'
                        sh 'false'
                    }
                }
        */
        stage('Test') {
            steps {
                echo 'Testing from the test-branch..'
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh './deploy.sh'
            }
        }
    }
    /*
    post {
        failure {
                    echo 'I failed :(. But I will take some actions here :)'
                }
      }
    */
}
