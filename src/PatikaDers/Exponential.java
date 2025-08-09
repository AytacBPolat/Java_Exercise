import java.util.Scanner;

public class Exponential {
    static int Exponential(int a, int b){
        int result = 1;
        for(int i = 1; i <= b; i++){
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base number  : ");
        int base = input.nextInt();
        System.out.println("Enter a exponent number : ");
        int exponent = input.nextInt();
        System.out.println("Result is :" +Exponential(base,exponent));
    }
}
