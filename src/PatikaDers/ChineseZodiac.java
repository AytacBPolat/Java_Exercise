import java.sql.SQLOutput;
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year, remainder;
        System.out.println("Please enter your birth year :");
        year = sc.nextInt();
        remainder = year % 12;
        if (remainder != 0){
            switch (remainder) {
                case 1: {
                    System.out.println("Your Chinese Zodiac : Rooster");
                    break;
                }
                case 2: {
                    System.out.println("Your Chinese Zodiac : Dog");
                    break;
                }
                case 3: {
                    System.out.println("Your Chinese Zodiac : Boar");
                    break;
                }
                case 4: {
                    System.out.println("Your Chinese Zodiac : Mouse");
                    break;
                }
                case 5: {
                    System.out.println("Your Chinese Zodiac : Ox");
                    break;
                }
                case 6: {
                    System.out.println("Your Chinese Zodiac: Tiger");
                    break;
                }
                case 7: {
                    System.out.println("Your Chinese Zodiac : Rabbit");
                    break;
                }
                case 8: {
                    System.out.println("Your Chinese Zodiac : Dragon");
                    break;
                }
                case 9: {
                    System.out.println("Your Chinese Zodiac : Snake");
                    break;
                }
                case 10: {
                    System.out.println("Your Chinese Zodiac : Horse");
                    break;
                }
                case 11: {
                    System.out.println("Your Chinese Zodiac : Sheep");
                    break;
                }
            }
        }else{
            System.out.println("Your Chinese Zodiac : Monkey");
        }
    }
}
