package OOPS.StringAndStringBuffer;

public class HandsOn1 {
    public static void main(String[] arg) {
        StringBuffer sb=new StringBuffer("malayalam");

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("String is a palindrome");
    }
}
