package Test;

import FactoryMethod_Equipment.Equipment;
import FactoryMethod_Equipment.Interface.IFactory;
import FactoryMethod_Equipment.Factory.InjectorFactory;
import FactoryMethod_Equipment.Factory.SubmersibleFactory;

import java.util.Scanner;

public class FactoryMethodTest {
    public static void main(String[] args) {

        System.out.println("Factory Method Pattern");
        System.out.println("请选择你想要的创建的装备种类：A.潜水装备。B.航空装备。");
        Scanner scanner=new Scanner(System.in);
        String result=scanner.nextLine();
        if (result.equals("A")){
            IFactory factory_1=new SubmersibleFactory();
            Equipment equipment_1=factory_1.createEquipment();
            equipment_1.function();
        }
        else if (result.equals("B")){
            IFactory factory_2=new InjectorFactory();
            Equipment equipment_2=factory_2.createEquipment();
            equipment_2.function();
        }




    }
}
