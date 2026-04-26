package com.naveen.HealthDetailApplication.health_api.controller;

import com.naveen.HealthDetailApplication.health_api.model.HealthDetail;
import com.naveen.HealthDetailApplication.health_api.service.HealthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/details")
    public ResponseEntity<HealthDetail> getHealthDetails() {
        return ResponseEntity.ok(healthService.getHealthDetails());
    }

}
