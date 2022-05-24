package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){


        // 1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver=  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");


    }

    @Test
    public void dropdown_task5(){
        // TC #5: Selecting state from State dropdown and verifying result
        //We located the dropdown and it is ready to use
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));


        //3. Select Illinois
        // Use Select options. (visible text)
        stateDropdown.selectByVisibleText("Illinois");

       // 4. Select Virginia
        // Use Select options. (value)
        stateDropdown.selectByValue("VA");

        //5. Select California
        // Use Select options. (index)
        stateDropdown.selectByIndex(5);


       // 6. Verify final selected option is California.

        //".getFirstSelectedOption()"  we are getting currently selected option not first option
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);


    }


    @Test
    public void dropdown_task6(){
       /* //TC #6: Selecting date on dropdown and verifying
        // 1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown

       ***------- until here I did them under the @BeforeMethod line 16 -----------***
        */
        //3. Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));


        //Select year using : visible text
        yearDropdown.selectByVisibleText("1923");


        // Select month using : value attribute
        monthDropdown.selectByValue("11");


        // Select day using : index number
        dayDropdown.selectByIndex(0);

        //create expected values

        String expectedYear ="1923";
        String expectedMonth ="December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        //Create assertions
        //Assert.assertEquals(actualYear, expectedYear);  -----OR---->
        Assert.assertTrue(actualYear.equals(expectedYear));

        //Assert.assertEquals(actualMonth, expectedMonth);  -----OR---->
        Assert.assertTrue(actualMonth.equals(expectedMonth));

        //Assert.assertEquals(actualDay, expectedDay);   -----OR---->
        Assert.assertTrue(actualDay.equals(expectedDay));





    }


    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

}
