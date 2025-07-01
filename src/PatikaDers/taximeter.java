import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
       double mile, opening = 10.0, perMile = 2.2, total;
       System.out.println("Please enter the mile:");
       Scanner input = new Scanner(System.in);
       mile = input.nextDouble();
        System.out.println("Mile is: " + mile);
       System.out.println("Opening is: " + opening);
       total = (opening + (mile * perMile));
       System.out.println("Total is: " + total);
       double minPrice = 20.0;
       String totalPrice = (total >= minPrice) ? ("Price is: " +total):  ("Price is: " +minPrice);
       System.out.println("Total is: " + totalPrice);
    }
}
