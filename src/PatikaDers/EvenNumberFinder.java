import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number:");
        num = input.nextInt();
        System.out.println("Your even numbers to " + num + " are: ");
        for (int i = 0; i <= num; i++){
            if (i % 2 == 0){
                System.out.println(i);
                continue;
            }
        }

    }
}
