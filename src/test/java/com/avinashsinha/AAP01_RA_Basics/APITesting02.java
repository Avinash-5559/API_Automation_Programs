package com.avinashsinha.AAP01_RA_Basics;

//--------------- It is "No Design Pattern Program" and here we use the ref. and call it one by one ---------------

public class APITesting02 {

    public void step1() {
        System.out.println("Step 1");
    }

    public void step2() {
        System.out.println("Step 2");
    }

    public void step3(String param1) {
        System.out.println("Step 3");
    }

    public static void main(String[] args) {

        APITesting02 ndp = new APITesting02();

        ndp.step1();
        ndp.step2();
        ndp.step3("Pramod");

    }
}