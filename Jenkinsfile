@Library("library") _
pipeline{
    agent any
    stages{
        stage("git checkout"){
            steps{
                git credentialsId: 'github-manu', url: 'https://github.com/manojkrishna0009/my-app.git'
            }
        }
        stage("maven build"){
            steps{
                sh 'mvn clean package'
            }
        }
        stage("dev tomcat deploy"){
            steps{
                tomcatdeploy("3.141.29.245","ec2-user","tomcat")
                
            }
        }
    }
}
