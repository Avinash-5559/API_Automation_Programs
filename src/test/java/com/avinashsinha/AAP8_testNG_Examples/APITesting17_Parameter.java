package com.avinashsinha.AAP8_testNG_Examples;

/*
    @Test: This annotation marks the actual test method that will be executed.

    @Parameters : Describes how to pass parameters to a @Test method.
*/

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting17_Parameter {

    @Test
    @Parameters("browser")
    public void demo1(String value) {
        System.out.println("Demo 1 Test Case");

        if (value.equalsIgnoreCase("chrome")) {
            System.out.println("Start the Chrome Browser");
        }

        if (value.equalsIgnoreCase("firefox")) {
            System.out.println("Start the Firefox Browser");
        }
    }
}