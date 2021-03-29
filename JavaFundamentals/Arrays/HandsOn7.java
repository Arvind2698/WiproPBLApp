package JavaFundamentals.Arrays;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class HandsOn7 {
    public static void main(String[] args) {
        int[] arrayWithDuplicates={1,1,1,2,3,3,3,4,4,5,6,7,7,8,9,10,11,11,2,3};

        System.out.println("Original Array:");
        for(int i=0;i<20;i++){
            System.out.print(arrayWithDuplicates[i]+" ");
        }

        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<20;i++){
            set.add(arrayWithDuplicates[i]);
        }

        int[] arrayWithoutDuplicates=new int[set.size()];
        int j=0;
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
            arrayWithoutDuplicates[j]=itr.next();
            j++;
        }

        System.out.println("\nArray without duplicates: ");
        for(int i=0;i<arrayWithoutDuplicates.length;i++){
            System.out.print(arrayWithoutDuplicates[i]+" ");
        }
    }
}
