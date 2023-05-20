package com.regres;

import data.createProduct.createProduct;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import data.baseUrl;

public class postProduct {
    Response response;
    baseUrl baseUrl = new baseUrl();
    String reqresUrl = baseUrl.reqres;

    @Test(priority = 1)
    public void createProductSingle(){
        createProduct regresCreateProduct = new createProduct();

        response = given()
                .header("Content-Type","application/json")
                .body(createProduct.newProduct().toJSONString())
                .when()
                .post(reqresUrl+ "/api/product")
                .then()
                .log().body()
                .statusCode(201)
                .extract().response();
    }
}
