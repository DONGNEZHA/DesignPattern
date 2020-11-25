package AniamlGames.MVC.Animal;

public class GCFactory implements AnimalIngredientFactory{
    @Override
    public Race CreateRace() {
        return new Cat();
    }

    @Override
    public Color CreateColor() {
        return new Green();
    }
}
