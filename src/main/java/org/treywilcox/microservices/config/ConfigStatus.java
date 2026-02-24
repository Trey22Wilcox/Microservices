package org.treywilcox.microservices.config;

import java.util.List;

public class ConfigStatus {
    private String applicationName;
    private List<String> activeProfiles;
    private String javaVersion;
    private int port;

    public ConfigStatus(String applicationName, List<String> activeProfiles, String javaVersion, int port) {
        this.applicationName = applicationName;
        this.activeProfiles = activeProfiles;
        this.javaVersion = javaVersion;
        this.port = port;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public List<String> getActiveProfiles() {
        return activeProfiles;
    }

    public String getJavaVersion() {
        return javaVersion;
    }

    public int getPort() {
        return port;
    }
}
