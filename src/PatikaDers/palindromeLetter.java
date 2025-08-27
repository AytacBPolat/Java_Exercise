import java.util.Scanner;
import java.util.ArrayList;
public class palindromeLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> palindrome = new ArrayList<>();
        ArrayList<Character> reverse = new ArrayList<>();
        System.out.println("Please enter the word : ");
        String word = sc.nextLine();
        System.out.println("Your word is : " + word);
        for(int i = 0; i < word.length(); i++){
            palindrome.add(word.charAt(i));
        }System.out.println(palindrome);

        for(int j = word.length()-1; j>=0; j--){
            reverse.add(word.charAt(j));
        }System.out.println(reverse);
    if(palindrome.equals(reverse)){
        System.out.println("Your word is palindrome");
    }else{
        System.out.println("Your word is not palindrome");
    }
    }
}
