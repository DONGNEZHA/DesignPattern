package abstractFactory;

public class GDFactory implements AnimalIngredientFactory {
    @Override
    public Race CreateRace() {
        return new Dog();
    }

    @Override
    public Color CreateColor() {
        return new Green();
    }
}
