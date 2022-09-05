package com.myfirstproject.homework;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Accordion extends TestBase {
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
}