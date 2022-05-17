package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;

    @BeforeClass
    public void setupMethod(){


        // TC #4: Iframe practice
        //1. Create a new class called: T4_Iframes
        //2. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


    }
    //@Ignore  //this makes that this test un-runnable and goes to another test
        @Test
    public void iframe_Test(){

        //We need to switch driver's focus to iframe
            //option #1- switching the iframe using id attribute value
            driver.switchTo().frame("mce_0_ifr");  // 1- frame(iframe_id);

            //option #2- passing index number of iframe
            driver.switchTo().frame(0);    // 2- frame(index number);

            //option #3- locate as web element and pass in frame()method
            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"))); // 3- frame(iframe)

        //Locate the p tag
            WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

            //4. Assert: “Your content goes here.” Text is displayed.
            Assert.assertTrue(yourContentGoesHereText.isDisplayed());

            // 5. Verify: “An iFrame containing the TinyMCE WYSIWYG Editor”
            //To be able to verify the header, we must switch back to "main HTML"

            driver.switchTo().parentFrame();  // 4- parentFrame();
            WebElement headerText = driver.findElement(By.xpath("//h3"));
            Assert.assertTrue(headerText.isDisplayed());



        }
        @AfterClass
    public void threadDropdown(){

       // driver.close();
        }

}
