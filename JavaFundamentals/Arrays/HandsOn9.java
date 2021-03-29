package JavaFundamentals.Arrays;

public class HandsOn9 {
    public static void main(String[] args) {

        if(args.length!=4){
            System.out.println("Enter 4 integers");
            return;
        }

        int[][] arr=new int[2][2];
        int k=0;

        try{
            for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    arr[i][j]=Integer.parseInt(args[k]);
                    k++;
                }
            }
        }catch(Exception e){
            System.out.println("Invalid Input Format");
            return;
        }

        System.out.println("Original Array: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arrRev=new int[2][2];

        int n=0;
        int m=0;
        for(int i=1;i>=0;i--){
            m=0;
            for(int j=1;j>=0;j--){
                arrRev[m][n]=arr[j][i];
                m+=1;
            }
            n+=1;
        }

        System.out.println("\nReverse Array: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arrRev[i][j]+" ");
            }
            System.out.println();
        }

    }
}
