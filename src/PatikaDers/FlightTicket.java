import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mile,kilometer,cost;
        int  age, selection;
        System.out.println("Enter your mile");
        mile = sc.nextDouble();
        System.out.println("Enter your age");
        age = sc.nextInt();
        System.out.println("Choose your ticket type 1-One way ticket 2-Return ticket");
        selection = sc.nextInt();
        kilometer = mile * 1.609;
        System.out.println("Your ticket price is $"+kilometer);
        if (age < 0 || mile < 0){
            System.out.println("Invalid input");
        }
        cost = kilometer + (kilometer * 0.1);
        System.out.println("Your ticket cost is $"+cost);
        switch (selection) {
            case 1:{
                if (age <= 12){
                    cost -=  cost / 2;
                }else if ( age > 12 && age < 24){
                    cost -= (cost*0.1);
                }else if (age >= 65) {
                    cost -= (cost * 0.3);
                }else{
                }
                System.out.println("Total cost :" + cost + "\nWish you safe trip");
                break;
            }
            case 2:{
                cost -= (cost*0.3);
                if (age <= 12){
                    cost -=  cost / 2;
                }else if ( age > 12 && age < 24){
                    cost -= (cost*0.1);
                }else if (age >= 65) {
                    cost -= (cost * 0.3);
                }else{
                }
                System.out.println("Total cost :" + cost + "\nWish you safe trip");
                break;
            }
        }

    }
}
