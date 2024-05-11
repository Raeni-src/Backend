package com.rennie.weather.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.Instant;

@Entity
@Table(name = "weather_conditions_data")
public class WeatherConditionsDatum {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "weather_icons", nullable = false, length = 45)
    private String weatherIcons;

    @Column(name = "weather_conditions", nullable = false, length = 45)
    private String weatherConditions;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private TownDatum location;

    @Column(name = "time", nullable = false)
    private Instant time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(String weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public String getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        this.weatherConditions = weatherConditions;
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

}
