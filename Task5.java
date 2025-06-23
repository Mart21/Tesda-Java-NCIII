import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n1, n2, n3;

        // No input validation, just asking for numbers
        System.out.println("Please enter the first digit:");
        n1 = myScanner.nextInt();

        System.out.println("Please enter the second digit:");
        n2 = myScanner.nextInt();

        System.out.println("Please enter the third digit:");
        n3 = myScanner.nextInt();

        myScanner.close();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is greater than " + n2 + " and " + n3 + "!");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is greater than " + n1 + " and " + n3 + "!");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is greater than " + n1 + " and " + n2 + "!");
        } else if (n1 == n2 && n2 == n3) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("There is a tie between some numbers.");
        }
    }
}
