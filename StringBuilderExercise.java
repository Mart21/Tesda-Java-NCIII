import java.util.Scanner;

public class StringBuilderExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (at least 10 characters): ");
        String input = scanner.nextLine();

        if (input.length() < 10) {
            System.out.println("The string must be at least 10 characters long.");
            return;
        }

        StringBuilder sb = new StringBuilder(input);

        // 1. Print the length of the string
        System.out.println("1. Length of the string: " + sb.length());

        // 2. Print the first character
        System.out.println("2. First character: " + sb.charAt(0));

        // 3. Print the last character
        System.out.println("3. Last character: " + sb.charAt(sb.length() - 1));

        // 4. Print the index of the first occurrence of the letter 'a'
        int indexA = sb.indexOf("a");
        System.out.println("4. Index of first 'a': " + (indexA != -1 ? indexA : "Not found"));

        // 5. Print the substring of the string from index 3 to index 6
        if (sb.length() >= 7) {
            System.out.println("5. Substring (index 3 to 6): " + sb.substring(3, 7));
        } else {
            System.out.println("5. Cannot extract substring from index 3 to 6.");
        }

        // 6. Append the string "123" to the end
        sb.append("123");
        System.out.println("6. After appending '123': " + sb);

        // 7. Insert the string "xyz" at index 4
        if (sb.length() >= 4) {
            sb.insert(4, "xyz");
            System.out.println("7. After inserting 'xyz' at index 4: " + sb);
        } else {
            System.out.println("7. Cannot insert at index 4.");
        }

        // 8. Delete the substring from index 2 to index 4
        if (sb.length() >= 4) {
            sb.delete(2, 4);
            System.out.println("8. After deleting index 2 to 4: " + sb);
        } else {
            System.out.println("8. Cannot delete index 2 to 4.");
        }

        // 9. Delete the character at index 8
       if (sb.length() > 8) { 
    sb.deleteCharAt(8);
    System.out.println("9. After deleting char at index 8: " + sb);
} else {
    System.out.println("9. Cannot delete character at index 8. The StringBuilder is too short.");
}

        // 10. Reverse the string and print it
        sb.reverse();
        System.out.println("10. Reversed string: " + sb);
    }
}