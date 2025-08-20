package lbd.example.graphql.server.mapper;

import lbd.example.graphql.server.entity.Book;
import lbd.example.graphql.server.model.BookInputDTO;
import lbd.example.graphql.server.model.BookResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    BookResponseDTO bookToBookResponseDTO (Book book);
    Book inputToBook(BookInputDTO input);

}
