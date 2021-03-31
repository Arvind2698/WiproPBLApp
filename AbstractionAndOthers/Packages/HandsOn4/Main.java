package com.automobile;

import com.automobile.twowheeler.*;
import com.automobile.fourwheeler.*;

public class Main {
    public static void main(String[] arg) {
        Honda honda=new Honda();
        Hero hero=new Hero();

        System.out.print(honda.getModelName()+"\n"+honda.getOwnerName()+"\n");
        System.out.print(hero.getModelName()+"\n"+hero.getOwnerName());

        Logan logan=new Logan();
        Ford ford=new Ford();

        System.out.print(logan.getModelName()+"\n"+logan.getOwnerName()+"\n");
        System.out.print(ford.getModelName()+"\n"+ford.getOwnerName());

    }
}
