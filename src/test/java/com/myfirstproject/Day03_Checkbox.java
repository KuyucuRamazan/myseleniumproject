package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_Checkbox {
//    Go to https://the-internet.herokuapp.com/checkboxes
//    Locate the elements of checkboxes
//    Then click on checkbox1 if box is not selected
//    Then click on checkbox2 if box is not selected
//    Homework: Then verify that checkbox1 is checked.

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {

//    Go to https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

//    Locate the elements of checkboxes
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        Thread.sleep(3000);
//    Then click on checkbox1 if box is not selected
        if(!checkBox1.isSelected()){
            checkBox1.click();
        }
        Thread.sleep(3000);
//    Then click on checkbox2 if box is not selected
        if(!checkBox2.isSelected()){
            checkBox2.click();
        }


//    Then verify that checkbox1 is checked.
        Assert.assertTrue(checkBox1.isSelected());
        Assert.assertTrue(checkBox2.isSelected());

    }
    /*
    isSelected() is used to check if checkbox or radio button is selected.
    If a checkbox is selected then isSelected() will return true
    If a checkbox is not selected then isSelected() will return false
     */

}