import java.sql.SQLOutput;
import java.util.Scanner;

public class HcfGcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();
        int i = 1;
        int common=1;
        while (i<=num1 || i<=num2){
            if (num1 % i == 0 && num2 % i == 0){
                common = i;
            }
            i++;
        }
        System.out.println("The highest common factor is: " +  common);
        System.out.println("The lowest common factor is: " +  ((num1*num2)/common));
    }
}
