package AbstractionAndOthers.ExceptionHandling;

import java.util.Scanner;

public class HandsOn2 {
    public static void main(String[] arg){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in a array");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter position that you want to get the element at");
        int index=sc.nextInt();
        try{
            System.out.println("Array element at the index "+index+" = "+arr[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }

    }
}