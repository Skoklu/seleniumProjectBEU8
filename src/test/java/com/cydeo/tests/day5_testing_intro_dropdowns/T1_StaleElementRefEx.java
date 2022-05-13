package com.cydeo.tests.day5_testing_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {

    public static void main(String[] args) {

        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");


        // 3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[contains(@onclick,'addElement()')]"));
        addElementButton.click();


        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButtonIsDisplayed = driver.findElement(By.xpath("//button[contains(@onclick,'deleteElement()')]"));
        System.out.println("deleteButtonIsDisplayed.isDisplayed() = " + deleteButtonIsDisplayed.isDisplayed());

        // 5. Click to “Delete” button.
        deleteButtonIsDisplayed.click();

        //6. Verify “Delete” button is NOT displayed after clicking.

try {
    System.out.println("deleteButtonIsDisplayed.isDisplayed() = " + deleteButtonIsDisplayed.isDisplayed());

}catch (StaleElementReferenceException e){
    System.out.println("StaleElementReferenceException is thrown");
    System.out.println("This means the web element is completely deleted from the page");
    System.out.println("deleteButtonIsDisplayed.isDisplayed() = false");
}
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
            driver.close();

    }
}
