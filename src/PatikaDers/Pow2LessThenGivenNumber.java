import java.util.Scanner;

public class Pow2LessThenGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = input.nextInt();
        int count=0;
        System.out.println("Power of 2 numbers are: ");
        for(int i=1 ; i<num; i *= 2){
            count++;
            System.out.println(i);
        }System.out.println("The Closest Power of 2 Less Then Given Number is: " +(count-1));
    }
}
