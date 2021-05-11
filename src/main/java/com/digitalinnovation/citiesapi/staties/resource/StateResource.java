package com.digitalinnovation.citiesapi.staties.resource;

import com.digitalinnovation.citiesapi.staties.entity.State;
import com.digitalinnovation.citiesapi.staties.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public Page<State> staties(Pageable page){
        return repository.findAll(page);
    }
}
