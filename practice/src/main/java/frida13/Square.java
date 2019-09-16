package frida13;

public class Square {
    public int length;

    public Square(int length) {
        ;
        this.length = length;

    }

    public void calculateArea() {
        System.out.println(length * length);}

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}



