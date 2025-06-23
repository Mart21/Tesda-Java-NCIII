import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter a word here: ");
        String input = myScanner.nextLine();
        String reversed = "";

        // Loop backward from last index to 0
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed)) {
            System.out.println("It's Palindrome!");
        } else {
            System.out.println("It's not a Palindrome!");
        }

        myScanner.close();
    }
}
