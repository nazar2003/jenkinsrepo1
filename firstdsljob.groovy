freeStyleJob('testing') {

  steps {
    shell('echo date')
        
    }
  
  }

freeStyleJob('testing1') {

  steps {
    shell('echo "uname -a"')
        
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
