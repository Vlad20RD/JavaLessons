package io.adressbook.tests;
import io.adressbook.model.ContactData;
import org.junit.jupiter.api.Test;



public class ContactCreationTests extends TestBase{

  @Test
  public void contactCreation(){
    app.getNavigationHelper().goToAddContactPage();
    app.getContactHelper().submitNext();
    app.getContactHelper().fillContactForm(new ContactData("name", "surname", "group_name"), true);
    app.getContactHelper().submitContactSave();
    app.getNavigationHelper().goToHomePage();
  }
}
