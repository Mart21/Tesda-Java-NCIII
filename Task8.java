public class Task8 {

    // Method with variable number of integer arguments
    public static int calculateTotal(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("Sum up to " + num + " = " + sum);
            totalSum += sum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = calculateTotal(4, 5, 10);
        System.out.println("Total of all cumulative sums: " + result);
    }
}
