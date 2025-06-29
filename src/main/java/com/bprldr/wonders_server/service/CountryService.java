package com.bprldr.wonders_server.service;

import com.bprldr.wonders_server.model.entity.Country;
import com.bprldr.wonders_server.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository repository;

    public List<Country> getAllCountries() {
        return repository.findAll();
    }

    public Country saveCountry(Country country) {
        return repository.save(country);
    }

    public Country getCountryByName(String name) {
        return repository.findByName(name).orElse(null);
    }
}