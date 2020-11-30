package Prototpye_Flyweight;

//  @program: AnimalGame
//  @description: A basic class about detail audience
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class CatAudience extends Audience {
    public CatAudience() {
        race = "CatAudience";
    }

    public CatAudience(String color) {
        this.color = color;
    }

    @Override
    public void printRace() {
        System.out.println("This is a CatAudience" + ", Color:" + color + ", Age:" + age + ", Sex:" + sex);
    }
}
