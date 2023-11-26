def call (){
    sh 'chomd +x jfrog.py'
    sh './jfrog.py'
}