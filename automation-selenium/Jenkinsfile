pipeline {
    agent any

    stages {
        stage("BUILD CLEAN") {
           steps {
            withGradle(Gradle : Gradle 5.6.2)
            sh 'clean build'
           }
       }
    }
 }