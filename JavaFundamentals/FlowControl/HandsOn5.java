package JavaFundamentals.FlowControl;

public class HandsOn5 {
    public static void main(String[] arg) {
        char ch='9';

        if( ((int)ch >= 97 && (int)ch<=122) || ((int)ch >= 65 && (int)ch<=90) ) {
            System.out.println("character is an alphabet");
        }else if((int)ch >= 48 && (int)ch<= 57){
            System.out.println("character is a digit");
        }else{
            System.out.println("character is special character");
        }
    }
}
