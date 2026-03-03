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
            System.out.println("Choose difficulty: 1.Easy (1-50) 2.Medium (1-100) 3.Hard (1-200)");
int level = scanner.nextInt();

int number;

if (level == 1) {
    number = random.nextInt(50) + 1;
} else if (level == 2) {
    number = random.nextInt(100) + 1;
} else {
    number = random.nextInt(200) + 1;
}
              System.out.println("Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
