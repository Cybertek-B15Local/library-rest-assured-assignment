package com.syslibrary.tests.user;

public class E2EUserTests {
    /**
     TEST ONE
     Create a new student user with not token provided
     Verify error code 401 401Unauthorized
     Verify json response empty
     **/

    /**
     TEST TWO
     Create a new student user with student token
     Verify error code 403Forbidden

     Verify json response
     {
     "error": "Unauthorized Access",
     "details": "/add_user"
     }
     **/

    /**

     TEST THREE
     Get user count using the /dashboard_stats
     Post a new student by providing valid information using /add_user
     Verify response contains  "message": "The user has been created."
     Verify response contains user_id with valid numeric string
     Get user count using the /dashboard_stats
     Verify that user count has increased
     ____

     Post a new student by providing valid information using /add_user
     Get the id of the user
     Get the user information using the get_user_by_id/:id
     Verify that user information is correct

     Update the name of the user using the /update_user
     Get the user information using the get_user_by_id/:id
     Verify the user name is updated
     Verify that all other fields are not changed
     **/

    /**

     TEST FOUR
     Post a new student by providing valid information using /add_user
     Post another student using the same email
     Verify that status code not equals 200
     Verify response NOT contains  "message": "The user has been created."
     **/



}
