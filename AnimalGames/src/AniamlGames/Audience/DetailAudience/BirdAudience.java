package AniamlGames.Audience.DetailAudience;

import AniamlGames.Audience.Audience;

//  @program: AnimalGame
//  @description: A basic class about detail audience
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class BirdAudience extends Audience {
    public BirdAudience(){
        race = "BirdAudience";
    }

    public BirdAudience(String color){
        this.color=color;
    }

    @Override
    public void printRace(){
        System.out.println("This is a BirdAudience" + ", Color:" + color +", Age:" + age + ", Sex:" + sex);
    }
}
