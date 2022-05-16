package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
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
        //4. Click to OK button from the alert
        //5. Verify “You successfully clicked an alert” text is displayed.


    }

}
