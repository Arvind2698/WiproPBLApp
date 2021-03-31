package AbstractionAndOthers.AbstractClass;

import java.util.Random;

public class HandsOn3 {
    public static void main(String[] arg){
        Instrument[] instruments=new Instrument[10];
        Random ran=new Random();
        for(int i=0;i<10;i++){
            int num=ran.nextInt(3)+1;
            if(num==1){
                instruments[i]=new Piano();
            }else if(num==2){
                instruments[i]=new Flute();
            }else if(num==3){
                instruments[i]=new Guitar();
            }
        }

        for(int i=0;i<10;i++){
            Instrument obj=instruments[i];
            System.out.println(obj.getClass());
        }
    }
}

abstract class Instrument {
    public abstract void play();
}

class Piano extends Instrument{
    public void play(){
        System.out.println("Piano is playing");
    }
}

class Flute extends Instrument{
    public void play(){
        System.out.println("Flute is playing");
    }
}

class Guitar extends Instrument{
    public void play(){
        System.out.println("Guitar is playing");
    }
}