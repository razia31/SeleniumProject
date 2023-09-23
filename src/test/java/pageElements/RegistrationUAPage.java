package pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationUAPage {
    // Constructor
    // Page Elements
    // Methods according to action

    /*
Absolute xpath :
i.Registration Text: /html/body/div/div[4]/h2
ii.First name: /html/body/div/section[2]/div/form/div/input
iii.Last name: /html/body/div/section[2]/div/form/div[2]/input
iv.Username : /html/body/div/section[2]/div/form/div[3]/input
v.Email : /html/body/div/section[2]/div/form/div[4]/input
vi.Password: /html/body/div/section[2]/div/form/div[5]/input
vii. Confirm Password: /html/body/div/section[2]/div/form/div[6]/input
viii.D.O.B: /html/body/div/section[2]/div/form/div[7]/input
ix.Phone: /html/body/div/section[2]/div/form/div[8]/input
x.Address: /html/body/div/section[2]/div/form/div[9]/input
Xi.City: /html/body/div/section[2]/div/form/div[10]/input
Xii.Zip: /html/body/div/section[2]/div/form/div[11]/input
Xiii:Country: /html/body/div/section[2]/div/form/div[12]/input
XIV.Open Account Button: /html/body/div/section[2]/div/form/div[13]/button
     */


    public RegistrationUAPage(WebDriver driver) { //constructor
        PageFactory.initElements(driver, this);
    }
//Page elements
    @FindBy(linkText = "Registration")
    WebElement registrationLocator;

    //registration text xpath
    @FindBy(xpath = "/html/body/div/div[4]/h2")
    WebElement registrationTextPath;


    // xpath of all fields in Registration page
    @FindBy(xpath = "//input[@id='inputfname']")
    WebElement firstNameRegistration;

    @FindBy(xpath = "//input[@name='inputlname']")
    WebElement lastNameRegistration;

    @FindBy(xpath = "//input[@id='inputusername']" )
    WebElement userNameRegistration;

    @FindBy(xpath = "//input[@id='inputemail']")
    WebElement emailRegistration;

    @FindBy(xpath = "//input[@id='inputPassword4']")
    WebElement passwordRegistration;

    @FindBy(xpath = "//input[@name='inputrepassword']")
    WebElement confirmPasswordRegistration;

    @FindBy(xpath = "//input[@name='inputbirth']")
    WebElement birthDateRegistration;

    @FindBy(xpath = "//input[@id='inputphone']")
    WebElement phoneRegistration;

    @FindBy(xpath = "//input[@name='inputaddress']")
    WebElement addressRegistration;

    @FindBy(xpath = "//input[@id='inputCity']")
    WebElement cityRegistration;

    @FindBy(xpath = "//input[@id='inputZip']")
    WebElement zipRegistration;

    @FindBy(xpath = "//input[@id='inputcountry']")
    WebElement countryRegistration;

    @FindBy(xpath = "//button[@name='inputsubmit']")
    WebElement openAccountRegistration;


    public void clickOnRegistration(){

            registrationLocator.click();
    }

    public String getRegistrationText() {
        String registrationText = registrationTextPath.getText();
        return registrationText;
    }

    public void firstName(){
        firstNameRegistration.sendKeys("Razia");
    }

}
