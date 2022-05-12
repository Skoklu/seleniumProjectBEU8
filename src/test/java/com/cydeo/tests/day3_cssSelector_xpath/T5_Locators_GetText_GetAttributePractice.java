package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_Locators_GetText_GetAttributePractice {

    public static void main(String[] args) {


       // 1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");


        //3- Verify “Reset password” button text is as expected:
       // Expected: Reset password
        WebElement resetPasswordLink = driver.findElement(By.cssSelector("button[value='Reset password']"));

        String expectedResetButton = "Reset password";
        String actualResetButton = resetPasswordLink.getAttribute("value");

        if (actualResetButton.equals(expectedResetButton)){
            System.out.println("Reset button verification PASSED!");
        }else {
            System.out.println("Reset button verification FAILED!!!");
        }



       /* PS: Inspect and decide which locator you should be using to locate web elements.
                PS2: Pay attention to where to get the text of this button from

        */
    }
}
