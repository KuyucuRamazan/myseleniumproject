package com.practice.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
    // ...Exercise4...
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculator under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Verify the result
    // Print the result

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        // Click on  Calculator under Micro Apps
        driver.findElement(By.xpath("//*[@id=\"calculatetest\"]")).click();

        // Type any number in the first input
        driver.findElement(By.xpath("//*[@id=\"number1\"]")).sendKeys("15");

        // Type any number in the second input
        driver.findElement(By.xpath("//*[@id=\"number2\"]")).sendKeys("10");

        // Click on Calculate
        driver.findElement(By.xpath("//*[@id=\"calculate\"]")).click();

        // Get the result
        String result = driver.findElement(By.xpath("//*[@id=\"answer\"]")).getText();


        // Verify the result
        Assert.assertEquals("25", result);

        // Print the result
        System.out.println(result);

    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
