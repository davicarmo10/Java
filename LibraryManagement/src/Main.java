import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        boolean running = true;

        while (running) {
            String[] options = { "Add Book", "List Books", "Remove Book", "Find Book", "Exit" };
            int choice = JOptionPane.showOptionDialog(null, "Library Management System",
                    "Library", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0:
                    String title = JOptionPane.showInputDialog("Enter title:\n");
                    if (title != null) {
                        String author = JOptionPane.showInputDialog("Enter author:\n");
                        if (author != null) {
                            library.addBook(title, author);
                            JOptionPane.showMessageDialog(null, "Book added.\n");
                        }
                    }
                    break;
                case 1:
                    library.listBook();
                    break;
                case 2:
                    String removeTitle = JOptionPane.showInputDialog("Enter title of the book to remove:\n");
                    if (removeTitle != null) {
                        library.deleteBook(removeTitle);
                        JOptionPane.showMessageDialog(null, "Book removed if it existed.\n");
                    }
                    break;
                case 3:
                    title = JOptionPane.showInputDialog("digite o título do livro");
                    library.findBook(title);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.\n");
            }
        }
    }
}
