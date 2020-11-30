package Interpreter;

public class ExchangePrice extends PriceOperation {
    //解释器计算汇率
    public float Method(Price p) {
        return p.GetExchange() * p.GetOriPrice();
    }
}
