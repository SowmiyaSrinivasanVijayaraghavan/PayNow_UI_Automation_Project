pipeline {
    agent any

    tools {
        maven 'Maven'    // must match the Maven tool name in Jenkins config
        jdk 'Java 21'    // must match the JDK name in Jenkins config
    }

    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM',
  		branches: [[name: '*/main']],
  		userRemoteConfigs: [[url: 'https://github.com/SowmiyaSrinivasanVijayaraghavan/PayNow_UI_Automation_Project.git']]
])
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Report') {
            steps {
                publishHTML([
                    reportDir: 'target/cucumber-html-reports',
                    reportFiles: 'overview-features.html',
                    reportName: 'Cucumber Report'
                ])
            }
        }
    }
}
