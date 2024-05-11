package com.rennie.weather.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.Instant;
import java.time.LocalTime;

@Entity
@Table(name = "sunrise_sunset_data")
public class SunriseSunsetDatum {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    private TownDatum location;

    @Column(name = "time", nullable = false)
    private Instant time;

    @Column(name = "sunrise_time", nullable = false)
    private LocalTime sunriseTime;

    @Column(name = "sunset_time", nullable = false)
    private LocalTime sunsetTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TownDatum getLocation() {
        return location;
    }

    public void setLocation(TownDatum location) {
        this.location = location;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public LocalTime getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(LocalTime sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public LocalTime getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(LocalTime sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

}
