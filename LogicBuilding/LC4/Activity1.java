package LogicBuilding.LC4;

import java.util.Scanner;

public class Activity1 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        char[] charArray=input.toCharArray();

        for(int i=0;i<charArray.length/2;i++){
            // System.out.println(charArray[i]);
            char temp=charArray[i];
            charArray[i]=charArray[charArray.length-1-i];
            charArray[charArray.length-1-i]=temp;
        }

        input=String.valueOf(charArray);
        System.out.println("The string after reversing is: "+ input);
        sc.close();
    }
}
