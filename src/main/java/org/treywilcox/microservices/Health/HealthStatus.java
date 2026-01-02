package Health;

public class HealthStatus {

    private int port = 8080;
    private String status;

    public HealthStatus(int port, String status) {
        this.port = port;
        this.status = status;
    }

    public int getPort() {
        return port;
    }

    public String getStatus() {
        return status;
    }
}
