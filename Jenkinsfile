 
pipeline{
  agent any
  
  stages{    
      when{
        expression{
          BRANCH_NAME == 'master' && CODE_CHANGES == true 
        }
      }
    stage("build"){
      steps{
        echo 'building the application...' 
        sh 'javac Display.java'
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
    post{
      always{
        //
      }
      success{
        //
      }
      failure{
        //
      }
    }  
  }
}
 
