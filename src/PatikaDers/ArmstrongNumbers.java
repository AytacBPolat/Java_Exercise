import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num, total=0,count=0,digitVal,pow;
        num = sc.nextInt();
        int temp =num;
        while(temp!=0){
            temp/=10;
            count++;
        }System.out.println(count);
        temp=num;
        while(temp!=0){
            digitVal=temp%10;
            pow = 1;
            for(int i=1; i<=count; i++){
                pow *=digitVal;
            }total+=pow;
            temp=temp/10;
        }System.out.println(total);
        if(total==num){
            System.out.println("The number "+num+" is a Armstrong number");
        }else{
            System.out.println("The number "+num+" is not a Armstrong number");
        }
    }
}
