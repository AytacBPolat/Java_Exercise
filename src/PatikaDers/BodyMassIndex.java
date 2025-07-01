import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, index;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height");
        height = input.nextDouble();
        System.out.print("Enter your weight");
        weight = input.nextDouble();
        index = (weight /(height*height));
        System.out.println("Your index is: " + index);
    }
}
