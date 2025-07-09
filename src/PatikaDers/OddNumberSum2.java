import java.util.Scanner;

public class OddNumberSum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a number: ");
             num = input.nextInt();
            if  (num % 2 != 0) {
                sum +=num;
            }
        } while ( num > 0) ;
        System.out.print("Sum of the odd numbers is: " +sum);
    }
}
