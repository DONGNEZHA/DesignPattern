package AbstractFactory_Animal;
import AbstractFactory_Animal.Factory.GCFactory;
import AbstractFactory_Animal.Factory.GDFactory;
import AbstractFactory_Animal.Factory.RCFactory;
import AbstractFactory_Animal.Factory.RDFactory;
import AbstractFactory_Animal.Interface.AnimalIngredientFactory;

import java.util.Scanner; //导入输入类

public class AnimalStore {
    private String OrderName;
    //创建输入对象
    private Scanner sc=new Scanner(System.in);

    protected  Animal createAnimal(){//根据用户提供要求调用不同的工厂
        Animal animal=new Animal();
        AnimalIngredientFactory factory=null;

        if (OrderName.equals("GreenDog")){
            factory=new GDFactory();
            animal.setFactory(factory);
        }
        else if (OrderName.equals("GreenCat")){
            factory=new GCFactory();
            animal.setFactory(factory);
        }
        else if (OrderName.equals("RedDog")){
            factory=new RDFactory();
            animal.setFactory(factory);
        }
        else if (OrderName.equals("RedCat")){
            factory=new RCFactory();
            animal.setFactory(factory);
        }


        return animal;
    }

    public Animal orderAnimal(){//调用角色创建
        System.out.println("请输入想要创建的动物角色的颜色和种族，示例：RedDog");
        OrderName=sc.nextLine();
        Animal animal=createAnimal();
        animal.makeAnimal();
        return animal;
    }


}
