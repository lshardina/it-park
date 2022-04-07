package lesson35.hw.repository;

import lesson35.hw.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Integer> {
}
