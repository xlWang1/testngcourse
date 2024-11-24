package com.course.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterFromXml {
    @Test
    @Parameters("name")
    public void scanStuName(String name){
        System.out.println("姓名：" + name);
    }

    @Test
    @Parameters("age")
    public void scanStuAge(String age){
        System.out.println("年纪：" + age);
    }
}
