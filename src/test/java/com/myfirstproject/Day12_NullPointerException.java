package com.myfirstproject;
import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day12_NullPointerException  {
    WebDriver driver;
    Faker faker ;
    @Test
    public void nullPointerTest1(){
        driver.get("https//www.google.com");//NullPointerException
//        solution : intantiate the object...WebDriver driver = new ChromeDriver();
    }
    @Test
    public void nullPointerTest2(){
        System.out.println(faker.name().fullName());//NullPointerException
    }
}
