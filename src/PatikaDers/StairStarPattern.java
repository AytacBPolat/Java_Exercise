import java.util.Scanner;

public class StairStarPattern {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Enter a stair number: ");
        int num = input.nextInt();
       for (int i = num; i >= 1; i--){
           for  (int j = 1; j <= (2*i) - 1; j++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
