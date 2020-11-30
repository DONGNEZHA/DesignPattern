package Interpreter;

public class OriginalPrice extends PriceOperation {
    //原价类
    public float Method(Price p) {
        return p.GetOriPrice();
    }
}
