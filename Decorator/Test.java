package Decorator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Animals dog = new Dog();
        Animals bird = new Bird();
        System.out.println("你要为谁穿戴装备：\n1.狗\n2.鸟\n");
        String typeOfAnimal;
        int chooseAnimal =scan.nextInt();
        if(chooseAnimal==1){
            typeOfAnimal="狗";
        }
        else{
            typeOfAnimal="鸟";
        }

        System.out.println("请选择你要穿戴的装备：1.神奇翅膀  2.神奇跑鞋\n");
        int chooseEquipment =scan.nextInt();
        String typeOfEquipment;
        switch (chooseEquipment){
            case 1:
                typeOfEquipment="神奇翅膀";
                if(chooseAnimal==1){
                    FlyDecorator flyDecorator=new FlyDecorator(dog);
                    flyDecorator.setAbility(chooseAnimal);
                }
                else{
                    FlyDecorator flyDecorator=new FlyDecorator(bird);
                    flyDecorator.setAbility(chooseAnimal);
                }
                break;
            case 2:
                typeOfEquipment="神奇跑鞋";
                if(chooseAnimal==1){
                    RunDecorator runDecorator=new RunDecorator(dog);
                    runDecorator.setAbility(chooseAnimal);
                }
                else{
                    RunDecorator runDecorator=new RunDecorator(bird);
                    runDecorator.setAbility(chooseAnimal);
                }
                break;
        }
    }
}
