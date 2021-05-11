package com.digitalinnovation.citiesapi.staties.repository;

import com.digitalinnovation.citiesapi.staties.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
