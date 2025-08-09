import java.util.Scanner;

public class AdvancedCalculator {
    static int summation (int a, int b) {
        return a + b;
    }
    static int subtraction (int a, int b) {
        return a - b;
    }
    static int multiplication (int a, int b) {
        return a * b;
    }
    static int division (int a, int b) {
        return a / b;
    }
    static int exponentiation (int a, int b) {
        int result =1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    static int factorial (int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    static int modulo (int a, int b) {
        return a % b;
    }
    static int area(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selection;
        int number1, number2;
     do{
         System.out.println("1- Summation \n" +"2- Subtraction\n"+"3- Multiplication \n" +"4- Division \n"+"5- Exponentiation \n"+"6- Factorial \n"+"7- Modulo \n"+"8- Rectangular Area\n" +"0- Exit ");
        System.out.println("=============");
         System.out.println("Please select an operation.");
         selection = input.nextInt();
         switch (selection){
             case 1:
                 System.out.println("Enter first number");
                 number1 = input.nextInt();
                 System.out.println("Enter second number");
                 number2 = input.nextInt();
                 System.out.println("Result is: " +summation(number1 , number2));
                 break;
             case 2:
                 System.out.println("Enter first number");
                 number1 = input.nextInt();
                 System.out.println("Enter second number");
                 number2 = input.nextInt();
                 System.out.println("Result is: " +subtraction(number1 , number2));
                 break;
             case 3:
                 System.out.println("Enter first number");
                 number1 = input.nextInt();
                 System.out.println("Enter second number");
                 number2 = input.nextInt();
                 System.out.println("Result is: " +multiplication(number1 , number2));
                 break;
             case 4:
                 System.out.println("Enter first number");
                 number1 = input.nextInt();
                 System.out.println("Enter second number");
                 number2 = input.nextInt();
                 System.out.println("Result is: " +division(number1 , number2));
                 break;
             case 5:
                 System.out.println("Enter base number");
                 number1 = input.nextInt();
                 System.out.println("Enter exponent number");
                 number2 = input.nextInt();
                 System.out.println("Result is: " +exponentiation(number1 , number2));
                 break;
             case 6:
                 System.out.println("Enter a number");
                 number1 = input.nextInt();
                 System.out.println("Factorial of a " +  number1 + " is: " +factorial(number1));
                 break;
             case 7:
                    System.out.println("Enter first number");
                    number1 = input.nextInt();
                    System.out.println("Enter second number");
                    number2 = input.nextInt();
                    System.out.println("Modulo of a "+ number1 + " and "+ number2 +" is :" +modulo(number1 , number2));
                    break;
             case 8:
                 System.out.println("Enter short side");
                 number1 = input.nextInt();
                 System.out.println("Enter short side");
                 number2 = input.nextInt();
                 System.out.println("Rectangular area is: " +area(number1 , number2));
             case 0:
                 break;
             default:
                 System.out.println("Invalid input");
         }
     }
     while (selection !=0);
    }
}
