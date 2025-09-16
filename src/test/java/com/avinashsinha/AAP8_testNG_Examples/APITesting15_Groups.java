package com.avinashsinha.AAP8_testNG_Examples;

/*
    @Test: This annotation marks the actual test method that will be executed.

    groups : The list of groups this class/method belongs to.
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting15_Groups {

    @Test(groups = {"sanity", "regression"}, priority = 1)
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"p1", "regression"}, priority = -1)
    public void test_regressionRun() {
        System.out.println("Regression");
        Assert.assertTrue(false);
    }

    @Test(groups = {"p1", "smoke"}, priority = 2)
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
