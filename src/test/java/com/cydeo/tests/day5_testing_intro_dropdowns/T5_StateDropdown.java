package com.cydeo.tests.day5_testing_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_StateDropdown {

   // TC #5: Selecting state from State dropdown and verifying result
    // 1. Open Chrome browser
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void simpleDropdownTest(){

        Select selectDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        // 3. Select Illinois
        //Use  Select options. (visible text)
        selectDropdown.selectByVisibleText("Illinois");


        //4. Select Virginia
        //Use Select options. (value)
        selectDropdown.selectByValue("VA");


        //5. Select California
        //Use Select options. (index)
        selectDropdown.selectByIndex(5);


//6. Verify final selected option is California.

     String expectedOptionText = "California";

     String actualOptionText = selectDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);
    }
    

}
