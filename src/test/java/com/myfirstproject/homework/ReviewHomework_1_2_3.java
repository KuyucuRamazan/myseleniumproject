package com.myfirstproject.homework;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReviewHomework_1_2_3 extends TestBase {
    @Test
    public void accordionTest() throws InterruptedException {
        // Go to Url "http://jqueryui.com/accordion/"
        driver.get("http://jqueryui.com/accordion/");

        // Click on Section2

        driver.switchTo().frame(0);
        driver.findElement(By.id("ui-id-3")).click();
        String text = driver.findElement(By.xpath("//*[@id='ui-id-4']")).getText();
        System.out.println(text);
        Thread.sleep(3000);
        Assert.assertTrue(text.contains("Sed non urna"));
    }
    @Test
    public void datePickerTest() throws InterruptedException {
        // Go to Url
        driver.get("http://jqueryui.com/datepicker/");

        // Switch to iframe
        driver.switchTo().frame(0);

        // Locate datepicker Webelement and click on it
        driver.findElement(By.id("datepicker")).click();
        Thread.sleep(3000);

        // Locate current date from table and click the next day
        driver.findElement(By.xpath("//*[contains(@class,'ui-datepicker-today')]//following::td[1]")).click();

    }
    @Test
    public void toggleTest() throws InterruptedException {
        //User goes to https://jqueryui.com/toggle/
        driver.get("https://jqueryui.com/toggle/");

        //Print the text that should be:
//        "Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede.
//        Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi."

        driver.switchTo().frame(0);
        String text = driver.findElement(By.xpath("//*[@id='effect']/p")).getText();
        System.out.println(text);

        //Click run effect button
        //print the text and verify it is empty
        WebElement button = driver.findElement(By.xpath("//button[@id='button']"));
        button.click();

        Thread.sleep(2000);
        String textAfterEffect = driver.findElement(By.xpath("//*[@id='effect']/p")).getText();
        System.out.println("NO TEXT"+textAfterEffect);
        Assert.assertTrue(textAfterEffect.isEmpty());

        //Click on Run Effect button again
        //Print the text that shoud be:
//        "Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede.
//        Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi."
        button.click();
        Thread.sleep(2000);
        String textAfterSecondEffect = driver.findElement(By.xpath("//*[@id='effect']/p")).getText();
        System.out.println(textAfterSecondEffect);
    }
}
