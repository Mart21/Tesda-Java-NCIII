class ArithmeticTask {

    public static void main(String[] args) {

        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1; // result = result - 1; now 2
        System.out.println(result);

        result *= 2; // result = result * 2; now 4
        System.out.println(result);

        result /= 2; // result = result / 2; now 2
        System.out.println(result);

        result += 8; // result = result + 8; now 10
        result %= 7; // result = result % 7; now 3
        System.out.println(result);
    }
}
