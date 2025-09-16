package com.avinashsinha.AAP8_testNG_Examples;

/*
    @Test: This annotation marks the actual test method that will be executed.

    priority : The priority for this test method. Lower priorities will be scheduled first.

                NOTE : If no priority is specified, the default priority is 0.
*/

import org.testng.annotations.Test;

public class APITesting14_AnnotationWithPriority {

    @Test(priority = 1)
    public void t4() {
        System.out.println("4");
    }

    @Test(priority = 3)
    public void t2() {
        System.out.println("2");
    }

    @Test(priority = 2)
    public void t3() {
        System.out.println("3");
    }

    @Test(priority = 4)
    public void t1() {
        System.out.println("1");
    }
}

/*
    OUTPUT :
                4
                3
                2
                1
*/