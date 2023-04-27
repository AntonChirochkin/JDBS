import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    private final String user = "postgres";
    private final String password = "1758";
    private final String url = "jdbc:postgresql://localhost:5432/skypro";

    @Override
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();

        try (final Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM books")) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idOfBook = resultSet.getInt("book_id");
                String titleOfBook = resultSet.getString("title");
                int authorOfBook = resultSet.getInt("author_id");
                int amountOfBook = resultSet.getInt("amount");

                books.add(new Book(idOfBook, titleOfBook, authorOfBook, amountOfBook));
            }

        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к БД!");
            e.printStackTrace();
        }

        return books;
    }
}
