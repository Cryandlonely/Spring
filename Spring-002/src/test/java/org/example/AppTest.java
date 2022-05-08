package org.example;

import static org.junit.Assert.assertTrue;

import org.example.controller.studentController;
import org.junit.Test;

/*
    原始的三层架构
 */
public class AppTest 
{
    @Test
    public void Test01(){
        studentController studentController = new studentController();
        System.out.println(studentController.getName("test"));
    }
}
