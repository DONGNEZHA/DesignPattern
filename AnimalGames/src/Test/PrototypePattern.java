package Test;

import AniamlGames.Audience.Audience;
import AniamlGames.Audience.AudienceCache;

import java.util.Scanner;


//  @program: AnimalGame
//  @description: The test class for PrototypePattern
//  @author: Xinyu Cui
//  @create: 2020/11/12


public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        AudienceCache.loadCache();

        System.out.println("Please enter the race of the audience!");
        System.out.println("\"1\":DogAudience \"2\":CatAudience \"3\":BirdAudience");
        System.out.println("Input \"view\" to view the counter!");
        System.out.println("Input \"Q\" to quit!");
        int counter = 0;
        int dogCounter = 0;
        int catCounter = 0;
        int birdCounter = 0;
        String str = "";
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str) {
                case "1": {
                    System.out.println("From Audience clone a new DogAudience!");
                    Audience clonedAudience = AudienceCache.getAudience("1");
                    System.out.println("Here is a new " + clonedAudience.getRace());
                    counter++;dogCounter++;
                };break;
                case "2": {
                    System.out.println("From Audience clone a new CatAudience!");
                    Audience clonedAudience = AudienceCache.getAudience("2");
                    System.out.println("Here is a new " + clonedAudience.getRace());
                    counter++;catCounter++;
                };break;
                case "3": {
                    System.out.println("From Audience clone a new BirdAudience!");
                    Audience clonedAudience = AudienceCache.getAudience("3");
                    System.out.println("Here is a new " + clonedAudience.getRace());
                    counter++;birdCounter++;
                };break;
                case "view": {
                    System.out.println("The number of Audience:" + counter);
                    System.out.println("The number of DogAudience:" + dogCounter);
                    System.out.println("The number of CatAudience:" + catCounter);
                    System.out.println("The number of BirdAudience:" + birdCounter);
                };break;
                case "Q":{
                    flag = false;
                };break;
                default: {
                    System.out.println("Invalid input,please try again!");
                }break;
            }
        }
    }
}
