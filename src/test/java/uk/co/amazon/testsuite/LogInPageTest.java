package uk.co.amazon.testsuite;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import uk.co.amazon.pages.HomePage;
import uk.co.amazon.pages.LoginPage;
import uk.co.amazon.testbase.TestBase;

public class LogInPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void usernavigatepagesuccessfull() {
    homePage.sendTextToElement(By.id("twotabsearchtextbox"),"Dell Laptop");
    homePage.clickOnElement(By.xpath("nav-search-submit-button"));
    homePage.clickOnElement(By.className("a-icon a-icon-checkbox"));
        String expectedErrorMessage = "1-24 of over 1,000 results for";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);





    }
}
