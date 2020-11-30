package Decorator;

import Command_Memento.Memento;

public class Drink {
    //饮品类（被装饰者）
    public String condiment = "";       //添加配料的描述

    //获取添加的配料信息
    public String getDescription() {
        return "null";
    }

    //设置备份
    public Memento createMemento() {
        return new Memento(condiment);
    }

    //获取备份
    public String getFromMemento(Memento memento) {
        return memento.getCondiment();
    }
}
