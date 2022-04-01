import jenkins.model.*

def matchedJobs = Jenkins.instance.items.findAll { job ->
    job.name =~ /demo-test/
}
    
matchedJobs.each { job ->
    println job.name
    job.delete()
}