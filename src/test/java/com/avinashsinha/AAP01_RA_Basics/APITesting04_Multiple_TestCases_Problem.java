package com.avinashsinha.AAP01_RA_Basics;

//Every Test Cases run under the main method and if one fail whole program will terminate that's why TestNG will come

import io.restassured.RestAssured;

public class APITesting04_Multiple_TestCases_Problem {
    public static void main(String[] args) {

        String pincode;

        pincode = "110045";

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);

        pincode = "@";

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);

        pincode = " ";

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }
}