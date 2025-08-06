package lbd.example.graphql.client.model;

import lombok.Builder;

@Builder
public record BookInput(String title,
                        Integer pages,
                        String author
) {
}
