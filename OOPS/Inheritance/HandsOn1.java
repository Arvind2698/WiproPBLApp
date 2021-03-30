package OOPS.Inheritance;

public class HandsOn1 {
    public static void main(String[] arg){
        Animal a=new Bird();
        a.eat();
        a.sleep();
        Bird b=new Bird();
        b.eat();
        b.sleep();
    }
}

class Animal{
    public void eat(){
        System.out.println("Eat method of animal class");
    }
    public void sleep(){
        System.out.println("Sleep method of animal class");
    }
}

class Bird extends Animal{
    public void eat(){
        System.out.println("Eat method of Bird class overriding Animal class");
    }
    public void sleep(){
        System.out.println("Sleep method of Bird class overriding Animal class");
    }
}