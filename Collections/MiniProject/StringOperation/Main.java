package StringOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){

        int input=0;
        Scanner sc=new Scanner(System.in);

        ArrayList<String> list=new ArrayList<>();

        while(input !=-1){
            System.out.println("1. Insert\n2. Search\n3. Delete\n4. Display\n5. Exit");
            input=sc.nextInt();

            switch(input){
                case 1:
                    System.out.println("Enter the item to be inserted");
                    String text=sc.next();
                    list.add(text);
                    System.out.println("Item successfully added");
                    break;
                case 2:
                    System.out.println("Enter the item to be searched");
                    String search=sc.next();
                    if(list.contains(search)){
                        System.out.println("Item found in the list");
                    }else{
                        System.out.println("Item not found in the list");
                    }
                    break;
                case 3:
                    System.out.println("Enter the item to be deleted");
                    String delete=sc.next();
                    if(list.contains(delete)){
                        list.remove(delete);
                        System.out.println("Item successfully deleted");
                    }else{
                        System.out.println("Item not found in the list");
                    }
                    break;
                case 4:
                    if(list.size()==0){
                        System.out.println("The list is empty");
                    }else{
                        for(int i=0;i<list.size();i++){
                            System.out.println(list.get(i));
                        }
                    }
                    break;
                case 5:
                    input=-1;
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
        }

        sc.close();
    }
}
