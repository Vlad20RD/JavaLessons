package io.adressbook.tests;
import org.junit.jupiter.api.Test;



public class GroupDeletionTests extends TestBase{

  @Test
  public void groupDeletion(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
