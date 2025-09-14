package com.avinashsinha.AAP7_DELETE_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting12_Non_BDD_Style {

    @Test
    @Description("TC#1 Verify the DELETE Request")

    public void test_Delete_Booking() {

        String token = "d9c199cb621bd76";
        String bookingId = "2597";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/" + bookingId);
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        Response response = requestSpecification.when().log().all().delete();

        ValidatableResponse validatableResponse = response.then().log().all().statusCode(201);
    }
}
