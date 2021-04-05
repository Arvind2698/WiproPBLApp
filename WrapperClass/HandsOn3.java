package WrapperClass;

import java.util.Scanner;

public class HandsOn3 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer between(1..255) ");
        int num=sc.nextInt();
        System.out.println("Given number: "+num);
        String numBinary=Integer.toBinaryString(num);

        if(numBinary.length()==8){
            System.out.println("Binary equivalent:" +numBinary);
        }else{
            int numOfZero=8-numBinary.length();
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<numOfZero;i++){
                sb.append("0");
            }
            sb.append(numBinary);
            System.out.println("Binary equivalent:" +sb.toString());
        }
        sc.close();
    }
}
