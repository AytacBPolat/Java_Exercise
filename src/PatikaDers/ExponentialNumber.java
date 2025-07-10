import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int body, exp,res=1;
        System.out.print("Enter body number:");
        body = input.nextInt();
        System.out.print("Enter exp number:");
        exp = input.nextInt();
        System.out.print("The number "+body+" to the power of " +exp+ " is = ");
        while(exp>0) {
            res *=body;
            exp --;
        }System.out.print(res);
    }
}
