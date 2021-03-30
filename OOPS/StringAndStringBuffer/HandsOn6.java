package OOPS.StringAndStringBuffer;

public class HandsOn6 {
    public static void main(String[] arg){
        String input1="hi";
        String input2="hello";

        System.out.println(createString(input1,input2));
    }
    public static String createString(String str1,String str2){

        if(str1.length()>str2.length()){
            if(str2.length()==0){
                return str1;
            }else{
                StringBuffer sb=new StringBuffer();
                sb.append(str2);
                sb.append(str1);
                sb.append(str2);

                return sb.toString();
            }
        }else if(str1.length()<str2.length()){
            if(str1.length()==0){
                return str2;
            }else{
                StringBuffer sb=new StringBuffer();
                sb.append(str1);
                sb.append(str2);
                sb.append(str1);

                return sb.toString();
            }
        }else if(str1.length()==str2.length()){
                StringBuffer sb=new StringBuffer();
                sb.append(str1);
                sb.append(str2);
                sb.append(str1);

                return sb.toString();
        }else{
            return null;
        }
    }
}
