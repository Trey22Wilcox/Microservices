package org.treywilcox.microservices.Health;

import org.springframework.stereotype.Service;
import org.springframework.core.env.Environment;

@Service
public class HealthService {

    private final Environment env;

    //constructor injection
    public HealthService(Environment env) {
        this.env = env;
    }

    public HealthStatus getHStatus() {
        int port = Integer.parseInt(env.getProperty("local.server.port"));
        String status = "UP";
        return new HealthStatus(port, status);
    }
}
