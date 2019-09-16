package frida13;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
}
 public Bicycle(Bicycle bikeObject){
    if (bikeObject !=null);
    cadence =bikeObject.cadence;
    gear = bikeObject.gear;
    speed = bikeObject.speed;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
