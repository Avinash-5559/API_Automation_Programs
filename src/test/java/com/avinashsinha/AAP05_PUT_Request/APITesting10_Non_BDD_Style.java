package com.avinashsinha.AAP05_PUT_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting10_Non_BDD_Style {

    @Test
    @Description("TC#1 Verify the PUT Request")

    public void test_Update_Booking() {

        String payload = "{\n" +
                "    \"firstname\" : \"Kunal\",\n" +
                "    \"lastname\" : \"Kapoor\",\n" +
                "    \"totalprice\" : 251,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2026-02-10\",\n" +
                "        \"checkout\" : \"2026-02-15\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        String token = "e86a029d3112031";
        String bookingId = "1893";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingId);
        requestSpecification.contentType(ContentType.JSON);

        //requestSpecification.auth().basic("admin","password123");

        requestSpecification.cookie("token", token);
        requestSpecification.log().all().body(payload);

        Response response = requestSpecification.when().log().all().put();

        ValidatableResponse validatableResponse = response.then().log().all().statusCode(200);

    }
}