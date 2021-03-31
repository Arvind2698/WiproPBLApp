package AbstractionAndOthers.ExceptionHandling;

import java.util.Scanner;

public class HandsOn7 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name");
        String userName=sc.next();
        System.out.println("Enter your country");
        String userCountry=sc.next();

        try{
            userRegistration(userName, userCountry);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            sc.close();
        }
    }

    public static void userRegistration(String userName,String userCountry) throws InvalidCountryException{
        if(userCountry.toLowerCase().equals("india")){
            System.out.println("User Registration was Successful");
        }else{
            throw new InvalidCountryException();
        }
    }
}

class InvalidCountryException extends Exception{
    public String toString(){
        return("User outside India cannot be Registered");
    }
}