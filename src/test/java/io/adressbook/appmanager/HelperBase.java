package io.adressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



//базовый класс для классов помощников
public class HelperBase {

  protected WebDriver driver;
  //конструктор для драйвера
  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  protected void click(By locator) {
    driver.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    driver.findElement(locator).sendKeys(text);
  }
}
