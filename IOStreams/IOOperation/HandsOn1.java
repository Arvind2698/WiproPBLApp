package IOStreams.IOOperation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HandsOn1 {
    public static void main(String[] arg)throws IOException{
        File f=new File("C:\\Users\\ASUS\\Desktop\\WiproPBLApp\\IOStreams\\Data\\input.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        FileReader fr=new FileReader(f);
        char[] charArray=new char[(int)f.length()];

        System.out.println("Enter the character you wan to search");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();

        char lower=input.toLowerCase().charAt(0);
        char upper=input.toUpperCase().charAt(0);

        fr.read(charArray);
        int letterCounter=0;
        for(char ch : charArray){
            if(ch==lower || ch==upper){
                letterCounter++;
            }
        }
        System.out.println(input.charAt(0)+" has occurred "+letterCounter+" times.");

        fr.close();
        sc.close();
    }
}
