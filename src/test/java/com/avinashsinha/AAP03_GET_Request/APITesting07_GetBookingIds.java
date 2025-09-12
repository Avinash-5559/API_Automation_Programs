package com.avinashsinha.AAP03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting07_GetBookingIds {

    RequestSpecification rs;
    Response rep;
    ValidatableResponse vr;

    @Test
    @Description("TC#1 Verify the Booking Id")

    public void GET_Booking_Ids() {

        System.out.println("\n-------------------- Part 1 - Pre Condition --------------------\n");

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking/829");

        System.out.println("\n-------------------- Part 2 - Making HTTP Request --------------------\n");

        rep = rs.when().log().all().get();

        System.out.println("\n-------------------- Part 3 - Verification --------------------\n");

        vr = rep.then().log().all().statusCode(200);

    }

}