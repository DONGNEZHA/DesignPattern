package Interpreter;

public class DiscountPrice extends PriceOperation{
    public float Methord(Price p){
        return p.GetDiscount() * p.GetOriPrice();
    }
}
