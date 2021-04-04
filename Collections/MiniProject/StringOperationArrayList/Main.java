package stringOperation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] arg){
        System.out.println("Enter the two strings");
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        ArrayList<String> result=new ArrayList<>();

        StringBuffer sb1=new StringBuffer();
        StringBuffer sb2=new StringBuffer();
        StringBuffer sb3=new StringBuffer();
        StringBuffer sb4=new StringBuffer();
        StringBuffer sb5=new StringBuffer();

        for(int i=0;i<s1.length();i++){
            if(i%2==0){
                sb1.append(s2);
            }else{
                sb1.append(s1.charAt(i));
            }
        }

        result.add(sb1.toString());

        if(findMatch(s1, s2)>1){
            int arr[]=findLastLocation(s1,s2);

            // System.out.println(arr[0]+" "+arr[1]);

            boolean append=true;
            for(int i=0;i<s1.length();i++){
                if(i>=arr[0] && i<=arr[1]-1){
                    if(append==true){
                        sb2.append(reverse(s2));
                        append=false;
                    }
                }else{
                    sb2.append(s1.charAt(i));
                }
            }

        }else{
            sb2.append(s1);
            sb2.append(s2);
        }

        result.add(sb2.toString());

        if(findMatch(s1, s2)>1){
            int arr[]=findFirstLocation(s1,s2);

            // System.out.println(arr[0]+" "+arr[1]);

            boolean append=true;
            for(int i=0;i<s1.length();i++){
                if(i>=arr[0] && i<=arr[1]-1){
                }else{
                    sb3.append(s1.charAt(i));
                }
            }

        }else{
            sb3.append(s1);
        }

        result.add(sb3.toString());

        if(s2.length()%2==0){
            sb4.append(s2.substring(0, s2.length()/2));
            sb4.append(s1);
            sb4.append(s2.substring(s2.length()/2, s2.length()));
        }else{
            sb4.append(s2.substring(0, s2.length()/2+1));
            sb4.append(s1);
            sb4.append(s2.substring(s2.length()/2+1, s2.length()));
        }

        result.add(sb4.toString());

        for(int i=0;i<s1.length();i++){
            char outer=s1.charAt(i);
            boolean found=false;
            for(int j=0;j<s2.length();j++){
                if(outer==s2.charAt(j)){
                    sb5.append('*');
                    found=true;
                    break;
                }
            }
            if(!found){
                sb5.append(s1.charAt(i));
            }
        }

        result.add(sb5.toString());


        System.out.println(result);



    }
    public static String reverse(String input){
        char[] inputArr=input.toCharArray();

        for(int i=0;i<inputArr.length/2;i++){
            char ch=inputArr[i];
            inputArr[i]=inputArr[inputArr.length -1 -i ];
            inputArr[inputArr.length -1 -i ]=ch;
        }

        return String.valueOf(inputArr);
    }

    public static int findMatch(String input,String toMatch){

        Pattern p =Pattern.compile(toMatch);
        Matcher m=p.matcher(input);

        int count=0;
        while(m.find()){
            count++;
        }

        return count++;
    }
    public static int[] findLastLocation(String input,String toMatch){

        Pattern p =Pattern.compile(toMatch);
        Matcher m=p.matcher(input);

        int start=0;
        int end=0;
        while(m.find()){
            start=m.start();
            end=m.end();
        }

        int[] arr={start,end};

        return arr;
    }
    public static int[] findFirstLocation(String input,String toMatch){

        Pattern p =Pattern.compile(toMatch);
        Matcher m=p.matcher(input);

        int start=0;
        int end=0;
        while(m.find()){
            start=m.start();
            end=m.end();
            break;
        }

        int[] arr={start,end};

        return arr;
    }
}