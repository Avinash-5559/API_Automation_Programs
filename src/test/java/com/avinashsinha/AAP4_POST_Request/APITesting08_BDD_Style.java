package com.avinashsinha.AAP4_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting08_BDD_Style {

    @Test
    @Description("TC#1 Verify the POST Request Positive")

    public void test_BDDStyle_POST_Req_Positive() {

        String payload = "{\n" +
                "    \"firstname\" : \"Abhinav\",\n" +
                "    \"lastname\" : \"Kumar\",\n" +
                "    \"totalprice\" : 356,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-11-20\",\n" +
                "        \"checkout\" : \"2025-12-25\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/booking")
                    .contentType(ContentType.JSON)
                    .log().all().body(payload)
                .when()
                    .log().all().post()
                .then()
                    .log().all().statusCode(200);
    }
}