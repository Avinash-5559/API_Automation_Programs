package com.avinashsinha.AAP9_Assertions;

/*
    Assertions are statements used in testing to verify that the actual result of an operation matches with expected result.
    This means that if an assertion fails, it indicates a defect, and the test is marked as failed.

    Hard Assertion : This means that if any assertion fails,
                     the remaining statements in that test method will not be executed.

    Soft Assertion : This means that if any assertion fails,
                     the remaining statements in that test method will still be executed,
                     and all assertion results will be reported at the end.
*/

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting24_TestNG_Assertions {

    @Test
    public void test_hardAssert() {
        System.out.println("Start of the Program");
        Assert.assertEquals("pramod","Pramod");
        System.out.println("End of the Program");
    }

    @Test
    public void test_softAssert() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("End of the Program");
        softAssert.assertAll();
    }
}