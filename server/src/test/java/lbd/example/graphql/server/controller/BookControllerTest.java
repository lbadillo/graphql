package lbd.example.graphql.server.controller;


import lbd.example.graphql.server.mapper.BookMapper;
import lbd.example.graphql.server.model.BookResponseDTO;
import lbd.example.graphql.server.repository.BookRepository;
import lbd.example.graphql.server.service.BookService;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;

import org.springframework.context.annotation.Import;
import org.springframework.graphql.ResponseError;
import org.springframework.graphql.test.tester.GraphQlTester;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;



@ExtendWith(SpringExtension.class)
//@GraphQlTest(BookController.class)
public class BookControllerTest {
  //  @Autowired
  //  private GraphQlTester graphQlTester;




    @Mock
    private BookService bookService;

    @InjectMocks
    private BookController controller;





    @Test
    void getBooksTest() {

        when(bookService.findAllBooks()).thenReturn(List.of(BookResponseDTO.builder().build()));
        List<BookResponseDTO> resp = controller.findAllBooks();
        assertEquals(1, resp.size());


    }
}
