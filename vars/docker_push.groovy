
def call(Map config) {

    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred",
        usernameVariable: "dockerUser",
        passwordVariable: "dockerPass"
    )]) {

        sh "docker login -u ${dockerUser} -p ${dockerPass}"
    }

    sh "docker push ${config.image}:${config.tag}"
}
