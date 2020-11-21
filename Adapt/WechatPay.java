package Adapt;

import java.util.Scanner;

public class WechatPay implements Pay{
    private int money;
    Scanner scan=new Scanner(System.in);
    Pay pay;
    public WechatPay(int type){
        if(type == 2){
            System.out.println("你选择了使用WeChat支付，输入你的支付金额：");
            money= scan.nextInt();
            pay();
        }
        else if(type==1){
            AliAdapt aliAdapt=new AliAdapt();
        }
    }
    @Override
    public void pay() {
        System.out.println("你通过WeChat支付了"+money+"元");
    }
}
