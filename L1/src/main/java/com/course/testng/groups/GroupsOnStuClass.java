package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnStuClass {
    public void stuGoToSchool(){
        System.out.println("学生去上学了...");
    }
    public void stuStudyOnClass(){
        System.out.println("学生在班级里学习...");
    }
    public void stuGoHome(){
        System.out.println("学生放学回家了...");
    }
}
