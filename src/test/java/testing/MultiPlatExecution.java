package testing;

import factory.PageFactory;
import org.testng.annotations.Test;
import pageinterface.HomePage;

import java.io.IOException;

public class MultiPlatExecution {

  PageFactory pageFactory = PageFactory.getPageFactory();


    @Test
    public void testMultiPlat() throws IOException {

      HomePage homePage = pageFactory.getHomePage();
      homePage.searchEvent("search for movie");
      homePage.selectMovie();

    }

    @Test
    public void testMultiPlat2() throws IOException {

      HomePage homePage = pageFactory.getHomePage();
      homePage.searchEvent("Avatar");
      homePage.selectMovie();

    }
}
