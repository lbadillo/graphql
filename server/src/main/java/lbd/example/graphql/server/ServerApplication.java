package lbd.example.graphql.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

/*	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository) {
		return args-> {
			Book reactiveSpring = new Book("Book1", 484, "Josh Long");
			Review review = new Review("greate book", "i Loved it");

			reactiveSpring.setReviews(List.of(review));
			repository.save(reactiveSpring);
		};
	}
*/
}
