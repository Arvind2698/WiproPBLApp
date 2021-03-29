package JavaFundamentals.FlowControl;

public class HandsOn7 {
    public static void main(String[] arg){
        char ch='k';
        char ch1=' ';

        if((int)ch >= 97 && (int)ch<=122){
            ch1=(char)((int)ch-32);
        }else if((int)ch >= 65 && (int)ch<=90){
            ch1=(char)((int)ch+32);
        }

        System.out.println(ch+"->"+ch1);
    }
}
