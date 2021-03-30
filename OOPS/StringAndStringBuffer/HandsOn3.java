package OOPS.StringAndStringBuffer;

public class HandsOn3 {
    public static void main(String[] arg){
        String str="Wipro";

        char ch1=str.charAt(0);
        char ch2=str.charAt(1);

        StringBuffer sb=new StringBuffer();

        for(int i=0;i<str.length();i++){
            sb.append(ch1);
            sb.append(ch2);
        }

        System.out.println(sb);
    }
}
