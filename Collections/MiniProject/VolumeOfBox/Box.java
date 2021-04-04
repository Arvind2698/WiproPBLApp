package setOfBox;

public class Box {
    private double length;
    private double width;
    private double height;
    private double volume;

    Box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
        this.volume=length*width*height;
    }

    public double getVolume(){
        return this.volume;
    }

    public void display(){
        System.out.println("Length= "+this.length+" Width= "+this.width+" Height= "+this.height+" Volume= "+this.getVolume());
    }
}
