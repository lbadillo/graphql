package lbd.example.graphql.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Review(Integer id,
                     String title,
                     String comment) {
}
