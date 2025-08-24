import java.util.Scanner;
import java.util.ArrayList;
public class repeatArrayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        do{
            System.out.print("Enter an integer: ");
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                list.add(num);
            }else{
                break;
            }
        }
            while(true);
            System.out.println(list);
            int repeated=0;
            for(int i = 0; i < list.size(); i++){
                int first = list.get(i);
                for(int j = i+1; j < list.size(); j++){
                    if(first == list.get(j)){
                        repeated = first;
                        System.out.println(repeated+" is repeated.") ;
                    }
                }
            }
    }
}
