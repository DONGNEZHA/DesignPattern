package Test;

import AbstractFactory_Animal.Animal;
import AbstractFactory_Animal.AnimalStore;

import java.util.Scanner;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("Abstract Factory Pattern");
        Scanner scanner=new Scanner(System.in);
        AnimalStore animalStore=new AnimalStore();
        Animal animal=null;
        System.out.println("是否要创建动物运动员角色(Y/N)?");
        String result=scanner.nextLine();
        while (result.equals("Y")){
            animal=animalStore.orderAnimal();
            System.out.println(animal);
            System.out.println("是否要创建动物运动员角色(Y/N)?");
            result=scanner.nextLine();
        }



    }
}
