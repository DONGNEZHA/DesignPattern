package Interpreter;

public class Price {
    private float oriPrice;
    private float exchange;

    public void SetOriPrice(float p) {
        oriPrice = p;
    }

    public float GetOriPrice() {
        return oriPrice;
    }

    public void SetExchange(float d) {
        exchange = d;
    }

    public float GetExchange() {
        return exchange;
    }
}
