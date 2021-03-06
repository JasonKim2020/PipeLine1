CODE_CHANGES = getGitChanges()
pipeline{
  agent any
  environment{
    NEW-VERSION = '1.3.0' 
  }
  tools{
    maven 
  }
  stages{    
      when{
        expression{
          BRANCH_NAME == 'master' && CODE_CHANGES == true 
        }
      }
    stage("build"){
      steps{
        echo 'building the application...'
        echo "building version${NEW_VERSION}"
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
 
