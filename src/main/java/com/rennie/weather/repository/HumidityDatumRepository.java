package com.rennie.weather.repository;

import com.rennie.weather.entity.HumidityDatum;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HumidityDatumRepository extends JpaRepository<HumidityDatum, Integer> {
}
