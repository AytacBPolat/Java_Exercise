import java.util.Scanner;

public class isPrime {
    static void  isPrime(int n){
        if(n<= 1){
            System.out.println( n+" is not a prime number");
            return;
        }
        boolean isItPrime = true;
        for(int i=2; i<n; i++){
            if(n%i==0 && i!=n){
                isItPrime = false;
                break;
            }
        }
        if (isItPrime){
            System.out.println( n+" is a prime number");
        }else{
            System.out.println( n+" is not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        isPrime(number);
    }
}
