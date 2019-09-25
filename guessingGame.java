import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(10) + 1;
        ArrayList<Integer> guesses = new ArrayList<Integer>();
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Guess Your Number");
            Integer userInput = scanner.nextInt();

            if (guesses.contains(userInput)) {

            }else { guesses.add(userInput);
                counter++;

            }

            if (userInput == random) {
                System.out.println("You are Correct");
                break;

            } else if (userInput < random) {
                System.out.println("Wrong to small");

            } else {
                    System.out.println("Wrong too big");
                }
            System.out.println("you guessed " + counter + " many times.");

        }
    }
}
