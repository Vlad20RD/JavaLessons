package io.adressbook.appmanager;
import io.adressbook.model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void submitNext() {
    click(By.xpath("//input[@value='NEXT'][1]"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.xpath("//input[@name='firstname']"), contactData.getFirstname());
    type(By.xpath("//input[@name='lastname']"), contactData.getLastname());

    //проверка наличия или отутсвия элемента на форме
    if(creation){
      new Select(driver.findElement(By.xpath("//select[@name='new_group']"))).selectByVisibleText(contactData.getGroup());
    }
    else {
      Assertions.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void submitContactSave() {
    click(By.xpath("//input[@value='Сохранить'][1]"));
  }

  public void submitContactModification() {
    click(By.xpath("//tr[2]//img[@title='Изменить']"));
  }

  public void submitContactUpdate() {
    click(By.xpath("//input[@value='Обновить'][1]"));
  }

}
