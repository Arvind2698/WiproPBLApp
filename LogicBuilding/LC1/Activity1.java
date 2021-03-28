package LogicBuilding.LC1;

// import java.util.Stack;

public class Activity1 {
    public static void main(String arg[]) {
        int var1=1;
        int var2=2;
        int var3=3;

        // 1 2 3
        // 2 1 3
        // 3 1 2
        // 3 2 1


        System.out.println("Before the swap "+ var1 +" " + var2 + " " + var3);

        int temp=var1;
        var1=var2;
        var2=temp;

        temp=var1;
        var1=var3;
        var3=temp;

        temp=var2;
        var2=var3;
        var3=temp;

        System.out.println("After the swap "+ var1 +" " + var2 + " " + var3);


        //Using a Stack

        // System.out.println("Before the swap "+ var1 +" " + var2 + " " + var3);

        // Stack<Integer> stack=new Stack<>();
        // stack.push(var1);
        // stack.push(var2);
        // stack.push(var3);

        // var1=stack.pop();
        // var2=stack.pop();
        // var3=stack.pop();

        // System.out.println("After the swap "+ var1 +" " + var2 + " " + var3);

    }
}
