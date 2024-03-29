import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);  // Create a Scanner object

        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        System.out.println("Enter your guess");
        int randomNumberGuess = 0;

        while (randomNumberGuess != randomNum) {
            
            int randomNumberGuessTryAgain = read.nextInt();  // Read user input

            if (randomNumberGuessTryAgain > randomNum) {
                System.out.println("Too high, try again!");
            } else if (randomNumberGuessTryAgain < randomNum) {
                System.out.println("Too low, try again!");
            }

            randomNumberGuess = randomNumberGuessTryAgain;
        }
        System.out.println("Guess Successful!");

        read.close();
    }
}