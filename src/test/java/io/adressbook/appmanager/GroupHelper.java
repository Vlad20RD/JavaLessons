package io.adressbook.appmanager;
import io.adressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class GroupHelper extends HelperBase{
  //конструктор для драйвера
  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  //вернуться на страницу группы
  public void returnToGroupPage() {
    click(By.xpath("//a[.='group page']"));
  }

  //заполнить форму группы
  public void fillGroupForm(GroupData groupData) {
    type(By.xpath("//input[@name='group_name']"), groupData.getName());
    type(By.xpath("//textarea[@name='group_header']"), groupData.getHeader());
    type(By.xpath("//textarea[@name='group_footer']"), groupData.getFooter());
  }

  //кнопка - перейти к созданию группуы
  public void initGroupCreation() {
    click(By.xpath("//input[@value='Новая группа'][1]"));
  }

  //кнопка - перейти к созданию изменению группы
  public void initGroupModification() {
    click(By.xpath("//input[@value='Изменить группу'][1]"));
  }

  //кнопка - удалить группу
  public void deleteSelectedGroups() {
    click(By.xpath("//input[@value='Удалить группу (ы)'][1]"));
  }

  //кнопка - создать группу
  public void submitGroupCreation() {
    click(By.xpath("//input[@value='Enter information']"));
  }

  //кнопка - изменить группу
  public void submitGroupModification() {
    click(By.xpath("  //input[@value='Обновить']"));
  }

  //выбрать последнюю группу
  public void selectGroup() {
    click(By.xpath("//input[@type='checkbox'][last()]"));
  }

  //кусок кода, где непосредвственно выполняется создание группы
  public void createGroup(GroupData group) {
      initGroupCreation();
      fillGroupForm(group);
      submitGroupCreation();
      returnToGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.xpath("//input[@type='checkbox'][last()]"));
  }

  public int getGroupCount() {
    return driver.findElements(By.xpath("//input[@type='checkbox']")).size();
  }
}
