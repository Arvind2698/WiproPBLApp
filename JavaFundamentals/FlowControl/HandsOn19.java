package JavaFundamentals.FlowControl;

public class HandsOn19 {
    public static void main(String[] args){
        int count=0;
        int i=0;
        int arr[]=new int[5];

        while(count!=5){
            if(i%2==0 && i%3==0 && i%5==0){
                arr[count]=i;
                count++;
            }
            i++;
        }

        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
