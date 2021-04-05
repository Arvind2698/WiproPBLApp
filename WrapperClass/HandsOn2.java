package WrapperClass;

public class HandsOn2 {
    public static void main(String[] arg){
        int num=Integer.valueOf(arg[0]);
        System.out.println("Given number: "+num);
        System.out.println("Binary equivalent: "+Integer.toBinaryString(num));
        System.out.println("Octal equivalent: "+Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent: "+Integer.toHexString(num));
    }
}
