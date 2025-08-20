package lbd.example.graphql.server.repository;

import lbd.example.graphql.server.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
