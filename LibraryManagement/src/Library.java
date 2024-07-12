import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books;

    public Library () {
        books = new ArrayList<>();
    }
    
    public void addBook (Book newBook)
    {
        books.add(newBook);
    }
    public void deleteBook (String title)
    {

    }
    public void showBook ()
    {
        if (books.isEmpty())
        {
            System.out.println("no book yet");
        }else {
            System.out.println(books);
        }
    }
    public Book findBook (String title)
    {
        for (Book book : books)
        {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                return book;                         
            }
        }
        return null;
    }

    public ArrayList<Book> getBooks ()
    {
        return books;
    }

}