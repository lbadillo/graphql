package lbd.example.graphql.client.service;

import lbd.example.graphql.client.model.Book;
import lbd.example.graphql.client.model.BookInput;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final HttpGraphQlClient httpGraphQlClient;

    public Mono<List<Book>> getBooks() {
        String book = """
                query testQuery {
                  findAllBooks {
                    id
                    title
                    pages
                    author
                    reviews {
                      id
                      title
                      comment
                    }
                  }
                }
                """;

        return httpGraphQlClient.document(book)
                .retrieve("findAllBooks")
                .toEntityList(Book.class);

    }

    public Mono<Book> addBook(BookInput bookInput) {
        String create = """
                mutation CreateBook($book: BookInput!) {
                  addBook(book: $book) {
                    id
                    title
                    author
                    pages
                  }
                }
                """;
        return httpGraphQlClient.document(create)
                .variable("book",bookInput)
                .retrieve("addBook")
                .toEntity(Book.class);

    }

}
