package AniamlGames.Audience;

import AniamlGames.Audience.DetailAudience.BirdAudience;
import AniamlGames.Audience.DetailAudience.CatAudience;
import AniamlGames.Audience.DetailAudience.DogAudience;

import java.util.Hashtable;

//  @program: AnimalGame
//  @description: A basic class for prototypePattern
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class AudienceCache {
    private static Hashtable<String, Audience> audienceHashtable
            = new Hashtable<String, Audience>();

    public static Audience getAudience(String audienceId) throws CloneNotSupportedException {
        Audience cachedAudience = audienceHashtable.get(audienceId);
        return (Audience) cachedAudience.clone();
    }

    public static void loadCache(){
        DogAudience dogAudience = new DogAudience();
        dogAudience.setId("1");
        audienceHashtable.put(dogAudience.getId(),dogAudience);

        CatAudience catAudience = new CatAudience();
        catAudience.setId("2");
        audienceHashtable.put(catAudience.getId(),catAudience);

        BirdAudience birdAudience = new BirdAudience();
        birdAudience.setId("3");
        audienceHashtable.put(birdAudience.getId(),birdAudience);
    }
}
