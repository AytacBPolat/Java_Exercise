import java.util.Scanner;

public class HarmonicNumberSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        float result=0;
        System.out.print("Enter a Number");
        n = input.nextInt();
        for (float i = 1; i <= n; i++) {
            System.out.println("1 / "+i);
            result = result + (1 / i);
        }
        System.out.println("Result is: "+result);


    }
}
