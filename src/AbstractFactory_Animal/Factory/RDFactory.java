package AbstractFactory_Animal.Factory;

import AbstractFactory_Animal.AnimalColor.Red;
import AbstractFactory_Animal.Interface.AnimalIngredientFactory;
import AbstractFactory_Animal.AnimalRace.Dog;
import AbstractFactory_Animal.Interface.Color;
import AbstractFactory_Animal.Interface.Race;

public class RDFactory implements AnimalIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Dog();
    }

    @Override
    public Color CreateColor() {
        return new Red();
    }
}
