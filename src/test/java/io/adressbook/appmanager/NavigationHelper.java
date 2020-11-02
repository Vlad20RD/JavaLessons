package io.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//класс навигации по сайту
public class NavigationHelper extends HelperBase{
  //конструктор для драйвера
  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  //перейти на страницу "Группы"
  public void goToGroupPage() {
    click(By.xpath("//div[@id='header']/following::a[.='Группы']"));
  }

  //перейти на страницу "Добавить контакт"
  public void goToAddContactPage() {
    click(By.xpath("//div[@id='header']/following::a[.='Добавить контакт']"));
  }

  //перейти на страницу "Главная"
  public void goToHomePage() {
    click(By.xpath("//div[@id='header']/following::a[.='Главная']"));
  }
}
