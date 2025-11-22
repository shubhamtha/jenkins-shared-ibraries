def call(String imageName, String tag, String user) {
    sh "docker build -t ${user}/${imageName}:${tag} ."
}
