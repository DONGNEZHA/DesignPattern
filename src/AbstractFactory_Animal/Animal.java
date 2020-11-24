package AbstractFactory_Animal;

import AbstractFactory_Animal.Interface.AnimalIngredientFactory;
import AbstractFactory_Animal.Interface.Color;
import AbstractFactory_Animal.Interface.Race;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
    String AnimalName;
    Race AnimalRace;
    Color AnimalColor;
    int speed,power,skill,HP=5;
    private static List<String> names=new ArrayList<String>();

    //创建输入对象
    Scanner sc=new Scanner(System.in);

    AnimalIngredientFactory factory;// factory interface

    public Animal(){// do nothing

    }

    public void setFactory(AnimalIngredientFactory factory) {//bind product factory
        this.factory = factory;
    }

    public void makeAnimal(){//制作动物角色

        prepare();
        System.out.println("是否要自创名字，否则将使用，默认名称。（Y/N)?");
        String result;
        result=sc.nextLine();
        if (result.equals("Y")){
            System.out.println("请输入你想要创建的昵称");
            setAnimalName(sc.nextLine());
        }else{
            setAnimalName(AnimalColor.toString()+AnimalRace.toString());
            //default use color&race
        }

    }

    private void    prepare(){// bind Animal attribute
        init();
        AnimalRace=factory.CreateRace();
        AnimalColor=factory.CreateColor();
        if (AnimalRace.toString().equals("cat")){
            skill+=3;
        }
        else if (AnimalRace.toString().equals("dog")){
            HP+=5;
        }
        if (AnimalColor.toString().equals("green")){
            speed+=2;
        }
        else if (AnimalColor.toString().equals("red")){
            power+=4;
        }

        System.out.println("Preparing "+AnimalColor.toString()+'_'+AnimalRace.toString());
    }
    private void init(){
        names.add("Faker");
        names.add("theShy");
        names.add("simple");
    }
    public void setAnimalName(String animalName) {//设置动物角色名称
        AnimalName = animalName;
        Animal.names.add(animalName);
    }

    public String getAnimalName() {//获取动物角色名称
        return AnimalName;
    }

    public static List<String> getNames() {
        return names;
    }

    public Color getAnimalColor() {//获取动物颜色
        return AnimalColor;
    }

    public Race getAnimalRace() {//获取动物种族
        return AnimalRace;
    }

    public int getHP() {//获取体力值
        return HP;
    }

    public int getPower() {//获取力量属性值
        return power;
    }

    public int getSkill() {//获取技巧值
        return skill;
    }

    public int getSpeed() {//获取速度
        return speed;
    }

    @Override
    public String toString() {// to print test

        StringBuffer result=new StringBuffer();
        result.append("----"+AnimalName+"----\n");
        if (AnimalColor!=null){

            result.append("color is ");
            result.append(AnimalColor);

        }
        result.append(" ");
        if (AnimalRace!=null){
            result.append("race is ");
            result.append(AnimalRace);
        }
        return result.toString();
    }
}
