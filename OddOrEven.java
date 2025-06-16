import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int input = myScanner.nextInt();

        if (input == 0) {
            System.out.println("You entered 0!");
        } else if (input < 0) {
            System.out.println("You entered a negative number.");
            if (input % 2 == 0) {
                System.out.println("It is an Even number.");
            } else {
                System.out.println("It is an Odd number.");
            }
        } else {
            if (input % 2 == 0) {
                System.out.println("You entered a Positive Even number.");
            } else {
                System.out.println("You entered a Positive Odd number.");
            }
        }

        myScanner.close();
    }
}
