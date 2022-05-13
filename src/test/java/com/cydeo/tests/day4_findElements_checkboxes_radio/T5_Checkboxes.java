package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_Checkboxes {

    public static void main(String[] args) {


        // Practice: Checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://practice.cydeo.com/checkboxes");



        //We have to locate checkboxes
        WebElement checkboxes1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkboxes2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

       // 2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkboxes1.isSelected(), expecting false = " + checkboxes1.isSelected());



        // 3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkboxes2.isSelected(), expecting true = " + checkboxes2.isSelected());



        // 4. Click checkbox #1 to select it.
        checkboxes1.click();


       // 5. Click checkbox #2 to deselect it.
        checkboxes2.click();



        //6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkboxes1.isSelected(), expecting true = " + checkboxes1.isSelected());


        // 7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkboxes2.isSelected(), expecting false = " + checkboxes2.isSelected());


        //driver.close();
    }
}
