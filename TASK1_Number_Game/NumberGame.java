import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        System.out.println(" Welcome to the Number Guessing Game!");

        boolean playAgain = true;

        while (playAgain) {
            int number = rand.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println(" Correct! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You ran out of attempts! The number was: " + number);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("\n Your total score (rounds won): " + score);
        System.out.println("Thanks for playing!");
    }
}
