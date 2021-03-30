package OOPS.StringAndStringBuffer;

public class HandsOn8 {
    public static void main(String[] arg){
        String input="ab*cd*";

        while(input.contains("*")){
            System.out.println(modifyString(input));
            input=modifyString(input);
        }

    }
    public static String modifyString(String str){
        StringBuffer sb=new StringBuffer();
        int before=0;
        int after=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                before=i-1;
                after=i+1;
                break;
            }
        }

        if(before>=0 && after<=str.length()-1 ){
            for(int i=0;i<str.length();i++){
                if(i==before || i==after || i==before+1 ){

                }else{
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }else if(before<0){
            for(int i=0;i<str.length();i++){
                if(i==after || i==after-1 ){

                }else{
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }else if(after>=str.length()){
            for(int i=0;i<str.length();i++){
                if(i==before || i==before+1 ){

                }else{
                    sb.append(str.charAt(i));
                }
            }
            return sb.toString();
        }
        return null;
    }
}
