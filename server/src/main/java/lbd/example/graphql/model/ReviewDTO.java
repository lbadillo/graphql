package lbd.example.graphql.model;

import lombok.Builder;

@Builder
public record ReviewDTO(Integer id, String title, String comment) {

}
