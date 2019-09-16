public class Main {
    public static void main(String[] args) {
        int sodaNum = 99;
        String word = "bottles";

        while (sodaNum > 0) {
        }
        if (sodaNum == 1) {
            word = "soda";

        }
        System.out.println(sodaNum + " " + word + " of soda on the wall");
        System.out.println(sodaNum + " " + word + " of soda.");
        System.out.println("Take one down.");
        System.out.println("Pass it around.");
        sodaNum = sodaNum - 1;

        if (sodaNum > 0) {
            System.out.println(sodaNum + " " + " of soda on the wall");
        } else {
            System.out.println(" No more bottles of soda on wall");
        }
    }
}