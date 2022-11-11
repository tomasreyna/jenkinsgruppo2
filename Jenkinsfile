pipeline {
	agent any
	
	stages {
		stage('Compile Stage'){
		
			steps{
				withMaven(maven : 'maven_3_5_0'){
					sh 'mvn clean compile'
				}
			}
		}
		
		stage('Testing Stage'){
		
			steps{
				withMaven(maven:'maven_3_5_0'){
					sh 'mvn test'
				}
			}
		}	
	}
	post{
        always{
            slackSend( channel: "#jenkins", token: "slack_webhook token", color: "good", message: "Test Email")
        }
    }
    def custom_msg()
{
  def JENKINS_URL= "localhost:8080"
  def JOB_NAME = env.JOB_NAME
  def BUILD_ID= env.BUILD_ID
  def JENKINS_LOG= " FAILED: Job [${env.JOB_NAME}] Logs path: ${JENKINS_URL}/job/${JOB_NAME}/${BUILD_ID}/consoleText"
  return JENKINS_LOG
}
}