package lbd.example.graphql.mapper;

import lbd.example.graphql.entity.Book;
import lbd.example.graphql.model.BookInputDTO;
import lbd.example.graphql.model.BookResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    BookResponseDTO bookToBookResponseDTO (Book book);
    Book inputToBook(BookInputDTO input);

}
