package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadByAnnotation {
    /**
     * invocationCount = 10：表示该方法将被调用10次
     * threadPoolSize = 3：表示测试将使用一个包含3个线程的线程池来执行。
     * 这意味着TestNG会尝试并行地运行测试方法，但同一时间最多只有3个线程在执行。
     * timeOut = 3000：表示每个测试方法的执行时间不应超过3000毫秒（即3秒），
     * 否则将被视为超时
     * **/
    @Test(invocationCount = 10,threadPoolSize = 3,timeOut = 3000)
    public void test01(){
        System.out.println("多线程+线程："+Thread.currentThread().getId());
    }

}
