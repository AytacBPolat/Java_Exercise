import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        System.out.print("Enter the first number:");
        num1 = input.nextDouble();
        System.out.print("Enter the second number:");
        num2 = input.nextDouble();
        System.out.print("Enter the operator: 1-addition / 2-Subtraction / 3-Multiplying / 4-Dividing");
        int operator = input.nextInt();
        switch(operator){
            case 1: result = num1 + num2;
            System.out.println("The result is :" +result );
            break;
            case 2: result = num1 - num2;
            System.out.println("The result is : " + result);
            break;
            case 3: result = num1 * num2;
            System.out.println("The result is : " + result);
            break;
            case 4: result = num1 / num2;
            if (num2 == 0){
                System.out.println("Error, please select a new number other than 0 ");
            }
            System.out.println("The result is : " + result);
            break;
        }
        System.out.print("Process ended.");
    }
}
