package AbstractionAndOthers.AbstractClass;

import java.util.Random;

public class HandsOn2 {
    public static void main(String[] arg) {
        Compartment[] train=new Compartment[10];

        Random ran=new Random();
        for(int i=0;i<10;i++){
            int num=ran.nextInt(4)+1;
            if(num==1){
                train[i]=new FirstClass();
            }else if(num==2){
                train[i]=new Ladies();
            }else if(num==3){
                train[i]=new General();
            }else if(num==4){
                train[i]=new Luggage();
            }
        }
        for(int i=0;i<10;i++){
            Compartment c=train[i];
            System.out.println(c.notice());
        }

    }
}

abstract class Compartment{
    public abstract String notice();
}

class FirstClass extends Compartment{
    public String notice(){
        return("First Class");
    }
}
class Ladies extends Compartment{
    public String notice(){
        return("Ladies");
    }
}
class General extends Compartment{
    public String notice(){
        return("General");
    }
}
class Luggage extends Compartment{
    public String notice(){
        return("Luggage");
    }
}