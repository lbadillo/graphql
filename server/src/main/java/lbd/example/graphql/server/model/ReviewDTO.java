package lbd.example.graphql.server.model;

import lombok.Builder;

@Builder
public record ReviewDTO(Integer id, String title, String comment) {

}
