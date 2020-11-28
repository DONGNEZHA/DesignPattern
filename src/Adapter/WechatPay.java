package Adapter;

import java.util.Scanner;

public class WechatPay implements Pay {
    Scanner scan = new Scanner(System.in);
    private int money;

    public void pay() {
        System.out.println("你选择了使用WeChat支付");
        money = 100;
    }

}

