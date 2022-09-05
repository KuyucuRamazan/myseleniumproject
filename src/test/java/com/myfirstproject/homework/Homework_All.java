package myfirstproject.homework;

import com.myfirstproject.utilities.TestBase;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework_All extends TestBase {
    @Test
    public void homework01() {
        //When user goes to https://jqueryui.com/accordion/
        driver.get("https://jqueryui.com/accordion/");
        //And user clicks on Section2 accordion
        driver.switchTo().frame(0);
        WebElement text = driver.findElement(By.xpath("//h3[@class='ui-accordion-header ui-corner-top ui-accordion-header-collapsed ui-corner-all ui-state-default ui-accordion-icons']"));
        text.click();
        //Verify the test contains "Sed non urna."
        String actualText = driver.findElement(By.xpath("//*[text()='\n" +
                "\t\tSed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet\n" +
                "\t\tpurus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor\n" +
                "\t\tvelit, faucibus interdum tellus libero ac justo. Vivamus non quam. In\n" +
                "\t\tsuscipit faucibus urna.\n" +
                "\t\t']")).getText();

        String expectedText = "Sed non urna.";
        Assert.assertTrue(actualText.contains(expectedText));
    }
    @Test
    public void homework02(){
        //When user goes to https://jqueryui.com/datepicker/
        driver.get("https://jqueryui.com/datepicker/");
        //And select the next date of the current date
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        driver.findElement(By.xpath("//table//tbody//tr//td[5]")).click();
        getValueByJS("datepicker");
    }
}