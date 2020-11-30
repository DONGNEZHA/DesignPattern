package Composite;

import java.util.ArrayList;

public class Menu extends Component {
    //菜单类，下可包含菜单和操作

    private String menuName;
    private Menu lastMenu;
    private ArrayList<Component> menu;

    public Menu(String menuName) {
        this.menuName = menuName;
        this.lastMenu = null;
        this.menu = new ArrayList<Component>();
    }

    @Override
    public String getName() {
        return menuName;
    }

    @Override
    public void add(Component component) {
        menu.add(component);
        component.setLastMenu(this);
    }

    @Override
    public void printMenu() {
        //打印菜单
        System.out.println("----- " + this.menuName + " -----");

        // 循环打印选项
        int i = 0;
        for (Component item : menu) {
            i++;
            System.out.println(i + " ----- " + item.getName());
        }
        if (lastMenu != null) System.out.println("0 ----- 回退");
        else System.out.println("0 ----- 退出");
    }

    public Menu getLast() {
        // root menu returns null
        return lastMenu;
    }

    @Override
    public void setLastMenu(Menu lastMenu) {
        this.lastMenu = lastMenu;
    }

    public ArrayList<Component> getMenu() {
        return menu;
    }
}
