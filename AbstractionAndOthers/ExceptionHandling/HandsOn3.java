package AbstractionAndOthers.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandsOn3 {
    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a array");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] arr=new int[n];
        try{
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
        }catch(InputMismatchException e){
            System.out.println("java.lang.InputMismatchException");
            sc.close();
            return;
        }

        System.out.println("Enter position that you want to get the element at");
        int index=sc.nextInt();
        try{
            System.out.println("Array element at the index "+index+" = "+arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }finally{
            sc.close();
        }

    }
}
