package com.myfirstproject;



import org.junit.*;

public class Day02_JUnitAnnotations {
    /*
     @Test is used to create test cases.
     All test methods must be void
     We can not run methods without @Test
     @BeforeClass is used to run once before the entire class
     @BeforeClass is  also used for PreConditions
     @AfterClass is used to run once after the entire class
     @AfterClass is  also used for AfterConditions

     */

    @BeforeClass
    public static void setUpClass(){
        System.out.println("Before Class ==> @BeforeClass");

    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("After Class ==>  @AfterClass");
    }

    @Before
    public void setUpMethod(){
        System.out.println("Before Method ==> @Before");

    }

    @After
    public void tearDownMethod(){
        System.out.println("Before Method ==> @After");

    }


    @Test
    public void test1(){
        System.out.println("Test 1");

    }

    @Test
    public void test2(){
        System.out.println("Test 2");

    }

    @Test
    public void test3(){
        System.out.println("Test 3");

    }

    @Test
    public void test4(){
        System.out.println("Test 4");

    }

}
