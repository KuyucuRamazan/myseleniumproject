package com.myfirstproject.homework;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class toggle extends TestBase {
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
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        Boolean textAfterEffect = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='effect']/p")));
        Assert.assertEquals(textAfterEffect);*/

        //Click on Run Effect button again
        //Print the text that shoud be:
//        "Etiam libero neque, luctus a, eleifend nec, semper at, lorem. Sed pede.
//        Nulla lorem metus, adipiscing ut, luctus sed, hendrerit vitae, mi."
        button.click();
        Thread.sleep(2000);
        String textAfterSecondEffect = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
        System.out.println(textAfterSecondEffect);
    }
}