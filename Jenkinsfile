pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/navadharani-art/Student_Registration_System.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test -Dtest=StudentRegressionTest'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mkdir -p /var/lib/jenkins/deploy'
                sh 'cp target/*.jar /var/lib/jenkins/deploy/'
            }
        }
    }
}