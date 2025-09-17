package com.avinashsinha.AAP06_PATCH_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting11_Non_BDD_Style {

    @Test
    @Description("TC#1 Verify the PATCH Request")

    public void test_Partial_Update_Booking() {

        String payload = "{\n" +
                "    \"lastname\": \"Kumar\",\n" +
                "    \"totalprice\": 551,\n" +
                "    \"additionalneeds\": \"Dinner\"\n" +
                "}";

        String token = "e86a029d3112031";
        String bookingId = "1893";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingId);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);
        requestSpecification.log().all().body(payload);

        Response response = requestSpecification.when().log().all().patch();

        ValidatableResponse validatableResponse = response.then().log().all().statusCode(200);
    }
}