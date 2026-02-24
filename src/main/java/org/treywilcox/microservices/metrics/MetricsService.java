package org.treywilcox.microservices.metrics;

import org.springframework.stereotype.Service;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;

@Service
public class MetricsService {

    public MetricsStatus getAllMetrics(){
        //Memory
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long maxMemory = runtime.maxMemory();
        long usedMemory = totalMemory - freeMemory;

        //CPU
        int cpuCount = runtime.availableProcessors();

        //Uptime
        long uptime = ManagementFactory.getRuntimeMXBean().getUptime();

        //Active Threads
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        int threadCount = threadMXBean.getThreadCount();

        return new MetricsStatus(totalMemory, freeMemory, maxMemory, usedMemory, uptime, cpuCount, threadCount);
    }
}
