 
pipeline{
  agent any
  environment{
    NEW-VERSION = '1.3.0' 
  }
   
  
    stage("build"){
      steps{
        echo 'building the application...' 
        sh "javac Display.java"
        sh "javac UseDisplay.java"
      }
    }
    
    stage("test"){
      when{
        expression{
          BRANCH_NAME == 'master' || BRANCH_NAME == 'main' 
        }
      }
      steps{
        echo 'testing the application...'
      }
    }
    
    stage("deploy"){
      steps{
        echo 'deploying the application...'        
      }
    }
 
}
 
