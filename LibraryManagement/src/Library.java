import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Library {
    private ArrayList<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public void addBook (String name, String author)
    {
        Book newBook = new Book(name, author);
        bookList.add(newBook);
    }

    public void listBook ()
    {
        if (!bookList.isEmpty())
        {
            JOptionPane.showMessageDialog(null, this.bookList);
        }else{
            JOptionPane.showMessageDialog(null,  "list is empty");
        }
    }

    public void findBook (String name)
    {
        ArrayList foundBook = new ArrayList<>();
        if (!bookList.isEmpty())
        {
            for (Book book : bookList)
            {
                if (name.contains(name))
                {
                    foundBook.add(book);
                }
            }
            JOptionPane.showMessageDialog(null, "\n" + foundBook + "\n");
        }else {
            JOptionPane.showMessageDialog(null,  "list is empty\n");
        }
    }

    public void deleteBook (String name)
    {

    }

}