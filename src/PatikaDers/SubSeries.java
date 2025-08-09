import java.util.Scanner;

public class SubSeries {
    static int series(int n){
        int i=5,temp=n;
        do{
            temp = temp - i ;
            System.out.print(temp+" ");
        }while(temp >=0);
        if (temp <= 0 ){
            do{
                temp = temp + i;
                System.out.print(temp+" ");
            }while (temp!=n);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        series(number);
    }
}
