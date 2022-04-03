package lesson35.hw.service;

import lesson35.hw.dto.BookDto;
import lesson35.hw.dto.BookPageDto;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

public interface BookService {

    List<BookDto> findAll();

    BookPageDto getPage(Pageable pageable);

    Optional<BookDto> getById(@NotEmpty int bookId);

    BookDto save(@Valid BookDto book);

    void deleteById(@NotEmpty String bookId);
}
