package com.tester.extent.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod {
    @Test
    public void test01(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test02(){
        Assert.assertEquals("asd","asd");
    }
    @Test
    public void test03(){
        Assert.assertEquals(5,6);
    }
    @Test
    public void test04(){
        Assert.assertEquals("5","6");
    }
    @Test
    public void logDemo(){
        Reporter.log("大大挂，小小霞");
        throw new RuntimeException("出现自定义异常");
    }
}
