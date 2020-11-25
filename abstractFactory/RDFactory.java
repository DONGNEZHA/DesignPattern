package abstractFactory;

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
