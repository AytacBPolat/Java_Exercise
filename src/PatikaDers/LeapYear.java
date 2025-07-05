import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = input.nextInt();
        boolean isLeapyear = false;
        if  ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            isLeapyear = true;
        }
        if (isLeapyear) {
            System.out.println(year + " is a leap year. ");
        }
            else{
                System.out.println(year +" is not a leap year.");
        }
    }
}

