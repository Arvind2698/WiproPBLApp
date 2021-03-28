package LogicBuilding.LC2;

import java.util.Scanner;
import java.util.Stack;

public class Activity3 {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

        int input=sc.nextInt();

        Stack<Integer> stack =new Stack<>();

        while(input>0){
            if(input%2 == 0){
                stack.push(0);
                input=input/2;
            }else{
                stack.push(1);
                input=input/2;
            }
        }

        StringBuffer sb=new StringBuffer();
        while(stack.size()>0){
            sb.append(stack.pop()+"");
        }
        System.out.print(sb);

        sc.close();
    }
}
