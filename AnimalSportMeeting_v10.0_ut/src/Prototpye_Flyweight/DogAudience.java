package Prototpye_Flyweight;

//  @program: AnimalGame
//  @description: A basic class about detail audience
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class DogAudience extends Audience {

    public DogAudience() {
        race = "DogAudience";
    }

    public DogAudience(String color) {
        this.color = color;
    }

    @Override
    public void printRace() {
        System.out.println("This is a DogAudience" + ", Color:" + color + ", Age:" + age + ", Sex:" + sex);
    }
}
