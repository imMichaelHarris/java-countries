package com.javacountries.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;

@RestController
@RequestMapping("/names")
public class NamesController {

    // /names/all - return names alphabetically
    @GetMapping(value = "/all", produces = {"application/json"})
    public ResponseEntity<?> getAllCountries(){
        return new ResponseEntity<>(DemoApplication.countryList.countryList, HttpStatus.OK);
    }
    // /names/start/{letter} - return alphabetically that start with letter
    @GetMapping(value = "/start/{letter}", produces = {"application/json"})
    public ResponseEntity<?> sortByLetter(@PathVariable char letter){
        ArrayList<Country> sorted = DemoApplication.countryList.sortedCountries(country -> country.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        System.out.println(sorted);
        return new ResponseEntity<>(sorted, HttpStatus.OK);
    }

    // /names/size/{number} - eturn the countries alphabetically that have a name equal to or longer than the given length
}
