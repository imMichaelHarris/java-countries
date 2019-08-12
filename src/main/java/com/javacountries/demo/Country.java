package com.javacountries.demo;

public class Country {
    private String name;
    private long population;
    private long landMass;
    private int medianAge;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getLandMass() {
        return landMass;
    }

    public void setLandMass(long landMass) {
        this.landMass = landMass;
    }

    public int getMedianAge() {
        return medianAge;
    }

    public void setMedianAge(int medianAge) {
        this.medianAge = medianAge;
    }
}
