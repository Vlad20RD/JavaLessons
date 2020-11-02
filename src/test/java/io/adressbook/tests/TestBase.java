package io.adressbook.tests;
import io.adressbook.appmanager.ApplicationManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;


public class TestBase {

  protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

  @BeforeEach
  public void setUp(){
    app.init();
  }

  @AfterEach
  public void setDown(){
    app.stop();
  }

}
