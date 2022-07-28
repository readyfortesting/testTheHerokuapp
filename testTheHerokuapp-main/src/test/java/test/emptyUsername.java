package test;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class emptyUsername extends BaseTest{
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
    public void emptyUsername(){
        loginPage.inputUsernameField("");
        loginPage.inputPasswordField("SuperSecretPassword!");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your username is invalid!", loginPage.invalidUsernameTextIsGet());
    }

}
