package AbstractionAndOthers.ExceptionHandling;

public class HandsOn8 {
    public static void main(String[] arg){
        try{
            String name=arg[0];
            System.out.println("Entered name is: "+name);
            int age=Integer.parseInt(arg[1]);
            checkAge(age);

        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void checkAge(int age) throws InvalidAgeException{
        if(age>=18 && age<=60){
            System.out.println("Age is in range");
        }else{
            throw new InvalidAgeException();
        }

    }
}

class InvalidAgeException extends Exception{
    public String toString(){
        return("Age is not in range");
    }
}