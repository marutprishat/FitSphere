package com.fitness.Activityservice.dto;
import com.fitness.Activityservice.model.ActivityType;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ActivityRequest {
    private String userId;
    private ActivityType type;
    private Integer calories;
    private Integer duration;
    private LocalDateTime startTime;
    private Map<String,Object> additionalMetrics;
}
