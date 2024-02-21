node{
    cleanWs()
    try{
        stage('PremiereEtape'){
            sh "echo 'hello'"
        }
        stage('DeuxiemeEtape'){
            sh "echo 'hello'"
        }
    }
    finally {
        cleanWs()
    }
}
