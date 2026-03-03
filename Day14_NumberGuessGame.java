import java.util.Random;
import java.util.Scanner;

public class Day14_NumberGuessGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;

        System.out.println("Guess a number between 1 and 100");
        int attempts = 0;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Too low!");
            } else if (guess > number) {
                System.out.println("Too high!");
            } else {
              System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
