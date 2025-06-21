import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String input = "";
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        input = myScanner.nextLine();

        int L = input.length();
        System.out.println("Word size is: " + L);

        System.out.println("Words to Uppercase: " + input.toUpperCase());
        System.out.println("Words to Lowercase: " + input.toLowerCase());

        // Show last letter
        if (L > 0) {
            System.out.println("The last letter is: " + input.charAt(L - 1));
        } else {
            System.out.println("No last letter (empty string).");
        }

        // Show letters 2 to 5 (index 1 to 5)
        if (L >= 6) {
            System.out.print("Second to the fifth letters are: ");
            for (int i = 1; i < 6; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        } else {
             System.out.println("The word is too short to get letters 2 to 5.");
        }
        myScanner.close(); 
    }
}
