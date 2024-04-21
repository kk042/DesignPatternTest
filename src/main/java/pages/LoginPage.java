package pages;

public class LoginPage {
  // WebElement


  // Methods
  public LoginPage enterEmail(String email) {
    // Enter email
    System.out.println("Entering email: " + email);
    return this;
  }

  public LoginPage enterPassword(String password) {
    // Enter email
    System.out.println("Entering password: " + password);
    return this;
  }


  public LoginPage login() {
    // Enter email
    System.out.println("click on login page");
    return this;
  }

    public HomePage doLogin(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        login();
        return new HomePage();
    }

}
