package IOStreams.IOOperation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HandsOn2 {
    public static void main(String[] arg) throws IOException{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file whose content you want to copy");
        String input=sc.next();

        File fInput=new File("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\Data\\"+input);
        if(!fInput.exists()){
            System.out.println("File not found");
            sc.close();
            return;
        }
        FileReader fr=new FileReader(fInput);
        BufferedReader br=new BufferedReader(fr);

        System.out.println("Enter the file to which you want to write");
        String output=sc.next();

        File fOutput=new File("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\Data\\"+output);
        if(!fOutput.exists()){
            System.out.println("Creating a new file "+fOutput);
        }
        FileWriter fw=new FileWriter(fOutput,true);
        PrintWriter pw=new PrintWriter(fw);

        String inputString=br.readLine();
        while(inputString!=null){
            pw.println(inputString);
            inputString=br.readLine();
        }

        pw.flush();
        pw.close();
        br.close();
        sc.close();
    }
}
