package com.nisum.onestopshop.be.utils;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RestUtilities {
    private static final Logger logger = LoggerFactory.getLogger(RestUtilities.class);
    public Response response;
    public RequestSpecification request;

    public Response getRequest(String url) {
        request = RestAssured.with();
        response= request.get(url);
        return response;
    }

    public Response postRequest(String url , String body){
        request=RestAssured.with();
        response = request.contentType("Application/json").body(body).post(url);
        return response;
    }
}
