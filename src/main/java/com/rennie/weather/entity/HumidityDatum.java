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
@Table(name = "humidity_data")
public class HumidityDatum {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "humidity_level")
    private Float humidityLevel;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "location_id", nullable = false)
    private TownDatum location;

    @Column(name = "time", nullable = false)
    private Instant time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getHumidityLevel() {
        return humidityLevel;
    }

    public void setHumidityLevel(Float humidityLevel) {
        this.humidityLevel = humidityLevel;
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
