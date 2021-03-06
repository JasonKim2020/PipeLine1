 
pipeline{
  agent any 
    stage("build"){
      steps{
        echo 'building the application...' 
        sh "javac Display.java"
        sh "javac UseDisplay.java"
      }
    }
    
    stage("test"){ 
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
 
