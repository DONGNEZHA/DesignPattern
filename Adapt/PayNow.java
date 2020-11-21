package Adapt;

public class PayNow implements AliPay{
    @Override
    public void huaBei(int money) {

    }

    @Override
    public void payNow(int money) {
        System.out.println("你通过Alipay支付了"+money+"元");
    }
}
