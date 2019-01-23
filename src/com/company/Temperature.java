package com.company;

public class Temperature {
    private double tempF;
    private double tempC;
    private double sumTempF;
    private double avgTempF;
    private double avgTempC;

    public void setTemp(double usrInput){
        tempF = usrInput;
    }

    public double getTempF(){
        return tempF;
    }


    public double convertToCelsius(){
        tempC = ((tempF - 32) / 1.8);
        return tempC;
    }




}
