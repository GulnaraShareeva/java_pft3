package ru.stqa.training2.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;


public class MyFirstTest7 {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,200 );
    }

    @Test
    public void myFirstTest() {
        driver.navigate().to("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.cssSelector("#app-")).click();
        driver.findElement(By.linkText("Template")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Template')]"));
        driver.findElement(By.linkText("Logotype")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Logotype')]"));
        driver.findElement(By.linkText("Catalog")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Catalog')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Product Groups')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[3]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Option Groups')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[4]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Manufacturers')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[5]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Suppliers')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[6]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Delivery Statuses')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[7]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Sold Out Statuses')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[8]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Quantity Units')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[9]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' CSV Import/Export')]"));
        driver.findElement(By.linkText("Countries")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Countries')]"));
        driver.findElement(By.linkText("Currencies")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Currencies')]"));
        driver.findElement(By.linkText("Customers")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' Customers')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(), ' CSV Import/Export')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[3]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Newsletter')]"));
        driver.findElement(By.linkText("Geo Zones")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Geo Zones')]"));
        driver.findElement(By.cssSelector("ul#box-apps-menu > li > a")).click();
        driver.findElement(By.linkText("Languages")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Languages')]"));
        driver.findElement(By.linkText("Storage Encoding")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Storage Encoding')]"));
        driver.findElement(By.linkText("Modules")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Job Modules')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Customer Modules')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[3]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Shipping Modules')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[4]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Payment Modules')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[5]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Order Total Modules')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[6]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Order Success Modules')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[7]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Order Action Modules')]"));
        driver.findElement(By.linkText("Orders")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Orders')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Order Statuses')]"));
        driver.findElement(By.linkText("Pages")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Pages')]"));
        driver.findElement(By.linkText("Reports")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Monthly Sales')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Most Sold Products')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[3]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Most Shopping Customers')]"));
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[3]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[4]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[5]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[6]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[7]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[8]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Settings')]"));
        driver.findElement(By.linkText("Slides")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Slides')]"));
        driver.findElement(By.linkText("Tax")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Tax Classes')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Tax Rates')]"));
        driver.findElement(By.linkText("Translations")).click();
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Search Translations')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[2]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Scan Files For Translations')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[3]")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' CSV Import/Export')]"));
        driver.findElement(By.linkText("Users")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' Users')]"));
        driver.findElement(By.linkText("vQmods")).click();
        driver.findElement(By.xpath("//h1[contains(text(),  ' vQmods')]"));
        driver.findElement(By.xpath("//*[@class='docs']/li[1]")).click();
        wait.until(titleIs("vQmods | My Store"));
    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}