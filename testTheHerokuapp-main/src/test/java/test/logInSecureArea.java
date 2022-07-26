package test;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class logInSecureArea extends BaseTest {
    LoginPage loginPage;
    SecurePage securePage;
    Utility utility;

    @Before
    public void setUpTest() {

        loginPage = new LoginPage();
        securePage = new SecurePage();
        utility = new Utility();

    }
    @Test
    public void removeSuccessX(){
        loginPage.inputUsernameField("tomsmith");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(securePage.loggedTextIsDisplay());
        Assert.assertEquals("You logged into a secure area!\n" +
                "×", securePage.loggedTextIsGetText());
        securePage.clickCloseX();
    }
}
