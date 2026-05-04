public class Book 
{
    public String title;
    public double price;
    public String ISBN;
    public String genre; // fiction, fantasy, mystery, thriller, horror
    public String author;

    public Book()
    {
        title = "The Silent Library";
        price = 399.50;
        ISBN = "978-1-4028-9462-6";
        genre = "fiction";
        author = "Ava Reynolds";
    }

    public Book(String t, double p, String i, String g, String a) throws InvalidPriceException, InvalidTitleException
    {
        if(t == null)
            throw new InvalidTitleException("title cannot be empty or null.");

        if(p<0)
            throw new InvalidPriceException("price cannot be negative.");

        title = t;
        price = p;
        ISBN = i;
        genre = g;
        author = a;
    }

    public Book(Book b)
    {
        title = b.title;
        price = b.price;
        ISBN = b.ISBN;
        genre = b.genre;
        author = b.author;
    }
}
