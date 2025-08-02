import java.util.Scanner;

public class HighestLowestFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minVal = 0;
        int maxVal = 0;
        boolean isFirstInput = true;
        while(true){
            System.out.print("Enter a number: ");
            System.out.println("The program will continue until the input is not integer.");
            if(!input.hasNextInt()){
                String invalidInput = input.next();
                System.out.println("Invalid input : " +invalidInput);
                break;
            }
            int num = input.nextInt();
            if(isFirstInput){
                minVal = num;
                maxVal = num;
                isFirstInput = false;
                System.out.println("First number: " + num + " set as minimum and maximum value.");
            }else{
                if(minVal > num){
                    minVal = num;
                }
                if(maxVal < num){
                    maxVal = num;
                }
            }
        }
        if(!isFirstInput){
            System.out.println("\n ---Result---");
            System.out.println("Minimum Value " +minVal);
            System.out.println("Maximum Value " +maxVal);
        }else{
            System.out.println("There is no input.");
        }
        input.close();
    }
}