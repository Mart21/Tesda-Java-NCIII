import java.util.Scanner;

public class NumberToMonths {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int input;

        System.out.print("Please enter a month number (1–12): ");
        input = myScanner.nextInt();

        if (input < 1 || input > 12) {
            System.out.println("Invalid input! Please enter a number from 1 to 12.");
        } else {
            switch (input) {
                case 1:
                    System.out.println("January has 31 days.");
                    break;
                case 2:
                    System.out.print("Is it a leap year? (true/false): ");
                    boolean isLeap = myScanner.nextBoolean();
                    if (isLeap) {
                        System.out.println("February has 29 days.");
                    } else {
                        System.out.println("February has 28 days.");
                    }
                    break;
                case 3:
                    System.out.println("March has 31 days.");
                    break;
                case 4:
                    System.out.println("April has 30 days.");
                    break;
                case 5:
                    System.out.println("May has 31 days.");
                    break;
                case 6:
                    System.out.println("June has 30 days.");
                    break;
                case 7:
                    System.out.println("July has 31 days.");
                    break;
                case 8:
                    System.out.println("August has 31 days.");
                    break;
                case 9:
                    System.out.println("September has 30 days.");
                    break;
                case 10:
                    System.out.println("October has 31 days.");
                    break;
                case 11:
                    System.out.println("November has 30 days.");
                    break;
                case 12:
                    System.out.println("December has 31 days.");
                    break;
            }
        }

        myScanner.close();
    }
}
