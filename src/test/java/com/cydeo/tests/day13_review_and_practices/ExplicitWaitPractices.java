package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {

    DynamicControlPage dynamicControlPage;

    @BeforeMethod
    public void setupMethod(){

       // 1- Open a chrome browser
       // 2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlPage = new DynamicControlPage();


    }

    @Test
    public void remove_button_test(){

        // 3- Click to “Remove” button
        dynamicControlPage.removeButton.click();


        // 4- Wait until “loading bar disappears”
        /*
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));

         */
        BrowserUtils.waitForInvisibilityOf(dynamicControlPage.loadingBar);
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 5- Verify:
        //a- Checkbox is not displayed

        try{
            //assertFalse Method will pass the test if the boolean value returned is:false
            Assert.assertTrue(!dynamicControlPage.checkbox.isDisplayed());

            Assert.assertFalse(dynamicControlPage.checkbox.isDisplayed());

        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's gone!"));
        // NOTE: FOLLOW POM




    }

    @Test
    public void enable_button_test(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls

        //1 and 2 under the @Before Method


        // 3- Click to “Enable” button

        dynamicControlPage.enableButton.click();

        System.out.println("dynamicControlPage.inputBox.isEnabled() = "
                + dynamicControlPage.inputBox.isEnabled());

        //4- Wait until “loading bar disappears”
        //calling our explicitWait utility method to wait loadingBar to disappear
        BrowserUtils.waitForInvisibilityOf(dynamicControlPage.loadingBar);

        System.out.println("dynamicControlPage.inputBox.isEnabled() = "+ dynamicControlPage.inputBox.isEnabled());


        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicControlPage.inputBox.isEnabled());


        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlPage.message.isDisplayed());


        //Check the string value is matching as expected: "It's enable!"
        Assert.assertTrue(dynamicControlPage.message.getText().equals("It's enable!"));




        // NOTE: FOLLOW POM
    }
}
