package com.rennie.weather.repository;

import com.rennie.weather.entity.WeatherConditionsDatum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherConditionsDatumRepository extends JpaRepository<WeatherConditionsDatum, Integer> {
}
