package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass extends CommonUtility{

    @Parameters("browser")

@BeforeClass
    public void appInitialize(String browser) throws InterruptedException, IOException {
        /* Open a browser
           To open a browser we need to download a driver. Let's say if I try to open a
           Chrome Browser, I need to download a chromedriver.
           if I try to open a firefox browser, I need to download a firefoxdriver (geckodriver).
           if I try to open a safari browser, I need to download a safaridriver.
           if I try to open a Internet Explorer browser, I need to download a iedriver.

           Before we start downloading Chromedriver, at first we need to check the current
           chrome browsers version.

         */
        FileInputStream fs = new FileInputStream("C:\\Users\\razia\\IdeaProjects\\Batch6Selenium\\src\\test\\java\\env.properties");

        Properties prop = new Properties();
        prop.load(fs);
        String myURL = prop.getProperty("url");

        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\razia\\IdeaProjects\\Batch6Selenium\\src\\main\\java\\drivers\\chromedriver.exe");
        //Chromedriver,FirefoxDriver, SafariDriver, IeDriver, OperaDriver --- these are all classes

        // Step - 1 -- Open the browser
       WebDriverManager.chromedriver().setup();
       //WebDriver driver = new FirefoxDriver();

        if (browser.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();// this will open the browser
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }
        else{
            System.out.println("check back your drivers");
        }
        /* WebDriver Manager ---- it will automatically check the browser version and i donot
        need to download the driver manually
         */

        // // Step-2 -- Navigate to the URL

        /* There are two ways we can navigate to the url
        i. driver.navigate().to(url)
        ii.driver.get(url)
         */

       // driver.navigate().to("https://www.amazon.com");
        driver.navigate().to(myURL);
        driver.manage().window().maximize();
//Thread.sleep(4000);
        //navigate to another url

       // driver.navigate().to("https://uprightforum.tech");
//Thread.sleep(4000);
       // driver.navigate().back();
//Thread.sleep(4000);
      //  driver.navigate().forward();
      //  driver.get("https://uprightautomation.online/registration/");

        /*
        driver.navigate().to() does not wait to load the page.
        It will navigate to the next line.

        diver.get() will wait until the page is loaded.
         */

driver.navigate().refresh();

// Validate that the url is https://uprightautomation.online/registration/
      String myURL1 =  driver.getCurrentUrl();
//
//      if (myURL1.equalsIgnoreCase("https://uprightautomation.online/registration/")){
//          System.out.println("The URL is good");
//      }
//      else {
//          System.out.println("Please check the url");
//      } // Validating/Testing my current url

        /*
        How many ways can you validate any functionality?
        i. Using if else statement (Java)
        ii. Using Assert utility (from TestNG or Junit)
         */

        /* TestNG is a testing framework. There are classes there which can be used to
        validate the test. Like Assert has many methods.
         */

        /*
        There are two types of assertion. i. Hard Assert ii. Soft Assert(Verify)
        Soft assert means verify.
         */
        SoftAssert obj = new SoftAssert();
        obj.assertEquals(myURL,"https://uprightautomation.online/registrati/");
       //  Assert.assertEquals(myURL, "https://uprightautomation.online/registrati/");

      // Validate that the title is "Registration – Upright Automation"
        String myTitle = driver.getTitle();
       // Assert.assertEquals(myTitle,"Registration – Upright Automation");
        obj.assertEquals(myTitle,"Registration – Upright Automation");

        /*
        What are the waits you have used in Selenium?
        I have used
        i. Implicitly Wait -- It will wait a certain period (the least say 10 sec) before throwing any exception
        to all the script wherever this class is extended. This is a global wait.

        ii. Explicitly Wait ---
         a.WebDriver Wait---Will wait a certain period (example 10 sec) before throwing an exception
             and applicable on a certain element. It will throw timeout exception with a try of 500 millisecond
             interval by default.

         b.Fluent Wait --- pollingEvery(Duration.ofSecond(5))

         expected conditions:
         i. elementisvisible
         ii. elementisclickable
         iii. alertisPresent
         iv. Frametobeavailableandswitchto
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        driver.close() will close the current browser opened by Selenium. If you have multiple browser
        opened by Selenium... it will only close the current browser. Also, driver.close() will not end
        task the chromedriver from the Background process.

        driver.quit() will close all the browsers opened by Selenium. Also, it will end task the chromedriver
        from the Background process.

         */

       // driver.close();



       // obj.assertAll();





    }
@AfterClass
    public void teardown(){
    driver.quit();
    }

}
