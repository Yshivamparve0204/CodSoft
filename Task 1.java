// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.util.Random;
import java.util.Scanner;

        public class Number_Game {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random random = new Random();

                // Set the range
                int minRange = 1;
                int maxRange = 100;

                // Generate a random number within specified range
                int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

                System.out.println("Welcome to my Number Guessing Game");
                System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Try to guess it!");

                int userGuess;
                int attempts_limit = 5;
                int attempts = 0;



                do {
                    System.out.print("Enter your guess: ");
                    userGuess = sc.nextInt();
                    attempts++;

                    if (attempts >= attempts_limit){
                        System.out.println("Sorry, You have reached the maximum no of attempts \n Please try again..");
                        break;
                    } else if (userGuess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (userGuess > randomNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                    }

                } while (userGuess != randomNumber);

                sc.close();
            }
        }
