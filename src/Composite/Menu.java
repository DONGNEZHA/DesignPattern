package Composite;

import java.util.Scanner;
import java.util.Vector;

public class Menu {
    private Vector<MenuOption> menu;
    private Menu lastMenu;
    private String menuName;

    public Menu(String name){
        lastMenu = null;
        menuName = name;
        menu = new Vector<MenuOption>();
    }

    public Object Get(int index){
        return this.menu.get(index).option;
    }
    public void Add(String name, Object newOption){
        menu.add(new MenuOption(name, newOption));
    }

    public void Add(int position, String name, Object newOption){
        menu.add(position, new MenuOption(name, newOption));
    }

    public int GetSize(){
        return menu.size();
    }

    public void SetLastMenu(Menu lastMenu){
        this.lastMenu = lastMenu;
    }

    public void SetMenuName(String name){
        menuName = name;
    }

    public Menu GoBack(){
        // root menu returns null
        return lastMenu;
    }

    public void PrintMenu(){
        // 打印菜单名
        System.out.println("----- " + this.menuName + " -----");
        // 循环打印选项
        for(int i = 1; i <= this.menu.size(); ++i){
            System.out.println(i + " ----- " + this.menu.get(i-1).name);
        }
        System.out.println("0 ----- 回退");
    }

    // **** 设置测试用菜单 ****
    public void SetTestMenu(){
        // **** 第一个比赛菜单 ****
        Menu raceMenu = new Menu("比赛");

        // 向比赛菜单中添加三个选项
        // 可在此处创建三个比赛实例替换 Add 中参数 element  后续同理

        //int element = 8;

        raceMenu.Add("1000米跑", element);
        raceMenu.Add("100米跑", element);
        raceMenu.Add("400米游泳", element);

        // 设置上级菜单 方便返回
        raceMenu.SetLastMenu(this);

        // menu 中添加 raceMenu
        this.Add("比赛", raceMenu);

        // 比赛 End

        // **** 饮品台 ****

        // 实例创建

        this.Add("饮品台", element);

        // 饮品台 End

        // **** 询问成绩 ****

        // 实例创建

        this.Add("询问成绩", element);

        // 询问成绩 End

        // **** 买装备 ****

        // 实例创建

        this.Add("买装备", element);

        // 买装备 End

        // **** 打印成绩单 ****

        // 实例创建

        this.Add("打印成绩单", element);

        // 打印成绩单 End

        // 测试用菜单 创建完毕
    }

    // 菜单以及选择返回
    public void PrintAndChoose(){
        this.PrintMenu();
        Scanner input = new Scanner(System.in);
        Menu nowMenu = this;
        while(input.hasNext()) {
            int i = input.nextInt();
            if (i > this.menu.size()) {
                System.out.println("选择无效");
                continue;
            } else if (i == 0) {
                nowMenu = nowMenu.GoBack();
                if(nowMenu == null)return;
            } else {
                // 1级目录
                if(nowMenu == this){
                    switch (i){
                        case 1:
                            nowMenu = (Menu)this.menu.get(0).option;
                            break;
                        case 2:
                            //饮品台
                            // this.menu.get(索引).option 拿到对应位存储的对象
                            break;
                        case 3:
                            //询问成绩
                            break;
                        case 4:
                            //买装备
                            break;
                        case 5:
                            // 打印成绩单
                            break;
                        default:
                            break;
                    }
                }
                // 2级目录
                else{
                    switch (i){
                        case 1:
                            // 1000m跑
                            break;
                        case 2:
                            // 100m跑
                            break;
                        case 3:
                            //400m游泳
                            break;
                        default:
                            break;
                    }
                }
            }
            nowMenu.PrintMenu();
        }
    }
}
