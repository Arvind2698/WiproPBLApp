package OOPS.StringAndStringBuffer;

public class HandsOn7 {
    public static void main(String[] arg){
        String input="xSumanx";

        System.out.println(modifyString(input));
    }
    public static String modifyString(String str){
        StringBuffer sb=new StringBuffer();

        if(str.charAt(str.length()-1)=='x' && str.charAt(0)=='x'){

            for(int i=1;i<str.length()-1;i++){
                sb.append(str.charAt(i));
            }
            return sb.toString();

        }else if(str.charAt(str.length()-1)=='x'){

            for(int i=0;i<str.length()-1;i++){
                sb.append(str.charAt(i));
            }
            return sb.toString();

        }else if(str.charAt(0)=='x'){

            for(int i=1;i<str.length();i++){
                sb.append(str.charAt(i));
            }
            return sb.toString();

        }else{
            return str;
        }
    }
}
