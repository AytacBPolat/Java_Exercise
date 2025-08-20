import java.util.Scanner;
import java.util.ArrayList;
public class midValueOfArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        double sum = 0.0;
        do {
            System.out.print("Enter an integer: ");
            if(input.hasNextInt()){
               int num = input.nextInt() ;
                list1.add(num);
                sum += num;
            }else{
                break;
            }
        }while(true);
        System.out.println("Total : "+sum);
        System.out.println("List size: " +list1.size());
        System.out.println("Average: " + sum/list1.size());
    }
}
