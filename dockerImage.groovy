// vars/dockerImage.groovy
def build(String imageName, String tag = 'latest') {
    echo "--- [Docker] Building image: ${imageName}:${tag} ---"
    
    // sh "docker build -t ${imageName}:${tag} ."
}

def push(String imageName, String tag = 'latest') {
    echo "--- [Docker] Pushing image: ${imageName}:${tag} to registry ---"

    // sh "docker push ${imageName}:${tag}"
}
