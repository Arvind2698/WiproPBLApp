package JavaFundamentals.LanguageBasics;

public class HandsOn1{
    public static void main(String arg[]) {
        while(arg.length==2){
            String output=arg[0]+" Technology "+arg[1];
            System.out.println(output);
            return;
        }
        System.out.println("Please Enter two command line arguments");
    }
}