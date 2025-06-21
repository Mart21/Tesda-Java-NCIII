import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Trim the input and check if it's empty
        if (input.trim().isEmpty()) {
            System.out.println("Word count: 0");
        } else {
            // Split the input based on one or more spaces
            String[] words = input.trim().split("\\s+");
            System.out.println("Word count: " + words.length);
        }

        scanner.close();
    }
}