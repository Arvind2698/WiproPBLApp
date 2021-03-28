package LogicBuilding.LC2;

import java.util.Scanner;

public class Activity4 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

        String input=sc.next();
        int length=input.length()-1;
        double number=0;

        try{
            for(int i=0;i<input.length();i++){
                int digit=Integer.valueOf(input.charAt(i)+"");
                if(digit == 0){
                    number=number+(0*Math.pow(2, length));
                }else if(digit== 1){
                    number=number+(1*Math.pow(2, length));
                }else{
                    throw new NotInBinaryFormat();
                }
                length--;
            }
        }catch(NotInBinaryFormat e){
            System.out.print(e);
            return;
            
        }finally{
            sc.close();
        }

        System.out.print("The binary representation of "+input+" is "+number);
    }
}

class NotInBinaryFormat extends Exception{
    public String toString(){
        return ("Input is not a binary");
    }
}