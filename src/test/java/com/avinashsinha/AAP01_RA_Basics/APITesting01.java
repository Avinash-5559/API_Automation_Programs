package com.avinashsinha.AAP01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Pincode : ");
        int pincode = sc.nextInt();

        /*
            Full URL    - https://api.zippopotam.us/IN/560016
                Let's Break it the Full URL
            Base URI    - https://api.zippopotam.us
            Base Path   - /IN/560016
        */

//--------------- It is "Builder Design Pattern Program" which are used in the "Rest Assured" ---------------

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