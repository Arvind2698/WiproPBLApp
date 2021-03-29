package JavaFundamentals.LanguageBasics;

public class HandsOn2 {
    public static void main(String arg[]) {
        while(arg.length==1){
            String output="Welcome "+arg[0];
            System.out.println(output);
            return;
        }
        System.out.println("Please Enter one command line arguments");
    }
}
