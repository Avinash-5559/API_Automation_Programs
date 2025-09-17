package com.avinashsinha.AAP04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting09_Non_BDD_Style {

    RequestSpecification rs;
    Response rep;
    ValidatableResponse vr;

    @Test
    @Description("TC#1 Verify GET Request Positive")

    public void test_NonBDD_Style_POST_Req_Positive() {

        String payload = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Sharma\",\n" +
                "    \"totalprice\" : 856,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-12-20\",\n" +
                "        \"checkout\" : \"2025-12-30\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Dinner\"\n" +
                "}";

        System.out.println("\n-------------------- Part 1 - Pre Condition --------------------\n");

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.log().all().body(payload);

        System.out.println("\n-------------------- Part 2 - Making HTTP Request --------------------\n");

        rep = rs.when().log().all().post();

        System.out.println("\n-------------------- Part 3 - Verification --------------------\n");

        vr = rep.then().log().all().statusCode(200);

    }
}