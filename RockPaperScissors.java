/*
 * This program creates a game of "rock-paper-scissors"
 * with a computer.
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-02-27
 */

import java.util.Random;
import java.util.Scanner;

/**
* This is the standard "RockPaperScissors" program.
*/
final class RockPaperScissors {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function simulates a game of "rock-paper-scissors"
    *
    * @param userInputString  The user's input.
    * @return The outcome of the game.
    */
    public static String rockPaperScissor(String userInputString) {

        // Computer chooses rock, paper, or scissors
        String[] computerOptions = {"rock", "paper", "scissors"};
        Random random = new Random();
        String computerChoice = computerOptions[random.nextInt(3)];

        String output = "";

        // Process
        System.out.println("You choose: " + userInputString);
        System.out.println("The computer choose: " + computerChoice);
        if (userInputString.equals(computerChoice)) {
            output = "You tied.";
        } else {
            switch (computerChoice) {
                case "rock":
                    if (userInputString.equals("scissors")) {
                        output = "You lost...";
                    } else {
                        output = "You won!";
                    }
                    break;
                case "paper":
                    if (userInputString.equals("rock")) {
                        output = "You lost...";
                    } else {
                        output = "You won!";
                    }
                    break;
                case "scissors":
                    if (userInputString.equals("paper")) {
                        output = "You lost...";
                    } else {
                        output = "You won!";
                    }
                    break;
            }
        }
        return output;
    }


    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("rock, paper, or scissors? (lowercase): ");
        String userInputString = scanner.nextLine().trim();

        // Error check
        if (userInputString.equals("rock") ||
            userInputString.equals("paper") ||
            userInputString.equals("scissors")) {
            String output = rockPaperScissor(userInputString);
            System.out.println(output);
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println("\nDone.");
    }
}
