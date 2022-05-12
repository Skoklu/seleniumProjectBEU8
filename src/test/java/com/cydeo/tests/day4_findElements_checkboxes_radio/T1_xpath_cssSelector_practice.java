package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {



        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        // 1. Open Chrome browser
        WebDriver  driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        // 2. Go to https://practice.cydeo.com/forgot_password
        driver.navigate().to("https://practice.cydeo.com/forgot_password");


        // 3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
        //  a. “Home” link
        //Locate homeLink using cssSelector 1, class value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //Locate homeLink using cssSelector syntax #2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));

        //Locate homeLink using cssSelector 3, href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));



        // b. “Forgot password” header
        //Locate header using cssSelector: locate parent element and move down to h2
        WebElement forgotPasswordHeader1 = driver.findElement(By.cssSelector("div.example > h2"));

        // Locate header using xpath, and using web elements text "Forgot Password"
        //WebElement forgotPasswordHeader2 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        WebElement forgotPasswordHeader3 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


        // c. “E-mail” text
        WebElement emailLabel  = driver.findElement(By.xpath("//label[@for='email']"));


        // d. E-mail input box

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@type='text']"));

        //Locate inputBox using xpath contains method

        //tagName[contains(@attribute,'value')]

        WebElement emailInputBox2 = driver.findElement(By.xpath("//input[@name='email']"));

        //tagName[contains(@attribute,'value')]
        WebElement emailInputBox3 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));


        // e. “Retrieve password” button
        WebElement RetrievePasswordButton1 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement RetrievePasswordButton2 = driver.findElement(By.xpath("//button[@class='radius']"));
        WebElement RetrievePasswordButton3 = driver.findElement(By.xpath("//button[@type='submit']"));


        // f. “Powered by Cydeo text
        WebElement PoweredByCydeoLink = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        // 4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("forgotPasswordHeader1.isDisplayed() = " + forgotPasswordHeader1.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("RetrievePasswordButton2.isDisplayed() = " + RetrievePasswordButton2.isDisplayed());
        System.out.println("PoweredByCydeoLink.isDisplayed() = " + PoweredByCydeoLink.isDisplayed());
        driver.close();
        // First solve the task with using cssSelector only.
        // Try to create 2 different
        // cssSelector if possible
       // Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible
    }
}
