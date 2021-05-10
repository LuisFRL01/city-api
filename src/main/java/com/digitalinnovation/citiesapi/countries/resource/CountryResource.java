package com.digitalinnovation.citiesapi.countries.resource;

import com.digitalinnovation.citiesapi.countries.entity.Country;
import com.digitalinnovation.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping
    private Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

}
