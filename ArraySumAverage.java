import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array
        int[] numbers = new int[n];
        int sum = 0;

        // Input values into the array and compute the sum
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Compute the average
        double average = (double) sum / n;

        // Output the result
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}