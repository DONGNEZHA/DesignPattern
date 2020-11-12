package DesignPattern;

import AniamlGames.Games.DetailGame.FourHundredMetersSwimming;
import AniamlGames.Games.DetailGame.OneHundredMetersRunning;
import AniamlGames.Games.DetailGame.OneThousandMetersRunning;
import AniamlGames.Games.Games;

import java.util.Scanner;

//  @program: AnimalGame
//  @description: The test class for TemplatePattern
//  @author: Xinyu Cui
//  @create: 2020/11/12

public class TemplatePattern {
    public static void main(String[] args) {
        String str = "";
        boolean flag = true;
        System.out.println("Please enter the type of the game!");
        System.out.println("\"1\":OneHundredMetersRunning \"2\":OneThousandMetersRunning \"3\":FourHundredMetersSwimming");
        System.out.println("Input \"Q\" to quit!");
        while (flag) {
            Games game = null;
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str){
                case "1":{
                    game = new OneHundredMetersRunning();
                    game.play();
                };break;
                case "2":{
                    game = new OneThousandMetersRunning();
                    game.play();
                };break;
                case "3":{
                    game = new FourHundredMetersSwimming();
                    game.play();
                };break;
                case "Q":{
                    flag = false;
                };break;
                default:{
                    System.out.println("Invalid input,please try again!");
                };break;
            }
        }
    }
}
