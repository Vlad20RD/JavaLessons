package io.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{
  //конструктор для драйвера
  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  //перейти на страницу "Главная"
  public void goToGroupPage() {
    click(By.xpath("//div[@id='header']/following::a[.='Группы']"));
  }
}
