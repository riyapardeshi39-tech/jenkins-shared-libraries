def calll(string ProjectName, string ImageTag, string DockerHubUser){
  sh "docker build -t ${DockerHubuser}/${ProjectName}:${ImageTag} ."
}
