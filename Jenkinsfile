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

}