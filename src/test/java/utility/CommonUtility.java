package utility;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class CommonUtility {
   public WebDriver driver; // if we do not use public or private then it will be package private/no access--
    //that means it will be accessible only within the package.
    public void screenshot(String fileName) throws IOException {
        TakesScreenshot ss = (TakesScreenshot) driver; //type casting
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(memoryLocation, new File("C:\\Users\\razia\\IdeaProjects\\Batch6Selenium\\src\\test\\ScreenshotFolder/"+fileName));
    }

    public void captureScreenShotonFailure(ITestResult result) throws InterruptedException {
        if (result.getStatus() == ITestResult.FAILURE) {
            try {
                screenshot(result.getName() + "fail.png");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

            public void JSExecutorScrollHeight() throws InterruptedException {
                JavascriptExecutor js = (JavascriptExecutor) driver; //js is a reference variable
                js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
                Thread.sleep(3000);
            }


            public void jsScrollByNumber(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
            }

            public void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].scrollIntoView()",element);
            }



}
