package JavaFundamentals.FlowControl;

public class HandsOn16 {
    public static void main(String[] arg){
        int i=1;
        while(i<=3){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            i++;
        }
    }
}
