package lbd.example.graphql.server.controller;

import lbd.example.graphql.server.model.BookInputDTO;
import lbd.example.graphql.server.model.BookResponseDTO;
import lbd.example.graphql.server.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {


    private final BookService service;


    @QueryMapping
    public List<BookResponseDTO> findAllBooks() {
        return service.findAllBooks();
    }

    @MutationMapping
    public BookResponseDTO createBook(@Argument String title,
                                      @Argument Integer pages,
                                      @Argument String author) {
        return service.createBook(title, pages, author);

    }

    @MutationMapping
    public BookResponseDTO addBook(@Argument BookInputDTO book) {
        return service.addBook(book);
    }

    @MutationMapping
    public List<BookResponseDTO> batchCreate(@Argument List<BookInputDTO> books) {
        return service.batchCreate(books);
    }
}
