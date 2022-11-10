pipeline {
	agent any
	
	triggers {
	
        cron('H/15 * * * *')
    
    }
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
}