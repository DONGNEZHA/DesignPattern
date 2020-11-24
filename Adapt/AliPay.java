package Adapt;

import java.util.Scanner;

public class AliPay {
    private int type,money;
    Scanner scan=new Scanner(System.in);

    public void specialPay(){
        System.out.println("你选择了使用Alipay支付，请选择你使用的付款方式：\n1、正常付款  2、花呗付款");
        type = scan.nextInt();
        if (type == 1) {
            System.out.println("你选择了正常付款");
            System.out.println("请输入你的付款金额：");
            money = scan.nextInt();
            PayNow payNow = new PayNow();
            payNow.payNow(money);
        } else if (type == 2) {
            System.out.println("你选择了花呗付款");
            System.out.println("请输入你的付款金额：");
            money = scan.nextInt();
            HuaBei huaBei = new HuaBei();
            huaBei.huaBei(money);
        }
    }
}
