import java.util.Scanner;
public class SumOfAllInputs {
    public static void main(String[] args) {
        int NumOfInput,sum=0, input=0;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Number of Digits you want to add: ");
        NumOfInput= myScanner.nextInt();
        if(NumOfInput<=1){
            System.out.println("Invalid input!");
        }else
        for(int i=0; i<NumOfInput; i++){
            System.out.print("Please Enter a number: ");
            input =myScanner.nextInt();
            sum+=input; 
        }
          myScanner.close();
        System.out.print("The Sum of Integer input is: "+sum+"\n");

    }
    
}
