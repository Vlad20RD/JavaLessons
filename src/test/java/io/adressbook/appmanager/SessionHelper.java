package io.adressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class SessionHelper extends HelperBase{

  public SessionHelper(WebDriver driver) {
    super(driver);
  }

  public void login(String login, String password) {
    type(By.xpath("//input[@name='user']"), login);
    type(By.xpath("//input[@name='pass']"), password);
    click(By.xpath("//input[@value='Войти']"));
  }
}
