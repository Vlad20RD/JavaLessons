package io.adressbook.appmanager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  public WebDriver driver;

  private GroupHelper groupHelper;
  private NavigationHelper navigationHelper;
  private SessionHelper sessionHelper;

  public void init() {
    driver = new ChromeDriver();

    System.setProperty("webdriver.chrome.driver", "D:/GitProject/Java_lessons/chromedriver.exe");
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
