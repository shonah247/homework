package frida13;

public class Shapes {
    public double length;
    public double width;

    public Shapes(){

    }

    public Shapes(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return this.length;

    }
    public void calculateArea() {
        System.out.println( length * width);

    }

    @Override
    public String toString() {
        return "Shapes{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
