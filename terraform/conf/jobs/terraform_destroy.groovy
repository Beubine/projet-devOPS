#!groovy
println('------------------------------------------------------------------Import Job IaC/terraform_destroy')
def pipelineScript = new File('/var/jenkins_config/jobs/terraform_destroy_pipeline.groovy').getText("UTF-8")

pipelineJob('IaC/terraform_destroy') {
    description("destroy instance aws terraform")
    definition {
        cps {
            script(pipelineScript)
            sandbox()
        }
    }
}