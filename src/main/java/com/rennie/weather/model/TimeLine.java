/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.rennie.weather.model;

import java.util.List;

/**
 *
 * @author hp
 */
public class TimeLine {
    private List<DailyTime> daily;
    public List<DailyTime> getDaily(){
         return daily;
     }
     public void setDaily(List<DailyTime> daily) {
         this.daily = daily;
     }
}
