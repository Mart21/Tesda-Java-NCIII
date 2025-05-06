import java.util.Scanner;

public class StringBuilderPalindrome {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = myScanner.nextLine();

        StringBuilder sb = new StringBuilder(input);
        String reversedInput = sb.reverse().toString();
        
        if (input.equals(reversedInput)) 
            System.out.println("It's a Palindrome!");
         else 
            System.out.println("No, it's not a Palindrome!");

        myScanner.close();
    }
}
