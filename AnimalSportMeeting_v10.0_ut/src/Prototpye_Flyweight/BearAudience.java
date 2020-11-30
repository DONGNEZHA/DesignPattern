package Prototpye_Flyweight;

//  @program: AnimalGame
//  @description: A basic class about detail audience
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class BearAudience extends Audience {
    public BearAudience() {
        race = "BearAudience";
    }

    public BearAudience(String color) {
        this.color = color;
    }

    @Override
    public void printRace() {
        System.out.println("This is a BearAudience" + ", Color:" + color + ", Age:" + age + ", Sex:" + sex);
    }
}
