package Interpreter;

public class ExchangePrice extends PriceOperation {
    public float Method(Price p) {
        return p.GetExchange() * p.GetOriPrice();
    }
}
