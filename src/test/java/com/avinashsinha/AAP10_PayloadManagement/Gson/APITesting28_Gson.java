package com.avinashsinha.AAP10_PayloadManagement.Gson;

/*
    GSON: It is a Google library used in Rest Assured to convert Java objects to JSON and JSON to Java objects.
    JSON: It is a plain text in key and value pair to transfer from client to server.
*/

// Tool (Website) : https://www.jsonschema2pojo.org/

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class APITesting28_Gson {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void test_createBooking_positive() {

        Booking booking = new Booking();

        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(123);
        booking.setDepositpaid(true);

        BookingDates bookingDates = new BookingDates();

        bookingDates.setCheckin("2025-10-01");
        bookingDates.setCheckout("2025-10-10");

        booking.setBookingdates(bookingDates);
        booking.setAdditionalneeds("Lunch");

        // Convert Java Objects to JSON by GSON

        Gson gson = new Gson();

        String jsonRequestString = gson.toJson(booking);
        System.out.println("JSON: " + jsonRequestString);

// JSON: {"firstname":"Pramod","lastname":"Dutta","totalprice":123,"depositpaid":true,"bookingdates":{"checkin":"2025-10-01","checkout":"2025-10-10"},"additionalneeds":"Lunch"}

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonRequestString).log().all();

        response = requestSpecification.when().log().all().post();

        String jsonResponseString = response.asString();

        validatableResponse = response.then().log().all().statusCode(200);

        //-------------------- Case 1: Direct Extraction by extract() --------------------

        Integer bookingId1 = response.then().extract().path("bookingid");
        String firstName1 = response.then().extract().path("booking.firstname");
        String checkIn1 = response.then().extract().path("booking.bookingdates.checkin");

        Assert.assertNotNull(bookingId1);
        Assert.assertEquals(firstName1, "Pramod");
        Assert.assertNotNull(checkIn1);

        assertThat(bookingId1).isNotNull().isNotZero().isPositive().isNotNegative();
        assertThat(firstName1).isEqualTo("Pramod").isNotNull().isNotBlank().isNotEmpty();
        assertThat(checkIn1).isNotNull().isNotBlank().isNotEmpty();

        //-------------------- Case 2: JSON Path Extraction by jsonPath.getString("") --------------------

        JsonPath jsonPath = new JsonPath(response.asString());

        Integer bookingId2 = jsonPath.getInt("bookingid");
        String firstName2 = jsonPath.getString("booking.firstname");
        String checkIn2 = jsonPath.getString("booking.bookingdates.checkin");

        Assert.assertNotNull(bookingId2);
        Assert.assertEquals(firstName2, "Pramod");
        Assert.assertNotNull(checkIn2);

        assertThat(bookingId2).isNotNull().isNotZero().isPositive().isNotNegative();
        assertThat(firstName2).isEqualTo("Pramod").isNotNull().isNotBlank().isNotEmpty();
        assertThat(checkIn2).isNotNull().isNotBlank().isNotEmpty();

        //-------------------- Case 3: DeSerialization Extraction --------------------

        BookingResponse bookingResponse = gson.fromJson(response.asString(), BookingResponse.class);

        Assert.assertNotNull(bookingResponse.getBookingid());
        Assert.assertEquals(bookingResponse.getBooking().getFirstname(), "Pramod");
        Assert.assertNotNull(bookingResponse.getBooking().getBookingdates().getCheckin());

        assertThat(bookingResponse.getBookingid()).isNotNull().isNotZero().isPositive().isNotNegative();
        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("Pramod").isNotNull().isNotBlank().isNotEmpty();
        assertThat(bookingResponse.getBooking().getBookingdates().getCheckin()).isNotNull().isNotBlank().isNotEmpty();

    }
}