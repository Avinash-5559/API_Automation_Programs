package com.avinashsinha.AAP09_Assertions;

/*
    Assertions are statements used in testing to verify that the actual result of an operation matches with expected result.
    This means that if an assertion fails, it indicates a defect, and the test is marked as failed.

    Assertion by AssertJ : It provides a rich set of fluent and readable assertions.
                           This means that you can write assertions that are both powerful and easy to read.
                           If the assertion fails, AssertJ gives clear and detailed error messages,
                           helping you quickly understand what went wrong.
*/

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class APITesting25_AssertJ_Assertions {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void test_POST() {

        String payLoad = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2024-01-01\",\n" +
                "        \"checkout\" : \"2024-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payLoad).log().all();

        response = requestSpecification.when().log().all().post();

        validatableResponse = response.then().log().all().statusCode(200);

        Integer bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        assertThat(bookingId).isNotNull().isNotZero().isNotNegative();
        assertThat(firstname).isEqualTo("Pramod").isNotNull().isNotBlank().isNotEmpty();
        assertThat(lastname).isEqualTo("Dutta").isNotNull().isNotBlank().isNotEmpty();

    }
}