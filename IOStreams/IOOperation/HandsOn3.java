package IOStreams.IOOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HandsOn3 {
    public static void main(String[] args) throws IOException{
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the file whose content you want to study");
        // String input=sc.next();

        File fInput=new File("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\Data\\input.txt");
        if(!fInput.exists()){
            System.out.println("File not found");
            // sc.close();
            return;
        }
        FileReader fr=new FileReader(fInput);
        BufferedReader br=new BufferedReader(fr);

        // System.out.println("Enter the file to which you want to write the results");
        // String output=sc.next();

        File fOutput=new File("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\Data\\inputResult.txt");
        if(!fOutput.exists()){
            System.out.println("Creating a new file "+fOutput);
        }
        FileWriter fw=new FileWriter(fOutput);
        PrintWriter pw=new PrintWriter(fw);



        TreeMap<String,Integer> map=new TreeMap<>();
        String inputString=br.readLine();
        while(inputString!=null){
            String[] inputArray=inputString.split("\\W+");
            wordCounter(inputArray, map);
            inputString=br.readLine();
        }

        Iterator itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry entrySet=(Map.Entry)itr.next();
            pw.println((String)entrySet.getKey()+" : "+(Integer)entrySet.getValue());
        }

        pw.flush();
        br.close();
        pw.close();

        // System.out.println(map);
    }
    public static void wordCounter(String[] inputArray,TreeMap<String,Integer> map){
        for(String str : inputArray){
            str=str.toLowerCase();
            if(map.containsKey(str)){
                int value=map.get(str)+1;
                map.put(str, value);
            }else{
                map.put(str,1);
            }
        }
    }
}
