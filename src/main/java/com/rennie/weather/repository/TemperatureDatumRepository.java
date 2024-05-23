package com.rennie.weather.repository;

import com.rennie.weather.entity.TemperatureDatum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureDatumRepository extends JpaRepository<TemperatureDatum, Integer> {
}
