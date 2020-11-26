package Interpreter;

public class OriginalPrice extends PriceOperation {
    public float Method(Price p) {
        return p.GetOriPrice();
    }
}
