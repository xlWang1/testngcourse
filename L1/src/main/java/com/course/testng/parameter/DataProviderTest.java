package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "school")
    public void test01(String name,int age){
        System.out.println(name+"同学今年已经" + age +"岁了哦..");
    }
    @DataProvider(name="school")
    public Object[][] testSchoolProviderInfo(){
        return new Object[][]{
                {"唐三",25},
                {"小舞",24}
        };
    }

    @Test(dataProvider = "dataFactory")
    public void test02(String name,double size){
        System.out.println(name+"的长度是"+size+"cm");
    }
    @Test(dataProvider = "dataFactory")
    public void test03(String name,int number){
        System.out.println(name+"被人砍了"+number+"多刀，愣是一声不吭");
    }
    @DataProvider(name="dataFactory")
    public Object[][] factoryForData(Method method){
        String methodName = method.getName();
        if (methodName.equals("test02")){
            return new Object[][]{{"小黑",18.2}};
        } else if (methodName.equals("test03")){
            return new Object[][]{{"pdd",6000}};
        }
        return null;
    }
}
