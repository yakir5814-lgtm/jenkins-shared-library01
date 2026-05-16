@Library('my-shared-library01') _

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    // קריאה לפונקציית הבנייה מהספרייה שלך
                    myLibrary.buildApp()
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // קריאה לפונקציית הפריסה
                    myLibrary.deployApp('main')
                }
            }
        }
    }

    post {
        always {
            script {
                // קריאה לפונקציית הניקוי
                myLibrary.cleanup()
            }
        }
    }
}
