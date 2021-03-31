package com.automobile.twowheeler;

import com.automobile.*;

public class Hero extends Vehicle {
    public String getModelName(){
        return "Hero Splender";
    }
    public String getRegistrationNumber(){
        return "123QWYFG#";
    }
    public String getOwnerName(){
        return "Arvind Ramachandran";
    }
    public int getSpeed(){
        return 100;
    }
    public void radio(){
        System.out.println("Radio not control available");
    }
}

