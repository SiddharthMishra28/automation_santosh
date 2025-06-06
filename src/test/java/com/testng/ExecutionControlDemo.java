package com.testng;

import org.testng.annotations.*;

public class ExecutionControlDemo {

    // HOOKS // TEST LIFECYCLE CONTROL
    @BeforeSuite // Executes once before entire test suite
    public void beforeSuite() { // method name can be anything
        System.out.println("I am before suite...");
    }

    @BeforeClass //Executes before each class containing tests
    public void beforeClass() {
        System.out.println("I am before class...");
    }

    @BeforeTest // Executes once per test class before test run
    public void beforeTest() {
        System.out.println("I am before test..");
    }

    @BeforeMethod // Executes before each test method
    public void beforeMethod() {
        System.out.println("I am before method");
    }

    @Test
    public void testOne() {
        System.out.println("I am test one...");
    }

    @Test
    public void testTwo() {
        System.out.println("I am test two...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am after method...");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("I am after test...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("I am after class..");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("I am after suite..");
    }
}
