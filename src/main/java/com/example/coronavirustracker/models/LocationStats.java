package com.example.coronavirustracker.models;

public class LocationStats {

    private String state;
    private String country;
    private int lastTotalCases;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLastTotalCases() {
        return lastTotalCases;
    }

    public void setLastTotalCases(int lastTotalCases) {
        this.lastTotalCases = lastTotalCases;
    }
}
