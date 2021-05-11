package com.digitalinnovation.citiesapi.cities.repository;

import com.digitalinnovation.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {}
