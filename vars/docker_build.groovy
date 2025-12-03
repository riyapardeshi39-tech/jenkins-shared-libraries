
def call(Map config) {
    sh """
        docker build -t ${config.image}:${config.tag} .
        docker push ${config.image}:${config.tag}
    """
}
