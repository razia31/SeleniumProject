package InterviewQA;

public class InterviewQ {
    /*
    Let's say you have 200 test cases that takes 2 hours to run. Your manager
    wants you to run in 1 hour. How would you run  that?

    We can run those in parallel using testNG parallel testing utility. I will use parallel testing
    and do the set-up in the testNG.xml file using parallel= "Methods/Classes" and thread-count - 5

    Research Grouping ---

    Q: What are the Selenium exceptions you have encountered?

    i. NoSuchElementException
    ii.TimeoutException



    Q: What is PageObject model?

    Page Object Model is a pattern where page object are being separated
    from the test class.

    Advantage:Reusability, reduce code duplication, helps in saving time and effort. anybody can use
    page elements from the page class and use that element in his/her test class.

    Q: How did you implement OOP Concept in Selenium?

    There are few OOP principles:
    i.Inheritance -- We used extension between class like Base Class and Common Utility and with Test Class.

    ii.Polymorphism -- OverLoading and overriding
            OverLoading I did use when we use Assert.assertEquals.

    iii.Abstraction -- Page class and Test Class

    iv.Interface -- WebDriver is an Interface. TakeScreenShot, ITestResult

    v.Encapsulation --

    Q: How to get screenshot once the test case failed?

    We used captureScreenShotonFailure method where for the parameter we use ITestResult
    if ITestResult == Failure, we call the screenshot method. That means if the test fails,
    only it takes screenshot of the test.

    Q: Why do you use Xpath?

    xpaths can be used when you don't see name, id, or class or in general company prefers/instruction
    in using xpath. xpath means xml path.

    Q: How many types of xpath?

    i. Absolute xpath -- starts from the root node with a single slash(/)
    ii. Relative xpath -- Starts from anywhere in the document and use double slash (//)
        formula: //tagname[@attribute = 'value']

    Q: Why not to use Absolute xpath?
    i. taking too long to create one xpath
    ii. Any change of the path my script will fail.



    Q: What are the validation method you used?
    i. isDisplayed
    ii. isSelected
    iii. isEnabled


     */


}
