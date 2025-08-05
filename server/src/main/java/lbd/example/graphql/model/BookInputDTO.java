package lbd.example.graphql.model;

import lombok.Builder;

@Builder
public record BookInputDTO(String title, Integer pages, String author) {
}
