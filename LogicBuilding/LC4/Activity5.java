package LogicBuilding.LC4;

import java.util.Scanner;

public class Activity5 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String input1=sc.next();
        String input2=sc.next();

        input2=reverseString(input2);

        String combinedString=joinStrings(input1, input2);

        System.out.println(combinedString);
        
        sc.close();
    }

    public static String reverseString(String input) {
        char[] charArray=input.toCharArray();
        for(int i=0;i<charArray.length/2;i++){
            char temp=charArray[i];
            charArray[i]=charArray[charArray.length-1-i];
            charArray[charArray.length-1-i]=temp;
        }
        input=String.valueOf(charArray);
        return input;
    }
    public static String joinStrings(String input1,String input2){
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
        return (String.valueOf(charArray3));
    }
}
