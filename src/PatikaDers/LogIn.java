import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummyUsername = "admin";
        String dummyPassword = "password";
        System.out.println("Enter your Username:");
        String username = sc.nextLine();
        System.out.println("Enter your Password:");
        String password = sc.nextLine();
        if (username.equals(dummyUsername) && password.equals(dummyPassword)){
            System.out.println("Welcome " + username);
        } else{
            System.out.println("Invalid username or password");
        }
    }
}
