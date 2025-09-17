package com.avinashsinha.AAP08_testNG_Examples;

/*
    @Test: This annotation marks the actual test method that will be executed.

    invocationCount : The number of times this method should be invoked.
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting20_InvocationCount {

    @Test(invocationCount = 10)
    public void test01() {
        Assert.assertTrue(true);
    }
}
