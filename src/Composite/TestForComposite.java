package Composite;

import java.util.Scanner;

public class TestForComposite {
    public static void main(String[] args) {
        // **** 设置测试用菜单 ****
        Menu rootMenu = new Menu("大厅选择");
        // **** 第一个比赛菜单 ****
        Menu gameMenu = new Menu("比赛");

        //创建三个比赛实例
        int element = 8;
        MenuOption run_1000 = new MenuOption("1000米跑", element);
        MenuOption run_100 = new MenuOption("100米跑", element);
        MenuOption swim_400 = new MenuOption("400米游泳", element);

        // 向比赛菜单中添加三个选项
        // 可在此处创建三个比赛实例替换 Add 中参数 element  后续同理
        gameMenu.add(run_1000);
        gameMenu.add(run_100);
        gameMenu.add(swim_400);

        // 比赛 End

        // **** 饮品台 ****

        // 实例创建
        MenuOption drinkTable = new MenuOption("饮品台", element);
        MenuOption queryRank = new MenuOption("询问成绩", element);
        MenuOption buyEquipment = new MenuOption("买装备", element);
        MenuOption printRank = new MenuOption("打印成绩单", element);

        rootMenu.add(gameMenu);
        rootMenu.add(drinkTable);
        rootMenu.add(queryRank);
        rootMenu.add(buyEquipment);
        rootMenu.add(printRank);

        // 菜单以及选择返回
        System.out.println(gameMenu.getLast().getName());

        Scanner input = new Scanner(System.in);
        rootMenu.printMenu();
        int i = input.nextInt();
        while (i != 0) {
            switch (i) {
                case 1: {
                    gameMenu.printMenu();
                    switch (input.nextInt()) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 0:
                            run_100.getLast().printMenu();
                            i = input.nextInt();
                            break;
                    }
                    break;
                }
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
            }
        }
    }
}

