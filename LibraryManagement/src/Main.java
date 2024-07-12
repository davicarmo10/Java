import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        boolean running = true;

        while (running) {
            String[] options = {"Add Book", "List Books", "Remove Book", "Find Book", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Library Management System",
                    "Library", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    String title = JOptionPane.showInputDialog("Enter title:");
                    if (title != null) {
                        String author = JOptionPane.showInputDialog("Enter author:");
                        if (author != null) {
                            library.addBook(new Book(title, author));
                            JOptionPane.showMessageDialog(null, "Book added.");
                        }
                    }
                    break;
                case 1:
                    StringBuilder bookList = new StringBuilder();
                    for (Book book : library.getBooks()) {
                        bookList.append(book.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, bookList.length() > 0 ? bookList.toString() : "No books in the library.");
                    break;
                case 2:
                    String removeTitle = JOptionPane.showInputDialog("Enter title of the book to remove:");
                    if (removeTitle != null) {
                        library.deleteBook(removeTitle);
                        JOptionPane.showMessageDialog(null, "Book removed if it existed.");
                    }
                    break;
                case 3:
                    String findTitle = JOptionPane.showInputDialog("Enter title of the book to find:");
                    if (findTitle != null) {
                        Book foundBook = library.findBook(findTitle);
                        JOptionPane.showMessageDialog(null, foundBook != null ? "Found: " + foundBook : "Book not found.");
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
            }
        }
    }
}
