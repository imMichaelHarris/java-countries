package com.javacountries.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static CountryList countryList;
    public static void main(String[] args) {

        countryList = new CountryList();
        SpringApplication.run(DemoApplication.class, args);
    }

}
