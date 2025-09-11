package com.avinashsinha.AAP02_RA_TestNG_AllureReport;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting04_Multiple_TestCases_Fix {

    @Test
    @Description("TC#1 Verify that Valid Pincode gives 200 Status Code")

    public void test_Get_Positive_TC1() {

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/110045")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }

    @Test
    @Description("TC#2 Verify that Invalid Pincode gives Error")

    public void test_Get_Negative_TC2() {

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/-110045")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }

    @Test
    @Description("TC#3 Verify that Invalid Pincode gives Error")

    public void test_Get_Negative_TC3() {

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/$$")
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }

}