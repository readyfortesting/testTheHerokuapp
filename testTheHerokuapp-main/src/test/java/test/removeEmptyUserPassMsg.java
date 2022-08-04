package test;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;


public class removeEmptyUserPassMsg extends BaseTest{
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
    public void removeEmptyUserPassMsg(){
        loginPage.inputUsernameField("");
        loginPage.inputPasswordField("");
        loginPage.clickLoginButton();
        Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
        Assert.assertEquals("Your username is invalid!\n" +
                "×", loginPage.invalidUsernameTextIsGet());
        securePage.clickCloseX();
    }
}
