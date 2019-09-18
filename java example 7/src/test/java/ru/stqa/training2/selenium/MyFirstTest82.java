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


public class MyFirstTest82 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 100);
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://localhost/litecart/en/");

        List<WebElement> mostPopularducks = driver.findElements(By.cssSelector("#box-most-popular .image-wrapper"));
        for(WebElement m : mostPopularducks){
            Assert.assertEquals( m.findElements(By.cssSelector(".sticker")).size(), 1);
        }

        List<WebElement> campaignsducks = driver.findElements(By.cssSelector("#box-campaigns .image-wrapper"));
        for(WebElement c : campaignsducks){
            Assert.assertEquals( c.findElements(By.cssSelector(".sticker")).size(), 1);
        }

        List<WebElement> latestProductsducks = driver.findElements(By.cssSelector("#box-latest-products .image-wrapper"));
        for(WebElement l : latestProductsducks){
            Assert.assertEquals( l.findElements(By.cssSelector(".sticker")).size(), 1);
        }
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
