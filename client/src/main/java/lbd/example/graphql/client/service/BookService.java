package lbd.example.graphql.client.service;

import lbd.example.graphql.client.model.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
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

}
