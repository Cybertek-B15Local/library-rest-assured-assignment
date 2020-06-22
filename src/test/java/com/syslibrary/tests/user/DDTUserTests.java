package com.syslibrary.tests.user;

public class DDTUserTests {

    /**
      this test uses the data provider below. update method signature accordingly
     TEST CASE
     connect to database and information of the person from the users table and
     the the group name of the person from the user_groups table (inner join)
     Get the user information using the get_user_by_id/:id
     verify user name in response matches with information from database
     verify user type in response matches with information from database

     */
    @Test
    public void test(){
    }

    /**
      Load the user information from one of the excel files in the resources/test-data folder. Read the right excel file
     based on the value of the env variable in the properties file or from the command line argument
     */
    @DataProvider(name ="users")
    public static Object [] testData(){
        return null;
    }
}
