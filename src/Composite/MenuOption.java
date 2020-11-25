package Composite;

public class MenuOption {
    // 把选项绑一个string做名字用的结构体
    public String name;
    public Object option;
    public MenuOption(String name, Object option){
        this.name = name;
        this.option = option;
    }
}
