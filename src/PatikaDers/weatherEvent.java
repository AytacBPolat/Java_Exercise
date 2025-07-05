import java.util.Scanner;

public class weatherEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;
        double temperature=0, temp;
        System.out.print("Enter temperature: ");
        temp = sc.nextDouble();
        System.out.print("Choose the type of the temperature: ");
        selection = sc.nextInt();
        switch(selection) {
            case 1:
                temperature = temp;
                System.out.println("Your temperature is :" + temperature+ "C");
                break;
            case 2:
                temperature = ((temp - 32) / 1.8);
                System.out.println("Your temperature is :" + temperature + "C");
                break;
            case 3:
                temperature = (temp - 273);
                System.out.println("Your temperature is :" + temperature + "C");
                break;
        }

        if( temperature<=5.0 ){
            System.out.println("You should go Skiing");
        }else if ((temperature > 5.0 && temperature <= 15.0)){
            System.out.println("You should go Cinema");
        } else if ((temperature > 15.0 && temperature <= 25.0)) {
            System.out.println("You should go Picnic");
        }else {
            System.out.println("You should go Swimming");
        }
    }
}
