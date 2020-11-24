package NullObject_Seache;

import AbstractFactory_Animal.Animal;

import java.util.List;

public class CustomerFactory {

    private static final List<String>names=Animal.getNames();
    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i <names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}