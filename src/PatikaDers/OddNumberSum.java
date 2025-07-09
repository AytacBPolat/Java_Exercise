import java.sql.SQLOutput;
import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum = 0;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.println("The odd numbers is :");
        for (int i = 0; i<=num; i++){
            if(i % 2 !=0){
                sum +=i;
                System.out.println(i);
                continue;
            }
        }
        System.out.print( "Sum of the odd numbers to: " +num+ " is :"  +sum );
    }
}
