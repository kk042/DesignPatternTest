package testing;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {

  @Test
  public void loginTest() {
    LoginPage loginPage = new LoginPage();
    loginPage.enterEmail("ASHJhajsh");
    loginPage.enterPassword("password");
    loginPage.login();

    //2nd approach
    loginPage.doLogin("ASHJhajsh", "password");

    //3rd approach mathod chaining
    loginPage.enterEmail("ASHJhajsh")
            .enterPassword("password").login();

    HomePage homePage = loginPage.doLogin("ASHJhajsh", "password");
    homePage.search("Mobile").applyBrancBuilder("Apple");

  }
}
