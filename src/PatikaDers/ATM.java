import java.util.Scanner;

public class ATM {
        public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int chances = 3;
        int selection;
        double balance = 1000;
        while (chances > 0) {
            System.out.print("Enter your username: ");
            username = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();
            if (username.equals("admin") && password.equals("password")) {
                System.out.println("Welcome");
               do {
                   System.out.println("1 - Deposit\n" + "2 - Withdrawal\n" + "3 - Balance Inquiry\n" + "4 - Exit");
                   System.out.println("Please choose the operation you want to perform: ");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Please enter the amount you want to deposit: ");
                     double  amount = input.nextDouble();
                     balance += amount;
                    }else if (selection == 2){
                        System.out.println("Please enter the amount you want to withdraw: ");
                        double amount = input.nextDouble();
                        if(balance >= amount){
                            balance -= amount;
                        }else{
                            System.out.println("Insufficient balance");
                        }
                    }else if (selection == 3) {
                        System.out.println("Your balance is: " + balance);
                    }
               }
               while (selection != 4);
               System.out.println("Have a good day.");
               break;
            }
            else{
                chances--;
                if(chances == 0){
                    System.out.println("Your account has been blocked.");
                }
                else{
                    System.out.println("Invalid username or password. Try again. " + chances+ " are remaining.");
                }
            }
        }
    }
}
