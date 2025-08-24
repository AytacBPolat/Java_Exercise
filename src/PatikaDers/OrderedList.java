import java.util.Scanner;
import java.util.ArrayList;

public class OrderedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter the size of the list : ");
        int size = input.nextInt();
        do{
            System.out.print("Enter an integer :");
            int number = input.nextInt();
            list.add(number);
        }while(size>list.size());
        System.out.println("Unordered list is: "+list);
        ArrayList<Integer> list2 = new ArrayList<>();
        while(!list.isEmpty()){
            int min = list.get(0);
            int minIndex = 0;
            for(int i=0;i<list.size();i++){
                if(list.get(i)<min){
                    min = list.get(i);
                    minIndex = i;
                }
            }
            list2.add(min);
            list.remove(minIndex);
        }
        System.out.println("Ordered list is: "+list2);
    }
}
