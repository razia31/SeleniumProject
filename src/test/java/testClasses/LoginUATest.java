package testClasses;

import dataReader.ExcelLoginDataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import pageElements.LoginUAPage;
import utility.BaseClass;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class LoginUATest extends BaseClass {

    LoginUAPage loginUAPage;

    /*
    Step 1 : Click on Account link
    Step 2 : Click on Login link
     */
    @Test
    public void clickOnAccount() throws IOException, InterruptedException {

        loginUAPage = new LoginUAPage(driver);
        loginUAPage.clickOnAccount();
        loginUAPage.clickOnLogin();

      //loginPage(); //Functionality

    }

    /*
    Test Case - Validate that the user is on the login page
    step-1 = click on Account
    step-2 = click on Login
    step-3 = validate that a text "Login" is there in the page

     */
    @Test
    public void validateLoginPage(){
        loginUAPage.clickOnAccount();
        loginUAPage.clickOnLogin();
        if(loginUAPage.getLoginText().equalsIgnoreCase("Login")){
            System.out.println("I am on the right page");
        }
        else{
            System.out.println("I am not on the right page");
        }
     //   Assert.assertEquals(loginUAPage.getLoginText(),"Login");
      //  Assert.assertEquals(loginUAPage.loginTextDisplay(),false);

    }

@Test
    public void login() {
    WebElement userName = driver.findElement(By.id("loginusername"));
    userName.sendKeys("raziasultana31");

    WebElement email = driver.findElement(By.name("loginemail"));
    email.sendKeys("razia.fariha@gmail.com");

    WebElement password = driver.findElement(By.id("loginPassword4"));
    password.sendKeys("razia1031");


    }
    @Test
    public void loginButton() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver ;
        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        js.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(5000);
        //js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.name("inputsubmitt")));
        WebElement loginClick = driver.findElement(By.name("loginsubmit"));

        loginClick.click();

        screenshot("login1.png");

        //captureScreenShotonFailure(ITestResult result); //screenshot for failed test cases
    }
@Test(dataProvider = "Login Data from Excel", dataProviderClass = ExcelLoginDataReader.class)
    public void enterLoginData(String userName, String passWord, String email) throws InterruptedException {
        // formula: //tagname[@attribute = 'value']


//        WebElement userNamePath = driver.findElement(By.xpath("//input[@name='loginusername']"));
//        userNamePath.clear();
//        userNamePath.sendKeys(userName);
        Thread.sleep(3000);
    loginUAPage.enterUserName(userName);

//        WebElement passwordPath = driver.findElement(By.xpath("//input[@id='loginPassword4']"));
//        passwordPath.clear();
//        passwordPath.sendKeys(passWord);
        Thread.sleep(3000);
    loginUAPage.enterPassword(passWord);



//        List<WebElement> inputList = driver.findElements(By.xpath("//input[@class='form-control']"));
//        WebElement emailPath = inputList.get(1);
//        emailPath.clear();
//        emailPath.sendKeys(email);
        Thread.sleep(3000);
    loginUAPage.enterEmail(email);

//        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]"));
//        loginButton.click();
        Thread.sleep(3000);
    loginUAPage.loginButton();
    }

}

