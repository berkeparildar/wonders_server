package com.bprldr.wonders_server.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.bprldr.wonders_server.model.entity.Site;

import java.util.List;

@Entity
@Data
public class Country {
    @Id
    private Integer id;

    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "sites_url")
    private String sitesUrl;
}
