package OOPS.ClassAndObjects;

public class HandsOn1 {
    public static void main(String[] arg){
        Box b=new Box(2,4,6);
        System.out.println(b.getVolume());
    }
}

class Box{
    public int width;
    public int length;
    public int height;

    Box(int width,int length,int height){
        this.width=width;
        this.length=length;
        this.height=height;
    }
    public int getVolume(){
        return this.width*this.height*this.length;
    }
}
