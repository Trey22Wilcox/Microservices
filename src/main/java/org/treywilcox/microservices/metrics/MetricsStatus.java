package org.treywilcox.microservices.metrics;

public class MetricsStatus {

    private long totalMemory;
    private long freeMemory;
    private long maxMemory;
    private long usedMemory;
    private long uptime;
    private int cpuCount;
    private int threadCount;

    public MetricsStatus(long totalMemory, long freeMemory, long maxMemory, long usedMemory, long uptime, int cpuCount, int threadCount) {
        this.totalMemory = totalMemory;
        this.freeMemory = freeMemory;
        this.maxMemory = maxMemory;
        this.usedMemory = usedMemory;
        this.uptime = uptime;
        this.cpuCount = cpuCount;
        this.threadCount = threadCount;
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public long getUsedMemory() {
        return usedMemory;
    }

    public long getUptime() {
        return uptime;
    }

    public int getCpuCount() {
        return cpuCount;
    }

    public int getThreadCount() {
        return threadCount;
    }
}
