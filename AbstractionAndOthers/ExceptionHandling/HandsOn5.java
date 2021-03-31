package AbstractionAndOthers.ExceptionHandling;

public class HandsOn5 {
    public static void main(String[] arg) {
        try{
            double ans=division(2,0);
            System.out.println(ans);
        }catch(ArithmeticException e){
            System.out.println("Exception occurred");
        }
    }
    public static double division(int num1,int num2) throws ArithmeticException{
        return (double)num1/num2;
    }
}
