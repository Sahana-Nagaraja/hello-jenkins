pipeline {
    agent { node { label 'slave1' } }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -DskipTests clean package'
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
}