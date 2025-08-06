package lbd.example.graphql.client.api;

import lbd.example.graphql.client.model.Book;
import lbd.example.graphql.client.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BookController {

    private final BookService service;
    @GetMapping("/book")
    Mono<List<Book>> getBooks() {
        return service.getBooks();
    }
}
