package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn18 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        String temp=num+"";
        char[] ch=temp.toCharArray();

        for(int i=0;i<ch.length/2;i++){
            if(ch[i]!=ch[ch.length-1-i]){
                System.out.println(num+" is not a palindrome");
                sc.close();
                return;
            }
        }

        System.out.println(num+" is a palindrome");
        sc.close();
    }
}
