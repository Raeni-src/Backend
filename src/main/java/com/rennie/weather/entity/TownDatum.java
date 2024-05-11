package com.rennie.weather.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "town_data")
public class TownDatum {
    @Id
    @Column(name = "location_id", nullable = false)
    private Integer id;

    @Column(name = "town_name", nullable = false, length = 45)
    private String townName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "country_id", nullable = false)
    private CountryDatum country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public CountryDatum getCountry() {
        return country;
    }

    public void setCountry(CountryDatum country) {
        this.country = country;
    }

}
