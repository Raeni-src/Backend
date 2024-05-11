package com.rennie.weather.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_data")
public class CountryDatum {
    @Id
    @Column(name = "country_id", nullable = false)
    private Integer id;

    @Column(name = "country_name", nullable = false, length = 45)
    private String countryName;

    @Column(name = "continent", nullable = false, length = 45)
    private String continent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

}
