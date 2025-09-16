package com.avinashsinha.AAP8_testNG_Examples;

/*
    @Test: This annotation marks the actual test method that will be executed.

    dependsOnMethods : The list of methods this method depends on.
*/

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting16_DependsOnMethod {

    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method2() {
        System.out.println("method2");
        Assert.assertTrue(true);
    }

}