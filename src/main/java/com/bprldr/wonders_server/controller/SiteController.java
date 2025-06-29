package com.bprldr.wonders_server.controller;

import com.bprldr.wonders_server.model.entity.Site;
import com.bprldr.wonders_server.service.SiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sites")
@CrossOrigin
@RequiredArgsConstructor
public class SiteController {

    private final SiteService siteService;

    @GetMapping("/{countryName}")
    public List<Site> getSitesByCountry(@PathVariable String countryName) {
        return siteService.getSitesByCountryName(countryName);
    }
}