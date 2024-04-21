package factory;

import pageinterface.HomePage;
import webpages.WebHomePage;

public class WebPageFactory extends PageFactory{
  @Override
  public HomePage getHomePage() {
    return new WebHomePage();
  }


}
