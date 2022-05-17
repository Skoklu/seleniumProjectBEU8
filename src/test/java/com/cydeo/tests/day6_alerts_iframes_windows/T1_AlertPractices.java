package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_AlertPractices {


    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //TC #1: Information alert practice
        //1. Open browser

      driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
      driver.get("https://practice.cydeo.com/javascript_alerts");


        //3. Click to “Click for JS Alert” button
        //4. Click to OK button from the alert
        //5. Verify “You successfully clicked an alert” text is displayed.
    }

    @Test
    public void alert_test1(){

        //3. Click to “Click for JS Alert” button
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //To be able to click to Alert OK button we need to switch driver's focus to alert itself.
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();

        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));

        //Failure message will only be displayed if assertion fails: ""Result text is not displayed
        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed.");

        String expectedText = "You successfully clicked an alert";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result test is not as expected!!!");



    }

    @Test
    public void confirmationAlertPractice(){


        //TC #2: Confirmation alert practice
        //1. Open browser

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");


        //3. Click to “Click for JS Confirm” button
        WebElement clickFoJSConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickFoJSConfirmButton.click();


        //4. Click to OK button from the alert
        //5. Verify “You clicked: Ok” text is displayed.


    }

}
