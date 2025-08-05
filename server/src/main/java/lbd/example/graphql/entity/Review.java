package lbd.example.graphql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor(force = true)
@Getter
@Setter
@RequiredArgsConstructor
public class Review {

    @Id
    @GeneratedValue
    private Integer id;
    private final String title;
    private final String comment;


}
