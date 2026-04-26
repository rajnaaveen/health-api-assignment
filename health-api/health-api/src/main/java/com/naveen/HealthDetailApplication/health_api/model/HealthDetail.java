package com.naveen.HealthDetailApplication.health_api.model;

public class HealthDetail {

    private String applicationName;
    private String currentTimestamp;
    private String buildVersion;
    private String environment;

    public HealthDetail(String applicationName, String currentTimestamp,
                        String buildVersion, String environment) {
        this.applicationName = applicationName;
        this.currentTimestamp = currentTimestamp;
        this.buildVersion = buildVersion;
        this.environment = environment;
    }

    public String getApplicationName() { return applicationName; }
    public String getCurrentTimestamp() { return currentTimestamp; }
    public String getBuildVersion()     { return buildVersion; }
    public String getEnvironment()      { return environment; }

}
