package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class multiThreadByXml {
    @Test
    public void test01(){
        System.out.println("多线程+线程："+Thread.currentThread().getName());
    }
    @Test
    public void test02(){
        System.out.println("多线程+线程："+Thread.currentThread().getName());
    }
    @Test
    public void test03(){
        System.out.println("多线程+线程："+Thread.currentThread().getName());
    }
    @Test
    public void test04(){
        System.out.println("多线程+线程："+Thread.currentThread().getName());
    }
    @Test
    public void test05(){
        System.out.println("多线程+线程："+Thread.currentThread().getName());
    }
}
