package JavaFundamentals.FlowControl;

public class HandsOn6 {
    public static void main(String[] arg){
        percentageInterest(arg);
    }
    public static void percentageInterest(String[] arg){

        if(arg.length!= 2){
            System.out.println("Invalid Input");
            return ;
        }

        String gender=arg[0];
        int age=Integer.parseInt(arg[1]);

        if(gender.charAt(0)=='m' || gender.charAt(0)=='M'){
            if(age>=1 && age<=58){
                System.out.println("percentage of interest is 8.4%");
            }else if(age>=59 && age<=100){
                System.out.println("percentage of interest is 10.5%");
            }
        }else if(gender.charAt(0)=='f' || gender.charAt(0)=='F'){
            if(age>=1 && age<=58){
                System.out.println("percentage of interest is 8.2%");
            }else if(age>=59 && age<=100){
                System.out.println("percentage of interest is 9.2%");
            }
        }
    }
}
