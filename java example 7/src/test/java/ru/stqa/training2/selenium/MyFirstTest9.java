package ru.stqa.training2.selenium;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class MyFirstTest9 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 100);
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://localhost/litecart/admin/?app=countries&doc=countries");


    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
