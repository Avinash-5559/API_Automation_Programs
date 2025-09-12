package com.avinashsinha.AAP03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting06_Non_BDD_Style {

    RequestSpecification rs;
    Response rep;
    ValidatableResponse vr;

    @Test
    @Description("TC#1 Verify GET Request Positive")

    public void test_NonBDDStyle_GET_Req_postive() {

        String pincode = "110045";

        rs = RestAssured.given();
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/" + pincode);

        rep = rs.when().log().all().get();

        vr = rep.then().log().all().statusCode(200);

    }

    @Test
    @Description("TC#2 Verify GET Request Negative")

    public void test_NonBDDStyle_GET_Req_Negative() {

        String pincode = "-110045";

        rs = RestAssured.given();
        rs.baseUri("https://api.zippopotam.us");
        rs.basePath("/IN/" + pincode);

        rep = rs.when().log().all().get();

        vr = rep.then().log().all().statusCode(404);
    }

}