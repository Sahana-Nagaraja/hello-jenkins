pipeline {
    agent any
    environment{
        env1 = 'local'
        env2 = 'staging'
        env3 = 'production'
    }
    stages {
        stage('Build') {
            steps {
                script {
                    env.ENVIRONMENT = input message: 'User input required',
                    ok: 'Continue',
                    parameters: [choice(name: 'Env to deploy', choices: "${env1}\n${env2}\n${env3}", description: 'What env you wont deploy?')]
                }
                echo 'Building from master'
                sh 'mvn -DskipTests clean package -Dspring.profiles.active=${ENVIRONMENT}'
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
                echo 'Testing from master'
                sh 'mvn test -Dspring.profiles.active=${ENVIRONMENT}'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh './deploy.sh ${ENVIRONMENT}'
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
