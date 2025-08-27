import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();
        boolean play = true;
        while (play) {
            int chances = 5;
            int randomNumber = rand.nextInt(100);
            for (int i = (chances - 1); i >= 0; i--) {
                System.out.println("Please select a number from 0 to 100.");
                int number = sc.nextInt();
                if (number < 0 || number > 100) {
                    System.out.println("Invalid input. Please try again.");
                    chances = i++;
                    continue;
                }
                numberList.add(number);
                if (number == randomNumber) {
                    System.out.println("Congratulations! You guessed the number!");
                    break;
                } else {
                    System.out.println("Your guess was wrong. Please try again.");
                    System.out.println(i + " are remaining.");
                }
            }
        System.out.println("The number was : " + randomNumber);
        System.out.println("You guessed this numbers : " + numberList.toString());
            numberList.clear();
        System.out.println();
        System.out.println("Would you like to play again? 0-Yes / 1-No ");
        int choice = sc.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Starting a new game...");
                play = true;
                break;
            case 1:
                System.out.println("Exiting game . Goodbye!");
                play = false;
                break;
            default:
                System.out.println("Invalid choice. Exiting  by default. ");
                play = false;
                break;
         }
     }
        sc.close();
    }
}

