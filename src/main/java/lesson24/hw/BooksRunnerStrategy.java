package lesson24.hw;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.exceptions.CsvBeanIntrospectionException;

public class BooksRunnerStrategy extends ColumnPositionMappingStrategy {

    public BooksRunnerStrategy() {
        this.setType(Book.class);
    }

    @Override
    public Object populateNewBean(String[] line) throws CsvBeanIntrospectionException {
        Book book = new Book();
        book.setIsbn(line[0]);
        book.setNameBook(line[1]);
        book.setAutor(line[2]);
        book.setSize(Integer.parseInt(line[3]));
        book.setShop(line[4]);
        return book;
    }
}
