package com.bprldr.wonders_server.model.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class OpenHours {
    private String openStart;
    private String openEnd;
}