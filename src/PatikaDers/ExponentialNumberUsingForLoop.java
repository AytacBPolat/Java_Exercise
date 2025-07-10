import java.util.Scanner;

public class ExponentialNumberUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int exp, body,total=1;
        System.out.print("Enter number: ");
        body = input.nextInt();
        System.out.print("Enter exponential: ");
        exp = input.nextInt();
        System.out.print("The number "+body+" to the power of " +exp+ " is = ");
        for(int i=1; i<= exp; i++){
            total *=body;
        }
        System.out.println(total);
    }
}
