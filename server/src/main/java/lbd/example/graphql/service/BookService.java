package lbd.example.graphql.service;

import lbd.example.graphql.entity.Book;
import lbd.example.graphql.mapper.BookMapper;
import lbd.example.graphql.model.BookInputDTO;
import lbd.example.graphql.model.BookResponseDTO;
import lbd.example.graphql.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public List<BookResponseDTO> findAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(bookMapper::bookToBookResponseDTO
                //    book.getReviews().stream().map(bookMapper::reviewToDTO)
                //    bookMapper.reviewToDTO(book.)
        ).collect(Collectors.toList());

    }

    public BookResponseDTO createBook(String title,
                                      Integer pages,
                                      String author) {
        Book book = new Book(title, pages, author);
        return bookMapper.bookToBookResponseDTO(bookRepository.save(book));
    }

    public BookResponseDTO addBook(BookInputDTO input) {
        return bookMapper
                .bookToBookResponseDTO(bookRepository
                        .save(new Book(input.title(),
                                input.pages(),
                                input.author())));
    }

    public List<BookResponseDTO> batchCreate(@Argument List<BookInputDTO> books) {

        return books.stream().map(bl ->
                        bookRepository.save(
                                new Book(bl.title(), bl.pages(), bl.author())))
                .map(bookMapper::bookToBookResponseDTO)
                .toList();
    }

}
