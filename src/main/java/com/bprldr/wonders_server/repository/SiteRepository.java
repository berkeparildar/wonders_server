package com.bprldr.wonders_server.repository;

import com.bprldr.wonders_server.model.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SiteRepository extends JpaRepository<Site, Integer> {
    List<Site> findByCountry_NameIgnoreCase(String countryName);
}