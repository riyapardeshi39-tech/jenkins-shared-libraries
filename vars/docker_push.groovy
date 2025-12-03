def call(string Project, string ImageTag, string dockerHubUser){
                withCredentials([usernamePassword(
                    credentialsId: "dockerHubCred",
                    usernameVariable: "dockerHubUser", 
                    passwordVariable: "dockerHubPass")]) {

                    sh " docker login -u ${dockerHubUser} -p ${dockerHubPass}" 
                }
                    sh "docker push ${dockerHubUser}/${project}:${ImageTag}"
                }
            }
