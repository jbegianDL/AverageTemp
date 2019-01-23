package com.company;

public class Temperature {
    private double tempF;
    private double tempC;
    private double convertTempF;

    public void setTempF(double fTempValue){
        tempF = fTempValue;
    }

    public double getTempF(){
        return tempF;
    }

    public void setTempC(double cTempValue){
        tempC = cTempValue;
    }

    public double getTempC(){
        return tempC;
    }


    public double convertToCelsius(){
        convertTempF = ((tempF - 32) / 1.8);
        return convertTempF;
    }




}
