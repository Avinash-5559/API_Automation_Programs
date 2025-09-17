package com.avinashsinha.AAP09_Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class APITesting26_All_Assertions {

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

//----------------------------------- Assertions by Rest Assured -----------------------------------

        validatableResponse.body("bookingid", Matchers.notNullValue());
        validatableResponse.body("booking.firstname", Matchers.equalTo("Pramod"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Dutta"));

//----------------------------------- Assertions by TestNG -----------------------------------

        // Hard Assertion

        Assert.assertNotNull(bookingId);
        Assert.assertEquals(firstname, "Pramod");
        Assert.assertEquals(lastname, "Dutta");

        // Soft Assertion

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(bookingId);
        softAssert.assertEquals(firstname, "Pramod");
        softAssert.assertEquals(lastname, "Dutta");
        softAssert.assertAll();


//----------------------------------- Assertions by AssertJ -----------------------------------

        assertThat(bookingId).isNotNull().isNotZero().isPositive();
        assertThat(firstname).isEqualTo("Pramod").isNotNull().isNotBlank().isNotEmpty();
        assertThat(lastname).isEqualTo("Dutta").isNotNull().isNotBlank().isNotEmpty();
    }
}