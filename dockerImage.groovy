// vars/dockerImage.groovy
def build(String imageName, String tag = 'latest') {
    echo "--- [Docker] Building image: ${imageName}:${tag} ---"
    // כאן תבוא פקודת הבנייה האמיתית בהמשך, למשל:
    // sh "docker build -t ${imageName}:${tag} ."
}

def push(String imageName, String tag = 'latest') {
    echo "--- [Docker] Pushing image: ${imageName}:${tag} to registry ---"
    // כאן תבוא פקודת הדחיפה האמיתית, למשל:
    // sh "docker push ${imageName}:${tag}"
}
