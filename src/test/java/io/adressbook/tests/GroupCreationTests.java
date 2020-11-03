package io.adressbook.tests;
import io.adressbook.model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class GroupCreationTests extends TestBase{

  @Test
  public void groupCreation(){
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test_name", "header_name", "footer_name"));
    int after = app.getGroupHelper().getGroupCount();
    Assertions.assertEquals(before + 1, after);
  }

}
