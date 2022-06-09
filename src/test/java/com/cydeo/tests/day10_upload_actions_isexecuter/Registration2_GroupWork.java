package com.cydeo.tests.day10_upload_actions_isexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration2_GroupWork {


    @Test
    public void test_form() {

        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));


        //Create JavaFaker object
        Faker faker = new Faker();


        //3. Enter first name
        //WebElement inputFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        //inputUsername.sendKeys(faker.name().username().replaceAll(".", ""));
        WebElement inputUserName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUserName.sendKeys(faker.name().username().replaceAll(".", ""));
        String username = faker.letterify("???????????");
        inputUserName.sendKeys(username);

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(username + "@gmail.com");


        //7. Enter password
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.bothify("###?????####"));

        //8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();



        //10.Enter date of birth
        WebElement dateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys("03/12/1996");


        // 11. Select Department/Office
        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByValue("MCTC");

        // 12.Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByVisibleText("Designer");

       // 13.Select programming language from checkboxes
       WebElement programmingLanguage =  Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
       programmingLanguage.click();


        //14.Click to sign up button
        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        signInButton.click();

        //15.Verify success message “You’ve successfully completed registration.” is displayed.
        WebElement actualMessage = Driver.getDriver().findElement(By.tagName("p"));
        Assert.assertTrue(actualMessage.isDisplayed());
    }


    }

