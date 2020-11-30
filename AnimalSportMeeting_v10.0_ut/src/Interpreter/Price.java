package Interpreter;

public class Price {
    //价格类

    private float oriPrice;
    private float exchange;

    //设置原价
    public void SetOriPrice(float p) {
        oriPrice = p;
    }

    //获取原价
    public float GetOriPrice() {
        return oriPrice;
    }

    //设置汇率
    public void SetExchange(float d) {
        exchange = d;
    }

    //得到汇率
    public float GetExchange() {
        return exchange;
    }
}
