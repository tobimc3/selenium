package com.example.marriott.demo_job;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

public class SeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver(); 
        driver.manage().window().maximize();
    }

    @Test
    public void validLoginTest() throws Exception{
        driver.get("https://www.marriott.com");
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Assert.assertEquals(driver.getTitle(), "Marriott Bonvoy Hotels | Book Directly & Get Exclusive Rates");

        //WebElement username = driver.findElement(By.id("username"));
        
        WebElement findHotelsButton = driver.findElement(By.xpath("/html/body/div[1]/main/section/div/div[2]/div/div/div/div/div[3]/button"));
        //WebElement password = driver.findElement(By.id("password"));
        //WebElement loginButton = driver.findElement(By.id("loginBtn"));

        //username.sendKeys("validUser");
        //password.sendKeys("validPass123");
        findHotelsButton.click();

        // Assert successful login by checking a known element on dashboard
        //WebElement welcomeText = driver.findElement(By.id("welcome"));
        //Assert.assertTrue(welcomeText.isDisplayed(), "Login failed or welcome message not shown");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            
            driver.quit();
        }
    }

    
}
