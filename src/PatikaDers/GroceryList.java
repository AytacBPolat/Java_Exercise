import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        double pear, apple, tomato, banana, eggplant, total;
        Scanner input = new Scanner(System.in);
        System.out.print("How many kilos of pear would you like: ");
        pear= input.nextDouble();
        System.out.println("Pears are: " +pear);
        System.out.print("How many kilos of apple would you like: ");
        apple= input.nextDouble();
        System.out.println("Apples are: " +apple);
        System.out.print("How many kilos of tomato would you like: ");
        tomato= input.nextDouble();
        System.out.println("Tomatoes are: " +tomato);
        System.out.print("How many kilos of banana would you like: ");
        banana = input.nextDouble();
        System.out.println("Bananas are: " +banana);
        System.out.print("How many kilos of eggplant would you like: ");
        eggplant = input.nextDouble();
        System.out.println("Eggplants are: " +eggplant);
        total = (2.14 * pear) + (3.67 * apple) + (1.11 * tomato) + (0.95 * banana) + (5*eggplant);
        System.out.println("Your total is: " + total);
    }
}
