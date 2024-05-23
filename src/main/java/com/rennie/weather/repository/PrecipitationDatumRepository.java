package com.rennie.weather.repository;

import com.rennie.weather.entity.PrecipitationDatum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrecipitationDatumRepository extends JpaRepository<PrecipitationDatum, Integer> {
}
