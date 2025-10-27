package com.example.springappconfig.controller;

import com.example.springappconfig.config.AppConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ConfigController {

    private final AppConfigProperties appConfigProperties;

    public ConfigController(AppConfigProperties appConfigProperties) {
        this.appConfigProperties = appConfigProperties;
    }

    @GetMapping("/config")
    public Map<String, Object> getConfig() {
        Map<String, Object> config = new HashMap<>();
        config.put("name", appConfigProperties.getName());
        config.put("description", appConfigProperties.getDescription());
        config.put("version", appConfigProperties.getVersion());
        config.put("features", appConfigProperties.getFeatures());
        return config;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("application", appConfigProperties.getName());
        return response;
    }
}
