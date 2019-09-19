package frida13;

public class House {

    private int window;

    public House(int window){
      this.window = window;
    }
     public int getWindow() {
        return window;
     }
     public void setWindows (int window) {
        this.window = window;
     }
    public void howManyWindows() {
        System.out.println(window);
    }
    public void sellHouse(double priceToPay){
        System.out.println("You Want to pay: " + priceToPay);
    }

    @Override
    public String toString() {
        return "House{" +
                "window=" + window +
                '}';
    }
}
