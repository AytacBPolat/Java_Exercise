import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of fibonacci series: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            int temp = first;
            first = second;
            second =  first + temp;
            System.out.print(first +" ");
        }
    }
}
