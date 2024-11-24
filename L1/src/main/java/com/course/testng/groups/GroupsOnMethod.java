package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups="service")
    public void testServiceCheck(){
        System.out.println("服务端检查完成了");
    }
    @Test(groups="service")
    public void testService(){
        System.out.println("服务端运行了");
    }
    @Test(groups="client")
    public void testClient(){
        System.out.println("客户端运行了");
    }
    @Test(groups="client")
    public void testClientErro(){
        System.out.println("客户端运行出错了");
    }
    @BeforeGroups("client")
    public void beforeClient(){
        System.out.println("这是客户端之前运行的");
    }
    @AfterGroups("client")
    public void afterClient(){
        System.out.println("这是客户端之后运行的");
    }

    @BeforeGroups("service")
    public void beforeService(){
        System.out.println("这是服务端之前运行的");
    }
    @AfterGroups("service")
    public void afterService(){
        System.out.println("这是服务端之后运行的");
    }
}
