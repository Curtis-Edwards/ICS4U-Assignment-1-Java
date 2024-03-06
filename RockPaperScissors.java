/*
 * This program creates a game of "rock-paper-scissors"
 * with a computer.
 *
 * @author  Curtis Edwards
 * @version 1.0
 * @since   2024-03-06
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
    * This function simulates a game of "rock-paper-scissors".
    *
    * @param userInputString  The user's input.
    * @return The outcome of the game.
    */
    public static String rockPaperScissor(String userInputString) {
        // variables
        final String winOutcome = "You won!";
        final String lostOutcome = "You lost...";
        final String tiedOutcome = "You tied.";
        final String rockString = "rock";
        final String paperString = "paper";
        final String scissorsString = "scissors";
        final int randnumberMax = 3;
        String output = "";

        // Computer chooses rock, paper, or scissors
        String[] computerOptions = {rockString, paperString, scissorsString};
        final Random random = new Random();
        final String computerChoice = computerOptions[random.nextInt(randnumberMax)];

        // Process
        System.out.println("You choose: " + userInputString);
        System.out.println("The computer choose: " + computerChoice);
        if (userInputString.equals(computerChoice)) {
            output = tiedOutcome;
        } else {
            switch (computerChoice) {
                case rockString:
                    if (userInputString == scissorsString) {
                        output = lostOutcome;
                    } else {
                        output = winOutcome;
                    }
                    break;
                case paperString:
                    if (userInputString == rockString) {
                        output = lostOutcome;
                    } else {
                        output = winOutcome;
                    }
                    break;
                case scissorsString:
                    if (userInputString == paperString) {
                        output = lostOutcome;
                    } else {
                        output = winOutcome;
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
        final Scanner scanner = new Scanner(System.in);
        System.out.print("rock, paper, or scissors? (lowercase): ");
        final String userInputString = scanner.nextLine().trim();

        // Error check
        if (userInputString == "rock"
            || userInputString == "paper"
            || userInputString == "scissors") {
            final String output = rockPaperScissor(userInputString);
            System.out.println(output);
        } else {
            System.out.println("Invalid input.");
        }

        System.out.println("\nDone.");
    }
}
