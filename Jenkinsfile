node{
  stage('SCM checkout'){
    echo '@@@@@ SCM checkout started @@@@@'
    git 'https://github.com/amohane/myapp'
    echo '@@@@@ SCM checkout completed @@@@@'
  }
  stage('Build Package'){
    powershell 'mvn package'
  }
}
