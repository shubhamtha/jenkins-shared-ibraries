def call() {
    withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'dockerHubUser', passwordVariable: 'dockerHubPass')]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/notes-app:latest"
    }
}
