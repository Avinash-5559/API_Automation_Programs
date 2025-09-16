package com.avinashsinha.AAP8_testNG_Examples;

/*
    @Test: This annotation marks the actual test method that will be executed.

    enabled : Whether methods on this class/method are enabled.
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting18_Enabled {

    @Test
    public void test01() {
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test02() {
        Assert.assertTrue(true);
    }

    @Test
    public void test03() {
        Assert.assertTrue(true);
    }
}