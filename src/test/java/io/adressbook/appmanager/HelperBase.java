package io.adressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;



//базовый класс для классов помощников
public class HelperBase {

  protected WebDriver driver;
  //конструктор для драйвера
  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public void type(By locator, String text) {
    if(text != null){
      String existingsText = driver.findElement(locator).getAttribute("value");
      if(!text.equals(existingsText)){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
      }
    }
  }

  public boolean isElementPresent(By locator) {
    try{
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException ex){
      return false;
    }
  }
}
