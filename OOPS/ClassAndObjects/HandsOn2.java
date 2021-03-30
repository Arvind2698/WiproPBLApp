package OOPS.ClassAndObjects;

public class HandsOn2 {
    public static void main(String[] arg){
        int a=20;
        int b=2;

        System.out.println("Power of ints");
        System.out.println(Calculator.powerInt(a, b));

        double c=2.4;
        double d=3.3;

        System.out.println("Power of doubles");
        System.out.println(Calculator.powerDouble(c, d));
    }
}

class Calculator{
    public static double powerInt(int num1,int num2){
        return Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,double num2){
        return Math.pow(num1,num2);
    }
}
