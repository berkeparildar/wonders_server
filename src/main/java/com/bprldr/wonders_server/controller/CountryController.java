package com.bprldr.wonders_server.controller;

import com.bprldr.wonders_server.model.entity.Country;
import com.bprldr.wonders_server.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@CrossOrigin
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Country> getAll() {
        return service.getAllCountries();
    }

    @PostMapping
    public Country create(@RequestBody Country country) {
        return service.saveCountry(country);
    }
}