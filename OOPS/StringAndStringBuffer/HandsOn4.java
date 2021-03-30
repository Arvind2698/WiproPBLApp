package OOPS.StringAndStringBuffer;

public class HandsOn4 {
    public static void main(String[] arg){
        String input="TomCat";

        System.out.println(getHalfString(input));
    }
    public static String getHalfString(String str){
        if(str.length()%2==0){
            return str.substring(0, str.length()/2);
        }
        return null;
    }
}
