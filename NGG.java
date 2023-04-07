import java.util.Scanner;
import java.util.Random;

public class NGG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess;
        int gl = 10;    // Guess left
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 10 chances to guess a number between 1 and 100.");

        while (gl > 0) 
        {
            System.out.println("Guesses left: " + gl);
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            gl--;

            if (guess == randomNumber) 
            {
                System.out.println("Congratulations! You guessed the number right!! ");
                score = gl + 1;
                break;
            } 
            else if (guess < randomNumber)  
                System.out.println("Your guess is too low.");
            else 
                System.out.println("Your guess is too high.");
        }

        if (score > 0) 
            System.out.println("Your score is: " + score);
        else
            System.out.println("Sorry, you didn't guess the number. The secret number was " + randomNumber);
    }
}
