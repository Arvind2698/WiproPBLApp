package JavaFundamentals.FlowControl;

public class HandsOn3 {
    public static void main(String[] arg) {
        if(arg.length==0){
            System.out.println("No values");
        }

        for(int i=0;i<arg.length;i++){
            System.out.print(arg[i]);
            if(i!=arg.length-1){
                System.out.print(",");
            }
        }
    }
}
