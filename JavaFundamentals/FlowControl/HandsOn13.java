package JavaFundamentals.FlowControl;

public class HandsOn13 {
    public static void main(String[] arg){
        for(int i=10;i<=99;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
