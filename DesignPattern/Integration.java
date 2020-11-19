package DesignPattern;

import State.*;
import Strategy.*;

import java.util.Scanner;

public class Integration {
    public static void main(String[] args){
        //创建策略对象
        ProjectContext projectContext = null;
        //创建状态对象
        StateContext stateContext = new StateContext();
        //赋予状态初值
        stateContext.setAnimalState(new StatePerfect());

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
        double value = projectContext.getResult(speed,physical,strength,skill) / stateContext.getState();
        System.out.print("你参加" + type + "的能力值为:" + value);
        scanner.close();
    }
}
