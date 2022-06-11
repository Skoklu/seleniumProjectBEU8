package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();

    }
    @Test
    public void RequiredFieldErrorMessage(){

        // TC Required Field Error Message
        //  #1:  test 1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com



        // 3- Do not enter any information
        // 4- Click to “Sign in” button


        libraryLoginPage.signInButton.click();


       // 5- Verify expected error is displayed:
       // Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void InvalidEmailFormatErrorMessageTest1(){

       // TC #2: Invalid email format error message test
        // 1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com



        //3- Enter invalid email format


        libraryLoginPage.inputUsername.sendKeys("somethingWrong");



       // 4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();

        //NOTE: FOLLOW POM DESIGN PATTERN
    }
    @Test
    public void Library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com




        //3- Enter incorrect username or incorrect password
        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongPassword");

        libraryLoginPage.signInButton.click();



       // libraryLoginPage = libraryLoginPage.WrongEmailOrPasswordMessage;
        // 4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.WrongEmailOrPasswordMessage.isDisplayed());
            Driver.closeDriver();
    }

} // NOTE: FOLLOW POM DESIGN PATTERN

//POM: Page object model