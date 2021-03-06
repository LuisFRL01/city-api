package com.digitalinnovation.citiesapi.states.resource;

import com.digitalinnovation.citiesapi.states.entity.State;
import com.digitalinnovation.citiesapi.states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public Page<State> states(Pageable page){
        return repository.findAll(page);
    }
}
