package Prototpye_Flyweight;

import java.util.HashMap;

//  @program: AnimalGame
//  @description: A basic class for FlyweightPattern
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class AttributeFactory {
    private static final HashMap<String, Audience> dogAudienceMap
            = new HashMap<>();
    private static final HashMap<String, Audience> catAudienceMap
            = new HashMap<>();
    private static final HashMap<String, Audience> birdAudienceMap
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

    public static Audience setCatAudience(String color) {
        CatAudience catAudience = (CatAudience) catAudienceMap.get(color);

        if (catAudience == null) {
            catAudience = new CatAudience(color);
            catAudienceMap.put(color, catAudience);
            System.out.println("Here is the first " + color + " CatAudience");
        }
        return catAudience;
    }

    public static Audience setBirdAudience(String color) {
        BearAudience bearAudience = (BearAudience) birdAudienceMap.get(color);

        if (bearAudience == null) {
            bearAudience = new BearAudience(color);
            birdAudienceMap.put(color, bearAudience);
            System.out.println("Here is the first " + color + " BearAudience");
        }
        return bearAudience;
    }
}