import java.util.Scanner;
public class StringMethods {
public static void main(String[] args) {
    
String input="";
Scanner myScanner= new Scanner(System.in);
System.out.print("Please enter a word: ");
input = myScanner.nextLine();
int L=input.length();
System.out.println("Word size is :" +L);

System.out.println(input.toUpperCase());

System.out.println(input.toLowerCase());

System.out.println(input.charAt(L-1));


for(int i=1; i<6;i++){
    System.out.print(input.charAt(i));
}
}

}


