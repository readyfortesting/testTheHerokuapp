package test;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class logoutTest extends BaseTest {
    LoginPage loginPage;
    SecurePage securePage;
    Utility utility;


    @Before
    public void setUpTest() {

        loginPage = new LoginPage();
        securePage = new SecurePage();
        utility = new Utility();

} @Test
    public void logoutTest(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        securePage.clickLogoutButton();

        Assert.assertTrue(loginPage.logoutTextIsDisplay());
        Assert.assertEquals("You logged out of the secure area!\n" +
                "×", loginPage.logoutTextIsGetText());

    }
}