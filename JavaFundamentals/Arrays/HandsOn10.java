package JavaFundamentals.Arrays;

public class HandsOn10 {
    public static void main(String[] args) {

        if(args.length!=9){
            System.out.println("Enter 9 integers");
            return;
        }

        int[][] arr=new int[3][3];
        int k=0;

        try{
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    arr[i][j]=Integer.parseInt(args[k]);
                    k++;
                }
            }
        }catch(Exception e){
            System.out.println("Invalid Input Format");
            return;
        }

        System.out.println("Original Array: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int maxElement=arr[0][0];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]>maxElement){
                    maxElement=arr[i][j];
                }
            }
        }

        System.out.println("\nThe largest element present in the 2D array is: "+maxElement);
    }
}
