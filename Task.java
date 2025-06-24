
public class Task {
  
public static class Book{
String title;
String author;
int yearPublished;
double price;

public Book(String title, String author, int yearPublished, double price ) {
    this.title=title;
    this.author=author;
    this.yearPublished=yearPublished;
    this.price=price;
    
}

public void displayDetails(){

System.out.println("Title is: " +title);
System.out.println("Author: "+ author);
System.out.println("Date published: "+yearPublished);
System.out.println("Price: $"+ price);
}

}  

public static void main(String[] args) {
        
Book book1 = new Book("Paulo Coelho","Paulo Coelho",1988, 14.99);
Book book2 = new Book("Atomic Habits","James Clear",2022, 21.50);
Book book3 = new Book("The Great Gatsby","F. Scott Fitzgerald",1925, 10.75);

System.out.println();
book1.displayDetails();
System.out.println();
book2.displayDetails();
System.out.println();
book3.displayDetails();
    }

}
