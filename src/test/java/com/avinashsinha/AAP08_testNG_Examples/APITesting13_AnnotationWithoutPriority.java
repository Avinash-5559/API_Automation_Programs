package com.avinashsinha.AAP08_testNG_Examples;

/*
    TestNG Annotations are special tags used in your test code to control which parts of the code should run during testing.
    •	These tags are written before each method (function) in your test.
    •	To mark a method as a test, you use @Test before it.
*/

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting13_AnnotationWithoutPriority {

    @BeforeTest
    public void getToken(){
        System.out.println("1");
    }

    @BeforeTest
    public void getBookingId(){
        System.out.println("2");
    }

    @Test
    public void testPut(){
        System.out.println("3");
    }

    @AfterTest
    public void closing(){
        System.out.println("4");
    }

    @AfterTest
    public void closeAllThings(){
        System.out.println("5");
    }
}

/*
    OUTPUT : (As per alphabetical order of methods name)
                2
                1
                3
                5
                4
*/