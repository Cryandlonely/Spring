package org.example;

import static org.junit.Assert.assertTrue;

import org.example.controller.studentController;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void Test01(){
        studentController studentController = new studentController();
        studentController.getName("dawda");
    }
}
