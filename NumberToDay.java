import java.util.Scanner;

public class NumberToDay {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);    
          int num;
        
        System.out.print("Please Enter a number 1 - 7 :");
        num= myScanner.nextInt();
        if(num == 1){
            System.out.println("It's Monday!");
        }else if(num == 2){
            System.out.println("It's Tuesday!");
        }else if(num == 3){
            System.out.println("It's Wenesday!");
        }else if(num == 4){
            System.out.println("It's Thursday!");
        }else if(num == 5){
            System.out.println("It's Friday!");
        }else if(num == 6){
            System.out.println("It's Saturday!");
        }else if(num == 7){
            System.out.println("It's Sunday!");
        }else{

            System.out.println("Invalid input");
        }



myScanner.close();

    }
}
