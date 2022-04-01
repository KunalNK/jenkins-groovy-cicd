import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

// Create a jenkins user
def hudsonRealm = new HudsonPrivateSecurityRealm(false)
hudsonRealm.createAccount("admin","admin123")
instance.setSecurityRealm(hudsonRealm)