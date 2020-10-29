package io.adressbook.appmanager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  public WebDriver driver;

  private GroupHelper groupHelper;
  private NavigationHelper navigationHelper;
  private SessionHelper sessionHelper;
  String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void init() {

    if(browser == BrowserType.CHROME){
      driver = new ChromeDriver();
      System.setProperty("webdriver.chrome.driver", "D:/GitProject/JavaLessons/chromedriver.exe");
    }
    else if(browser == BrowserType.FIREFOX){
      driver = new FirefoxDriver();
      System.setProperty("webdriver.gecko.driver", "D:/GitProject/JavaLessons/geckodriver.exe");
    }
    else if(browser == BrowserType.IE){
      driver = new InternetExplorerDriver();
      System.setProperty("webdriver.ie.driver", "D:/GitProject/JavaLessons/IEDriverServer.exe");
    }


    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    driver.get("http://addressbook/");
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
}
