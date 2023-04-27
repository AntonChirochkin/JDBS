import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAOImpl();
        List<Book> books = bookDAO.getAllBooks();

        for (Book book : books) {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author_id: " + book.getAuthorId());
            System.out.println("Amount: " + book.getAmount());
        }
    }
}
