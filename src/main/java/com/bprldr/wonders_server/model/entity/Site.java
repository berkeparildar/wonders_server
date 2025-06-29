package com.bprldr.wonders_server.model.entity;

import com.bprldr.wonders_server.model.entity.Country;
import com.bprldr.wonders_server.model.entity.OpenHours;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Site {

    @Id
    private Integer id;

    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private SiteType type;

    private Double latitude;

    private Double longitude;

    @Embedded
    private OpenHours openHours;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "country_id")
    private Country country;

    public enum SiteType {
        historicSite,
        religiousSite,
        castle,
        walkingArea,
        museum
    }

}