package Test;

import java.awt.*;
import Composite.Menu;

public class CompositeTest {
    public void Test(){
        Menu menu = new Menu("大厅");
        menu.SetTestMenu();
        menu.PrintAndChoose();
    }
}
