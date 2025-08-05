package lbd.example.graphql.model;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BookResponseDTO {

    private final Integer id;
    private final String title;
    private final Integer pages;
    private final String author;
    private List<ReviewDTO> reviews;

}
