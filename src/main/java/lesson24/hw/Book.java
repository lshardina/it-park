package lesson24.hw;

import com.opencsv.bean.CsvBindByName;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

@Getter
@Setter
@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @CsvBindByName(column = "ISBN")
    public String isbn;

    @CsvBindByName(column = "Наименование")
    public String nameBook;

    @CsvBindByName(column = "Автор")
    public String autor;

    @CsvBindByName(column = "Количество страниц")
    public int size;

    @CsvBindByName(column = "Ссылка на магазин")
    public String shop;


}
