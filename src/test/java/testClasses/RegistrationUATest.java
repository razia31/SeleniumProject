package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pageElements.LoginUAPage;
import pageElements.RegistrationUAPage;
import utility.BaseClass;

import java.io.IOException;

import static org.openqa.selenium.By.*;

public class RegistrationUATest extends BaseClass {

    /* TestCase 101 --- Verify that the registration page displayed all the fields properly.
       TestCase 102 --- Verify that user should be able to register to the application.

       TestCase 102

       Step 1 : Enter the first name
       Step 2 : Enter the last name
       Step 3 : Enter the Username
       Step 4 : Enter email
       Step 5 : Enter password
       Step 6 : Enter Confirm password
       Step 7 : Enter birthday
       Step 8 : Enter phone number

       There are few locators/attributes that Selenium likes:
       i. id
       ii.name
       iii. Class
       iv.Partial LinkText
       v. xpaths
       vi.Css Selector

       When we have lots of test methods ... it will run alphabetically.
       We can put parameters and execute the tests based on priority levels and conditions. For example:
        @Test priority = 4, dependsOnMethods = "enterUserName")

       If there is no priority number mentioned in a Test, then that test will run first
       because it is considered as priority 0.

       We can also fail the Test forcefully by using Assert.assertTrue(false);
     */

    RegistrationUAPage registrationUAPage;
@Test
    public void clickOnRegistration() throws IOException, InterruptedException {

    registrationUAPage = new RegistrationUAPage(driver);
    registrationUAPage.clickOnRegistration();
}

@Test
    public void validateRegistrationPage(){
       // registrationUAPage.clickOnRegistration();
        if(registrationUAPage.getRegistrationText().equalsIgnoreCase("Registration")){
            System.out.println("I am on the right page");
        }
        else{
            System.out.println("I am on the wrong page");
        }

      //  Assert.assertEquals(registrationUAPage.getRegistrationText(),"Registration");
    }

//@Test(groups = "smoke")
    public void enterFirstname(){
        registrationUAPage.firstName();
    }


    public void registration(){





    }


    public void submitButton() throws InterruptedException {
    JavascriptExecutor js = (JavascriptExecutor) driver ;
   // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    js.executeScript("window.scrollBy(0, 200)");
    Thread.sleep(5000);
       //js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.name("inputsubmit")));
    WebElement submit = driver.findElement(By.name("inputsubmit"));

       submit.click();
    }

    @AfterMethod
    public void captureScreenShotonFailure(ITestResult result){
        if(result.getStatus()== ITestResult.FAILURE){
            try{
                screenshot(result.getName()+"fail.png");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }


    }



}
/*
TestNG is a testing framework. We can organize our test. There are some annotations against each method

@BeforeClass
@BeforeMethod
@BeforeTest
@Test --- main annotation. Without @Test no other annotations will work. Where the class holds @Test
annotation, that means this is a Test Class. Test Class is an alternation to main method.
@AfterTest
@AfterMethod
@AfterClass

Fill out the whole registration page... including Open Account button

Registration Test Case

i.click on Registration
ii. Validate that we are on the registration page
iii. fill out all the fields using absolute xpath

 */