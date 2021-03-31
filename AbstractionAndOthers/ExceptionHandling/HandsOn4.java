package AbstractionAndOthers.ExceptionHandling;

public class HandsOn4 {
    public static void main(String[] arg){
        int [] arr=new int[5];
        try{
            for(int i=0;i<5;i++){
                arr[i]=Integer.parseInt(arg[i]);
            }
        }catch(Exception e){
            System.out.println("Input exception raised");
            return;
        }

        int sum=0;
        double avg=0;

        for(int i=0;i<5;i++){
            sum+=arr[i];
        }

        avg=(double)sum/5;

        System.out.println("Thr sum is: "+sum);
        System.out.println("The average is: "+avg);
    }
}
