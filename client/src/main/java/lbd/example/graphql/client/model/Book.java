package lbd.example.graphql.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


public record Book(Integer id,
                   String title,
                   Integer pages,
                   String author,
                   List<Review> reviews) {
}
