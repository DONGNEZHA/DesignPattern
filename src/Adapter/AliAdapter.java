package Adapter;

public class AliAdapter extends AliPay implements Pay {

    @Override
    public void pay() {
        this.specialPay();
    }
}