package io.adressbook.tests;
import io.adressbook.model.GroupData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class GroupCreationTests extends TestBase{

  @Test
  public void groupCreation(){
    app.getNavigationHelper().goToGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("test_name", "header_name", "footer_name"));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assertions.assertEquals(before.size() + 1, after.size());
  }

}
