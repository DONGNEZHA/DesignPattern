package Interpreter;

public class Price {
    private float oriPrice;
    private float discount;

    public void SetOriPrice(float p) {
        oriPrice = p;
    }

    public float GetOriPrice() {
        return oriPrice;
    }

    public void SetDiscount(float d) {
        discount = d;
    }

    public float GetDiscount() {
        return discount;
    }
}
