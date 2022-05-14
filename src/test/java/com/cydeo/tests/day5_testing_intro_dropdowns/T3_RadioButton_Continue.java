package com.cydeo.tests.day5_testing_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_Continue {

    public static void main(String[] args) {


        // XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #2: Radiobutton handling
        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");


        //Locate name='sports' radio buttons and store them in a list of a web elements
       clickAndVerifyRadioButton(driver, "sport", "hockey");
       clickAndVerifyRadioButton(driver, "sport", "football");
       clickAndVerifyRadioButton(driver, "color", "yellow");
            }


    private static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){
        List<WebElement> radioButton = driver.findElements(By.name("sport"));

        //Loop through the list of WebElement select matching result "hockey"
        for (WebElement each : radioButton) {
            String eachId = each.getAttribute("id");

            if (eachId.equals("hockey")) {
                each.click();
                System.out.println(eachId+" is selected: " + each.isSelected());
                break;
            }

        }
    }


    // 4. Verify “Hockey” radio button is selected after clicking.
        //USE XPATH LOCATOR FOR ALL WebElement LOCATORS
        //Create a utility method to handle above logic.
        // Method name: clickAndVerifyRadioButton Return type: void or boolean
       // Method args:
       // 1. WebDriver
        //2. NameAttributesString(forProvidingWhichGroupOfRadioButtons)
        // 3. IdAttributesString(forProvidingWhichRadioButtonToBeClicked)
        //Method should loop through the given group of radio buttons.
        // When it finds the matching option, it should click and verify option is Selected.
               // Print out verification: true

}
