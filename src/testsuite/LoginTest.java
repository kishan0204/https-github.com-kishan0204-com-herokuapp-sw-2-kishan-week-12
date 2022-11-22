package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.xpath("//input[@placeholder='Benutzername']"),"Admin");
        sendTextToElement(By.xpath("//input[@placeholder='Passwort']"),"admin123");
        clickOnElement(By.xpath("//button[normalize-space()='Login']"));

        //driver.findElement(By.xpath("button[type='submit']")).click();
        //driver.findElement(By.xpath("//button[@type='submit']")).click()


    }

}