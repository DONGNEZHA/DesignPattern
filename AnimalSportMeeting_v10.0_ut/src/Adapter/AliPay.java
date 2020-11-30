package Adapter;

import java.util.Scanner;

public class AliPay {
    //支付宝的特殊支付模式

    Scanner scan = new Scanner(System.in);
    private int type, money;

    public AliPay() {
        System.out.println("你选择了使用Alipay支付");
        type = 1;
    }

    public void specialPay() {
        if (type == 1) {
            System.out.println("选择余额付款");
            money = 100;
            System.out.println("你通过Alipay的余额支付了" + money + "元");
        } else if (type == 2) {
            System.out.println("选择花呗付款");
            money = 100;
            System.out.println("你通过Alipay的花呗支付了" + money + "元");
        }
    }
}