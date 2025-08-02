import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int rem=0 ,i=1;
        while(i < num){
          int temp = 0;
            if(num%i == 0){
                temp += i;
            }
            rem += temp;
            i++;
        }
        if(rem==num){
            System.out.println(num+" Is a perfect number.");
        }else{
            System.out.println(num+" Is not a perfect number.");
        }
    }
}
