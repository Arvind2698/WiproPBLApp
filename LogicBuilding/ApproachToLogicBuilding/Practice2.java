package LogicBuilding.ApproachToLogicBuilding;

public class Practice2 {
    public static void main(String arg[]) {
        int middleElement=0;
		for(int i=9;i>=0;i--){
		    middleElement=0;
            for(int j=1;j<=19;j++){
                while(j<=10){
                    if(j<=i){
                        System.out.print(" ");
                    }else{
                        middleElement++;
                        System.out.print(middleElement);
                    }
                    break;
                }
                while(j>10){
                    if(middleElement>1){
                        System.out.print(middleElement-1);
                        middleElement--;
                    }else{
                        System.out.print(" ");
                    }
                    break;
                }
            }
            System.out.println();
        }

        for(int i=1;i<=9;i++){
		    middleElement=0;
            for(int j=1;j<=19;j++){
                while(j<=10){
                    if(j<=i){
                        System.out.print(" ");
                    }else{
                        middleElement++;
                        System.out.print(middleElement);
                    }
                    break;
                }
                while(j>10){
                    if(middleElement>1){
                        System.out.print(middleElement-1);
                        middleElement--;
                    }else{
                        System.out.print(" ");
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
