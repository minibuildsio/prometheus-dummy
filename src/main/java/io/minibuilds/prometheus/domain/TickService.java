package io.minibuilds.prometheus.domain;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TickService {

    private final Counter totalTicks;

    public TickService(MeterRegistry meterRegistry) {
        totalTicks = meterRegistry.counter("no.of.ticks");
    }

    @Scheduled(fixedRate = 1000)
    public void tick() {
        totalTicks.increment();
    }
}
