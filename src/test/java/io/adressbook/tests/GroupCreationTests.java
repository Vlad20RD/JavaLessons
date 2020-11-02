package io.adressbook.tests;
import io.adressbook.model.GroupData;
import org.junit.jupiter.api.Test;



public class GroupCreationTests extends TestBase{

  @Test
  public void groupCreation(){
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test_name", "header_name", "footer_name"));
  }

}
