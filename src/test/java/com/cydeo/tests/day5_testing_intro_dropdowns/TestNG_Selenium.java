package com.cydeo.tests.day5_testing_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1- Do browser driver setup
        //2- Open Browser
       driver = WebDriverFactory.getDriver("chrome");


    }
    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test(){

        //3- maximize the page
        driver.manage().window().maximize();


        //4- implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //5- Get "https://google.com"
        driver.get("https://google.com");


        //6- Assert: title is "Google"

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle,"Title is not matching here.");
        Assert.assertTrue(actualTitle.equals(expectedTitle));


    }


}
