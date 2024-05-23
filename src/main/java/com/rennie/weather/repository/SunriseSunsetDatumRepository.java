package com.rennie.weather.repository;

import com.rennie.weather.entity.SunriseSunsetDatum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SunriseSunsetDatumRepository extends JpaRepository<SunriseSunsetDatum, Integer> {
}
