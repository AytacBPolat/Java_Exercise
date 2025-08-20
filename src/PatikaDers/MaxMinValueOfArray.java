import java.util.Scanner;
import java.util.ArrayList;

public class MaxMinValueOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        do{
            System.out.print("Enter a number: ");
            if(sc.hasNextInt()){
                int number = sc.nextInt();
                list.add(number);
            }else{
                break;
            }
        }while(true);
        System.out.println("Including this numbers " + list);
      int minnum =  list.get(0);
      int maxnum = list.get(0);
      for(int i = 1; i < list.size(); i++){
          if(list.get(i) < minnum){
            minnum = list.get(i);
          }
          if(list.get(i) > maxnum){
              maxnum = list.get(i);
          }
      }
      System.out.println("Maximum number is : " + maxnum);
      System.out.println("Minimum number is : " + minnum);
    }
}
