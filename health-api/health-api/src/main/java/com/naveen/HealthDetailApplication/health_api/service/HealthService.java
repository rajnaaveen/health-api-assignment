package com.naveen.HealthDetailApplication.health_api.service;

import com.naveen.HealthDetailApplication.health_api.model.HealthDetail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class HealthService {

    // Read from environment variable BUILD_VERSION (falls back to "unknown" if not set)
    @Value("${BUILD_VERSION:unknown}")
    private String buildVersion;

    // Read from application.yaml
    @Value("${app.environment}")
    private String environment;

    @Value("${spring.application.name}")
    private String applicationName;

    public HealthDetail getHealthDetails() {
        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));

        return new HealthDetail(applicationName, timestamp, buildVersion, environment);
    }
}
