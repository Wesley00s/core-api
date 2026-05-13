package com.cicdtest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/health")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<Map<String, Object>> checkStatus() {
        Map<String, Object> payload = Map.of(
                "service", "core-api",
                "status", "UP",
                "timestamp", Instant.now().toString(),
                "message", "CI/CD Pipeline successfully executed."
        );
        return ResponseEntity.ok(payload);
    }
}