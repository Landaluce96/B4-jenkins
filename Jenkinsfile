pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                sh '''
                    ./jenkins/build/mvn.sh mvn -B -DskipTests clean package dependency:copy-dependencies
                    ./jenkins/build/build.sh

                   '''
            }
            post {
                success {
                   archiveArtifacts artifacts: 'maven-log4j/target/**/*.jar', fingerprint: true
                }
            }
        }

        stage('Test') {
            steps {
                sh './jenkins/test/mvn.sh mvn test jacoco:prepare-agent jacoco:report'
            }
            post {
                always {
                   junit 'maven-log4j/target/surefire-reports/*.xml'
                    jacoco()
                }
            }
        }
    }
}
