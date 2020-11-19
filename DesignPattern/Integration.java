package DesignPattern;

import State.*;
import Strategy.*;

import java.util.Scanner;

public class Integration {
    public static void main(String[] args){
        //�������Զ���
        ProjectContext projectContext = null;
        //����״̬����
        StateContext stateContext = new StateContext();
        //����״̬��ֵ
        stateContext.setAnimalState(new StatePerfect());

        Scanner scanner = new Scanner(System.in);
        System.out.print("������μ���Ŀ��1:�İ�����Ӿ/2��һ������/3:һǧ���ܣ���");
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
                System.out.print("�����루1:�İ�����Ӿ/2��һ������/3:һǧ���ܣ�");
                break;
        }

        double speed = 100;
        double physical = 100;
        double strength = 100;
        double skill = 100;
        double value = projectContext.getResult(speed,physical,strength,skill) / stateContext.getState();
        System.out.print("��μ�" + type + "������ֵΪ:" + value);
        scanner.close();
    }
}
