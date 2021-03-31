package AbstractionAndOthers.Interface;

import java.util.Scanner;

public class HandsOn1 {
    public static void main(String[] arg){
        System.out.println("Enter the your age");
        Scanner sc= new Scanner(System.in);

        int age=sc.nextInt();

        if(age<12){
            KidUser kid=new KidUser();
            kid.registerAccount(age);

            kid.requestBook();
        }else if(age>12){
            AdultUser adult=new AdultUser();
            adult.registerAccount(age);

            adult.requestBook();
        }

        sc.close();
    }
}

interface LibraryUser{
    public void registerAccount(int age);
    public void requestBook();
}

class AdultUser implements LibraryUser{
    private int age;
    private String bookType;

    public void setAge(int age){
        this.age=age;
    }
    public void setBookType(String bookType){
        this.bookType=bookType;
    }

    public void registerAccount(int age){
        if(age>12){
            setAge(age);
            setBookType("fiction");
            System.out.println(" You have successfully registered as a adults account");
        }else{
            System.out.println(" Sorry age must be greater then 12 to register for adult account");
        }
    }

    public void requestBook(){
        if(this.bookType.equals("fiction")){
            System.out.println(" Book issued successfully.. Please return it within 7 days");
        }else{
            System.out.println("Please register your account....");
        }
    }
}
class KidUser implements LibraryUser{
    private int age;
    private String bookType;

    public void setAge(int age){
        this.age=age;
    }
    public void setBookType(String bookType){
        this.bookType=bookType;
    }

    public void registerAccount(int age){
        if(age<12){
            setAge(age);
            setBookType("kids");
            System.out.println(" You have successfully registered as a kids account");
        }else{
            System.out.println(" Sorry age must be less then 12 to register for kids account");
        }
    }

    public void requestBook(){
        if(this.bookType.equals("kids")){
            System.out.println(" Book issued successfully.. Please return it within 10 days");
        }else{
            System.out.println("Please register your account....");
        }
    }
}
