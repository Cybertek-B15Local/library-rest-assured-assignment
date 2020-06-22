package com.syslibrary.tests.books;

/**
 /get_book_by_id/{id} tests
 */
public class GetBookByIdTests {
/*
    TEST CASE: student cant get book by id. use any id
        make a request as a student, use any id
        verify content type json
        verify status code 403
        verify reponse body:
         {
           error": "Unauthorized Access",
           "details": "/get_book_by_id/@id:[0-9]+"
           }

 */

/*
    TEST CASE: librarian can get book by id.
      make a request as a student, use a valid id (to make sure that you always use valid id, you may have to create  new book)
      verify content type json
      verify status code 202
      based on the sample below, verify that response contains all following field with with values not empty or null
             "id": "200",
            "name": "Herb O'Kon PhD",
             "isbn": "387750360824",
             "year": "2006",
            "author": "Malvina Roden",
            "book_category_id": "3",
            "description": "Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum. Aliquam non mauris.",
             "added_date": "2019-03-28 00:00:00"

 */

}
