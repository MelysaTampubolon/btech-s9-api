package com.regres;
import data.baseUrl;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class getProduct {
    Response response;
    data.baseUrl baseURL = new baseUrl();
    String reqresUrl = baseURL.reqres;

    @Test(priority = 1)
    public void getListProduct(){
        response = given()
                .when()
                .get(reqresUrl+"/api/product?page=2")
                .then()
                .log().body()
                .statusCode(200)
                .extract().response();
    }

    @Test(priority = 2)
    public void getSingleProduct(){
        response = given()
                .when()
                .get(reqresUrl+"/api/product/2")
                .then()
                .log().body()
                .statusCode(200)
                .extract().response();
    }
}
