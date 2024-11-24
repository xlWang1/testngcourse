package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test(enabled = true)
    public void testIgnore1(){
        System.out.println("没被忽视");
    }

    @Test(enabled = false)
    public void testIgnore2(){
        System.out.println("被忽视了");
    }
}
