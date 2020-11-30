package Composite;

public class MenuOption extends Component {
    // 菜单操作类

    private String name;
    private Menu lastMenu;

    public MenuOption(String name, Object option) {
        this.name = name;
        this.lastMenu = null;
        this.option = option;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Component component) {
        super.add(component);
    }

    @Override
    public Menu getLast() {
        return lastMenu.getLast();
    }


    @Override
    public void printMenu() {
        super.printMenu();
    }

    @Override
    public void setLastMenu(Menu lastMenu) {
        this.lastMenu = lastMenu;
    }

}
