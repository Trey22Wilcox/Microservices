package org.treywilcox.microservices.config;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ConfigService {

    private final Environment environment;

    public ConfigService(Environment environment) {
        this.environment = environment;
    }

    public ConfigStatus getConfig(){
        String appName = environment.getProperty("spring.application.name");
        String[] profiles = environment.getActiveProfiles();
        String javaVersion = System.getProperty("java.version");
        int port = Integer.parseInt(environment.getProperty("server.port", "8080"));

        return new ConfigStatus(appName,Arrays.asList(profiles),javaVersion,port);
    }
}
