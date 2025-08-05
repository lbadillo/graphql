package lbd.example.graphql;

import lbd.example.graphql.entity.Book;
import lbd.example.graphql.entity.Review;
import lbd.example.graphql.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository) {
		return args-> {
			Book reactiveSpring = new Book("Book1", 484, "Josh Long");
			Review review = new Review("greate book", "i Loved it");

			reactiveSpring.setReviews(List.of(review));
			repository.save(reactiveSpring);
		};
	}

}
