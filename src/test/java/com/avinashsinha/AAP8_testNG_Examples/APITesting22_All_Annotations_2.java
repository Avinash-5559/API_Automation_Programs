package com.avinashsinha.AAP8_testNG_Examples;

/*
   @BeforeSuite     : It will run only once, before all tests in the suite are executed.

   @BeforeTest      : This will be executed before the first @Test annotated method. It can be executed multiple times before the test case.

   @BeforeClass     : This will be executed before first @Test method execution. It will be executed one only time throughout the test case.

   @BeforeMethod    : This will be executed before every @test annotated method.

   @Test            : This annotation marks the actual test method that will be executed.

   @AfterMethod     : This will be executed after every @test annotated method.

   @AfterClass      : This will be executed after all test methods in the current class have been run.

   @AfterTest       : A method with this annotation will be executed when all @Test annotated methods complete the execution of those classes inside the <test> tag in the TestNG.xml file.

   @AfterSuite      : A method with this annotation will run once after the execution of all tests in the suite is complete.
*/

import org.testng.annotations.*;

public class APITesting22_All_Annotations_2 {

    @BeforeSuite
    void demo1() {
        System.out.println("Read the data from the MySQL");
    }

    @BeforeTest
    void demo2() {
        System.out.println("Data in Matrix, TC Before");
    }

    @BeforeClass
    void demo3() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4() {
        System.out.println("BeforeMethod");
    }

    @Test
    void demo5() {
        System.out.println("Test");
    }

    @AfterMethod
    void demo6() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    void demo7() {
        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    void demo9() {
        System.out.println("AfterSuite");
        System.out.println("Close everything, Delete all the temp files");
    }
}