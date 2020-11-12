package AniamlGames.Audience.DetailAudience.AudienceAttribute;

import AniamlGames.Audience.Audience;
import AniamlGames.Audience.DetailAudience.BirdAudience;
import AniamlGames.Audience.DetailAudience.CatAudience;
import AniamlGames.Audience.DetailAudience.DogAudience;

import java.util.HashMap;

//  @program: AnimalGame
//  @description: A basic class for FlyweightPattern
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class AttributeFactory {
    private static final HashMap<String, Audience> dogAudienceMap
            = new HashMap<>();

    public static Audience setDogAudience(String color) {
        DogAudience dogAudience = (DogAudience) dogAudienceMap.get(color);

        if (dogAudience == null) {
            dogAudience = new DogAudience(color);
            dogAudienceMap.put(color, dogAudience);
            System.out.println("Here is the first " + color + " DogAudience");
        }
        return dogAudience;
    }

    private static final HashMap<String, Audience> catAudienceMap
            = new HashMap<>();

    public static Audience setCatAudience(String color) {
        CatAudience catAudience = (CatAudience) catAudienceMap.get(color);

        if (catAudience == null) {
            catAudience = new CatAudience(color);
            catAudienceMap.put(color, catAudience);
            System.out.println("Here is the first " + color + " CatAudience");
        }
        return catAudience;
    }

    private static final HashMap<String, Audience> birdAudienceMap
            = new HashMap<>();

    public static Audience setBirdAudience(String color){
        BirdAudience birdAudience = (BirdAudience)birdAudienceMap.get(color);

        if(birdAudience == null){
            birdAudience = new BirdAudience(color);
            birdAudienceMap.put(color, birdAudience);
            System.out.println("Here is the first " + color + " BirdAudience");
        }
        return birdAudience;
    }
}