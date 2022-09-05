package com.myfirstproject.homework;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class toggle1 extends TestBase {
//When user goes to https://jqueryui.com/toogle/

    @Test
    public void test() throws InterruptedException {
        driver.get("https://jqueryui.com/toggle/");

        //print the text that should be: Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede. Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.

        driver.switchTo().frame(0);
        String text = driver.findElement(By.xpath("//*[@id='effect']/p")).getText();
        System.out.println(text);

        //Then click on Run Effect button
        WebElement button=driver.findElement(By.id("button"));
        button.click();

        //then print the text and verify it is empty
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        Boolean emptyText1 =wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='effect']/p")));
        System.out.println("text is empty: "+emptyText1);
        Assert.assertTrue(emptyText1);

        //then click on run effect button one more time
        WebElement button2=driver.findElement(By.id("button"));
        button2.click();
        // //print the text that should be: Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede.
        // Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi.

        Thread.sleep(2000);
        String text3 = driver.findElement(By.xpath("//*[@id='effect']/p")).getText();
        System.out.println(text3);


    }
}
