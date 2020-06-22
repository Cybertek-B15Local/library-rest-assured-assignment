package com.syslibrary.tests.books;

public class AddBookTests {
    /*
    TEST CASE: student cant add books.
        send a request as a student to create a new book. use the LibraryDataUtility to create the
        verify content type json
        verify status code 403
        verify reponse body:
         {
           error": "Unauthorized Access",
           "details": "details": "/add_book"
           }

     TEST CASE: librarian add books
      send a request as a student to create a new book
      verify status code 201
      verify content type json
      verify response contain "message": "The book has been created."
      verify response contains book_id. Book_id must a numeric string

      TEST CASE: librarian add books
      send a request as a librarian to create a new book
      verify status code 200
      extract the book_id
      get the information using the get_book_by_id endpoint.
      verify that book information is correct in the response payload
      verify that book information is correct in database


}

 */
}
