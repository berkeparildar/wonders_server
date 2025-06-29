package com.bprldr.wonders_server.repository;

import com.bprldr.wonders_server.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    Optional<Country> findByName(String name);
}
