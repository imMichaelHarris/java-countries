package com.javacountries.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController {
     // /population/size/{people} - return the countries that have a population equal to or greater than the given population
    @GetMapping(value = "/size/{people}", produces = {"application/json"})
        public ResponseEntity<?> getEqualOrLarger(@PathVariable int people){
        ArrayList<Country> sorted = DemoApplication.countryList.sortedCountries(country -> country.getPopulation() >= people);
        return new ResponseEntity<>(sorted, HttpStatus.OK);
    }

    // /population/min - return the country with the smallest population

    // /population/max - return the country with the largest population
}
