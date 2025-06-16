import java.util.Scanner;

public class ScoreToGrade {

    public static void main(String[] args) {
        int Grade;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your Grade: ");
        Grade = input.nextInt();

        if (Grade >= 90 && Grade <= 100) {
            System.out.println("You got A grade!");
        } else if (Grade >= 80 && Grade < 90) {
            System.out.println("You got B grade!");
        } else if (Grade >= 70 && Grade < 80) {
            System.out.println("You got C grade!");
        } else if (Grade >= 60 && Grade < 70) {
            System.out.println("You got D grade!");
        } else if (Grade >= 0 && Grade < 60) {
            System.out.println("You got F grade!");
        } else {
            System.out.println("Invalid grade entered.");
        }

        input.close();
    }
}
