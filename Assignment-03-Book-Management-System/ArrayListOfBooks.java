import java.util.ArrayList;
public class ArrayListOfBooks 
{
    public static void main(String[] args)
    {
        Book b1 = new Book();

        Book b4 = new Book(b1);
        b4.title = "The Last Clue";
        b4.price = 299.99;

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b4);

        try
        {
            Book b2 = new Book("Realms of Neverland", 549.00, "978-0-545-01022-1", "fantasy", "Liam Carter");
            Book b3 = new Book(b2);
            b3.title = "Whispers in the Dark";
            b3.price = 375.00;
            b3.author = "Enid Blyton";

            books.add(b2);
            books.add(b3);
            
            Book b5 = new Book(null, -450.75, "978-1-86197-876-9", "thriller", "Ethan Brooks");
            books.add(b5);
        }

        catch(InvalidPriceException ipe)
        {
            System.out.println(ipe.getMessage());
        }

        catch(InvalidTitleException ite)
        {
            System.out.println(ite.getMessage());
        }

        books.forEach(e -> 
            {
                System.out.println("\nTitle: " + e.title);
                System.out.println("Price: " + e.price);
                System.out.println("ISBN: " + e.ISBN);
                System.out.println("Genre: " + e.genre);
                System.out.println("Author: " + e.author);
            });

        // average price calculation
        double sum = 0;
        for(Book b : books)
            sum += b.price;
        double avg = sum / books.size();
        System.out.println("Average Price: " + avg);

        // printing fiction books
        System.out.println("\nFiction Books:");
        books.forEach(b -> 
            {
                if(b.genre.equalsIgnoreCase("fiction"))
                    System.out.println(b.title + " - " + b.author);
            });
    }
}
