package OOPS.StringAndStringBuffer;

public class HandsOn10 {
    public static void main(String[] arg){
        String input1="wipro";
        int input2=2;

        System.out.println(modifyString(input1,input2));
    }
    public static String modifyString(String str1,int n){
        StringBuffer sb=new StringBuffer();

        int position=str1.length()-n;
        for(int j=0;j<n;j++){
            for(int i=position;i<str1.length();i++){
                sb.append(str1.charAt(i));
            }
        }

        return sb.toString();
    }
}
