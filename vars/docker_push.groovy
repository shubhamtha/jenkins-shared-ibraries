def call(string Project, String dockerhubuser){
  withCredentials({usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass',usernameVariable: 'dockerHubUser';)}){
                                    sh "docker loging -u ${dockerhubuser} -p ${dockerhubpass}"
                                    }
                                    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
                                    }
