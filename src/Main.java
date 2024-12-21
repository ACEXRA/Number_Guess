package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberGuesser();
    }

    public static void NumberGuesser() {
        int number = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number Guessing game : Guess number 1 to 100");
        System.out.println("Select the difficulty level");
        String[] difficultyLevel = {"1.Easy(10 chances)", "2.Medium(5 chances)", "3.Hard(3 chances)"};

        for (String level : difficultyLevel) {
            System.out.println(level);
        }

        int inputLevel = scanner.nextInt();

        int limit = 0;
        switch (inputLevel) {
            case 1:
                limit = 10;
                break;
            case 2:
                limit = 5;
                break;
            case 3:
                limit = 3;
                break;
            default:
                System.out.println("Select a valid choice");
        }
        int attempts = 0;
        while (attempts < limit) {
            System.out.println("Enter a number :");
            int input = scanner.nextInt();
            if (input == number) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (input < number) {
                System.out.println("Incorrect! The number is greater than " + input);
                attempts++;
            } else {
                System.out.println("Incorrect! The number is less than " + input);
                attempts++;
            }
        }
    }
}
