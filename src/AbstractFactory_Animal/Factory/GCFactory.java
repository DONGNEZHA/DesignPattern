package AbstractFactory_Animal.Factory;

import AbstractFactory_Animal.AnimalColor.Green;
import AbstractFactory_Animal.Interface.AnimalIngredientFactory;
import AbstractFactory_Animal.AnimalRace.Cat;
import AbstractFactory_Animal.Interface.Color;
import AbstractFactory_Animal.Interface.Race;

public class GCFactory implements AnimalIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Cat();
    }

    @Override
    public Color CreateColor() {
        return new Green();
    }
}
