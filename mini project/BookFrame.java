import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BookFrame extends JFrame {
    private JList<Book> bookList;
    private DefaultListModel<Book> listModel;
    private BookDAO bookDAO;

    public BookFrame() {
        setTitle("Book Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        listModel = new DefaultListModel<>();
        bookList = new JList<>(listModel);
        bookDAO = new BookDAO();

        updateBookList();

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add a new book
                String title = JOptionPane.showInputDialog("Enter book title:");
                String author = JOptionPane.showInputDialog("Enter book author:");
                String priceStr = JOptionPane.showInputDialog("Enter book price:");
                double price = Double.parseDouble(priceStr);

                Book newBook = new Book();
                newBook.setTitle(title);
                newBook.setAuthor(author);
                newBook.setPrice(price);

                bookDAO.insertBook(newBook);
                updateBookList();
            }
        });

        JButton deleteButton = new JButton("Delete Book");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Delete selected book
                Book selectedBook = bookList.getSelectedValue();
                if (selectedBook != null) {
                    bookDAO.deleteBook(selectedBook.getId());
                    updateBookList();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a book to delete.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(bookList));
        panel.add(addButton);
        panel.add(deleteButton);

        add(panel);
    }

    private void updateBookList() {
        // Update the JList with the current list of books from the database
        listModel.clear();
        List<Book> books = bookDAO.getAllBooks();
        for (Book book : books) {
            listModel.addElement(book);
        }
    }
}
