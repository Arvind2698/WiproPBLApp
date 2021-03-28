package LogicBuilding.LC4;

import java.util.Scanner;

public class Activity2 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        char[] charArray=input.toCharArray();
        int isVowel=0;

        for(int i=0;i<charArray.length;i++){
            char temp=charArray[i];
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u'){
                charArray[i]='z';
                isVowel++;
            }
        }

        input=String.valueOf(charArray);

        if(isVowel==0){
            System.out.println("No vowels present");
        }else{
            System.out.println("After the replacement: "+ input);
        }

        sc.close();
    }
}
