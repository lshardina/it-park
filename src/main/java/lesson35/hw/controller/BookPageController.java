package lesson35.hw.controller;

import lesson35.hw.dto.BookDto;
import lesson35.hw.dto.BookPageDto;
import lesson35.hw.service.BookService;
import lesson35.hw.validator.PositiveOrZero;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Positive;

@Controller
@Validated
@RequiredArgsConstructor
public class BookPageController {

    private final BookService bookService;

    @GetMapping("/books")
    public String index(Model model,
                        @PositiveOrZero(originValue = 15) @RequestParam(required = false, defaultValue = "0") Integer page,
                        @Positive @RequestParam(required = false, defaultValue = "5") Integer size) {
        BookPageDto allBooks = bookService.getPage(PageRequest.of(page, size));
        model.addAttribute("books", allBooks);
        return "book/books";
    }

    @GetMapping("/book/add")
    public String newBook(Model model) {
        return "book/book";
    }

    @GetMapping("/book/edit")
    public String currentGenre(@RequestParam("id") int BookId, Model model) {
        BookDto currentBook = bookService.getById(BookId)
                .orElseThrow(() -> new IllegalArgumentException("Non existed book"));
        model.addAttribute("book", currentBook);
        return "book/book";
    }

    @PostMapping("/book/save")
    public String saveBook(BookDto book) {
        bookService.save(book);
        return "redirect:/books";
    }

}
