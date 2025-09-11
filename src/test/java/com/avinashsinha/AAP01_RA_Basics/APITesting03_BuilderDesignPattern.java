package com.avinashsinha.AAP01_RA_Basics;

//--------------- It is "Builder Design Pattern Program" which are used in the "Rest Assured" ---------------

public class APITesting03_BuilderDesignPattern {

    public APITesting03_BuilderDesignPattern step1() {
        System.out.println("Step 1");
        return this;
    }

    public APITesting03_BuilderDesignPattern step2() {
        System.out.println("Step 2");
        return this;
    }

    public APITesting03_BuilderDesignPattern step3(String param1) {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {

        APITesting03_BuilderDesignPattern bdp = new APITesting03_BuilderDesignPattern();

        bdp.step1().step2().step3("pramod");
    }
}