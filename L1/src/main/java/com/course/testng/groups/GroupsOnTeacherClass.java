package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnTeacherClass {
    public void teacherTeach(){
        System.out.println("老师在课堂上授课");
    }
    public void teacherCheck(){
        System.out.println("老师在检查学生的作业000");
    }
}
