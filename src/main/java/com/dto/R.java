package com.example.demo.dto;

import java.time.LocalDateTime;

public class RouteOptimizationResultDTO {

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsage;
    private LocalDateTime generatedAt;

    public RouteOptimizationResultDTO(Double optimizedDistanceKm,
                                      Double estimatedFuelUsage,
                                      LocalDateTime generatedAt) {
        this.optimizedDistanceKm = optimizedDistanceKm;
        this.estimatedFuelUsage = estimatedFuelUsage;
        this.generatedAt = generatedAt;
    }

    public Double getOptimizedDistanceKm() {
        return optimizedDistanceKm;
    }

    public Double getEstimatedFuelUsage() {
        return estimatedFuelUsage;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }
}
