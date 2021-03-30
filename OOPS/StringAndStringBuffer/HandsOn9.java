package OOPS.StringAndStringBuffer;

public class HandsOn9 {
    public static void main(String[] arg){
        String input1="abcd";
        String input2="wxyz";

        System.out.println(modifyString(input1,input2));
    }
    public static String modifyString(String str1,String str2){
        StringBuffer sb=new StringBuffer();

        if(str1.length()>str2.length()){
            int i;
            for(i=0;i<str2.length();i++){
                sb.append(str1.charAt(i));
                sb.append(str2.charAt(i));
            }
            for(;i<str1.length();i++){
                sb.append(str1.charAt(i));
            }
            return sb.toString();
        }else if(str1.length()<str2.length()){
            int i;
            for(i=0;i<str1.length();i++){
                sb.append(str1.charAt(i));
                sb.append(str2.charAt(i));
            }
            for(;i<str2.length();i++){
                sb.append(str2.charAt(i));
            }
            return sb.toString();
        }else if(str1.length()==str2.length()){
            int i;
            for(i=0;i<str1.length();i++){
                sb.append(str1.charAt(i));
                sb.append(str2.charAt(i));
            }
            return sb.toString();
        }else if(str1.length()==0){
            return str2;
        }
        return str1;
    }
}