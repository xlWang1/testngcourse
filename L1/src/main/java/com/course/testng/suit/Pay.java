package com.course.testng.suit;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Pay {
    @Test
    public void testPay(){
        System.out.println("支付了......");
    }
    @Test
    public void testIgnore(){
        System.out.println("没被忽视");
    }
    @Ignore
    public void testIgnore1(){
        System.out.println("被忽视");
    }
}
