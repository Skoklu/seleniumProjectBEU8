package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //#1- Initialize the driver instance and object of the class
    public LibraryLoginPage(){
        /*
        //InitElements method will create connecting in between the current driver session (instance)
         and the object of the current class.
       */
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Use @FindBy annotation to locate web elements
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(xpath ="//input[@id='inputPassword']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement fieldRequiredErrorMessage;

}
