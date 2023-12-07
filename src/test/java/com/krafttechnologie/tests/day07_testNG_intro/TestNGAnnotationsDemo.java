package com.krafttechnologie.tests.day07_testNG_intro;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationsDemo {


    @BeforeMethod
    public void setUp() {
        System.out.println("Open Browser");
    }

    @Test
    public void test1() {
        System.out.println("First Test Case");
        Assert.assertEquals("title","title","Title is Not match");
        System.out.println("**second assertion**");
        Assert.assertEquals("url","url");

    }

    @Test
    public void test2() {
        System.out.println("Second test case");
        Assert.assertEquals("test2","test2");
    }

    @Test
    public void test3() {
        String email="aaa@aaa.com";
        Assert.assertTrue(email.contains("@"));
    }

    @Test
    public void test4() {
        Assert.assertFalse(0>1,"verifry");
    }

    @Test
    public void test5() {
    Assert.assertNotEquals("one","two");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Close Browser");
    }
}
