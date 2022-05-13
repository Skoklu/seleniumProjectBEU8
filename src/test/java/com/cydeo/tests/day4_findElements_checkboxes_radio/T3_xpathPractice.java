package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_xpathPractice {

    public static void main(String[] args) {


        //XPATH Practice
       // DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
       // TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        // 2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons");



        // 3. Click on Button 1
        WebElement clickOnButton1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        clickOnButton1.click();


        //4. Verify text displayed is as expected: Expected: “Clicked on button one!”
        WebElement clickedOnButton1 = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedClickedOnButton1 ="Clicked on button one!";
        String actualClickedOnButton1 = clickedOnButton1.getText();

        if (actualClickedOnButton1.equals(expectedClickedOnButton1)){
            System.out.println("Clicked on button one! verification is PASSED!");
        }else{
            System.out.println("Clicked on button one! verification is FAILED!!!");
        }
        driver.close();



        // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
