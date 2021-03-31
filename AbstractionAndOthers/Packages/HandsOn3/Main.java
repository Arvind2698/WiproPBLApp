package com.automobile;

import com.automobile.twowheeler.*;

public class Main {
    public static void main(String[] arg) {
        Honda honda=new Honda();
        Hero hero=new Hero();

        System.out.print(honda.getModelName()+"\n"+honda.getOwnerName()+"\n");
        System.out.print(hero.getModelName()+"\n"+hero.getOwnerName());

    }
}
