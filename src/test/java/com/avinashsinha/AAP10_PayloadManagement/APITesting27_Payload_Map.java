package com.avinashsinha.AAP10_PayloadManagement;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting27_Payload_Map {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    @Test
    public void test_POST() {

    /*
        String payload_POST = "{\n" +
                "    \"firstname\" : \"Pramod\",\n" +
                "    \"lastname\" : \"Dutta\",\n" +
                "    \"totalprice\" : 123,\n" +
                "    \"depositpaid\" : false,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-10-01\",\n" +
                "        \"checkout\" : \"2025-10-10\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";
    */

        Map<String, Object> jsonBodyUsingMap = new LinkedHashMap<>();

        jsonBodyUsingMap.put("firstname", "Pramod");
        jsonBodyUsingMap.put("lastname", "Dutta");
        jsonBodyUsingMap.put("totalprice", 123);
        jsonBodyUsingMap.put("depositpaid", false);

        Map<String, Object> bookingDatesMap = new LinkedHashMap<>();

        bookingDatesMap.put("checkin", "2025-10-01");
        bookingDatesMap.put("checkout", "2025-10-10");

        jsonBodyUsingMap.put("bookingdates", bookingDatesMap);
        jsonBodyUsingMap.put("additionalneeds", "Lunch");

        System.out.println(jsonBodyUsingMap);
    }
}

/*
    Convert MAP to JSON by GSON, Jackson API

    MAP
            {firstname=Pramod, lastname=Dutta, totalprice=123, depositpaid=false,
            bookingdates={checkin=2025-10-01, checkout=2025-10-10}, additionalneeds=Lunch}
    JSON
            {"firstname"="Pramod", "lastname"="Dutta", "totalprice"=123, "depositpaid"="false",
            "bookingdates"={"checkin"=2025-10-01, "checkout"=2025-10-10}, "additionalneeds"="Lunch"}
*/