package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例一");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @BeforeTest
    public void testCase2(){
        System.out.println("BeforeTest是在测试之前运行的");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @Test
    public void testCase4(){
        System.out.println("这是测试用例二");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @AfterTest
    public void testCase3(){
        System.out.println("AfterTest实在测试之后运行的");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @BeforeMethod
    public void testCase5(){
        System.out.println("BeforeMethod是在测试方法之前运行的");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @AfterMethod
    public void testCase6(){
        System.out.println("AfterMethod是在测试方法之前运行的");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @BeforeClass
    public void testCase7(){
        System.out.println("BeforeClass在测试类之前运行的");
        System.out.println("线程："+Thread.currentThread().getName());
    }

    @AfterClass
    public void testCase8(){
        System.out.println("BeforeClass在测试类之后运行的");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @BeforeSuite
    public void tsetCase9(){
        System.out.println("BeforeSuite测试套件之前");
        System.out.println("线程："+Thread.currentThread().getName());
    }
    @AfterSuite
    public void tsetCase10(){
        System.out.println("AfterSuite测试套件之前");
        System.out.println("线程："+Thread.currentThread().getName());
    }
}
