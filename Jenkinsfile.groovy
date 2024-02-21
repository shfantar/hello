node{
    cleanWs()
    try{
        stage('PremiereEtape'){
            sh "echo 'Hello World !!'"
        }
        stage('DeuxiemeEtape'){
            sh "echo 'Hello World !!'"
        }
    }
    finally{
        cleanWs()
    }
}
