import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("I've randomly chosen a number between 1 & 100.");
        System.out.println("Try to Guess it.");

        for (int i = 10; i >= 1; i--) {
            System.out.println("You have " + i + " guess(es) left. Try again.");
            int guess = sc.nextInt();
            if (randomNumber < guess)
                System.out.println("The answer is smaller than " + guess + ". Try Again.");
            else if (randomNumber > guess)
                System.out.println("The answer is bigger than " + guess + ". Try Again.");
            else {
                hasWon = true;
                break;
            }

        }
        if (hasWon)
            System.out.println("Correct... You Won!");
        else {
            System.out.println("Game Over... You Lose!");
            System.out.println("The answer was: " + randomNumber);
        }


    }
}
