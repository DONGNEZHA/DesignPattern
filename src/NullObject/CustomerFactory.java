package NullObject;

import Iterator.AthleteContainer;

import java.util.List;

public class CustomerFactory {

    private List<String> names = null;

    public CustomerFactory() {
        for (int i = 0; i < AthleteContainer.getInstance().size(); ++i) {
            names.add(AthleteContainer.getInstance().get(i).getAnimalName());
        }
    }

    public AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}