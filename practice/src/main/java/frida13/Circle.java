package frida13;

public class Circle {
    public int radius;
    public double pie;



    public Circle(int radius, double pie) {
        ;
        this.radius = radius;
        this.pie = pie;
    }

    public void calculateArea(){
        System.out.println(pie * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pie=" + pie +
                '}';
    }
}
