package com.course.testng;

import org.testng.annotations.Test;

import java.util.Random;

public class DependTest {
    public static boolean flag;
    @Test
    public void testLogin(){
        int temp = new Random().nextInt(0,10);
//        int value = (temp > 5)?1:0;
        if(temp < 5){
            flag = true;
        }else{
            throw new RuntimeException();
        }
    }
    @Test(dependsOnMethods = {"testLogin"})
    public void testPayCheck(){
        if(flag){
            System.out.println("具备支付条件");
        }else {
            throw new RuntimeException();
        }
    }
}
