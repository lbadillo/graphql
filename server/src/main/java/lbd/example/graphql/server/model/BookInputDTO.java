package lbd.example.graphql.server.model;

import lombok.Builder;

@Builder
public record BookInputDTO(String title, Integer pages, String author) {
}
