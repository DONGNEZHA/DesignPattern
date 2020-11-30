package Prototpye_Flyweight;

import java.util.Scanner;


//  @program: AnimalGame
//  @description: The test class for CPrototypeFn
//  @author: Xinyu Cui
//  @create: 2020/11/12


public class CPrototypeFn {
    public static void PrototypeFn() throws CloneNotSupportedException {
        AudienceCache.loadCache();

        System.out.println("请选择要接见的观众的种类：[1]Dog [2]Cat [3]Bear");
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
                    //System.out.println("From Audience clone a new DogAudience!");
                    Audience clonedAudience = AudienceCache.getAudience("1");
                    System.out.println("Here is a " + clonedAudience.getRace());
                    counter++;
                    dogCounter++;
                }
                ;
                break;
                case "2": {
                    //System.out.println("From Audience clone a new CatAudience!");
                    Audience clonedAudience = AudienceCache.getAudience("2");
                    System.out.println("Here is a " + clonedAudience.getRace());
                    counter++;
                    catCounter++;
                }
                ;
                break;
                case "3": {
                    //System.out.println("From Audience clone a new BirdAudience!");
                    Audience clonedAudience = AudienceCache.getAudience("3");
                    System.out.println("Here is a " + clonedAudience.getRace());
                    counter++;
                    birdCounter++;
                }
                ;
                break;
                case "view": {
                    System.out.println("The number of Audience:" + counter);
                    System.out.println("The number of DogAudience:" + dogCounter);
                    System.out.println("The number of CatAudience:" + catCounter);
                    System.out.println("The number of BirdAudience:" + birdCounter);
                }
                ;
                break;
                case "Q": {
                    flag = false;
                }
                ;
                break;
                default: {
                    System.out.println("Invalid input,please try again!");
                }
                break;
            }
        }
    }
}
