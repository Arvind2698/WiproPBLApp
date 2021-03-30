package OOPS.StringAndStringBuffer;

public class HandsOn2 {
    public static void main(String[] arg) {
        String str1="Mark";
        String str2="Kate";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        StringBuffer sb3=new StringBuffer();

        char ch=' ';
        for(int i=0;i<str1.length();i++){
            sb3.append(str1.charAt(i));
            if(i==str1.length()-1){
                ch=str1.charAt(i);
            }
        }
        int i=0;
        if(ch==str2.charAt(0)){
            i=1;
        }
        for(;i<str2.length();i++){
            sb3.append(str2.charAt(i));
        }

        System.out.println(sb3);

    }
}
