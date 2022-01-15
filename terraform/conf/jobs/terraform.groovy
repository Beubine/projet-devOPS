#!groovy
println('------------------------------------------------------------------Import Job IaC/terraform')
def pipelineScript = new File('/var/jenkins_config/jobs/terraform_pipeline.groovy').getText("UTF-8")

pipelineJob('IaC/terraform') {
    description("Create instance aws terraform - success")
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
}
