package LogicBuilding.LC5;

import java.util.Random;

public class Activity5 {
    public static void main(String arg[]) {
        int[] array1=new int[15];
        int[] array2=new int[15];

        Random rand=new Random();

        for(int i=0;i<15;i++){
            array1[i]=rand.nextInt(101);
        }
        for(int i=0;i<15;i++){
            array2[i]=rand.nextInt(101);
        }

        sort(array1);
        sort(array2);

        System.out.println("array 1 after desc sort");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println("\narray 2 after desc sort");
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+" ");
        }
        int[] result=merge(array1,array2);

        System.out.println("\narray after merge");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }


    }

    public static void sort(int[] input){

        int n=input.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (input[j] < input[j+1])
                {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }

    }

    public static int[] merge(int[] input1,int[] input2){

        int[] result=new int[input1.length+input2.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<input1.length && j<input2.length) {
            if(input1[i]>input2[j]){
                result[k]=input1[i];
                i++;
                k++;
            }else if(input2[j]>input1[i]){
                result[k]=input2[j];
                j++;
                k++;
            }else if(input1[i]==input2[j]){
                result[k]=input1[i];
                k++;
                result[k]=input2[j];
                k++;
                j++;
                i++;
            }
        }

        while(i<input1.length){
            result[k]=input1[i];
            k++;i++;
        }
        while(j<input2.length){
            result[k]=input1[j];
            k++;j++;
        }

        return result;
    }
}
