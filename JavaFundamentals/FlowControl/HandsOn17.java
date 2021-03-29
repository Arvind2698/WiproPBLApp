package JavaFundamentals.FlowControl;

import java.util.Scanner;

public class HandsOn17 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        String temp=num+"";
        char[] ch=temp.toCharArray();
        for(int i=0;i<ch.length/2;i++){
            char t=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=t;
        }
        temp=String.valueOf(ch);

        System.out.println("Initial number: "+num);
        System.out.println("Reversed number: "+Integer.valueOf(temp));

        sc.close();
    }
}
