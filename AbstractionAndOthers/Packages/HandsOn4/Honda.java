package com.automobile.twowheeler;

import com.automobile.*;

public class Honda extends Vehicle{
    public String getModelName(){
        return "Honda CBR650";
    }
    public String getRegistrationNumber(){
        return "123QWYFG#";
    }
    public String getOwnerName(){
        return "Kelvin Ramachandran";
    }
    public int getSpeed(){
        return 200;
    }
    public void cdPlayer(){
        System.out.println("Control the cd player available");
    }
}