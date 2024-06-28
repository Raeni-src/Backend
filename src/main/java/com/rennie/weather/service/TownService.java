/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rennie.weather.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class TownDatumService {
    private final TownDatumRepository towndatumRepository;
   
    @Autowired
    public TownDatumService(TownDatumRepository towndatumRepositiry){
        this.townDatumRepository = townDatumRepository;
    }
    
    
    public List<TownDatum> getAllTowns(){
        return townDatumRepository.findAll();
    }
}
