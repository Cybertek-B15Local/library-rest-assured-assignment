package com.syslibrary.utilities;

import java.util.Map;

public class LibraryDataUtility {

    /**
     * takes user type and create map that contains a new student or librarian user information with these fields:
     * random string full_name
     * random string email
     * random string password
     * int user_group_id (values: 2 for librarian, 3 for student)
     * string status (values: active, inactive)
     * random string start_date (format: 01-13-2019)
     * random string end_date (format: 02-13-2019)
     * random string address
     *
     * @param userGroup
     * @return user map
     */
    public static Map<String, Object> createUser(int userGroup) {
        return null;
    }

    /**
     * takes user type and create map that contains a new book information  wth these fields:
     * random string name
     * random string author
     * random string description
     * random string isbn (numeric values only, 10 or 13 characters)
     * random int year
     * int book_category_id ( get the list of possible categories by making a request to /get_book_categories endpoint and select one randomly)
     *
     * @return book map
     */
    public static Map<String, Object> createBook() {
        return null;
    }

}
