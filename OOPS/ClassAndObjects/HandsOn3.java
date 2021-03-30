package OOPS.ClassAndObjects;

import java.util.Scanner;

public class HandsOn3 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the patient name");
        String name=sc.next();
        System.out.println("Enter the patient height(cm)");
        double height=sc.nextDouble();
        height=height/100;
        System.out.println("Enter the patient weight");
        double weight=sc.nextDouble();

        Patient p=new Patient(name,height,weight);
        System.out.println(p.getName()+" has a BMI of "+p.getBMI());

        sc.close();
    }
}

class Patient{
    private String name;
    private double height;
    private double weight;

    public Patient(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    public String getName(){
        return this.name;
    }
    public double getBMI(){
        return (this.weight)/(this.height*this.height);
    }
}
