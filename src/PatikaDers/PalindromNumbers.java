import java.util.Scanner;

public class PalindromNumbers {
    static boolean isPalindrom(int number) {
    int lastdigit, temp, reverseNum=0;
    temp = number;
    while (temp != 0) {
        lastdigit = temp % 10;
        reverseNum = (reverseNum * 10) + lastdigit;
        temp /= 10;
    }
    if(reverseNum == number){
        System.out.print(number + " is palindrom.");
        return true;
    }else{
        System.out.print(number + " is not palindrom.");
        return false;
    }

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        isPalindrom(number);

    }
}
