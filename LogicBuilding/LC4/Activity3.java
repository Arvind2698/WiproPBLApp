package LogicBuilding.LC4;

import java.util.Scanner;

public class Activity3 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

        String input1=sc.next();
        String input2=sc.next();

        char[] charArray1=input1.toCharArray();
        char[] charArray2=input2.toCharArray();
        char[] charArray3=new char[charArray1.length+charArray2.length];

        for(int i=0;i<charArray1.length;i++){
            charArray3[i]=charArray1[i];
        }
        int j=0;
        for(int i=charArray1.length;i<charArray1.length+charArray2.length;i++){
            charArray3[i]=charArray2[j];
            j++;
        }

        System.out.println(String.valueOf(charArray3));

        sc.close();
    }
}
