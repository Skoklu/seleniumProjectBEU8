package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    @Test
    public void RequiredFieldErrorMessage(){

        // TC Required Field Error Message
        //  #1:  test 1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com/");


        // 3- Do not enter any information
        // 4- Click to “Sign in” button
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();


       // 5- Verify expected error is displayed:
       // Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

    }


}
