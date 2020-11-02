package io.adressbook.tests;
import io.adressbook.model.GroupData;
import org.junit.jupiter.api.Test;



public class GroupDeletionTests extends TestBase{

  @Test
  public void groupDeletion(){
    app.getNavigationHelper().goToGroupPage();
    if(!app.getGroupHelper().isThereAGroup()){
        app.getGroupHelper().createGroup(new GroupData("test_name", "header_name", "footer_name"));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
