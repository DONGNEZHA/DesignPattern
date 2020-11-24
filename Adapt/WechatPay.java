package Adapt;

import java.util.Scanner;

public class WechatPay implements Pay{
    private int money;
    Scanner scan=new Scanner(System.in);

    public WechatPay() {
        System.out.println("你选择了使用WeChat支付，输入你的支付金额：");
        money = scan.nextInt();
        pay();
    }

    @Override
    public void pay() {
        System.out.println("你通过WeChat支付了"+money+"元");
    }
}
