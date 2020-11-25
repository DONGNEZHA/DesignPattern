package Adapt;

import java.util.Scanner;

public class AliAdapt implements Pay{

    AliPay aliPay=new AliPay();

    @Override
    public void pay() {
        this.aliPay.specialPay();
    }

}
