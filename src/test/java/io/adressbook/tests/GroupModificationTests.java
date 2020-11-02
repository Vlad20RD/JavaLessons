package io.adressbook.tests;
import io.adressbook.model.GroupData;
import org.junit.jupiter.api.Test;



public class GroupModificationTests extends TestBase{

  @Test
  public void groupModification(){
    app.getNavigationHelper().goToGroupPage();
    if(!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("test_name", "header_name", "footer_name"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("Mtest_name", "Mheader_name", "Mfooter_name"));
    app.getGroupHelper().submitGroupModification();
    app.getGroupHelper().returnToGroupPage();
  }
}
