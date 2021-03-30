package OOPS.OverridingAndPolymorphism;

public class HandsOn1 {
    public static void main(String[] arg){
        Apple apple=new Apple("Apple","sweet","small");
        apple.eat();

        Orange orange=new Orange("Orange","sour", "small");
        orange.eat();
    }
}

class Fruit{
    public String name;
    public String taste;
    public String size;

    public Fruit(String name,String taste,String size){
        this.name=name;
        this.taste=taste;
        this.size=size;
    }
    public void eat(){
        System.out.println("Fruit class eat method");
    }
}

class Apple extends Fruit{
    public Apple(String name,String taste,String size){
        super(name, taste, size);
    }
    public void eat(){
        System.out.println("Apple tastes sweet");
    }
}

class Orange extends Fruit{
    public Orange(String name,String taste,String size){
        super(name, taste, size);
    }
    public void eat(){
        System.out.println("Orange tastes sour");
    }
}