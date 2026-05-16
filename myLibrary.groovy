// vars/myLibrary.groovy
def cleanup() {
    echo "--- [Cleanup] Cleaning up Jenkins workspace and removing temp files ---"
    cleanWs() 

def sendStatusEmail(String status) {
    echo "--- [Notification] Sending email notification with status: ${status} ---"
}
