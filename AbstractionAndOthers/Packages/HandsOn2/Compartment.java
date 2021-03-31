package com.wipro.automobile.ship;

public class Compartment {
    public int height;
    public int width;
    public int length;

    Compartment(){
        this.height=10;
        this.length=10;
        this.width=10;
    }

    public void printDimensions(){
        System.out.println("The dimensions are "+this.height+"X"+this.width+"X"+this.length);
    }

    public static void main(String[] arg){
        System.out.println("WORKING");
    }
}
