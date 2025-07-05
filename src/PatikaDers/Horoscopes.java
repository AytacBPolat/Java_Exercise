import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;
        System.out.print("Enter your birthday : ");
        day =input.nextInt();
        System.out.println("Enter your  month : 1-Jan / 2-Feb / 3-Mar /4-Apr /5-May /6-Jun /7-Jul /8-Aug /9-Sept /10-Oct /11-Nov /12-Dec ");
        month = input.nextInt();
        switch (month) {
            case 1:
                if(day >= 1 && day <= 31 ){
                    if (day <= 22){
                        System.out.println("Your horoscope is: Capricorn ");
                    }else {
                        System.out.println("Your horoscope is: Aquarius ");
                    }
                }else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 2:
                if(day <= 1 && day <= 28 ){
                    if (day <= 19){
                        System.out.println("Your horoscope is: Aquarius ");
                    }
                    else{
                        System.out.println("Your horoscope is: Pisces ");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 3:
                if(day >= 1 && day <= 31 ){
                    if (day <= 20){
                        System.out.println("Your horoscope is: Pisces ");
                    }
                    else{
                        System.out.println("Your horoscope is: Aries ");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 4:
                if(day >= 1 && day <= 30 ){
                    if (day <= 20){
                        System.out.println("Your horoscope is: Aries ");
                    }
                    else {
                        System.out.println("Your horoscope is: Taurus ");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 5:
                if(day >= 1 && day <= 30 ){
                    if (day <= 21){
                        System.out.println("Your horoscope is: Taurus ");
                    }
                    else {
                        System.out.println("Your horoscope is: Gemini ");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 6:
                if(day >= 1 && day <= 30 ){
                    if (day <= 21){
                        System.out.println("Your horoscope is: Gemini ");
                    }
                    else {
                        System.out.println("Your horoscope is: Cancer");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 7:
                if(day >= 1 && day <= 31 ){
                    if (day <= 22){
                        System.out.println("Your horoscope is : Cancer");
                    }
                    else {
                        System.out.println("Your horoscope is : Leo");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 8:
                if(day >= 1 && day <= 31 ){
                    if (day <= 22){
                        System.out.println("Your horoscope is : Leo");
                    }
                    else {
                        System.out.println("Your horoscope is: Virgo");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 9:
                if(day >= 1 && day <= 30 ){
                    if (day <= 22){
                        System.out.println("Your horoscope is : Virgo");
                    }
                    else {
                        System.out.println("Your horoscope is : Libra");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 10:
                if(day >= 1 && day <= 31 ){
                    if (day <= 22){
                        System.out.println("Your horoscope is : Libra");
                    }
                    else {
                        System.out.println("Your horoscope is: Scorpio");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 11:
                if(day >= 1 && day <= 30 ){
                    if (day <= 21){
                        System.out.println("Your horoscope is : Scorpio");
                    }
                    else {
                        System.out.println("Your horoscope is: Sagittarius");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
            case 12:
                if(day >= 1 && day <= 31 ){
                    if (day <= 22){
                        System.out.println("Your horoscope is : Sagittarius");
                    }
                    else {
                        System.out.println("Your horoscope is : Capricorn");
                    }
                } else{
                    System.out.println("Invalid day. ");
                }
                break;
        }
    }
}
