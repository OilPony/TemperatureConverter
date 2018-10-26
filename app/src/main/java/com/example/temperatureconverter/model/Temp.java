package com.example.temperatureconverter.model;

public class Temp {
    private int ed;
    public Temp(int ed){
        this.ed = ed;
    }

    public double TempCalToF(){
        int c = this.ed;

        double cf = (c * 1.8) +32;
                //(this.ed * (9/5))+32;
        return cf;
        //(1.8 × °C) + 33
    }

    public double FToCal(){
        int f = this.ed;
        double fc = (f - 32) /1.8;
        //(this.ed * (9/5))+32;
        return fc;
        //(F - 32) x 5/9
    }

}
