package frida13;

public class BicycleTest {
    public static void main(String[] args) {
        Bicycle applyBrake = new Bicycle(60, 18, 25);
        System.out.println(applyBrake);


        Bicycle speedUp = new Bicycle(60, 18, 25);
        System.out.println(speedUp);
    }
}