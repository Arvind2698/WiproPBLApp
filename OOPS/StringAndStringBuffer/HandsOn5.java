package OOPS.StringAndStringBuffer;

public class HandsOn5 {
    public static void main(String[] arg){
        String input="Suman";

        System.out.println(modifyString(input));
    }
    public static String modifyString(String str){
        StringBuffer sb=new StringBuffer();

        for(int i=1;i<str.length()-1;i++){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
