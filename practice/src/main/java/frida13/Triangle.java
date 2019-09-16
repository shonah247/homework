package frida13;

public class Triangle {
    public int sideA;
    public int sideB;
    public int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        ;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }

    public void calculateArea() {
        System.out.println(sideA + sideB + sideC);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}


