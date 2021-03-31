package test2;

import test.*;

public class VerifyingAccess {
    public static void main(String[] arg){
        System.out.println("Testing the accessibility of the variables from test.Foundation ");
        Foundation f=new Foundation();
        System.out.println("public variable accessible"+f.var1);
        System.out.println("default variable accessible"+f.var1);
    }
}
