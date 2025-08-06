# GraphQL

## Server
* Database H2 on memory
* Use mapstruct

### Configuration
* URL: http://localhost:8080/graphiql?path=/graphql
  * Queries:
```
query testQuery {
       findAllBooks {
            id
            title
            pages
            reviews {
                id
                title
                comment
            }
        }
 }
```
```
 mutation create1 {
  createBook(title: "book2", pages: 46, author: "test ") {
    id
    title
  }
}
```
```
mutation CreateBook($book: BookInput!) {
  addBook(book: $book) {
    id
    title
    author
    pages
  }
}


// variables
{
  "book": {
    "title": "book3",
    "pages": 53,
    "author": "el otro"
  }
}

 ```

 ```
 mutation CreateBookBatch($books: [BookInput!]!) {
  batchCreate(books: $books) {
    id
    title
    author
    pages
  }
}

// variables
{
  "books": [
    {
    "title": "book9",
    "pages": 53,
    "author": "el otro"
    },
     {
    "title": "book10",
    "pages": 53,
    "author": "el otro"
   }
  ]
}
 ```


```
mutation CreateBook1 {
  addBook(book: {title: "book4", pages: 53, author: "el otro"}) {
    id
    title
    author
    
  }
}
```