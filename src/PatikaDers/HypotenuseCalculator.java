import java.util.Scanner;
public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double longSide, shortSide,hypotenuse;
        System.out.print("Please enter the long side length: ");
       longSide = input.nextDouble();
        System.out.print("Please enter the short side length: ");
        shortSide = input.nextDouble();
        hypotenuse = Math.sqrt(longSide * longSide + shortSide * shortSide);
        System.out.println("Hypotenuse is: " + hypotenuse);
    }
}

