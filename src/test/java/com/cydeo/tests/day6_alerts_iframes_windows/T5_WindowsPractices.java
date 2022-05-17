package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #5: Window Handle practice
        //1. Create a new class called: T5_WindowsPractice
        // 2. Create new test and make setups
        // open the browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


       // 3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");


    }

    @Test
    public void multiple_window_tests(){

        //4. Assert: Title is “Windows”
        //5. Click to: “Click Here” link
        // 6. Switch to new Window.
        //7. Assert: Title is “New Window”

    }
}
