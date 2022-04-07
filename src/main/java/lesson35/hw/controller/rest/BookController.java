package lesson35.hw.controller.rest;

import lesson35.hw.dto.ResultDto;
import lesson35.hw.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @DeleteMapping("/books/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String bookId) {
        bookService.deleteById(bookId);
        return ResponseEntity.ok(new ResultDto());
    }
}
