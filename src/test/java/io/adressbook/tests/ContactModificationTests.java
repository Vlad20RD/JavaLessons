package io.adressbook.tests;
import io.adressbook.model.ContactData;
import org.junit.jupiter.api.Test;



public class ContactModificationTests extends TestBase{

  @Test
  public void contactModification(){
    app.getNavigationHelper().goToHomePage();
    app.getContactHelper().submitContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Mname", "Msurname", null), false);
    app.getContactHelper().submitContactUpdate();
    app.getNavigationHelper().goToHomePage();
  }
}
