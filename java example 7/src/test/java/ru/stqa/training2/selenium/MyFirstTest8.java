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


public class MyFirstTest8 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,100 );
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://localhost/litecart/en/");
        System.out.println("most-popular");
        System.out.println(driver.findElements(By.cssSelector("#box-most-popular .product:nth-child(1) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-most-popular .product:nth-child(2) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-most-popular .product:nth-child(3) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-most-popular .product:nth-child(4) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-most-popular .product:nth-child(5) .sticker")).size());
        System.out.println("campaigns");
        System.out.println(driver.findElements(By.cssSelector("#box-campaigns .product:nth-child(1) .sticker")).size());
        System.out.println("latest-products");
        System.out.println(driver.findElements(By.cssSelector("#box-latest-products .product:nth-child(1) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-latest-products .product:nth-child(2) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-latest-products .product:nth-child(3) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-latest-products .product:nth-child(4) .sticker")).size());
        System.out.println(driver.findElements(By.cssSelector("#box-latest-products .product:nth-child(5) .sticker")).size());

    }




    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}