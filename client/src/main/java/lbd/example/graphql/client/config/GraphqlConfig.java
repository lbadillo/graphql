package lbd.example.graphql.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class GraphqlConfig {
    @Value("${data.server.url}")
    private String url;

    @Bean
    HttpGraphQlClient createQlClient() {
        HttpGraphQlClient httpGraphQlClient;
        WebClient client = WebClient.builder()
                .baseUrl("http://localhost:8080/graphql")
                .build();
        httpGraphQlClient = HttpGraphQlClient.builder(client).build();
        return httpGraphQlClient;
    }
}
