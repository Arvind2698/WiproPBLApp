package OOPS.StringAndStringBuffer;

public class HandsOn11 {
    public static void main(String[] arg){
        String input1="XY1234XY";
        String input2="XY";

        System.out.println(modifyString(input1,input2));
    }
    public static String modifyString(String str1,String str2){
        StringBuffer sb=new StringBuffer();

        int location;
        int before;
        int after;
        while(str1.indexOf(str2)!=-1){
            location =str1.indexOf(str2);
            before =location-1;
            after =before+str2.length()+1;

            if(before>=0 && after<=str1.length()-1){
                sb.append(str1.charAt(before));
                sb.append(str1.charAt(after));
            }else if(before<0 && after<=str1.length()-1){
                sb.append(str1.charAt(after));
            }else if(after>str1.length()-1 && before>=0){
                sb.append(str1.charAt(before));
            }
            str1=str1.substring(after);
        }

        return sb.toString();
    }
}
