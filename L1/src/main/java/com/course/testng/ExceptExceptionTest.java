package com.course.testng;

import org.testng.annotations.Test;

public class ExceptExceptionTest {
    //运行预期是抛出异常的测试
    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero(){
        int b = 0,a = 20;

        System.out.println(a/b);
    }
}
