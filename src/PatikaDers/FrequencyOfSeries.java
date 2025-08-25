import java.util.Scanner;
import java.util.ArrayList;

public class FrequencyOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        do{
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            if(sc.hasNextInt()){
                list.add(number);
            }else{
                break;
            }
        }
        while(true);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (list.get(k).equals(temp)) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(temp)) {
                    count++;
                }
            }
            System.out.println(temp + " is repeated " + count + " times.");
        }
    }
}