package Prototpye_Flyweight;

import java.util.Hashtable;

//  @program: AnimalGame
//  @description: A basic class for prototypePattern
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class AudienceCache {
    private static Hashtable<String, Audience> audienceHashtable
            = new Hashtable<String, Audience>();

    //复制动物
    public static Audience getAudience(String audienceId) throws CloneNotSupportedException {
        Audience cachedAudience = audienceHashtable.get(audienceId);
        return (Audience) cachedAudience.clone();
    }

    //访问Cache
    public static void loadCache() {
        DogAudience dogAudience = new DogAudience();
        dogAudience.setId("1");
        audienceHashtable.put(dogAudience.getId(), dogAudience);

        CatAudience catAudience = new CatAudience();
        catAudience.setId("2");
        audienceHashtable.put(catAudience.getId(), catAudience);

        BearAudience bearAudience = new BearAudience();
        bearAudience.setId("3");
        audienceHashtable.put(bearAudience.getId(), bearAudience);
    }
}
