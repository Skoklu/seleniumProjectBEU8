package com.cydeo.tests.day5_testing_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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

        // 3. Select Illinois

        Select simpleSelect = new Select(driver.findElement(By.xpath("//option[@value='IL']")));

        WebElement currentlySelectedOption = simpleSelect.getFirstSelectedOption();


    }
    


//4. Select Virginia
//5. Select California
//6. Verify
    //final selected option is California.
    //Use all Select options. (visible text, value, index)
}
