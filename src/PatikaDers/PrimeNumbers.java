import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int counter ;
        for (int i = 2; i <= num; i++) {
            counter = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    counter = 0;
                    break;
                }
            }
            if (counter !=0) {
                System.out.print(i + " ");
            }
        }
    }
}
