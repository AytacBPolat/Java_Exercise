import java.util.Scanner;

public class Passmark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double math, physics, biology, chemistry, history, music,avr,passMark = 50.0 ;
        System.out.print("Enter your math score: ");
        math = input.nextDouble();
        System.out.print("Enter your physics score: ");
        physics = input.nextDouble();
        System.out.print("Enter your biology score: ");
        biology = input.nextDouble();
        System.out.print("Enter your chemistry score: ");
        chemistry = input.nextDouble();
        System.out.print("Enter your history score: ");
        history = input.nextDouble();
        System.out.print("Enter your music score: ");
        music = input.nextDouble();
        avr = (math + physics + biology + chemistry + history + music)/6;
        if(avr>=passMark){
            System.out.println("Congratulations! You passed.");

        }else{
            System.out.println("Sorry, you didn't pass!.");
        }
        System.out.println("Your average score is: "+avr);
    }
}