/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rennie.weather.model;

/**
 *
 * @author hp
 */
public class Value {
    private float humidity;
    public float getHumidity(){
        return humidity;
    }
    public void setHumidity(float humidity){
        this.humidity = humidity;
    }
    //precipitation values
    private float precipitationProbability;
    public float getPrecipitationProbability(){
        return precipitationProbability;
    }
    public void setPrecipitationProbability(float precipitationProbability){
        this.precipitationProbability = precipitationProbability;
    }
    //temperature values
    private float temperature;
    public float getTemperature(){
        return temperature;
    }
    public void setTemperature(float temperature){
        this.temperature = temperature;
    }
   
    //windspeed
    private float windspeed;
    public float getWindspeed(){
        return windspeed;
    }
    public void setWindspeed(float windspeed){
        this.windspeed = windspeed;
    }
    //sunrise
    private float sunrisetime;
    public float getSunriseTime(){
        return sunrisetime;
    }
    public void setSunriseTime(float sunrisetime){
        this.sunrisetime = sunrisetime;
    }
    //sunset
    private float sunsettime;
    public float getSunsetTime(){
        return sunsettime;
    }
    public void setSunsetTime(float sunsettime){
        this.sunsettime = sunsettime;
    }
}
