import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , num3;
        System.out.print("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        num3 = sc.nextInt();
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Your numbers are equal");
        }
        if (num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.println("Your numbers for the ascending order is :"+num3+ ","+num2+ "," +num1);
            }else {
                System.out.println("Your numbers for the ascending order is :"+num2+ ","+num3+ ","+num1);
            }
        }else if (num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println("Your numbers for the ascending order is :"+num3+ ","+num1+ ","+num2);
            }else{
               System.out.println("Your numbers for the ascending order is :"+num1+ ","+num3+ ","+num2);
            }
        } else{
            if (num1 > num2) {
                System.out.println("Your numbers for the ascending order is :" + num2+"," + num1+"," + num3);
            } else {
                System.out.println("Your numbers for the ascending order is :" + num1+"," + num2+"," + num3);
            }
        }
    }
}
