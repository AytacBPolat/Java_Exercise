import java.util.Scanner;
public class CircleAreaAndQuarterCalculator {
    public static void main(String[] args) {
        double radius,area,quarter;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Radius: ");
        radius = input.nextDouble();
        System.out.println("Radius is:" +radius);
        quarter = (2*Math.PI*radius);
        System.out.println("Quarter is: "+quarter);
        area = Math.PI*radius*radius;
        System.out.println("Area is: " +area);
    }
}
