package com.automobile.fourwheeler;

import com.automobile.*;

public class Ford extends Vehicle {
    public String getModelName(){
        return "Ford GT";
    }
    public String getRegistrationNumber(){
        return "123Q44G#";
    }
    public String getOwnerName(){
        return "Mark Corey";
    }
    public int speed(){
        return 450;
    }
    public int tempControl(){
        return 24;
    }
}
