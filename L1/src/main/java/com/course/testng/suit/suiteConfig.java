package com.course.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {
    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("BeforeSuit运行了");
    }
    @AfterSuite
    public void testAfterSuite(){
        System.out.println("AfterSuit运行了");
    }
    @BeforeTest
    public void testBeforeTest(){
        System.out.println("beforetest");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("aftertest");
    }
}
