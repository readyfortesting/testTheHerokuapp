package test;
import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.*;

public class emptyPassword extends BaseTest {
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
        public void emptyPasswordPass () {
            loginPage.inputUsernameField("tomsmith");
            loginPage.inputPasswordField("");
            loginPage.clickLoginButton();
            Assert.assertTrue(loginPage.invalidUsernameTextIsDisplay());
            Assert.assertEquals("Your password is invalid!", loginPage.invalidUsernameTextIsGet());
        }
    }

