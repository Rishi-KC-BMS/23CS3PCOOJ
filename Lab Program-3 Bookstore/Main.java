import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) 
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }
    public String toString() 
    {
        String name = "Book name: " + this.name + "\n";
        String author = "Author name: " + this.author + "\n";
        String price = "Price: " + this.price + "\n";
        String numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }
}

public class Main 
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        String name,author;
        int price, numPages;

        System.out.print("Enter number of books: ");
        int n = in.nextInt();

        Books[] b = new Books[n];

        for (int i = 0; i < n; i++) 
        {
            System.out.println("\n\nEnter details for book " + (i + 1) + ":");
            
            System.out.print("Name: ");
            name = in.next();

            System.out.print("Author: ");
            author = in.next();

            System.out.print("Price: ");
            price = in.nextInt();

            System.out.print("Number of pages: ");
            numPages = in.nextInt();

            b[i] = new Books(name, author, price, numPages);
        }

        System.out.println("\n\nBook details:\n");

        for (int i = 0; i < n; i++) 
        {
            System.out.println(b[i].toString());
        }

        in.close();
    }
}
