package AniamlGames.MVC.Animal;

public class RCFactory implements AnimalIngredientFactory{
    @Override
    public Race CreateRace() {
        return new Cat();
    }

    @Override
    public Color CreateColor() {
        return new Red();
    }
}
