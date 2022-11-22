package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

/*Write down the following test into ‘ForgotPasswordTest’
class*/
public class ForgotPasswordTest extends Utility {

    String baseurl ="https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseurl);
    }

/*1. userShouldNavigateToForgotPasswordPageSuccessfully *
click on the ‘Forgot your password’ link

* Verify the text ‘Reset Password’*/
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        String expectedMessage = "Forgot your password";

clickOnElement(By.xpath("//p[@xpath='1']"));


        String expected="Reset Password";
        String actualText = verifyText(By.xpath("//div[@id='flash']"));
        Assert.assertEquals("not match",expected,actualText);
    }
@After
    public void close(){

}

}
