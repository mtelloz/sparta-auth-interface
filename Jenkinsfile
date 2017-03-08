@Library('libpipelines@master') _

hose {
    EMAIL = 'sparta'
    MODULE = 'sparta-auth'
    DEVTIMEOUT = 20
    RELEASETIMEOUT = 20
    FOSS = true
    REPOSITORY = 'sparta-auth-interface'
    
    DEV = { config ->
        doCompile(config)
        doPackage(config)
        doDeploy(config)            
    }
}
