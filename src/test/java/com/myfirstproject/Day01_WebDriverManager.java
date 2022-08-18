package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_WebDriverManager {
    public static void main(String[] args) {
        //1.Setup chrome driver. NO LONGER System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        //2.Rest is the same
        WebDriver driver = new ChromeDriver();
        // 3. write your test case
        driver.get("https://www.amazon.com/");
    }
}
