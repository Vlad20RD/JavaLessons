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
    if(isElementPresent(By.xpath("//h1[.='Группы']"))){
      return;
    }
    click(By.xpath("//div[@id='header']/following::a[.='Группы']"));
  }

  //перейти на страницу "Добавить контакт"
  public void goToAddContactPage() {
    if(isElementPresent(By.xpath("//h1[.='Изменить / добавить запись адресной книги']"))){
      return;
    }
    click(By.xpath("//div[@id='header']/following::a[.='Добавить контакт']"));
  }

  //перейти на страницу "Главная"
  public void goToHomePage() {
    if(isElementPresent(By.xpath("//form[@name='MainForm']"))){
      return;
    }
    click(By.xpath("//div[@id='header']/following::a[.='Главная']"));
  }
}
