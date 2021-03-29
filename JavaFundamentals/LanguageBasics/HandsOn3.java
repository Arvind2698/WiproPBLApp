package JavaFundamentals.LanguageBasics;

public class HandsOn3 {
    public static void main(String arg[]) {
        while(arg.length==2){
            try{
                int num1=Integer.parseInt(arg[0]);
                int num2=Integer.parseInt(arg[1]);
                System.out.println(num1+num2);
            }catch(Exception e){
                System.out.println("Please check input format");
            }
            return;
        }
        System.out.println("Please Enter two command line arguments");
    }
}
