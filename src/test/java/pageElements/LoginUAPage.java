package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginUAPage {
    /*
    There are three parts in a page class
    i. constructor
    ii.page elements
    iii. method according to action

    Absolute xpath:

   i. Login username - /html/body/div/section[2]/div/form/div/input
   ii. Login password - /html/body/div/section[2]/div/form/div[3]/input
   iii. Login email - /html/body/div/section[2]/div/form/div[2]/input
   iv. Login button - /html/body/div/section[2]/h3
     */


    // PageFactory
    public LoginUAPage(WebDriver driver) { //Constructor
        PageFactory.initElements(driver, this);
    }

    //Page elements
    @FindBy(linkText = "Account")
    WebElement accountlocator;

    @FindBy(linkText = "Login")
    WebElement loginlocator;

    @FindBy(xpath = "/html/body/div/section[2]/h3")
    WebElement loginTextPath;

    @FindBy(xpath = "//input[@name='loginusername']")
    WebElement userNamePath;

    @FindBy(xpath = "//input[@id='loginPassword4']")
    WebElement passwordPath;

    @FindBy(xpath = "//input[@id='loginemail']")
    WebElement loginEmailPath;

    @FindBy(xpath = "//button[contains(@class,'btn-primary')]")
    WebElement loginButtonPath;




    public void clickOnAccount(){

        accountlocator.click();


        //all the implementation

       /* WebElement account = driver.findElement(By.linkText("Account"));
        account.click();
        Thread.sleep(4000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login"));

        WebElement login = driver.findElement(By.linkText("Login"));
        login.click();

        */

    }
    public void clickOnLogin(){
        loginlocator.click();
    }

    public String getLoginText(){
        String loginText = loginTextPath.getText();
        return loginText;

    }

//    public boolean loginTextDisplay(){
//       boolean logintextboolean = loginTextPath.isDisplayed();
//        return logintextboolean;
//    }

    public void enterUserName(String user){
        userNamePath.clear();
        userNamePath.sendKeys(user);
    }

    public void enterPassword(String pass){
        passwordPath.clear();
        passwordPath.sendKeys();
    }

    public void enterEmail (String email){
        loginEmailPath.clear();
        loginEmailPath.sendKeys();
    }

    public void loginButton (){
        loginButtonPath.click();
    }

System.out.println("New Line contributed by other team memeber");

}
