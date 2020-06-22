package com.syslibrary.utilities;

import io.restassured.response.Response;

public interface AuthenticationUtility {

    Response getLoginResponse();

    String getToken();

    String getRedirectUrl();

}