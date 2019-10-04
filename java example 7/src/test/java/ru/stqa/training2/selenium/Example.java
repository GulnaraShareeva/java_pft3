package ru.stqa.training2.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class Example {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,200 );
    }

    @Test
    public void checkStickers() {
        driver.get("http://localhost/litecart/en/");

        String[] boxType = {"box-most-popular", "box-campaigns", "box-latest-products"};
        for (String box : boxType) {
            System.out.println("Категория товаров: " + box.replace("-"," "));
            List<WebElement> locator = driver.findElements(By.xpath("//*[@id='" + box + "']/div/ul/li[contains(@class, 'product')]"));

            for (WebElement e : locator) {
                if (e.findElements(By.className("sticker")).size() == 1) {
                    System.out.println("стикер один");
                } else {
                    System.out.println("стикер не является единственным");
                }
            }
        }
    }


    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}