def call(String Image, String Tag, String DockerHubUser){
  sh"docker build -t ${dockerHubUser}/${ProjectName}:${ImageTag}."
}
