package lesson24.hw;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import lesson24.DbRunner;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class BooksRunner {

    private static final Properties DB_SETTINGS = new Properties();

    static {
        try {
            DB_SETTINGS.load(DbRunner.class.getResourceAsStream("/db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, SQLException {
        String fileBooks = "src/main/resources/books.csv";

        Path myPath = Paths.get(fileBooks);

        try (BufferedReader br = Files.newBufferedReader(myPath, StandardCharsets.UTF_8)) {

            CsvToBean<Book> csvToBean = new CsvToBeanBuilder<Book>(br)
                    .withMappingStrategy(new BooksRunnerStrategy())
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSkipLines(1)
                    .withSeparator(';')
                    .build();

            List<Book> bookList = csvToBean.parse();
            fillBooksBD(bookList);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите, пожалуйста, название или автора произведения");
            String searhBook = scanner.nextLine();
            List interestingBook = searchingBook(searhBook);
            if (interestingBook.isEmpty()) {
                System.out.println("Увы, ничего не найдено  ☹");
            } else {
                System.out.println("По Вашему запросу найдены книги:");
                interestingBook.forEach(System.out::println);
            }
        }
    }

    private static void fillBooksBD(List<Book> listbook) throws SQLException {
        try (final Connection connection = DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"));
             final Statement st = connection.createStatement();
             final PreparedStatement statement = connection.prepareStatement(
                     "insert into books values (?,?,?,?,?,?)")
        ) {
            st.execute("truncate books");
            int i = 1;
            for (Book lb : listbook) {
                statement.setInt(1, i);
                statement.setString(2, lb.getIsbn());
                statement.setString(3, lb.getNameBook());
                statement.setString(4, lb.getAutor());
                statement.setString(5, lb.getShop());
                statement.setInt(6, lb.getSize());
                statement.execute();
                i++;
            }
        }
    }

    private static List<Book> searchingBook(String text) throws SQLException {
        List<Book> books;
        try (final Connection connection = DriverManager.getConnection(
                DB_SETTINGS.getProperty("jdbc.url"),
                DB_SETTINGS.getProperty("db.login"),
                DB_SETTINGS.getProperty("db.password"));
             final PreparedStatement statement = connection.prepareStatement(
                     "select * from books where autor like ? union all select * from books where name like ?"
             )) {
            statement.setString(1, "%" + text + "%");
            statement.setString(2, "%" + text + "%");
            books = new ArrayList<>();
            try (final ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Book book = new Book(resultSet.getString("isbn"), resultSet.getString("name"),
                            resultSet.getString("autor"), resultSet.getInt("size"),
                            resultSet.getString("market"));
                    books.add(book);
                }
            }
        }
        return books;
    }
}



