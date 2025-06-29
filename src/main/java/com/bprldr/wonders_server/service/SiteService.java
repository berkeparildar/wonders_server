package com.bprldr.wonders_server.service;

import com.bprldr.wonders_server.model.entity.Site;
import com.bprldr.wonders_server.repository.SiteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SiteService {

    private final SiteRepository siteRepository;

    public List<Site> getSitesByCountryName(String countryName) {
        return siteRepository.findByCountry_NameIgnoreCase(countryName);
    }
}