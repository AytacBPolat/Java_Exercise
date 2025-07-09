import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,fac=1;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        for(int i=1; i <= num;i++){
            fac *=i;
        }
        System.out.println("Factorial of "+num+" is "+fac);
    }
}
