package Adapt;

public class HuaBei implements AliPay{
    @Override
    public void payNow(int money) {

    }

    @Override
    public void huaBei(int money) {
        System.out.println("你通过Alipay的花呗功能支付了"+money+"元");
    }
}
