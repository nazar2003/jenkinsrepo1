freeStyleJob('testing') {

  steps {
    shell('date;uname -a')
        
    }
  
  }

freeStyleJob('testing1') {

  steps {
    shell('echo "uname -a";date')
        
    }
  
  }
freeStyleJob('testing1 from git') {
  scm{
  
    git{
            remote {
      url('https://github.com/nazar2003/mygit.git')
                   }
    
        }
    
     }
  
    steps {
    shell('sh testrun')
       
          }
   
}
pipelineJob('my pipe line job') {
definition {
cpsScm {
scm{
git{
remote{
url('https://github.com/nazar2003/New_Repo.git')
       }
   }
   }
        }
  
          }
ttriggers{
scm('')
}         
}
