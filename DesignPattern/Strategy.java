package DesignPattern;

import java.util.Scanner;
import Strategy.*;

public class Strategy {
    public static void main(String[] args){
        ProjectContext projectContext = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入参加项目（1:四百米游泳/2：一百米跑/3:一千米跑）：");
        int in = scanner.nextInt();
        String type = "";

        switch (in){
            case 1:
                projectContext = new ProjectContext(new FourHundredMetersSwimming());
                type+="FourHundredMetersSwimming";
                break;

            case 2:
                projectContext = new ProjectContext(new OneHundredMetersRunning());
                type +="OneHundredMetersRunning";
                break;

            case 3:
                projectContext = new ProjectContext(new OneThousandMetersRunning());
                type += "OneThousandMetersRunning";
                break;

            default:
                System.out.print("请输入（1:四百米游泳/2：一百米跑/3:一千米跑）");
                break;
        }

        double speed = 100;
        double physical = 100;
        double strength = 100;
        double skill = 100;
        double value = projectContext.getResult(speed,physical,strength,skill);
        System.out.print("你参加此项目的能力值为:" + value);
        scanner.close();
    }
}
