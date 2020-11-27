package Adapter;

import java.util.Scanner;

public class AliPay {
    private int type,money;
    Scanner scan=new Scanner(System.in);

    public AliPay(){
        System.out.println("你选择了使用Alipay支付，请选择你使用的付款方式：\n1、余额付款  2、花呗付款");
        type = scan.nextInt();
    }

    public void specialPay(){
        if (type == 1) {
            System.out.println("你选择了余额付款");
            System.out.println("请输入你的付款金额：");
            money = scan.nextInt();
            System.out.println("你通过Alipay的余额支付了"+money+"元");
        } else if (type == 2) {
            System.out.println("你选择了花呗付款");
            System.out.println("请输入你的付款金额：");
            money = scan.nextInt();
            System.out.println("你通过Alipay的花呗支付了"+money+"元");
        }
    }
}
