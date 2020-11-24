package Test;

import AbstractFactory_Animal.Animal;
import AbstractFactory_Animal.AnimalStore;
import NullObject_Seache.AbstractCustomer;
import NullObject_Seache.CustomerFactory;

import java.util.Scanner;

public class NullPatternTest {
    public static void main(String[] args) {

        //Animal init
        AnimalStore animalStore=new AnimalStore();
        Animal animal=null;
        animal=animalStore.orderAnimal();

        System.out.println("请输入想要查询的动物角色的名称:(示例：Faker)");
        Scanner scanner=new Scanner(System.in);
        AbstractCustomer abstractCustomer=null;
        String name=scanner.nextLine();
        abstractCustomer= CustomerFactory.getCustomer(name);
        boolean result=abstractCustomer.isNil();
        if (!result){
            System.out.println("该名称存在，名称为：");
            System.out.println(abstractCustomer.getName());
        }
        else{
            System.out.println("名称不存在");
            System.out.println(abstractCustomer.getName());
        }
    }
}
