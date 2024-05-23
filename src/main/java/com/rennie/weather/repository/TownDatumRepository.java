package com.rennie.weather.repository;

import com.rennie.weather.entity.TownDatum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TownDatumRepository extends JpaRepository<TownDatum, Integer> {
}
