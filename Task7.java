import java.util.Scanner;

public class Task7 {

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a * b;
    }

    public static int div(int a, int b){
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num1, num2, choice;

        System.out.print("Enter the first number: ");
        num1 = myScanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = myScanner.nextInt();

        System.out.println("\nChoose an operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.print("Enter your choice (1-4): ");
        choice = myScanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The sum is: " + add(num1, num2));
                break;
            case 2:
                System.out.println("The difference is: " + sub(num1, num2));
                break;
            case 3:
                System.out.println("The product is: " + mul(num1, num2));
                break;
            case 4:
                System.out.println("The quotient is: " + div(num1, num2));
                break;
            default:
                System.out.println("Invalid choice.");
        }

        myScanner.close();
    }
}
