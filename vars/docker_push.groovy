
def call(String project, String imageTag, String dockerHubUser) {

    withCredentials([usernamePassword(
        credentialsId: "dockerHubCred",
        usernameVariable: "dockerUser",
        passwordVariable: "dockerPass"
    )]) {
        sh "docker login -u ${dockerUser} -p ${dockerPass}"
    }

    sh "docker push ${dockerHubUser}/${project}:${imageTag}"
}
