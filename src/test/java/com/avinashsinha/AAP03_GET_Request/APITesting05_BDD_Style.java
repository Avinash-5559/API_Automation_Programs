package com.avinashsinha.AAP03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting05_BDD_Style {

    @Test
    @Description("TC#1 Verify GET Request Positive")

    public void test_BDDStyle_GET_Req_Positive() {
        String pincode = "110045";

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                    .log().all().get()
                .then()
                    .log().all().statusCode(200);
    }

    @Test
    @Description("TC#2 Verify GET Request Negative")

    public void test_BDDStyle_GET_Req_Negative() {
        String pincode = "-110045";

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                    .log().all().get()
                .then()
                    .log().all().statusCode(200);
    }
}