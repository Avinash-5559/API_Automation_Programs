package com.avinashsinha.AAP8_testNG_Examples;

/*
    @Test: This annotation marks the actual test method that will be executed.

    alwaysRun : The alwaysRun attribute in TestNG annotations, when set to true,
                ensures that a method will be executed regardless of the status of its dependencies.
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting19_AlwaysRun {

    @Test(enabled = false)
    public void test01() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test02() {
        Assert.assertTrue(true);
    }

    @Test
    public void test03() {
        Assert.assertTrue(true);
    }
}