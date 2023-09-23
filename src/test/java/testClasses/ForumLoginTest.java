package testClasses;

import dataReader.ExcelForumLoginDataReader;
import dataReader.ExcelLoginDataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utility.BaseClass;

public class ForumLoginTest extends BaseClass {



    @Test(dataProvider = "Forum Login Data from Excel", dataProviderClass = ExcelForumLoginDataReader.class)
    public void enterForumLoginData(String userName, String passWord) throws InterruptedException {


        WebElement userNamePath = driver.findElement(By.xpath("//input[@name='username-44']"));
        userNamePath.clear();
        userNamePath.sendKeys(userName);
        Thread.sleep(3000);


        WebElement passwordPath = driver.findElement(By.xpath("//input[@id='user_password-44']"));
        passwordPath.clear();
        passwordPath.sendKeys(passWord);
        Thread.sleep(3000);



       WebElement loginButton = driver.findElement(By.xpath("//input[@id='um-submit-btn']"));
       loginButton.click();
        Thread.sleep(3000);

    }

}


