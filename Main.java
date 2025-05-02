import java.util.Scanner;

public class OddEven
{
	public static void main(String[] args) {
	   Scanner myScanner = new Scanner(System.in);
	   
	    System.out.print("Enter a number: ");
	    int input = myScanner.nextInt();
	      
	    if(input % 2==0){
	        System.out.print("You entered even number!");
	    }
	    else
	       System.out.print("You entered odd number!");
	       myScanner.close();
	    
	}

}
