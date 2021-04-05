package WrapperClass;

public class HandsOn1 {
    public static void main(String[] arg){
        Integer i=new Integer(1);
        Float f=new Float(1.2);
        Double d=new Double(1);
        Long l=new Long(1);
        Short s=new Short("12");
        Byte b=new Byte("1");

        System.out.println("Integer range");
        System.out.println("min value: "+i.MAX_VALUE);
        System.out.println("min value: "+i.MIN_VALUE);
        System.out.println("Double range");
        System.out.println("min value: "+d.MAX_VALUE);
        System.out.println("min value: "+d.MIN_VALUE);
        System.out.println("Float range");
        System.out.println("min value: "+f.MAX_VALUE);
        System.out.println("min value: "+f.MIN_VALUE);
        System.out.println("Long range");
        System.out.println("min value: "+l.MAX_VALUE);
        System.out.println("min value: "+l.MIN_VALUE);
        System.out.println("Short range");
        System.out.println("min value: "+s.MAX_VALUE);
        System.out.println("min value: "+s.MIN_VALUE);
        System.out.println("Byte range");
        System.out.println("min value: "+b.MAX_VALUE);
        System.out.println("min value: "+b.MIN_VALUE);
    }
}
