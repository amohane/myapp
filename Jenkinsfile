node{
  stage('SCM checkout'){
    git 'https://github.com/amohane/myapp'
  }
  stage('Build Package'){
    cmd 'mvn package'
  }
}
